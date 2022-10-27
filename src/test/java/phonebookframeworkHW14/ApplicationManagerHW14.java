//package phonebookframeworkHW14;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import java.util.concurrent.TimeUnit;
//
//public class ApplicationManagerHW14 {
//    protected WebDriver wd;
//
//    MenuHelperHW14 menuHelper;
//    LoginPageHelperHW14 loginPageHelper;
//    AddContactsPageHelperHW14 addContactsPageHelper;
//    ContactsPageHelperHW14 contactsPageHelper;
//
//    public MenuHelperHW14 getMenuHelper() {
//        return menuHelper;
//    }
//
//    public LoginPageHelperHW14 getLoginPageHelper() {
//        return loginPageHelper;
//    }
//
//    public AddContactsPageHelperHW14 getAddContactsPageHelper() {
//        return addContactsPageHelper;
//    }
//
//    public ContactsPageHelperHW14 getContactsPageHelper() {
//        return contactsPageHelper;
//    }
//
//    protected void initApp() {
//        wd = new ChromeDriver();
//
//        loginPageHelper = new LoginPageHelperHW14(wd);
//        addContactsPageHelper = new AddContactsPageHelperHW14(wd);
//        contactsPageHelper = new ContactsPageHelperHW14(wd);
//        menuHelper = new MenuHelperHW14(wd);
//
//        wd.manage().window().maximize();
//        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//        goToLoginPage();
//    }
//
//    protected void stopApp() throws InterruptedException {
//        TimeUnit.SECONDS.sleep(1);
//        wd.quit();
//    }
//
//    protected void goToLoginPage() {
//        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/login");
//    }
//
//    protected void goToContactsPage() {
//    }
//
//    public void goToAddContactsPage() {
//    }
//}
