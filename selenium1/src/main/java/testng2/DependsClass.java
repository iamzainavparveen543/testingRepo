package testng2;

import org.testng.annotations.Test;

public class DependsClass {
    @Test(timeOut = 2000)
   void  a()throws Exception{
        Thread.sleep(3000);
       System.out.println("Hello world");
   }
    @Test(dependsOnMethods = "a",alwaysRun = true)
    void  b(){
        System.out.println("void b.....");
    }
    @Test
    void  c(){
        System.out.println("void c.....");
    }
    @Test
    void  d(){
        System.out.println("void d.....");
    }


}
