package com.ghy.boot.controller;
import com.ghy.boot.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {

    @Autowired
    private Person person;

    @GetMapping("/person")
    public Person hello(){
        return person;
    }

    @Value("${JAVA_HOME}")
    private String msg;

    @Value("${os.name}")
    private String osName;

    @GetMapping("/osname")
    public String geOsName(){
        return osName;
    }

    @GetMapping("/msg")
    public String getMsg(){
        return msg;
    }

}
