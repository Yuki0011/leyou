package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class LyApiGetway {
    public static void main(String[] args) {
      //小袁来了
        //小袁又走了
      //校长来了
        //本地
      
        SpringApplication.run(LyApiGetway.class,args);
    }
}
