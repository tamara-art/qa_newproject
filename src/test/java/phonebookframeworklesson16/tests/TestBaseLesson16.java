package phonebookframeworklesson16.tests;


import org.openqa.selenium.remote.BrowserType;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.internal.TestNGMethod;
import phonebookframeworklesson16.fw.ApplicationManagerLesson16;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;

public class TestBaseLesson16 {
    protected Logger logger = LoggerFactory.getLogger(TestBaseLesson16.class);

    protected static ApplicationManagerLesson16 app = new ApplicationManagerLesson16(System.getProperty("browser", BrowserType.CHROME));
//    protected static ApplicationManagerLesson16 app = new ApplicationManagerLesson16(System.getProperty("browser", BrowserType.FIREFOX));

    @BeforeMethod
    public void setUp() throws InterruptedException {
        app.initApp();
    }

//    @BeforeMethod
//    public void beforeMethod(){
//        logger.info("Start test!");
//        logger.info("**********************");
//    }

//    @BeforeMethod
//    public void beforeMethod(Method method){
//        logger.info("Start test " + method.getName());
//        logger.info("**********************");
//    }
//
//    @AfterMethod
//    public void afterMethod(Method method){
//        logger.info("Stop test " + method.getName());
//        logger.info("**********************");
//    }
    @BeforeMethod
    public void beforeMethod(Method method){
        logger.info("Start test " + method.getName());
        logger.info("**********************");
    }

    @AfterMethod
    public void afterMethod(Method method){
        logger.info("Stop test " + method.getName() + " by Tamara");
        logger.info("**********************");
    }
    @AfterMethod (alwaysRun = true)
    public void tearDown(ITestResult result) throws InterruptedException {
        if (!result.isSuccess()) app.takeScreenShot();
        app.stopApp();
    }

}
