package com.sd.utilities;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.sd.TestBase.TestBase;

public class CustomTestListener extends TestBase implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        // This method will be invoked before the test method starts.
        System.out.println("Test Started: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        // This method will be invoked when the test method passes.
        System.out.println("Test Passed: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        // This method will be invoked when the test method fails.
        System.out.println("Test Failed: " + result.getName());
        UtilClass.takeSS(result.getName()+"-"+System.currentTimeMillis());
        System.out.println("Take Screenshot");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        // This method will be invoked when the test method is skipped.
        System.out.println("Test Skipped: " + result.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // This method will be invoked when a test fails, but the failure is within success percentage.
        System.out.println("Test Failed But Within Success Percentage: " + result.getName());
    }

    @Override
    public void onStart(ITestContext context) {
        // This method will be invoked before any test methods are run in the test context.
        System.out.println("Test Suite Started: " + context.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        // This method will be invoked after all the test methods have run.
        System.out.println("Test Suite Finished: " + context.getName());
    }
}
