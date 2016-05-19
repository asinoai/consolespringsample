package aron.sinoai.consolespringsample.main;

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
