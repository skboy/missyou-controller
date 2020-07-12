package com.missyou.controller.dashboard;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author skboy
 * @since v1.0.0
 */
@SpringBootApplication(scanBasePackages = "com.missyou")
@MapperScan(basePackages = "com.missyou.repository.core.mapper")
public class DashboardControllerApplication {

	@Bean
	public BCryptPasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}
	public static void main(String[] args) {
		SpringApplication.run(DashboardControllerApplication.class, args);
	}

}