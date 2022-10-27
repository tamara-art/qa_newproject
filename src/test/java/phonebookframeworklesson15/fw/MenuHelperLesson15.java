package phonebookframeworklesson15.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenuHelperLesson15 extends BaseHelperLesson15 {
    public static final String LOGOUT_BTN_XPATH_SELECTOR_STR = "//button[text()='Sign Out']";

    public MenuHelperLesson15(WebDriver wd) {
        super(wd);
    }

    public boolean isUserSignedIn() {
        return isWebElementPresent(By.xpath(LOGOUT_BTN_XPATH_SELECTOR_STR));
    }
}
