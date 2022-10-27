//package lesson8;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import java.util.concurrent.TimeUnit;
//
//public class ContactTestsLesson8 {
//    WebDriver wd;
//
//    //before steps
//    @BeforeMethod
//    public void Setup(){
//       System.setProperty("webdriver.chrome.driver","C:\\Users\\Damara\\OneDrive\\Документы\\tests\\chromedriver.exe");
//        wd = new ChromeDriver();
//        wd.navigate().to("https://www.saucedemo.com");
//    }
//
//    //test
//    @Test
//    public void testLocators(){
//       WebElement loginBtnWebElement1 = wd.findElement(By.cssSelector(".submit_button"));
//        System.out.println("loginBtnWebElement1:" + loginBtnWebElement1.isDisplayed());
//
//    }
//
//    //after steps
//    @AfterMethod
//    public void tearDown() throws InterruptedException {
//        TimeUnit.SECONDS.sleep(1);
//        wd.quit();
//    }
//}
