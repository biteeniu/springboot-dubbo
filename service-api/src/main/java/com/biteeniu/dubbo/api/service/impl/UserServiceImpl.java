package com.biteeniu.dubbo.api.service.impl;

import com.biteeniu.dubbo.api.service.UserService;
import com.biteeniu.dubbo.api.utils.JodaTimeUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 用户相关的Dubbo服务接口的实现类
 * @author BiteeNiu
 * @date 2018/9/7 15:35
 */
public class UserServiceImpl implements UserService {

    private final static Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public String sayHello(String username) {
        LOGGER.info("Service provider: User[{}] login at [{}], say hello to {}.", username, JodaTimeUtils.formatDateTimeNow(), username);
        return "Hello, " + username + "!";
    }

}
