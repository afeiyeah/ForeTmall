package com.neuedu.ForeTmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ComponentScan("com.neuedu.ForeTmall")
@EnableTransactionManagement
public class ForeTmallApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForeTmallApplication.class, args);
	}

}
