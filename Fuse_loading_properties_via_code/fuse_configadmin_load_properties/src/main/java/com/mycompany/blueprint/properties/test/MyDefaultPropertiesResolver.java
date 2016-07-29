package com.mycompany.blueprint.properties.test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Map;
import java.util.Properties;

import org.apache.camel.CamelContext;
import org.apache.camel.component.properties.DefaultPropertiesResolver;
import org.apache.camel.component.properties.PropertiesComponent;
import org.apache.camel.component.properties.PropertiesResolver;
import org.apache.camel.util.IOHelper;
import org.apache.camel.util.ObjectHelper;

public class MyDefaultPropertiesResolver extends DefaultPropertiesResolver implements PropertiesResolver {

private PropertiesComponent propertiesComponent;
	  
	   public MyDefaultPropertiesResolver(PropertiesComponent propertiesComponent) {
		super(propertiesComponent);
		this.propertiesComponent = propertiesComponent;

	}


	
	protected Properties loadPropertiesFromFilePath(CamelContext context, boolean ignoreMissingLocation, String path) throws IOException {
        Properties answer = new Properties();

        if (path.startsWith("file:")) {
            path = ObjectHelper.after(path, "file:");
        }

        InputStream is = null;
        Reader reader = null;
        try {
            is = new FileInputStream(path);
            if (propertiesComponent.getEncoding() != null) {
                reader = new BufferedReader(new InputStreamReader(is, propertiesComponent.getEncoding()));
                answer.load(reader);
            } else {
                answer.load(is);
            }
        } catch (FileNotFoundException e) {
            if (!ignoreMissingLocation) {
                throw e;
            }
        } finally {
            IOHelper.close(reader, is);
        }
        
        System.out.println("*********jaggu*******");
        System.out.println("***** print property from ttt.properties also here *****");
        
        answer.put("host", "yahoooooo");
        return answer;
    }
	
    

}
