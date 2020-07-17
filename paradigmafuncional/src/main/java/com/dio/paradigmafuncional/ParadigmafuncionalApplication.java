package com.dio.paradigmafuncional;

import com.dio.paradigmafuncional.Source.Sourcing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ParadigmafuncionalApplication {

	public static void main(String[] args) {

	   // SpringApplication.run(ParadigmafuncionalApplication.class, args);
		Sourcing.showit();
	}

}
