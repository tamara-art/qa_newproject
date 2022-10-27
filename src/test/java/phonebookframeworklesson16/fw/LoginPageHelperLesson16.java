package phonebookframeworklesson16.fw;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import phonebookframeworklesson16.model.UserLesson16;

import java.util.concurrent.TimeUnit;

public class LoginPageHelperLesson16 extends BaseHelperLesson16 {
    public static final String LOGIN_FAILED_400_ERROR_MSG_TEXT_STR = "Login Failed with code 400";
    public static final String LOGIN_ERROR_MSG_XPATH_SELECTOR_STR = "//div[text() = '$loginFailedMessageTxt']";
    public static final String LOGIN_CSS_SELECTOR_STR = ".login_login__3EHKB input:nth-child(1)";
    public static final String PWD_CSS_SELECTOR_STR = ".login_login__3EHKB input:nth-child(2)";
    public static final String LOGIN_BTN_CSS_SELECTOR_STR = "button:nth-child(4)";


    public LoginPageHelperLesson16(WebDriver wd) {
        super(wd);
    }

    public void fillAndSubmitLoginForm(UserLesson16 currentUser) {
        // enter email
        fillTheInputField(By.cssSelector(LOGIN_CSS_SELECTOR_STR), currentUser.getEmail());
        // enter pwd
        fillTheInputField(By.cssSelector(PWD_CSS_SELECTOR_STR), currentUser.getPwd());

        //delay for debugging
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        // click Login Btn
        clickButton(By.cssSelector(LOGIN_BTN_CSS_SELECTOR_STR));
    }

    public void registerUser(UserLesson16 user) {
        //todo: you have to write your own implementation here
    }

    public void clickOnErrorAlert() {
        Alert invalidEmailOrPwdAlert = new WebDriverWait(wd, WAITING_TIME_SEC)
                .until(ExpectedConditions.alertIsPresent());
        // click Ok in the Alert window
        wd.switchTo().alert();
        invalidEmailOrPwdAlert.accept();
    }

    public boolean isLoginErrorMessagePresent(String errorMsgTextStr) {
        return wd.findElements(By.xpath(LOGIN_ERROR_MSG_XPATH_SELECTOR_STR.replace
                ("$loginFailedMessageTxt", LOGIN_FAILED_400_ERROR_MSG_TEXT_STR))).size() > 0;
    }
}
