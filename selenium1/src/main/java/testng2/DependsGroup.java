package testng2;

import org.testng.annotations.Test;

public class DependsGroup {
    @Test(groups = {"Regression"})
    void e(){
        System.out.println("void e");
    }
    @Test(dependsOnGroups ={"Regression"} )
    void f(){
        System.out.println("void f");
    }
    @Test
    void g(){
        System.out.println("void g");
    }
    @Test
    void h(){
        System.out.println("void h");
    }
    @Test
    void i(){
        System.out.println("void i");
    }
}
