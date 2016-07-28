package com.hybrid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class MosaicWeb2Application {

	public static void main(String[] args) {
		SpringApplication.run(MosaicWeb2Application.class, args);
	}
}
