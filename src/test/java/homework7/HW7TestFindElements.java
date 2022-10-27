//package homework7;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.*;
//import java.util.concurrent.TimeUnit;
//
//
//
//public class HW7TestFindElements {
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
//        webDriver.get("https://contacts-app.tobbymarshall815.vercel.app/about");
//        WebElement webElementByTagName = webDriver.findElement(By.tagName("a"));
//        System.out.println("webElementByTagName: " + webElementByTagName.getText());
//    }
//
//    //after steps
//    @AfterMethod
//    public void tearDown() throws InterruptedException {
//        TimeUnit.SECONDS.sleep(5);
//        webDriver.quit();
//    }
//
//}
