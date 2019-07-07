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
        //制造冲突  云端
        //制造冲突 本地
        //创建分支
        //在分支上开发
        SpringApplication.run(LyApiGetway.class,args);
    }
}
