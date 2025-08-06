package testng2;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
    SoftAssert softassert = new SoftAssert();
    @Test
    public void a(){
        String name1 = "mobile";
        String name2 = "laptop";
        softassert.assertEquals(name1,name2);

        int a = 19;
        int b = 10;
        System.out.println("sum : "+ (a + b));
        softassert.assertTrue(true);
        softassert.assertAll();
    }
    @Test
    public void logic(){
        System.out.println("this is my first soft assert statement");
        softassert.assertTrue(true);


        System.out.println("this is my second soft assert statement");
        softassert.assertFalse(false);

        System.out.println("this is my third soft assert statement");
        softassert.assertTrue(true);

        softassert.assertAll();




    }
}
