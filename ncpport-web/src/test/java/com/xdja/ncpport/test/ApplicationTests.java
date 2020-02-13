package com.xdja.ncpport.test;

import com.xdja.ncpport.ApplicationBootstrap;
import com.xdja.ncpport.redis.service.RedisService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes={ApplicationBootstrap.class})// 指定启动类
public class ApplicationTests {

    @Autowired
    private RedisService redisService;

    @Test
    public void test(){
        redisService.put("1","1",10000);
        String re = (String) redisService.get("1" );
        System.out.println( re );
    }

}
