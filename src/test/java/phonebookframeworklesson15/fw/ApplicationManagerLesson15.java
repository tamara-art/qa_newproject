package phonebookframeworklesson15.fw;

import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ApplicationManagerLesson15 {

    protected WebDriver wd;

    MenuHelperLesson15 menuHelper;
    LoginPageHelperLesson15 loginPageHelper;
    AddContactsPageHelperLesson15 addContactsPageHelper;
    ContactsPageHelperLesson15 contactsPageHelperl;

    public MenuHelperLesson15 getMenuHelper() {
        return menuHelper;
    }

    public LoginPageHelperLesson15 getLoginPageHelper() {
        return loginPageHelper;
    }

    public AddContactsPageHelperLesson15 getAddContactsPageHelper() {
        return addContactsPageHelper;
    }

    public ContactsPageHelperLesson15 getContactsPageHelperl() {
        return contactsPageHelperl;
    }

    public void initApp() {
        wd = new ChromeDriver();

        loginPageHelper = new LoginPageHelperLesson15(wd);
        addContactsPageHelper = new AddContactsPageHelperLesson15(wd);
        contactsPageHelperl = new ContactsPageHelperLesson15(wd);
        menuHelper = new MenuHelperLesson15(wd);

        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        goToLoginPage();
    }

    public void stopApp() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        wd.quit();
    }

    public void goToLoginPage() {
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/login");
    }

    protected void goToContactsPage() {
    }

    public void goToAddContactsPage() {
    }

    public String takeScreenShot() {
        File tmpScreenshotFile = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
        String pathName = "screenshots/" + System.currentTimeMillis() + ".png";
        File screenshotFile = new File(pathName);
        try {
            Files.copy(tmpScreenshotFile, screenshotFile);
        }catch (IOException e){
            e.printStackTrace();
        }
        return pathName;
    }
}
