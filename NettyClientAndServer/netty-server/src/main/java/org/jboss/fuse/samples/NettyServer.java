package org.jboss.fuse.samples;

import java.net.InetSocketAddress;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

import org.jboss.netty.bootstrap.ServerBootstrap;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelFactory;
import org.jboss.netty.channel.group.ChannelGroup;
import org.jboss.netty.channel.group.DefaultChannelGroup;
import org.jboss.netty.channel.socket.nio.NioServerSocketChannelFactory;
import org.jboss.netty.handler.execution.OrderedMemoryAwareThreadPoolExecutor;
import org.jboss.netty.logging.InternalLogLevel;
import org.jboss.netty.logging.InternalLoggerFactory;
import org.jboss.netty.logging.Slf4JLoggerFactory;

public class NettyServer {
    public static void main(String[] args) throws Exception {
        InternalLoggerFactory.setDefaultFactory(new Slf4JLoggerFactory());
//        if (args.length != 1) {
//            System.err.println("Usage: " + NettyServer.class.getSimpleName() +
//                    " <port>");
//            return;
//        }
        // Parse options.
//        int port = Integer.parseInt(args[0]);
int port=50011;
        // *** Start the Netty configuration ***

        // Start server with Nb of active threads = 2*NB CPU + 1 as maximum.
        ChannelFactory factory = new NioServerSocketChannelFactory(Executors
                .newCachedThreadPool(), Executors.newCachedThreadPool(),
                Runtime.getRuntime().availableProcessors() * 2 + 1);

        ServerBootstrap bootstrap = new ServerBootstrap(factory);
        // Create the global ChannelGroup
        ChannelGroup channelGroup = new DefaultChannelGroup(
                NettyServer.class.getName());

        bootstrap.setPipelineFactory(new NettyServerPipelineFactory());

        bootstrap.setOption("child.tcpNoDelay", true);
        bootstrap.setOption("child.keepAlive", true);
        bootstrap.setOption("child.reuseAddress", true);
        bootstrap.setOption("child.connectTimeoutMillis", 20000);
        bootstrap.setOption("readWriteFair", true);

        // *** Start the Netty running ***

        // Add the parent channel to the group
        Channel channel = bootstrap.bind(new InetSocketAddress(port));
        channelGroup.add(channel);

        System.out.println("NettyServer starting...");
/*
        try {
            Thread.sleep(50*60*1000);
        } catch (InterruptedException e) {
            System.out.println("caught an interrupted exception while sleeping");
        }

        // *** Start the Netty shutdown ***

        // End the monitor
        System.out.println("End of monitor");
        // Now close all channels
        System.out.println("End of channel group");
        channelGroup.close().awaitUninterruptibly();
        // Now release resources
        System.out.println("End of resources");
        factory.releaseExternalResources();
*/
    }
}
