package com.esr.app.cacheviewer;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * CacheViewer Application initializer
 * @author Enrique Sanchez
 *
 */
@SpringBootApplication
public class CacheviewerApplication {

	private static final Logger LOGGER = Logger.getLogger(CacheviewerApplication.class);
	
    public static void main(String[] args) {
    	LOGGER.info("Starting CacheViewer ...");
    	
        SpringApplication.run(CacheviewerApplication.class, args);
        
        LOGGER.info("CacheViewer Initialized ...");
        LOGGER.info("Launch http://localhost/cacheviewer/search in a browser to access the search form...");
    }
}
