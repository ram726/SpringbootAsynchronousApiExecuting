package com.example.SpringbootAsyncApiCall.UserApi;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {
   private UserRepository userRepository;

    public List<UserBean> getAllUser(){
        List<UserBean> userBeanList=userRepository.fetchUser();
        return userBeanList;
    }
}

