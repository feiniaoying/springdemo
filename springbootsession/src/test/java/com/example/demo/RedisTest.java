package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by feini on 2017/6/6.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {

    @Autowired
    RedisTemplate<String, String> redisTemplate;

    @Test
        public void redisTest() {
        String key = "redisTestKey";
        String value = "I am test value";

        ValueOperations<String, String> opsForValue = redisTemplate.opsForValue();

        //数据插入测试：
        opsForValue.set(key, value);
        String valueFromRedis = opsForValue.get(key);
        System.out.println("redis value after set: {}"+ valueFromRedis);

        //数据删除测试：
        redisTemplate.delete(key);
        valueFromRedis = opsForValue.get(key);
        System.out.println("redis value after delete: {}"+valueFromRedis);
    }



    @Test
    public void contextLoads() {
    }

}
