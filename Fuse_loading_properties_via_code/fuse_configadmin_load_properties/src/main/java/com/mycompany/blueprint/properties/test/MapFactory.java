package com.mycompany.blueprint.properties.test;

import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class MapFactory {
    private static final Logger logger = LoggerFactory.getLogger(MapFactory.class);
    public static Map<String,String> createInstance() {
        
        Map<String,String> result = new HashMap<String,String>();
        result.put("host", "yahoooooo");
        result.put("123", "456");
        return result;
    }
}
