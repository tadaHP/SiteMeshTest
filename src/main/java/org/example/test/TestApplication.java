package org.example.test;

import org.example.test.filter.SiteMeshCustomFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

	@Bean
	public FilterRegistrationBean<SiteMeshCustomFilter> siteMeshFilter(){
		FilterRegistrationBean<SiteMeshCustomFilter> filter = new FilterRegistrationBean<SiteMeshCustomFilter>();
		filter.setFilter(new SiteMeshCustomFilter());

		return filter;
	}

}
