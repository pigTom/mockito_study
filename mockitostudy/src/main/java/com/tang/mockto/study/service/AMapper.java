package com.tang.mockto.study.service;

import com.tang.mockto.study.entity.Student;

/**
 * @author tangdunhong
 * @since 2020/7/6 6:42 PM
 **/
public interface AMapper {
    Student findBy(long id);
}
