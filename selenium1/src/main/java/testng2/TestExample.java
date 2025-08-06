package testng2;

import org.testng.annotations.Test;

public class TestExample {
    @Test                //(groups = {"sanity"})
    public void test() throws Exception{
        String fname = "Zainav ";
        String lname = "parveen";
        Thread.sleep(2000);
        System.out.println("fullname : " + fname+lname);
    }
       @Test       //(groups = {"regression","sanity"})              // (invocationCount = 4)
    public void test1() throws Exception {
        Thread.sleep(2000);
        String fname1 = "sajid ";
        String lname1 = "ali";
        System.out.println("fullname1 : " + fname1 + lname1);
    }
}
