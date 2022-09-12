package cn.edu.njtech.entity;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Teacher {

    @Autowired(required = false)
    @Qualifier(value = "student")
    public Student student;


    @Resource(name = "student", type = Student.class)
    private Student student1;

}
