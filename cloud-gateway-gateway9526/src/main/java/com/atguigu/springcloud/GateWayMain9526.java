package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @auther zzyy
 * @create 2020-02-21 11:02
 */
@SpringBootApplication
@EnableEurekaClient
public class GateWayMain9526
{
    public static void main(String[] args) {
            SpringApplication.run(GateWayMain9526.class, args);
    }
}
