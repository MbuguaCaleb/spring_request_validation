package com.codewithcaleb.requestvalidation.service;


import com.codewithcaleb.requestvalidation.dto.UserRequest;
import com.codewithcaleb.requestvalidation.entity.User;
import com.codewithcaleb.requestvalidation.exceptions.UserNotFoundException;
import com.codewithcaleb.requestvalidation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public User saveUser(UserRequest userRequest){

        User user = User.build(0, userRequest.getName(),userRequest.getEmail(),userRequest.getMobile(),userRequest.getGender(),userRequest.getAge(),userRequest.getNationality());
        return userRepository.save(user);
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User getUser(int id) throws UserNotFoundException {
        User user = userRepository.findByUserId(id);
        if(user !=null){
            return user;
        }else {
            throw new UserNotFoundException("User Not Found with id :" + id);
        }

    }
}
