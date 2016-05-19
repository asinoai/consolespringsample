package aron.sinoai.consolespringsample.main;

import aron.sinoai.consolespringsample.main.IHelloPrinter;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Console  {

    private final IHelloPrinter printer;

    public Console(final IHelloPrinter printer) {
        this.printer = printer;
    }

    public void runMain() {
        System.out.println("Start!");

        printer.print();
        printer.print();

    }
}
