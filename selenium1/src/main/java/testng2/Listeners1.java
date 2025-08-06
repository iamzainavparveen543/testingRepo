package testng2;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners1 implements ITestListener {
    //this is interface  or   this is lestenerClass
    //ITestListener     or     TestListenerAdapter

    public void onTestStart(ITestResult result) {
        System.out.println(" on test start method...");
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println(" on test success method...");
    }

    public void onTestFailure(ITestResult result) {
        System.out.println(" on test failure method...");
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println(" on test skip method...");
    }

    public void onStart(ITestContext context) {
        System.out.println("testing started ...");
    }

    public void onFinish(ITestContext context) {
        System.out.println(" on test finish method...");
    }

}
