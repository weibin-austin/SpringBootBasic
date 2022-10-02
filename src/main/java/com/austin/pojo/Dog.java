package com.austin.pojo;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = "classpath:weibin.properties")
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Dog {
    @Value("${name}")
    private String name;

    @Value("${age}")
    private Integer age;


}
