package com.austin.pojo;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;

@Component
@ConfigurationProperties(prefix = "student")
@Validated
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Email
    private String name;
    private Integer age;
}
