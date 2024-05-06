package com.ylive.user.interfaces;

import com.ylive.user.dto.UserDTO;

/**
 * @desc:
 * @author: zyg
 * @date: 2024-05-03  18:15
 */
public interface IUserRPC {
    String getUserName();

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
