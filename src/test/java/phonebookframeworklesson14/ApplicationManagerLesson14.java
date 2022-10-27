package phonebookframeworklesson14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManagerLesson14 {

    protected WebDriver wd;

    MenuHelperLesson14 menuHelper;
    LoginPageHelperLesson14 loginPageHelper;
    AddContactsPageHelperLesson14 addContactsPageHelper;
    ContactsPageHelperLesson14 contactsPageHelper;

    public MenuHelperLesson14 getMenuHelper() {
        return menuHelper;
    }

    public LoginPageHelperLesson14 getLoginPageHelper() {
        return loginPageHelper;
    }

    public AddContactsPageHelperLesson14 getAddContactsPageHelper() {
        return addContactsPageHelper;
    }

    public ContactsPageHelperLesson14 getContactsPageHelper() {
        return contactsPageHelper;
    }

    protected void initApp() {
        wd = new ChromeDriver();

        loginPageHelper = new LoginPageHelperLesson14(wd);
        addContactsPageHelper = new AddContactsPageHelperLesson14(wd);
        contactsPageHelper = new ContactsPageHelperLesson14(wd);
        menuHelper = new MenuHelperLesson14(wd);

        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        goToLoginPage();
    }

    protected void stopApp() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        wd.quit();
    }

    protected void goToLoginPage() {
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/login");
    }

    protected void goToContactsPage() {
    }

    public void goToAddContactsPage() {
    }
}
