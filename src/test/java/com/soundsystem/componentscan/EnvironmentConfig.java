package com.soundsystem.componentscan;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:com/soundsystem/app.properties")
@ComponentScan({ "com.soundsystem.componentscan" })
public class EnvironmentConfig {
	
	//can not miss a placeholderConfigurer which will be used to inject placeholder values
	//with out this bean, artist will be "${dis.artist}" instand of "The beatles"
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
}
