package com.atguigu.mybatis_plus_test.mapper;

import com.atguigu.mybatis_plus_test.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
