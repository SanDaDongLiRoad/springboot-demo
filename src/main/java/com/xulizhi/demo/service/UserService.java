package com.xulizhi.demo.service;

import com.xulizhi.demo.dto.UserDTO;

import java.util.List;

public interface UserService {

    /**
     * 查询账户列表
     * @return
     */
    List<UserDTO> queryUserList();

    /**
     * 根据账户ID查询账户
     */
    UserDTO queryUserById(String userId);
}
