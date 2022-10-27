package phonebookframeworklesson16.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenuHelperLesson16 extends BaseHelperLesson16 {
    public static final String LOGOUT_BTN_XPATH_SELECTOR_STR = "//button[text()='Sign Out']";
    private static final String SIGNOUT_BTN_XPATH_SELECTOR_STR = "//button[text()='Sign Out']";

    public MenuHelperLesson16(WebDriver wd) {
        super(wd);
    }

    public boolean isUserSignedIn() {
        return isWebElementPresent(By.xpath(LOGOUT_BTN_XPATH_SELECTOR_STR));
    }

    public boolean hasSignOutButtonPresent() {
        return isWebElementPresent(By.xpath(SIGNOUT_BTN_XPATH_SELECTOR_STR));
    }
}
