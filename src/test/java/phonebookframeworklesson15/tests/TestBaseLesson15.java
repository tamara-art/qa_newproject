//package phonebookframeworklesson15.tests;
//
//
//import org.testng.ITestResult;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import phonebookframeworklesson15.fw.ApplicationManagerLesson15;
//
//public class TestBaseLesson15 {
//
//    protected static ApplicationManagerLesson15 app = new ApplicationManagerLesson15();
//
//    @BeforeMethod
//    public void setUp() throws InterruptedException {
//        app.initApp();
//    }
//
//    @AfterMethod (alwaysRun = true)
//    public void tearDown(ITestResult result) throws InterruptedException {
//        if (!result.isSuccess()) app.takeScreenShot();
//        app.stopApp();
//    }
//
//}
