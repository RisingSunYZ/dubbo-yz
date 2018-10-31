package com.yz.dubbo;

import com.yz.dubbo.api.IUserService;
import com.yz.dubbo.service.IOrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args ) throws IOException
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "classpath:customer.xml" });


        final IUserService demoService = (IUserService) context.getBean("userService");

        System.out.println(demoService.getUser());
        System.in.read();
    }
}
