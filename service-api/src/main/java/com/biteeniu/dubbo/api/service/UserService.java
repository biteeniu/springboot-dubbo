package com.biteeniu.dubbo.api.service;

/**
 * 用户相关的Dubbo服务接口定义类
 * @author BiteeNiu
 * @date 2018/9/7 15:33
 */
public interface UserService {

    /**
     * 向用户Say Hello
     * @param username 用户名称
     * @return
     */
    String sayHello(String username);

}
