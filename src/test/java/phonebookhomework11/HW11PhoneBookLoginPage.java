//package phonebookhomework11;
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
//public class HW11PhoneBookLoginPage extends HW11TestBase {
//    static final int WAITING_TIME_SEC = 10;
//    static final String LOGIN_PAGE_URL_STR = "https://contacts-app.tobbymarshall815.vercel.app/login";
//    static final String LOGIN_CSS_SELECTOR_STR = ".login_login__3EHKB input:nth-child(1)";
//    static final String LOGIN_FORM_CLASS_NAME = "login_login__3EHKB";
//    static final String USER_EMAIL_STR = "michael@gmail.com";
//    static final String LOGIN_LOGIN_3_EHKB_INPUT_NTH_CHILD_2 = ".login_login__3EHKB input:nth-child(2)";
//    static final String ZZXCV_1 = "ZZxcv_1!";
//    static final String BUTTON_NTH_CHILD_4 = "button:nth-child(4)";
//    static final String CONTACT_PAGE_MAIN_32_IRJ = "contact-page_main__32Irj";
//    static final String BUTTON = "button";
//
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
//        WebElement pwdInputField = wd.findElement(By.cssSelector(LOGIN_LOGIN_3_EHKB_INPUT_NTH_CHILD_2));
//        pwdInputField.click();
//        pwdInputField.sendKeys(ZZXCV_1);
//        // click Login Btn
//        WebElement loginBtn = wd.findElement(By.cssSelector(BUTTON_NTH_CHILD_4));
//        loginBtn.click();
//        //wait till the page is loaded
//        WebElement firstContactPageResult = new WebDriverWait(wd, WAITING_TIME_SEC)
//                .until(ExpectedConditions.visibilityOf(wd.findElement(By.className(CONTACT_PAGE_MAIN_32_IRJ))));
//        // check that the user is signed in
//        // Option 1:
//        int logOutButtonArraySize = wd.findElements(By.cssSelector(BUTTON)).size();
//        System.out.println("Size of array of WebElements by cssSelector('button'): " + logOutButtonArraySize);
//        // todo: change to xpath
//        Assert.assertTrue(logOutButtonArraySize == 1, "Log Out button is present");
//        Assert.assertEquals(logOutButtonArraySize,1,"Log Out button is present (second assertion)");
//
//        // Option 2: try-catch
//
//        System.out.println("Signed in!");
//    }
//}
