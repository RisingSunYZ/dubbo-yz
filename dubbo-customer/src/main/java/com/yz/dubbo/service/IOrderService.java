package com.yz.dubbo.service;

import com.yz.dubbo.exception.UserException;
import com.yz.dubbo.model.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IOrderService {

    List<User> getAllUser() throws UserException;
}
