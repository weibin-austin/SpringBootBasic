package com.austin;

import com.austin.pojo.Dog;
import com.austin.pojo.Person;
import com.austin.pojo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

// 单元测试
@SpringBootTest
class SpringLearningApplicationTests {

    @Autowired
    public Person person;

    @Autowired
    public Dog dog;

    @Autowired
    public Student student;

    @Test
    void contextLoads() {
//        System.out.println(dog);
//        System.out.println(person);
        System.out.println(student);
    }

}
