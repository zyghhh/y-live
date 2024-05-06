package com.live.api.controller;

import com.ylive.user.dto.UserDTO;
import com.ylive.user.interfaces.IUserRPC;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @desc:
 * @author: zyg
 * @date: 2024-05-05  23:41
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @DubboReference
    private IUserRPC userRpc;

    @GetMapping("/getUserInfo")
    public UserDTO getUserInfo(Long userId) {
        return userRpc.getByUserId(userId);
    }

    @PostMapping("/updateUserInfo")
    public boolean getUserInfo(Long userId,String nickname) {
        UserDTO userDTO = new UserDTO();
        userDTO.setUserId(userId);
        userDTO.setNickName(nickname);
        return userRpc.updateUserInfo(userDTO);
    }


    @PostMapping("/insertOne")
    public boolean insertOne(Long userId) {
        UserDTO userDTO = new UserDTO();
        userDTO.setUserId(userId);
        userDTO.setNickName("idea-test");
        userDTO.setSex(1);
        return userRpc.insertOne(userDTO);
    }
}
