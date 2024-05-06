package com.live.api.controller;

import com.ylive.user.interfaces.IUserRPC;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @desc:
 * @author: zyg
 * @date: 2024-05-04  0:02
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @DubboReference(url = "127.0.0.1:9091")
    private IUserRPC userRpc;

    @GetMapping("/dubbo")
    public String dubbo(){
        return userRpc.getUserName();
    }
}
