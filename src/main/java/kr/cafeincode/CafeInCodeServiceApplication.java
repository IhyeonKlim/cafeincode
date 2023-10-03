package kr.cafeincode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CafeInCodeServiceApplication {
    public static void main(String[] args){
        SpringApplication.run(CafeInCodeServiceApplication.class, args);

        System.out.println("Server is running. Cafe in code.");

    }
}
