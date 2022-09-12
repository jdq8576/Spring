package cn.edu.njtech.proxy;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author tim
 * @date 2022/9/7 10:17 上午
 */
public class Before implements MethodBeforeAdvice {
    /**
     * @param method  原始方法
     * @param objects 参数
     * @param o       增强对象
     * @throws Throwable
     */
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("-- new method before advice log --");
        method.invoke(o, objects);
    }
}
