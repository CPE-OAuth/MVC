package com.huawei.servicecomb;

import org.apache.servicecomb.springboot.starter.provider.EnableServiceComb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableServiceComb
public class CseDemoApplication {
    public static void main(String[] args) {
         SpringApplication.run(CseDemoApplication.class,args);
    }
}
