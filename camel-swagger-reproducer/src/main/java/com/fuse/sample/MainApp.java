package com.fuse.sample;

import org.apache.camel.main.Main;

import com.fuse.sample.routes.HitsRoute;
import com.fuse.sample.routes.marketplace.MarketPlaceRoute;

/**
 * A Camel Application
 */
public class MainApp {

    /**
     * A main() so we can easily run these routing rules in our IDE
     */
    public static void main(String... args) throws Exception {
        Main main = new Main();
        main.enableHangupSupport();
        main.addRouteBuilder(new HitsRoute());
        main.addRouteBuilder(new MarketPlaceRoute());
        main.run(args);
        
    }

	
	/*
	   public static void main(String... args) throws Exception {
		   InsuranceEnrollRequestBO req = new InsuranceEnrollRequestBO();
		   req.setChannel(new ChannelType());
		   req.setCustomer(new CustomerType());
		   req.setEquipment(new EquipmentType());
		   req.setHeader(new HeaderType());
	      	 System.out.println(new Gson().toJson(req));
	    }*/
}

