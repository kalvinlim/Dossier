package com.dossier.init;


import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.dossier")
public class Application {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {		
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		//debugBeans(ctx);
	}

	public static void debugBeans(ApplicationContext ctx) {
		System.out.println("Let's inspect the beans provided by Spring Boot:");

		String[] beanNames = ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for (String beanName : beanNames) {
			//if (beanName.charAt(0) == 'b' || beanName.charAt(0) == 'B')
				System.out.println(beanName);
		}
	}

}