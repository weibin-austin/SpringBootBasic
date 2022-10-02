package com.austin.pojo;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/*
@ConfigurationProperties(prefix = "person")
将配置文件中配置的每一个属性的值，映射到这个组建中；告诉SpringBoot将本类中的所有属性和配置文件中的相关配置进行绑定
参数 prefix = "person"：将配置文件中的person下面的所有属性一一对应
只有这个组建是容器中的组件，才能使用容器提供的@ConfigurationProperties 功能
 */
@Component // 注册bean
@ConfigurationProperties(prefix = "person")
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String name;
    private Integer age;
    private boolean happy;
    private Date birth;
    private Map<String, Object> maps;
    private List<Object> lists;
    private Dog dog;

}
