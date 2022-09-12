package cn.edu.njtech;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowired {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        final Object object = context.getBean("teacher");
        System.out.println(object);
    }
}
