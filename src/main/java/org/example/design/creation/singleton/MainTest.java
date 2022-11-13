package org.example.design.creation.singleton;

import java.util.Map;
import java.util.Properties;

public class MainTest {
    public static void main(String[] args) {

        Person person1 = Person.getPerson();
        Person person2 = Person.getPerson();
        System.out.println(person2 == person1);

//        Properties properties = System.getProperties();
//        System.out.println(properties);

        //获取当前系统的环境变量
        Map<String,String> getenv =  System.getenv();
        System.out.println(getenv);

    }
}
