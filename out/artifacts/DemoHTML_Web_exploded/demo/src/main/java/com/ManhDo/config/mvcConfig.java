package com.ManhDo.config;

import com.ManhDo.controller.HomePageController;
import com.ManhDo.controller.RegisterController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.support.WebApplicationObjectSupport;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackageClasses = HomePageController.class)
public class mvcConfig extends WebApplicationObjectSupport {

    @Bean
    public ViewResolver viewResolver(){
         return new InternalResourceViewResolver("WEB-INF/jsp/",".jsp");
    }

}
