package com.yz.dubbo;

import com.yz.dubbo.api.IUserService;
import com.yz.dubbo.service.IOrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "classpath:customer.xml" });


        final IUserService demoService = (IUserService) context.getBean("userService");

        System.out.println(demoService.getUser());
    }
}
