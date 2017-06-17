package com.chenwt;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;
import org.apache.ibatis.io.Resources;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by feini on 2017/6/17.
 */
public class EncacheTest {

    @Test
    public void testEhcache() throws IOException {
        String resource = "ehcache.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);


        CacheManager manager = CacheManager.newInstance(inputStream);
        // obtains a Cache called sampleCache1, which has been preconfigured in the configuration file
        Cache cache = manager.getCache("helloCache");
        // puts an element into a cache
        Element element = new Element("greeting", "Hello, World!");
        // 将一个Element添加到Cache
        cache.put(element);
        //The following gets a NonSerializable value from an element with a key of key1.
        Object value = element.getObjectValue();
        System.out.println(value.toString());

        String[] cacheNames = manager.getCacheNames();
        for (String cacheName:cacheNames
             ) {
            System.out.println("cacheName =="+cacheName);
        }
        manager.shutdown();
    }

}
