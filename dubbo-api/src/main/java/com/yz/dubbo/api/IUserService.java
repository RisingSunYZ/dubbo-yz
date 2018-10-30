package com.yz.dubbo.api;

import com.yz.dubbo.exception.UserException;
import com.yz.dubbo.model.User;

import java.util.List;

public interface IUserService {

    public List<User> getUser() throws UserException;
}
