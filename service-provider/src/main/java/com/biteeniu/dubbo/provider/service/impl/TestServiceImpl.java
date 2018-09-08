package com.biteeniu.dubbo.provider.service.impl;

import com.biteeniu.dubbo.provider.service.TestService;
import org.springframework.stereotype.Service;

/**
 * 测试用途
 * @author BiteeNiu
 * @date 2018/9/8 11:03
 */
@Service
public class TestServiceImpl implements TestService {

    @Override
    public String getUserAddress(String username) {
        return username + "的地址: 皇后大道101号";
    }

}
