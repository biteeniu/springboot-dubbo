package com.biteeniu.dubbo.provider.controller;

import com.biteeniu.dubbo.api.response.ExtraResponse;
import com.biteeniu.dubbo.api.response.Response;
import com.biteeniu.dubbo.api.response.ResponseEnum;
import com.biteeniu.dubbo.provider.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试用途的Controller
 * @author BiteeNiu
 * @date 2018/9/8 10:58
 */
@RestController
@RequestMapping(path = "/test")
public class TestController {

    private final TestService testService;

    @Autowired
    public TestController(TestService testService) {
        this.testService = testService;
    }

    /**
     * 获取用户的地址，入参方式：?username={username}
     * @param username 用户名称
     * @return
     */
    @GetMapping(path = "/address")
    public Response getUserAddress(@RequestParam String username) {
        return new ExtraResponse(ResponseEnum.SUCCESS, testService.getUserAddress(username));
    }

}