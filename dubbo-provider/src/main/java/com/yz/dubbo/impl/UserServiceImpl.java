package com.yz.dubbo.impl;

import com.yz.dubbo.api.IUserService;
import com.yz.dubbo.exception.UserException;
import com.yz.dubbo.model.User;

import java.util.Arrays;
import java.util.List;

public class UserServiceImpl implements IUserService{

    @Override
    public List<User> getUser() throws UserException {


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("被调用了3............");

        return Arrays.asList(new User[]{new User(1,"yz","china","hlj")
                ,new User(2,"zwl","china","ah")
                ,new User(3,"hhj","china","zj")});
    }
}
