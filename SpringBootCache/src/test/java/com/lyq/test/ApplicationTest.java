package com.lyq.test;

import com.lyq.CacheApplication;
import com.lyq.pojo.Student;
import com.lyq.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CacheApplication.class)
public class ApplicationTest {
    @Autowired
    private StudentService studentService;

    @Test
    public void test() throws Exception {
        Student student1 = this.studentService.queryStuBySno("210");
        System.out.println("学号为[" + student1.getStuno() + "]的学生姓名为：" + student1.getStuname());

        student1.setStuname("test");
        this.studentService.updateStu(student1);

        Student student2 = this.studentService.queryStuBySno("210");
        System.out.println("学号为[" + student2.getStuno() + "]的学生姓名为：" + student2.getStuname());
    }
}
