package com.thomas.springdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author yanzou
 * @version V1.0.0
 * @date 2024/8/21
 * @description
 **/
@RestController
public class BatchTestController {

    @GetMapping("/year")
    public String year(){
        System.out.println("年次処理");
        String now = "年次処理:" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(now);
        return now;
    }

    @GetMapping("/week")
    public String week(){
        System.out.println("月次処理");
        String now = "月次処理:" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(now);
        return now;
    }

    @GetMapping("/month")
    public String month(){
        String now = "週次処理:" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(now);
        return now;
    }


    @GetMapping("/day")
    public String day(){
        String now = "日次处理:" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(now);
        return now;
    }

    @GetMapping("/min")
    public String min(){
        String now = "分間隔処理:" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(now);
        return now;
    }

    @GetMapping("/hour")
    public String hour(){
       String now = "時間隔処理:" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
       System.out.println(now);
       return now;
    }
}
