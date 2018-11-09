package com.xulizhi.demo.service.impl;

import com.xulizhi.demo.enums.DeletedStatusEnum;
import com.xulizhi.demo.domain.User;
import com.xulizhi.demo.dto.UserDTO;
import com.xulizhi.demo.repository.UserRepository;
import com.xulizhi.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServoceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserDTO> queryUserList() {

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
}
