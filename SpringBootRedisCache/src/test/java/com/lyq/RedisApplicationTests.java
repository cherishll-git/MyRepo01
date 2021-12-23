package com.lyq;


import com.lyq.util.RedisUtils;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class RedisApplicationTests {
    @Resource
    private RedisUtils redisUtils;

    @Test
    void contextLoads() {
        redisUtils.set("redis_key", "redis_vale");
    }

    /**
     * 读取缓存数据
     */
    @Test
    public void get() {
        String value = redisUtils.get("redis_key");
        System.out.println(value);
    }


}
