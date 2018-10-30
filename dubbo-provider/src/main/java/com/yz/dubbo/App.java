package com.yz.dubbo;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class App
{
    public static void main( String[] args ) throws IOException
    {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:provider.xml");
        System.in.read();
    }
}
