//package homework12;
//
//import org.openqa.selenium.Alert;
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
//public class PhoneBookLookingPage12 extends TestBase12 {
//    public static final String PWD_CSS_SELECTOR_STR = ".login_login__3EHKB input:nth-child(2)";
//    public static final String LOGIN_BTN_CSS_SELECTOR_STR = "button:nth-child(4)";
//    public static final String ERROR_MSG_TEXT_STR = "Login Failed with code 400";
//    public static final String LOGIN_FAILED_400_ERROR_MSG_TEXT_STR = "Login Failed with code 400";
//    public static final String VALID_USER_PWD_STR = "ZZxcv_1!";
//    public static final String SIGN_OUT_BTN_XPATH_SELECTOR_STR = "//button[text()='Sign Out']";
//    public static final String LOGIN_PAGE_URL_STR = "https://contacts-app.tobbymarshall815.vercel.app/login";
//    public static final String LOGIN_FORM_CLASS_NAME = "login_login__3EHKB";
//    public static final String VALID_USER_EMAIL_STR = "michael@gmail.com";
//    public static final String INVALID_USER_PWD_STR = "invalid_user_pwd";
//    public static final String LOGIN_ERROR_MSG_XPATH_SELECTOR_STR = "//div[text() = '$loginFailedMessageTxt']";
//
//    @BeforeMethod
//    public void loginSetUp() {
//        // navigate streight to the login page
//        wd.navigate().to(LOGIN_PAGE_URL_STR);
//        //wait till it's loaded
//        wd.manage().timeouts().implicitlyWait(WAITING_TIME_SEC, TimeUnit.SECONDS);
//        isUserSignIn();
//    }
//
//    private boolean isUserSignIn() {
//        if (isWebElementPresent(By.cssSelector(LOGIN_BTN_CSS_SELECTOR_STR))) {
//            assertElementIsPresent(By.className(LOGIN_FORM_CLASS_NAME), "Login form");
//            return true;
//        } else return false;
//    }
//
//    @Test
//    public void testLoginFormPositive() throws InterruptedException {
//        loginUser(VALID_USER_EMAIL_STR, VALID_USER_PWD_STR);
//        // check that the user is signed in
//        assertElementIsPresent(By.xpath(SIGN_OUT_BTN_XPATH_SELECTOR_STR), "Log Out button");
//
//        // The second way to make the same assertions is:
//        // Assert.assertTrue(isWebElementPresent(By.cssSelector("button")) == true, "Log Out button is present");
//        // The third way to make the same assertions is:
//        // Assert.assertEquals(isWebElementPresent(By.cssSelector("button")),true,"Log Out button is present (second assertion)");
//
//        System.out.println("Signed in!");
//    }
//
//    @Test
//    public void testLoginFormNegative() {
//        // enter valid email
//        // enter invalid pwd
//        // click login btn
//        fillAndSubmitLoginForm(VALID_USER_EMAIL_STR, INVALID_USER_PWD_STR);
//        // check (wait for it) Alert is present
//        Alert invalidEmailOrPwdAlert = new WebDriverWait(wd, WAITING_TIME_SEC).until(ExpectedConditions.alertIsPresent());
//        // click Ok in the Alert window
//        wd.switchTo().alert();
//        invalidEmailOrPwdAlert.accept();
//        // assert Error message
//        Assert.assertTrue(isLoginErrorMessagePresent(ERROR_MSG_TEXT_STR), "Login error message is present");
//        // asserts that user is still not signed in
//        Assert.assertFalse(isUserSignIn(), "User is not signed in");
//    }
//
//    private boolean isLoginErrorMessagePresent(String errorMsgTextStr) {
//        return wd.findElements(By.xpath(LOGIN_ERROR_MSG_XPATH_SELECTOR_STR.replace("$loginFailedMessageTxt", LOGIN_FAILED_400_ERROR_MSG_TEXT_STR))).size() > 0;
//    }
//
//    private void assertElementIsPresent(By by, String message) {
//        Assert.assertTrue(isWebElementPresent(by), message + " is present");
//    }
//
//    public void loginUser(String userEmailStr, String pwdStr) {
//        fillAndSubmitLoginForm(userEmailStr, pwdStr);
//        //wait till the page is loaded
//        WebElement firstContactPageResult = new WebDriverWait(wd, WAITING_TIME_SEC).until(ExpectedConditions.visibilityOf(wd.findElement(By.className("contact-page_main__32Irj"))));
//    }
//
//    private void fillAndSubmitLoginForm(String userEmailStr, String pwdStr) {
//        // enter email
//        fillTheInputField(By.cssSelector(LOGIN_CSS_SELECTOR_STR), userEmailStr);
//        // enter pwd
//        fillTheInputField(By.cssSelector(PWD_CSS_SELECTOR_STR), pwdStr);
//        // click Login Btn
//        WebElement loginBtn = wd.findElement(By.cssSelector(LOGIN_BTN_CSS_SELECTOR_STR));
//        loginBtn.click();
//    }
//
//    public boolean isWebElementPresent(By by) {
//        // Option 1:
//        return wd.findElements(by).size() > 0;
//    }
//
//    // Option 2: try-catch]
//    /*
//    public boolean isWebElementPresentWithTryCatch() {
//        try {
//            WebElement webElement = wd.findElement(By.cssSelector("button"));
//            return true;
//        } catch (NoSuchElementException noSuchElementException) {
//            return false;
//        }
//    }
//     */
//
//}
