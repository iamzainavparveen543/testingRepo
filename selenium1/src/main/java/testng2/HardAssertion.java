package testng2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {
    @Test
    public void a(){
        int a = 12;
        int b = 10;
        Assert.assertEquals(a,b);
    }
    @Test
    public void b(){
       boolean a1 = 1<2;
        boolean a2 = 2>3;
        Assert.assertTrue(a1!=a2);
//        Assert.fail();

    }
    @Test
    public void c(){
        Assert.fail("ececution failed");
    }
    @Test
    public void d(){
        String name1 = "zainav";
        String name2 = "zainav";
//        Assert.assertTrue(name1 == name2);
        Assert.assertEquals(name1,name2);
    }
    @Test
    public void hardlogic(){
        System.out.println("this is my hard assert statement");
        Assert.assertTrue(true);

        System.out.println("this is my second hard assert statement");
        Assert.assertFalse(true);

        System.out.println("this is my third hard asssert statement");
        Assert.assertFalse(false);
        System.out.println("this is my four hard assert statement");
        Assert.assertTrue(true);

    }
    @Test
    public void e(){
        int a = 4;
        int b = 10;
        System.out.println("sum : "+(a+b));
    }

}
