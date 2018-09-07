package com.biteeniu.dubbo.consumer.scheduled;

import com.biteeniu.dubbo.api.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 定时任务类
 * @author BiteeNiu
 * @date 2018/9/7 16:39
 */
@Component
public class ScheduledTask {

    private final static Logger LOGGER = LoggerFactory.getLogger(ScheduledTask.class);
    private final UserService userService;

    @Autowired
    public ScheduledTask(UserService userService) {
        this.userService = userService;
    }

    /**
     * 每隔5秒钟调用一次远程的Dubbo服务接口
     */
    @Scheduled(initialDelay = 5000L, fixedDelay = 5000L)
    public void invokeRemoteDubboService() {
        LOGGER.info("Service consumer: {}", userService.sayHello("BiteeNiu"));
    }

}
