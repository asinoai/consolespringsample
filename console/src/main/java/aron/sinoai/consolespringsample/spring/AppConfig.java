package aron.sinoai.consolespringsample.spring;

import aron.sinoai.consolespringsample.main.Console;
import aron.sinoai.consolespringsample.main.HelloWorldPrinter;
import aron.sinoai.consolespringsample.main.IHelloPrinter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {

    @Bean
    public Console console() {
        return new Console(helloPrinter());
    }

    @Bean
    public IHelloPrinter helloPrinter() {

        return new HelloWorldPrinter(0);
    }

}