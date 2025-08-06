package testng2;

import org.testng.annotations.*;

public class Annotation {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before suite...");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("Before suite...");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("Before test....");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("After test....");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before class....");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("After class....");
    }
//    @BeforeGroups
//    public void beforeGruop(){
//        System.out.println("Before group...");
//    }
//    @AfterGroups
//    public void afterGruop(){
//        System.out.println("Before group...");
//    }
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before method...");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("after method.....\n");
    }

    @Test
    public void test1(){
        System.out.println(" Test case1.....");
    }
    @Test
    public void test2(){
        System.out.println("Test case2.....");
    }
    @Test
    public void test3(){
        System.out.println("Test case3.....");
    }
}
