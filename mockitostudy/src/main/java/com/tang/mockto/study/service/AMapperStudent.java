package com.tang.mockto.study.service;

import com.tang.mockto.study.entity.Student;
import org.springframework.stereotype.Component;

/**
 * @author tangdunhong
 * @since 2020/7/6 6:44 PM
 **/
@Component
public class AMapperStudent implements AMapper {
    public Student findBy(long id) {
        Student student = new Student();
        student.setName("tnag");
        student.setSex("male");
        return student;
    }
}
