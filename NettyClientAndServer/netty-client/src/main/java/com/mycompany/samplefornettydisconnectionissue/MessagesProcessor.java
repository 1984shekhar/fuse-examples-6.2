

package com.mycompany.samplefornettydisconnectionissue;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.jboss.netty.buffer.DynamicChannelBuffer;

public class MessagesProcessor implements Processor
{
    private final int               BYTEMASK;
    private final int               SHORTMASK;
    private final int               BYTESHIFT;
    
    public MessagesProcessor()
    {
        super();
        BYTESHIFT        = 8;
        SHORTMASK        = 0xffff;
        BYTEMASK         = 0xff;
    }
     
    @Override
    public void process(Exchange exchange) throws Exception 
    {                 
        String msg = "A TEST MESSAGE !";
        
        byte[] msgB = msg.getBytes();
        DynamicChannelBuffer buf = new DynamicChannelBuffer(msgB.length);
        buf.writeBytes(msgB);
        
        exchange.getOut().setBody(buf);
        
    }    
    
}
