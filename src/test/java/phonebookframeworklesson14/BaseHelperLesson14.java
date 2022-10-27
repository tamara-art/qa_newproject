package phonebookframeworklesson14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseHelperLesson14 {
    public static final int WAITING_TIME_SEC = 10;

    protected WebDriver wd;

    public BaseHelperLesson14(WebDriver wd) {
        this.wd = wd;
    }

    protected void fillTheInputField(By by, String key) {
        WebElement inputFieldWebElement = wd.findElement(by);
        inputFieldWebElement.clear();
        inputFieldWebElement.click();
        inputFieldWebElement.sendKeys(key);
    }

    protected void clickButton(By buttonLocator) {
        WebElement existingContact = wd.findElement(buttonLocator);
        existingContact.click();
    }

    public boolean isWebElementPresent(By by) {
        return wd.findElements(by).size() > 0;
    }

}
