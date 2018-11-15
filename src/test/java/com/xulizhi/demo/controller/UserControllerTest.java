package com.xulizhi.demo.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.Assert.*;

@SpringBootTest
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
public class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void queryUserList() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/user/queryUserList")).andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    public void queryUserById() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/user/queryUserById?userId=f9059929503d4923bcc0d7eada186e27")).andExpect(MockMvcResultMatchers.status().isOk());
    }
}