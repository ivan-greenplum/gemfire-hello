package com.vmware.gemfire;

import org.apache.geode.cache.client.ClientCacheFactory;
import org.apache.geode.cache.client.ClientRegionShortcut;
import org.apache.geode.cache.client.ClientCache;
import org.apache.geode.distributed.ConfigurationProperties;
import org.apache.geode.cache.Region;

public class GemFireHello {

    public static void main(String[] args) {
        
        String p_value;
        ClientCache cache;
	ClientCacheFactory factory;
        Region<Integer, String> region;

	factory = new ClientCacheFactory();

        // Specify Locator Host and Port that is running
        // change logging to be less verbose then default INFO
	factory.addPoolLocator("127.0.0.1", 10334);
	factory.set(ConfigurationProperties.LOG_LEVEL, "warn");
        cache = factory.create();

        // configure and create local proxy Region named example
        region = cache.<Integer, String>createClientRegionFactory( ClientRegionShortcut.PROXY).create("presidents");

        System.out.println("Cache with Local Proxy Region for 'presidents' created successfully");

        // create data
        region.put(4, "James Madison");
        region.put(5, "James Monroe");
        region.put(6, "John Quincy Adams");
        region.put(7, "Andew Jackson");
        region.put(8, "Martin Van Buren");
        region.put(9, "William Henry Harrison");
        region.put(10, "John Tyler");

        System.out.println("Data Inserted to Gemfire Successfully");

	for (int i = 4; i <= 10; i++) {

        	p_value = region.get(i);
    		System.out.println("President #" + i + " was " + p_value);
	}

        cache.close();
    }
}
