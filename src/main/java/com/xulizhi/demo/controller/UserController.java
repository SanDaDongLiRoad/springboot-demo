package com.xulizhi.demo.controller;

import com.xulizhi.demo.domain.Result;
import com.xulizhi.demo.dto.UserDTO;
import com.xulizhi.demo.service.UserService;
import com.xulizhi.demo.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author lenovo
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("queryUserList")
    public Result<List<UserDTO>> queryUserList(){
        return ResultUtil.success(userService.queryUserList());
    }
}
