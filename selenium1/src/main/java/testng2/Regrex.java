package testng2;

import org.testng.annotations.Test;

public class Regrex {
    @Test
    void UPIPayment(){
        System.out.println("upi payment");
    }
    @Test
    void codPayment(){
        System.out.println("cod payment");
    }
    @Test
    void dcPayment(){
        System.out.println("dc payment");
    }
    @Test
    void ccPayment(){
        System.out.println("cc payment");
    }
    @Test
    void amazonPayment(){
        System.out.println("amazon payment");
    }
}
