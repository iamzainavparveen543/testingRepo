package testng2;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
    @Parameters("SampleParameter")
    @Test
    void name(String fname){
        System.out.println(fname);
    }
    @Parameters("SampleParameter1")
    @Test
    void name1(String lname){
        System.out.println(lname);
    }
    @Parameters("anotherParameter")
    @Test
    void name2(String fullname){
        System.out.println(fullname);
    }
    @Parameters({"parameter","parameter1","anotherParameter1"})
    @Test
    void name3(String a,String b,String c) {
        System.out.println(a + " " + b + " " + c);
    }
}
