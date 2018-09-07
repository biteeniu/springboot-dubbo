package com.biteeniu.dubbo.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 程序启动类
 * @author BiteeNiu
 * @date 2018/9/7 16:35
 */
@SpringBootApplication
@ImportResource(locations = "classpath:dubbo-service-consumer.xml")
@EnableScheduling
public class Launcher {

    /**
     * 程序启动入口方法
     * @param args args
     */
    public static void main(String[] args) {
        SpringApplication.run(Launcher.class, args);
    }

}
