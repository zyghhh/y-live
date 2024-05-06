package com.ylive.user.provider.service.impl;

import com.ylive.common.interfaces.ConvertBeanUtils;
import com.ylive.user.dto.UserDTO;
import com.ylive.user.provider.dao.mapper.IUserMapper;
import com.ylive.user.provider.dao.po.UserPO;
import com.ylive.user.provider.service.IUserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;


/**
 * @Author idea
 * @Date: Created in 16:40 2023/5/12
 * @Description
 */
@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserMapper userMapper;

    @Override
    public UserDTO getByUserId(Long userId) {
        if (userId == null) {
            return null;
        }
        return ConvertBeanUtils.convert(userMapper.selectById(userId), UserDTO.class);
    }

    @Override
    public boolean updateUserInfo(UserDTO userDTO) {
        if (userDTO == null || userDTO.getUserId() == null) {
            return false;
        }
        userMapper.updateById(ConvertBeanUtils.convert(userDTO, UserPO.class));
        return true;
    }

    @Override
    public boolean insertOne(UserDTO userDTO) {
        if (userDTO == null || userDTO.getUserId() == null) {
            return false;
        }
        userMapper.insert(ConvertBeanUtils.convert(userDTO, UserPO.class));
        return true;
    }
}
