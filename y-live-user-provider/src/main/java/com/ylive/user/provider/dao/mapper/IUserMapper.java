package com.ylive.user.provider.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ylive.user.provider.dao.po.UserPO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author idea
 * @Date: Created in 16:39 2023/5/12
 * @Description
 */
@Mapper
public interface IUserMapper extends BaseMapper<UserPO> {
}
