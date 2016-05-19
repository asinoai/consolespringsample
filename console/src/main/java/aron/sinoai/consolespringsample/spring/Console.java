package aron.sinoai.consolespringsample.spring;

import aron.sinoai.consolespringsample.main.IHelloPrinter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Console  {

    @Autowired
    private IHelloPrinter printer;

    public static void main(String[] args) {

        final ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        context.registerShutdownHook();

        final Console console = context.getBean(Console.class);
        console.runMain();

    }

    private void runMain() {
        System.out.println("Start!");

        printer.print();
        printer.print();

    }
}
