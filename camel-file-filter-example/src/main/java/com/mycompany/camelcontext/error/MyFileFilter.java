package com.mycompany.camelcontext.error;

import org.apache.camel.component.file.GenericFile;
import org.apache.camel.component.file.GenericFileFilter;
import org.apache.log4j.Logger;

public class MyFileFilter<T> implements GenericFileFilter<T> {
	
	private Logger logger = Logger.getLogger(getClass());
	@Override
	public boolean accept(GenericFile<T> file) {
		// TODO Auto-generated method stub
		if (file.isDirectory()) {
            return true;
        }
        // we dont accept any files starting with skip in the name
		logger.info("filename: "+file.getFileName());
        return !file.getFileName().startsWith("skip");
	}

}
