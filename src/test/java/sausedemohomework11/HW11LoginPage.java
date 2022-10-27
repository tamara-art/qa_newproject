//package sausedemohomework11;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import java.util.concurrent.TimeUnit;
//
//
//public class HW11LoginPage extends Homework11TestBase {
//
//
//    static final int WAITING_TIME_SEC = 10;
//    static final String LOGIN_PAGE_URL_STR = "https://www.saucedemo.com/inventory.html";
//    static final String USER_NAME_STR = "standard_user";
//    static final String SECRET_SAUCE = "secret_sauce";
//    static final String LOGIN_FORM_ID = "user-name";
//    static final String LOGIN_CSS_SELECTOR_STR = "#user-name";
//    static final String PASSWORD = "#password";
//    static final String LOGIN_BUTTON = "login-button";
//    public static final String SHOPPING_CART_LINK = "shopping_cart_link";
//    static final String LOGOUT_SIDEBAR_LINK = "logout_sidebar_link";
//
//
//    @BeforeMethod
//    public void loginSetUp(){
//        // navigate streight to the login page
//        wd.navigate().to(LOGIN_PAGE_URL_STR);
//        //wait till it's loaded
//        wd.manage().timeouts().implicitlyWait(WAITING_TIME_SEC, TimeUnit.SECONDS);
//        WebElement loginFormLoaded = wd.findElement(By.id(LOGIN_FORM_ID));
//    }
//
//    @Test
//    public void testLoginForm() throws InterruptedException {
//        // enter email
//        WebElement loginInputField = wd.findElement(By.cssSelector(LOGIN_CSS_SELECTOR_STR));
//        loginInputField.click();
//        loginInputField.sendKeys(USER_NAME_STR);
//        // enter pwd
//        WebElement pwdInputField = wd.findElement(By.cssSelector(PASSWORD));
//        pwdInputField.click();
//        pwdInputField.sendKeys(SECRET_SAUCE);
//        // click Login Btn
//        WebElement loginBtn = wd.findElement(By.id(LOGIN_BUTTON));
//        loginBtn.click();
//        //wait till the page is loaded
//        WebElement shoppingCartPageResult = new WebDriverWait(wd, WAITING_TIME_SEC)
//                .until(ExpectedConditions.visibilityOf(wd.findElement(By.className(SHOPPING_CART_LINK))));
//        // check that the user is signed in
//        // Option 1:
//        int logOutButtonArraySize = wd.findElements(By.id(LOGOUT_SIDEBAR_LINK)).size();
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
