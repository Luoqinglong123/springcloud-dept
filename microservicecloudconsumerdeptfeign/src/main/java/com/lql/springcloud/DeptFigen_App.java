package com.lql.springcloud;

import com.lql.rule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.lql.springcloud"})
@ComponentScan("com.lql.springcloud")
public class DeptFigen_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptFigen_App.class,args);
    }
}
