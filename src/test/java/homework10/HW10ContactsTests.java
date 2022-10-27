//package homework10;
//
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
//public class HW10ContactsTests {
//    WebDriver wd;
//
//    @BeforeMethod
//    public void SetUp (){
//        // System.setProperty("webdriver.chrome.driver","C:\Users\Damara\tools\chromedriver.exe");
//        wd = new ChromeDriver();
//        wd.navigate().to("http://automationpractice.com/index.php");
//    }
//
//    @Test
//    public void testLocators(){
//        /* First part of the lesson*/
//
//        // by a HTML tag (v1):
//        WebElement webElementByTagName = wd.findElement(By.tagName("form"));
//        System.out.println("webElementByTagName: " + webElementByTagName.isDisplayed());
//        // by a HTML tag (v2):
//        WebElement webElementByTagCssSelector = wd.findElement(By.cssSelector("form"));
//        System.out.println("webElementByTagCssSelector: " + webElementByTagCssSelector.isDisplayed());
//        // by a class name(v1):
//        WebElement webElementByClassName = wd.findElement(By.className("columns-container"));
//        System.out.println("webElementByClassName: " + webElementByClassName.isDisplayed());
//        // by a class name(v2):
//        WebElement webElementByClassCssSelector = wd.findElement(By.cssSelector(".columns-container"));
//        System.out.println("webElementByClassCssSelector: " + webElementByClassCssSelector.isDisplayed());
//        // finding element by a class name:
//        WebElement anotherWebElementByClassCssSelector = wd.findElement(By.cssSelector(".header-container"));
//        System.out.println("anotherWebElementByClassCssSelector: " + anotherWebElementByClassCssSelector.isDisplayed());
//        // getting all text inside nested element; finding by a HTLM tag and its parent class name:
//        WebElement webElementByNestedTag = wd.findElement(By.cssSelector(".header-container header"));
//        System.out.println("webElementByNestedTag: '" + webElementByNestedTag.getText() + "'");
//        // getting all text inside parent of that element; finding by its class name:
//        WebElement parentElementByClassCssSelector = wd.findElement(By.cssSelector(".header-container"));
//        System.out.println("parentElementByClassCssSelector: '" + parentElementByClassCssSelector.getText() + "'");
//        // example of equal element found using different syntaxis:
//        WebElement webElementByCssSelector2 = wd.findElement(By.cssSelector("[class='blockcategories_footer footer-block col-xs-12 col-sm-2']"));
//        System.out.println("webElementByCssSelector2: " + webElementByCssSelector2.isDisplayed());
//        // if WebElement has an id > use ID locator (faster, unique)
//        WebElement loginBtnWebElement1 = wd.findElement(By.className("button"));
//        System.out.println("loginBtnWebElement1: " + loginBtnWebElement1.isDisplayed());
//        // by complicated class names:
//        WebElement loginBtnWebElement2 = wd.findElement(By.cssSelector(".button.btn.btn-default.button-medium"));
//        System.out.println("loginBtnWebElement2: " + loginBtnWebElement2.isDisplayed());
//    }
//
//    @AfterMethod
//    public void tearDown() throws InterruptedException {
//        TimeUnit.SECONDS.sleep(1);
//        wd.quit();
//    }
//}
