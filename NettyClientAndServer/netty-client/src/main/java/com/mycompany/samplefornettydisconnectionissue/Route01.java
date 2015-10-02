


package com.mycompany.samplefornettydisconnectionissue;

import org.apache.camel.builder.RouteBuilder;
import org.apache.log4j.Logger;

public class Route01 extends RouteBuilder
{
    private final String CLASSNAME = Route01.class.getName();
    private final Logger LOGGER    = Logger.getLogger( CLASSNAME );
    private final NettyClientEndPoint NETTYCLIENTENDPOINT;
    
    public Route01()
    {
        super();
        LOGGER.debug( CLASSNAME + ".NewInstance called." );
        
        NETTYCLIENTENDPOINT = new NettyClientEndPoint("127.0.0.1",50011,30000,30000,1000); 
    }

    @Override
    public void configure() throws Exception  
    {        
        NETTYCLIENTENDPOINT.add2CamelContext( getContext() );
        
        from( "timer://test2?fixedRate=true&period=10000" ).routeId( CLASSNAME ).startupOrder( 600 ) 
            .process(new MessagesProcessor() )
            .to(NETTYCLIENTENDPOINT.getEndPoint() );
           
    }
   
    
}
