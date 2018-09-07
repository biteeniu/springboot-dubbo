package com.biteeniu.dubbo.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * 程序启动类
 * @author BiteeNiu
 * @date 2018/9/7 16:21
 */
@SpringBootApplication
@ImportResource(locations = "classpath:dubbo-service-provider.xml")
public class Launcher {

    /**
     * 程序启动入口方法
     * @param args args
     */
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Launcher.class, args);
    }

}