package pojo.practice;

import kr.cafeincode.config.MyBatisConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

@Slf4j
@Import(MyBatisConfig.class)
@SpringBootApplication(scanBasePackages = "kr.cafeincode")
public class CicApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		String [] beanNames = context.getBeanDefinitionNames();
		SpringApplication.run(CicApplication.class, args);
		System.out.println("Server is running. Welcome to CafeInCode.");
	}

}
