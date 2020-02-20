/**
 * @filename App.java
 * @author lg
 * @date 2019年12月30日 上午11:03:11
 * @version 1.0
 * Copyright (C) 2019 
 */

package com.imti.citic;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.imti.citic.mapper")
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);

	}

}
