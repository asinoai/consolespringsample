package aron.sinoai.consolespringsample.main;

import org.junit.Assert;
import org.junit.Test;

/**
 */


public class ConsoleTest {

    @Test
    public void basicTest() {

        final int[] counter = {0};

        final Console console = new Console(new IHelloPrinter() {
            @Override
            public void print() {

                counter[0]++;
            }
        });

        console.runMain();

        Assert.assertEquals("Should be 2 print calls! ", 2, counter[0]);

    }
}
