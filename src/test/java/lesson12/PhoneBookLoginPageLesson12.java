//package lesson12;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//import java.util.concurrent.TimeUnit;
//
//public class PhoneBookLoginPageLesson12 extends TestBaseLesson12 {
//    static final int WAITING_TIME_SEC = 10;
//    static final String LOGIN_PAGE_URL_STR = "https://contacts-app.tobbymarshall815.vercel.app/login";
//    static final String LOGIN_CSS_SELECTOR_STR = ".login_login__3EHKB input:nth-child(1)";
//    static final String LOGIN_FORM_CLASS_NAME = "login_login__3EHKB";
//    static final String USER_EMAIL_STR = "michael@gmail.com";
//
//    @BeforeMethod
//    public void loginSetUp(){
//        // navigate streight to the login page
//        wd.navigate().to(LOGIN_PAGE_URL_STR);
//        //wait till it's loaded
//        wd.manage().timeouts().implicitlyWait(WAITING_TIME_SEC, TimeUnit.SECONDS);
//        WebElement loginFormLoaded = wd.findElement(By.className(LOGIN_FORM_CLASS_NAME));
//    }
//
//    @Test
//    public void testLoginForm() throws InterruptedException {
//        // enter email
//        WebElement loginInputField = wd.findElement(By.cssSelector(LOGIN_CSS_SELECTOR_STR));
//        loginInputField.click();
//        loginInputField.sendKeys(USER_EMAIL_STR);
//        // enter pwd
//        WebElement pwdInputField = wd.findElement(By.cssSelector(".login_login__3EHKB input:nth-child(2)"));
//        pwdInputField.click();
//        pwdInputField.sendKeys("ZZxcv_1!");
//        // click Login Btn
//        WebElement loginBtn = wd.findElement(By.cssSelector("button:nth-child(4)"));
//        loginBtn.click();
//        //wait till the page is loaded
//        WebElement firstContactPageResult = new WebDriverWait(wd, WAITING_TIME_SEC)
//                .until(ExpectedConditions.visibilityOf(wd.findElement(By.className("contact-page_main__32Irj"))));
//        // check that the user is signed in
//        // Option 1:
//        int logOutButtonArraySize = wd.findElements(By.cssSelector("button")).size();
//        System.out.println("Size of array of WebElements by cssSelector('button'): " + logOutButtonArraySize);
//        // todo: change to xpath
//        Assert.assertTrue(logOutButtonArraySize == 1, "Log Out button is present");
//        Assert.assertEquals(logOutButtonArraySize,1,"Log Out button is present (second aassertion)");
//
//        // Option 2: try-catch
//
//        System.out.println("Signed in!");
//    }
//
//}
