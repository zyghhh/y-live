package com.ylive.user.provider.rpc;

import com.ylive.user.dto.UserDTO;
import com.ylive.user.interfaces.IUserRPC;
import com.ylive.user.provider.service.IUserService;
import jakarta.annotation.Resource;
import org.apache.dubbo.config.annotation.DubboService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @desc:
 * @author: zyg
 * @date: 2024-05-03  21:49
 */
@DubboService
public class UserRpcImpl implements IUserRPC {
    @Resource
    private IUserService userService;
    private static final Logger logger = LoggerFactory.getLogger(UserRpcImpl.class);
    @Override
    public String getUserName() {
        logger.info("this is dubbo server test!");
        return "success";
    }


    @Override
    public UserDTO getByUserId(Long userId) {
        return userService.getByUserId(userId);
    }

    @Override
    public boolean updateUserInfo(UserDTO userDTO) {
        return userService.updateUserInfo(userDTO);
    }

    @Override
    public boolean insertOne(UserDTO userDTO) {
        return userService.insertOne(userDTO);
    }

}
