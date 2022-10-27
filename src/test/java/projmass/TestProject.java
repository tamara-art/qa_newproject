//package projmass;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.*;
//import java.util.concurrent.TimeUnit;
//
//public class TestProject {
//    WebDriver webDriver;
//
//    //before steps
//    @BeforeMethod
//    public void Setup(){
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\Damara\\OneDrive\\Документы\\tests\\chromedriver.exe");
//        webDriver = new ChromeDriver();
//    }
//
//    //test
//    @Test
//    public void openGooglePage(){
//        webDriver.get("https://www.google.com/");
//
//    }
//
//    //after steps
//    @AfterMethod
//    public void tearDown() throws InterruptedException {
//        TimeUnit.SECONDS.sleep(3);
//        webDriver.quit();
//
//    }
//
//}
