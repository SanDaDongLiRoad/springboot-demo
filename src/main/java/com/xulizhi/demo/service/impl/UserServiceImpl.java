package com.xulizhi.demo.service.impl;

import com.xulizhi.demo.enums.DeletedStatusEnum;
import com.xulizhi.demo.domain.User;
import com.xulizhi.demo.dto.UserDTO;
import com.xulizhi.demo.repository.UserRepository;
import com.xulizhi.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Cacheable(value = "UserInfo",keyGenerator = "simpleKeyGenerator") // 3000秒
    @Override
    public List<UserDTO> queryUserList() {

        log.info("查询数据库-----------------------------------------------------------------");
        List<UserDTO> userDTOList = new ArrayList<UserDTO>();
        List<User> userList = userRepository.findByDeleted(DeletedStatusEnum.NOTDEL.getCode());
        for(int i=0;i<userList.size();i++){
            UserDTO userDTO = new UserDTO();
            User user = userList.get(i);
            userDTO.setId(user.getId());
            userDTO.setName(user.getName());
            userDTO.setPassword(user.getPassword());
            userDTO.setAge(user.getAge());
            userDTOList.add(userDTO);
        }
        return userDTOList;
    }

    @Cacheable(value = "UserInfo",keyGenerator = "simpleKeyGenerator") // 3000秒
    @Override
    public UserDTO queryUserById(String userId) {
        log.info("查询数据库-----------------------------------------------------------------");
        UserDTO userDTO = new UserDTO();
        User user = userRepository.getOne(userId);
        userDTO.setId(user.getId());
        userDTO.setName(user.getName());
        userDTO.setPassword(user.getPassword());
        userDTO.setAge(user.getAge());
        return userDTO;
    }
}
