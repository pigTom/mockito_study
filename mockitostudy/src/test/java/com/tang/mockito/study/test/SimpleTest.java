package com.tang.mockito.study.test;

import com.tang.mockto.study.entity.Student;
import com.tang.mockto.study.service.AMapper;
import com.tang.mockto.study.service.Aservice;
import com.tang.mockto.study.service.AserviceImpl;
import com.tang.mockto.study.service.SimpleService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

/**
 * @author tangdunhong
 * @since 2020/7/6 6:18 PM
 **/
public class SimpleTest {

    @Mock
    private AMapper aMapper;
    @InjectMocks
    private AserviceImpl aservice;

    @Before
    public void init() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testString() {
        String word = "hello world1";
        String word2 = "hello world2";
        SimpleService simpleService = mock(SimpleService.class);
        // excepted-run-verify
        when(simpleService.say(Mockito.anyString())).thenReturn(word);
        Assert.assertEquals(simpleService.say("another"), word2);
        System.out.println(simpleService.say(word2));
    }

    @Test
    public void testName() throws Exception{
        Student student = new Student();
        student.setSex("female");
        student.setName("tang");
        when(aMapper.findBy(12345)).thenReturn(student);
        when(aMapper.findBy(12345678L)).thenReturn(student);
        when(aservice.getName(12345L)).thenReturn("tang");
        when(aservice.getName(12345678L)).thenReturn("bbb");
        System.out.println(aservice.getName(12345L));
        System.out.println(aservice.getName(12345678L));
    }
}
