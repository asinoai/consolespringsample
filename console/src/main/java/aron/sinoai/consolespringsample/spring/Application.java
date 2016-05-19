package aron.sinoai.consolespringsample.spring;

import aron.sinoai.consolespringsample.main.Console;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 */
public class Application {
    public static void main(String[] args) {

        final ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        context.registerShutdownHook();

        final Console console = context.getBean(Console.class);
        console.runMain();

    }
}
