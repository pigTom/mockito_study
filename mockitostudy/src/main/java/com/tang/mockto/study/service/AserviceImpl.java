package com.tang.mockto.study.service;

import com.tang.mockto.study.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author tangdunhong
 * @since 2020/7/6 6:45 PM
 **/
@Component
public class AserviceImpl implements Aservice{

    @Autowired
    private AMapper aMapper;

    public String getName(long id) {
        Student student = aMapper.findBy(id);
        return student.getName();
    }
}
