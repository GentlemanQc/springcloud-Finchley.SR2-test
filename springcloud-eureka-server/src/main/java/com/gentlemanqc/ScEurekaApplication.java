package com.gentlemanqc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: GentlemanQcc
 * @date: 2018/10/22
 */
@EnableEurekaServer //启动一个服务注册中心提供给其他应用进行对话
@SpringBootApplication //注解等价于以默认属性使用 @Configuration ，@EnableAutoConfiguration 和 @ComponentScan 。
public class ScEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScEurekaApplication.class, args);
    }
}