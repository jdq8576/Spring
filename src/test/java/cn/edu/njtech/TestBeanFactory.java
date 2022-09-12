package cn.edu.njtech;

import cn.edu.njtech.entity.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author tim
 * @date 2022/9/11 9:56 下午
 */
public class TestBeanFactory {
    public static void main(String[] args) {
        /**
         * ClassPathXmlApplicationContext 实现了BeanFactory
         */
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        Student student = (Student) context.getBean("student");

        // true
        System.out.println(context.containsBean("student"));

        // true
        System.out.println(context.isSingleton("student"));

        // false
        System.out.println(context.isPrototype("student"));

        // class cn.edu.njtech.entity.Student
        Class<?> aClass = context.getType("student");
        System.out.println(aClass.toString());

        // true
        Class<?> aClass1 = new Student().getClass();
        System.out.println(context.isTypeMatch("student", aClass1));


        /**
         * 1
         * student2
         */
        final String[] aliases = context.getAliases("stu");
        System.out.println(aliases.length);
        for (String alias : aliases) {
            System.out.println(alias);
        }
    }
}
