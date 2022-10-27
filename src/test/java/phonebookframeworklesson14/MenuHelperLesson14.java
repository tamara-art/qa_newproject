package phonebookframeworklesson14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenuHelperLesson14 extends BaseHelperLesson14 {
    public static final String LOGOUT_BTN_XPATH_SELECTOR_STR = "//button[text()='Sign Out']";

    public MenuHelperLesson14(WebDriver wd) {
        super(wd);
    }

    public boolean isUserSignedIn() {
        return isWebElementPresent(By.xpath(LOGOUT_BTN_XPATH_SELECTOR_STR));
    }
}
