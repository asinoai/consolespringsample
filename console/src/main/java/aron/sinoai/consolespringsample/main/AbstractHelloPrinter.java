package aron.sinoai.consolespringsample.main;

/**
 */
public abstract class AbstractHelloPrinter implements IHelloPrinter{

    private int counter;
    private final int step;

    public AbstractHelloPrinter(final int counterStartIndex, final int step) {
        counter = counterStartIndex;
        this.step = step;
    }

    protected void incrementCounter() {
        counter += 2;
        System.out.println(counter);
    }
}
