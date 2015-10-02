
package com.mycompany.samplefornettydisconnectionissue;

import java.util.ArrayList;
import java.util.List;
import org.apache.camel.CamelContext;
import org.apache.camel.Endpoint;
import org.apache.camel.LoggingLevel;
import org.apache.camel.component.netty.ChannelHandlerFactories;
import org.apache.camel.component.netty.NettyComponent;
import org.apache.camel.component.netty.NettyConfiguration;
import org.apache.camel.component.netty.NettyEndpoint;
import org.apache.camel.component.netty.TextLineDelimiter;
import org.apache.log4j.Logger;
import org.jboss.netty.channel.ChannelHandler;
import org.jboss.netty.handler.codec.frame.LengthFieldPrepender;



public class NettyClientEndPoint
{    
    
    private final String CLASSNAME = NettyClientEndPoint.class.getName();
    private final Logger LOGGER    = Logger.getLogger( CLASSNAME );
    
    private NettyEndpoint           nettyEndpoint;
    private CamelContext            camelContext;
    private NettyConfiguration      nettyConfiguration;
    

    private final int PORT;
    private final String HOST;
    private final int CONNECTIONTIMEOUT;
    private final int REQUESTTIMEOUT;
    private final int MAXPOOLSIZE;
    
    public NettyClientEndPoint(           
           String hostParam,
           int portParam,
           int requestTimeOutParam,
           int connectionTimeOutParam,
           int maxPoolSizeParam
    )
    {
        
        
        LOGGER.debug( CLASSNAME + ".NewInstance called." );
                        
        PORT = portParam;
        HOST = hostParam;
        CONNECTIONTIMEOUT = connectionTimeOutParam;
        REQUESTTIMEOUT = requestTimeOutParam;
        MAXPOOLSIZE = maxPoolSizeParam;
        
        camelContext        = null;
        nettyEndpoint       = null;
        nettyConfiguration  = null;
        
        
    }
           
    
    public void add2CamelContext( CamelContext context ) throws Exception
    {
        //Check if it has already assigned the component on camelContext.
        if ( ( camelContext !=null ) && ( camelContext.equals( context ) ) ) 
        {
            LOGGER.debug( CLASSNAME + ".add2CamelContext: it has already started on camel context : " + context.getName() ); 
            return;
        }
        
        LOGGER.debug( CLASSNAME + ".add2CamelContext called." );        
        

        
        // *********************************************************************
        // Configuration of TcpClient
        // *********************************************************************
        
        nettyConfiguration = new NettyConfiguration();
        
          
        //Decoder
        List<ChannelHandler> decoders = new ArrayList<>();             
        decoders.add( ChannelHandlerFactories.newLengthFieldBasedFrameDecoder( 65535, 0, 2, 0, 2 ) );
        
        //Encoder
        List<ChannelHandler> encoders = new ArrayList<>();        
        encoders.add( new  LengthFieldPrepender( 2, false ) );
        
        
        //Netty Configuration
        
        //Setting to ensure socket is not closed due to inactivity
        nettyConfiguration.setKeepAlive(                    true );
        
        //Time to wait for a socket connection to be available. Value is in millis.
        nettyConfiguration.setConnectTimeout(               CONNECTIONTIMEOUT );
        
        // The core pool size for the ordered thread pool, if its in use.
        nettyConfiguration.setMaximumPoolSize(              MAXPOOLSIZE) ;
        
        //Whether to use ordered thread pool, to ensure events are processed orderly on the same channel.
        //See details at the netty javadoc of org.jboss.netty.handler.execution.OrderedMemoryAwareThreadPoolExecutor for more details.     
        nettyConfiguration.setOrderedThreadPoolExecutor(    true );
        
        //Whether or not to disconnect(close) from Netty Channel right after use. Can be used for both consumer and producer.
        nettyConfiguration.setDisconnect(                   false );
        //Channels can be lazily created to avoid exceptions, if the remote server is not up and running when the Camel producer is started.
        nettyConfiguration.setLazyChannelCreation(          true );
               
        //Allows to use a timeout for the Netty producer when calling a remote server.
        //By default no timeout is in use. The value is in milli seconds, so eg 30000 is 30 seconds.
        //The requestTimeout is using Netty's ReadTimeoutHandler to trigger the timeout.  
        nettyConfiguration.setRequestTimeout(               REQUESTTIMEOUT );
        
         
        
        nettyConfiguration.setTcpNoDelay(                   true );
        nettyConfiguration.setDecoders(                     decoders );               
        nettyConfiguration.setProtocol(                     "tcp" );
        nettyConfiguration.setHost(                         HOST );
        nettyConfiguration.setPort(                         PORT );
        
        //Setting to set endpoint as one-way or request-response     
        nettyConfiguration.setSync(                         false ); 
        nettyConfiguration.setNoReplyLogLevel(              LoggingLevel.ERROR );
        nettyConfiguration.setEncoders(                     encoders );
        nettyConfiguration.setBroadcast(                    false );
        nettyConfiguration.setSendBufferSize(               65536 );
        nettyConfiguration.setReceiveBufferSize(            65536 );
        nettyConfiguration.setReceiveBufferSizePredictor(   0 );
        nettyConfiguration.setWorkerCount(                  0 );
        nettyConfiguration.setBossCount(                    1 );       
        nettyConfiguration.setReuseAddress(                 true );
//        nettyConfiguration.setNeedClientAuth(               false );
//        nettyConfiguration.setSsl(                          false );
//        nettyConfiguration.setSslClientCertHeaders(         false );
        nettyConfiguration.setDisconnectOnNoReply(          false );
        
//        nettyConfiguration.setProducerPoolEnabled(          true );
//        nettyConfiguration.setServerExceptionCaughtLogLevel( LoggingLevel.ERROR ); 
//        nettyConfiguration.setServerClosedChannelExceptionCaughtLogLevel( LoggingLevel.ERROR );
//        
        
        nettyConfiguration.setProducerPoolMinEvictableIdle(0);
        
        
        
        
//        nettyConfiguration.setTextline(                     false );      
//        
//        nettyConfiguration.setAllowDefaultCodec(            true );
//        nettyConfiguration.setDelimiter(                    TextLineDelimiter.LINE );
//        nettyConfiguration.setDecoderMaxLineLength(         1024 );
//        nettyConfiguration.setAutoAppendDelimiter(          true );
        nettyConfiguration.setProducerPoolMaxActive(        -1 );
        nettyConfiguration.setProducerPoolMinIdle(          0 );
        nettyConfiguration.setProducerPoolMaxIdle(          1000 );
//        

        NettyComponent nettyComponent = new NettyComponent( context );
        nettyComponent.setConfiguration( nettyConfiguration );
        context.addComponent( "netty", nettyComponent );
        nettyComponent.start();

        // create and start endpoint, pass in null as endpoint uri as we create this endpoint manually
        nettyEndpoint = new NettyEndpoint( null, nettyComponent, nettyConfiguration );
        nettyEndpoint.setTimer( NettyComponent.getTimer() );        
        nettyEndpoint.start();
        
        camelContext = context;        
    }
    
    public Endpoint getEndPoint()
    {
        return nettyEndpoint;
    }
    
}
