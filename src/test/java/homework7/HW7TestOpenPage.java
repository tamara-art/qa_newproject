//package homework7;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.*;
//import java.util.concurrent.TimeUnit;
//
//public class HW7TestOpenPage {
//    WebDriver webDriver;
//
//    //before steps
//    @BeforeMethod
//    public void Setup(){
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\Damara\\tools\\chromedriver.exe");
//        webDriver = new ChromeDriver();
//    }
//
//    //test
//    @Test
//    public void openGooglePage(){
//        webDriver.get("https://www.saucedemo.com");
//    }
//
//    //after steps
//    @AfterMethod
//    public void tearDown() throws InterruptedException {
//        TimeUnit.SECONDS.sleep(60);
//        webDriver.quit();
//    }
//}
