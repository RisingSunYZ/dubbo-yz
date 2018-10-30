package com.yz.dubbo.service.impl;

import com.yz.dubbo.api.IUserService;
import com.yz.dubbo.exception.UserException;
import com.yz.dubbo.model.User;
import com.yz.dubbo.service.IOrderService;

import javax.annotation.Resource;
import java.util.List;

public class OrderServiceImpl implements IOrderService{

    private IUserService userService;

    @Override
    public List<User> getAllUser() throws UserException {
        return this.userService.getUser();
    }
}
