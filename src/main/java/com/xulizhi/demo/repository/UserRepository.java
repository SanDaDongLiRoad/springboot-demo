package com.xulizhi.demo.repository;

import com.xulizhi.demo.domain.User;
import com.xulizhi.demo.dto.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,String> {

    List<User> findByDeleted(Integer deleted);
}
