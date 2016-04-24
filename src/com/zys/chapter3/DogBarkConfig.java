package com.zys.chapter3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DogBarkConfig {
	
	@Bean
	public Cat whiteCat() {
		return new Cat("white");
	}
	
	@Bean
	public Cat blackCat() {
		return new Cat("black");
	}
	
	@Bean
	public Dog blackDog() {
		return new BlackDog(whiteCat());
	}
	
	@Bean
	public Dog whiteDog() {
		return new WhiteDog(blackCat());
	}
	
}
