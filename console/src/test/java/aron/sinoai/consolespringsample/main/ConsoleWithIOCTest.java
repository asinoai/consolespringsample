package aron.sinoai.consolespringsample.main;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ConsoleWithIOCTest.TestAppConfig.class})
public class ConsoleWithIOCTest {

    private static TestHelloPrinter printer = new TestHelloPrinter();

    @Autowired
    private Console console;

    @Configuration
    public static class TestAppConfig {

        @Bean
        public Console console() {
            return new Console(helloPrinter());
        }


        @Bean
        public IHelloPrinter helloPrinter() {

            return printer;
        }

    }

    private static class TestHelloPrinter implements IHelloPrinter {

        private long counter;
        @Override
        public void print() {
            counter++;
        }

        public long getCounter() {
            return counter;
        }


    }

    @Test
    public void basicTest() throws Exception {
        console.runMain();

        Assert.assertEquals("Should be 2 print calls! ", 2, printer.getCounter());
    }
}
