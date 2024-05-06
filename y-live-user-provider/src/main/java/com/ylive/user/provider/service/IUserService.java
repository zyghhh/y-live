package com.ylive.user.provider.service;


import com.ylive.user.dto.UserDTO;

/**
 * @Author idea
 * @Date: Created in 16:40 2023/5/12
 * @Description
 */
public interface IUserService {

    /**
     * 根据用户id进行查询
     *
     * @param userId
     * @return
     */
    UserDTO getByUserId(Long userId);

    /**
     * 用户信息更新
     *
     * @param userDTO
     * @return
     */
    boolean updateUserInfo(UserDTO userDTO);

    /**
     * 插入用户信息
     *
     * @param userDTO
     * @return
     */
    boolean insertOne(UserDTO userDTO);
}
