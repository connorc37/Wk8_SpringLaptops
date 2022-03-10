package demo.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import demo.beans.Laptop;
import demo.beans.Specification;

/**
 * @author Corey Connor - cconnor3
 * CIS175 - Spring 2022
 * Mar 10, 2022
 */

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Laptop laptop() {
		// Constructor injection
		Laptop bean = new Laptop("Default brand", "model");
		return bean;
	}
	
	@Bean
	public Specification specification() {
		Specification bean = new Specification();
		// Setter injection
		bean.setProcessor("Default processor");
		bean.setOs("os");
		bean.setVideoCard("video card");
		bean.setMemoryGb(8);
		bean.setHardDriveGb(256);
		return bean;
	}

}
