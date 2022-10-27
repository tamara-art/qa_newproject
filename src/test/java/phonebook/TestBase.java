//package phonebook;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import java.util.concurrent.TimeUnit;
//
//
//public class TestBase {
//    WebDriver wd;
//
//    @BeforeMethod
//    public void setUp(){
//        wd = new ChromeDriver();
//        // create a user - skipped to simplify
//        // open web page
//        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");
//        //wait till it's loaded
//        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//    }
//
//    @AfterMethod
//    public void tearDown() throws InterruptedException {
//        TimeUnit.SECONDS.sleep(3);
//        wd.quit();
//    }
//
//}
