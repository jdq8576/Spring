package cn.edu.njtech;

import cn.edu.njtech.entity.Student;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author tim
 * @date 2022/9/11 10:21 下午
 */
public class TestFactoryBean {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        FactoryBean<Student> factoryBeanStudent = (FactoryBean<Student>) context.getBean("&factoryBeanStudent");
        FactoryBean<Student> factoryBeanStudent1 = (FactoryBean<Student>) context.getBean("&factoryBeanStudent");

        System.out.println(factoryBeanStudent);

        System.out.println(factoryBeanStudent == factoryBeanStudent1);
    }
}
