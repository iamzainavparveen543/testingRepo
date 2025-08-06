package testng2;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(testng2.Listeners1.class)
public class TestNgExample {
    @Test (timeOut = 3000)            //(groups = {"sanity"})         //(enabled = false)
    public void addTwoNum() throws Exception{
        Thread.sleep(4000);
        int a = 5;
        int b = 8;
        System.out.println("a + b = " +a + b);
    }
    @Test(dependsOnMethods = "addTwoNum")       //(groups = {"regression"})          // (timeOut = 4000)          //              //(priority = 1)
    public void subtraction() throws Exception{
        Thread.sleep(3000);
        int x = 10;
        int y = 5;
        System.out.println("x - y = " +(x - y));
    }
    @Test         //(groups = {"regression"})
    public void multiply()throws Exception{
        int c = 12;
        int d = 2;
        Thread.sleep(3000);
        System.out.println("c * d = " +c * d);
    }
}
