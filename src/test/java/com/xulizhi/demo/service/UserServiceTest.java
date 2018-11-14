package com.xulizhi.demo.service;

import com.xulizhi.demo.dto.UserDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void queryUserList() {
        List<UserDTO> userDTOList = userService.queryUserList();
        for(UserDTO userDTO : userDTOList){
            System.out.println(userDTO);
        }
    }

    @Test
    public void queryUserById() {
        UserDTO userDTO = userService.queryUserById("f9059929503d4923bcc0d7eada186e27");
        System.out.println(userDTO);
    }
}