package testng1;

import org.testng.annotations.Test;

public class Sample {

    @Test
    public void method() {
        System.out.println("hello world");
    }

    @Test
    public void myMethod() {
        int a = 10;
        int b = 5;
        int c = a + b;
        System.out.println("a + b = " + c);
    }
}
