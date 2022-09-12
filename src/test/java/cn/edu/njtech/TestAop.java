package cn.edu.njtech;

import cn.edu.njtech.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author tim
 * @date 2022/9/7 10:22 上午
 */
public class TestAop {
    public static void main(String[] args) {
        
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        UserService userService = (UserService) context.getBean("userService");

        userService.login("tim", "778899");
    }
}
