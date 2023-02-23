package com.ngochung.springevent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringEventApplication {

    @Autowired
    private MyHouse myHouse;

    public static void main(String[] args) {
        SpringApplication.run(SpringEventApplication.class, args

        );
    }

    @Bean
    CommandLineRunner run() {
        return args -> {
            System.out.println(Thread.currentThread().getName() + ": NgocHung đi tới cửa nhà !!!");
            System.out.println(Thread.currentThread().getName() + ": => NgocHung bấm chuông và khai báo họ tên!");
            myHouse.rangDoorbellBy("NgocHung");
            System.out.println(Thread.currentThread().getName() + ": NgocHung quay lưng bỏ đi");
        };
    }
}
