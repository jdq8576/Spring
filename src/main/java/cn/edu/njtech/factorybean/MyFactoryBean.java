package cn.edu.njtech.factorybean;

import cn.edu.njtech.entity.Student;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author tim
 * @date 2022/9/11 10:17 下午
 */

@Setter
@Getter
public class MyFactoryBean implements FactoryBean<Student>, InitializingBean, DisposableBean {

    private Student student;

    @Override
    public Student getObject() throws Exception {
        return student;
    }

    @Override
    public Class<?> getObjectType() {
        return MyFactoryBean.class;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy....");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet....");
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    @Override
    public String toString() {
        return "MyFactoryBean{" +
                "student=" + student +
                '}';
    }
}
