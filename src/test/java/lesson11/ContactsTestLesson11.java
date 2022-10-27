//package lesson11;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//public class ContactsTestLesson11 {
//    WebDriver wd;
//
//    @BeforeMethod
//    public void SetUp (){
//        // System.setProperty("webdriver.chrome.driver","C:\\Users\\Damara\\OneDrive\\Документы\\tests\\chromedriver.exe");
//        wd = new ChromeDriver();
//        wd.navigate().to("https://www.saucedemo.com");
//
//        wd.manage().window().maximize();
//        wd.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
//    }
//
//    @Test
//    public void testTableSccSelectors(){
//        WebElement firstRow = wd.findElement(By.cssSelector("tr:nth-child(1)"));
//        System.out.println("Text in the 1st row: " + firstRow.getText());
//
//
//    }
//
//    @AfterMethod
//    public void tearDown() throws InterruptedException {
//        TimeUnit.SECONDS.sleep(3);
//        // webDriver.Close() - Close the browser window that the driver has focus of
//        // webDriver.Quit() - Calls Dispose()
//        // webDriver.Dispose() Closes all browser windows and safely ends the session
//        wd.quit();
//    }
//}
