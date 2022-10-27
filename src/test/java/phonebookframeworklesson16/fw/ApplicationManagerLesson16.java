package phonebookframeworklesson16.fw;

import com.google.common.io.Files;
import org.monte.media.Format;
import org.monte.media.FormatKeys;
import org.monte.media.math.Rational;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.safari.SafariDriver;
import org.w3c.dom.css.Rect;
import phonebookframeworklesson15.fw.AddContactsPageHelperLesson15;

import javax.tools.Tool;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static org.monte.media.FormatKeys.*;
import static org.monte.media.VideoFormatKeys.*;

public class ApplicationManagerLesson16 {

    private static final Object ENDCODING_AVI_MJPG = new Object();
    protected String browser;
    protected WebDriver wd;

    MenuHelperLesson16 menuHelper;
    LoginPageHelperLesson16 loginPageHelper;
    AddContactsPageHelperLesson16 addContactsPageHelper;
    ContactsPageHelperLesson16 contactsPageHelper;

    public ApplicationManagerLesson16(String browser) {
        this.browser = browser;

    }

    public MenuHelperLesson16 getMenuHelper() {
        return menuHelper;
    }

    public LoginPageHelperLesson16 getLoginPageHelper() {
        return loginPageHelper;
    }

    public AddContactsPageHelperLesson16 getAddContactsPageHelper() {
        return addContactsPageHelper;
    }

    public ContactsPageHelperLesson16 getContactsPageHelper() {
        return contactsPageHelper;
    }

    public void initApp() {
        if(browser.equals(BrowserType.CHROME))
        wd = new ChromeDriver();
        else if (browser.equals(BrowserType.FIREFOX))
            wd = new FirefoxDriver();
        else if(browser.equals(BrowserType.SAFARI))
            wd = new SafariDriver();

        loginPageHelper = new LoginPageHelperLesson16(wd);
        addContactsPageHelper = new AddContactsPageHelperLesson16(wd);
        contactsPageHelper = new ContactsPageHelperLesson16(wd);
        menuHelper = new MenuHelperLesson16(wd);

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

    public void waitForLoginPageToLoad() {
    }

    Recorder recorder;

    public void startRecording()  {
        String pathName = "records/recording";
        GraphicsConfiguration gc = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice()
                .getDefaultConfiguration();
        try {
            recorder = new Recorder(gc,pathName);
            recorder.start();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public void stopRecording() {
        try {
            recorder.stop();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sleep(int seconds) {
    }

    public void startRecordingWithoutSound() {
        String pathName = "records/recording";
        GraphicsConfiguration gc = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice()
                .getDefaultConfiguration();

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        Rectangle capturedArea = new Rectangle(screenSize.width, screenSize.height);

        try {
            recorder = new Recorder(gc,
                    new Format(MediaTypeKey, MediaType.FILE,MimeTypeKey, MIME_AVI),
                    new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey ,ENCODING_AVI_MJPG,CompressorNameKey,
                            ENCODING_AVI_MJPG,DepthKey,24, FrameRateKey, Rational.valueOf(15),QualityKey,1.0f,
                            KeyFrameIntervalKey,15*60),
                    new Format(MediaTypeKey,MediaType.VIDEO, EncodingKey,"black", FrameRateKey, Rational.valueOf(30)),
                    null,
                    pathName);
            recorder.start();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public void deleteRecordings() {
        String pathName = "records";
        File directory = new File(pathName);
        File[] files = directory.listFiles();
         for(File file: files){
             file.delete();
         }
    }
}
