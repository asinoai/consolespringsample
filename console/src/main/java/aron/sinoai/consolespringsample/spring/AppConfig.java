package aron.sinoai.consolespringsample.spring;

import aron.sinoai.consolespringsample.main.HelloWorldPrinter;
import aron.sinoai.consolespringsample.main.IHelloPrinter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan
public class AppConfig {

    @Bean
    public IHelloPrinter helloPrinter() {

        return new HelloWorldPrinter(0);
    }

}