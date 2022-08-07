package io.usama.springboot.courseapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class VendorsApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(VendorsApiApplication.class, args);
    }
}
