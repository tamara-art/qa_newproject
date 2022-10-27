package phonebookframeworklesson16.tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import phonebookframeworklesson16.fw.DataProvidersLesson16;
import phonebookframeworklesson16.model.UserLesson16;

import java.util.concurrent.TimeUnit;

public class LoginPageTestsLesson16 extends TestBaseLesson16 {
    UserLesson16 validUser = new UserLesson16("michael@gmail.com", "ZZxcv_1!");
    UserLesson16 invalidPwdUser = new UserLesson16("michael@gmail.com", "invalid_pwd");
    UserLesson16 invalidEmailUser = new UserLesson16("invalid_email@gmail.com", "ZZxcv_1!");


    @Test(dataProvider = "newUsersFromFile", dataProviderClass = DataProvidersLesson16.class)
    public void testLoginFormWithDataProviderFromFilePositive(UserLesson16 user) throws InterruptedException {
        app.getLoginPageHelper().fillAndSubmitLoginForm(user);
        Assert.assertTrue(app.getMenuHelper().isUserSignedIn(), "Log Out button is present");
        TimeUnit.SECONDS.sleep(2);
    }

    @Test(dataProvider = "newUsers", dataProviderClass = DataProvidersLesson16.class)
    public void testLoginFormWithDataProviderPositive(UserLesson16 user) throws InterruptedException {
        app.goToLoginPage();
        app.waitForLoginPageToLoad();
        app.getLoginPageHelper().fillAndSubmitLoginForm(invalidPwdUser);
        app.getLoginPageHelper().fillAndSubmitLoginForm(user);
        Assert.assertTrue(app.getMenuHelper().isUserSignedIn(), "Log Out button is present");
    }

    @Test
    public void testLoginFormPositive() {
        //app.startRecording();
        app.deleteRecordings();
        app.startRecording();
        app.startRecordingWithoutSound();
        app.getLoginPageHelper().fillAndSubmitLoginForm(validUser);
        app.sleep(1);
//        Assert.assertTrue(false, "Demo failed test!");
        Assert.assertTrue(app.getMenuHelper().isUserSignedIn(), "Log Out button is present");
        app.sleep(2);
        app.stopRecording();
    }

    @Test
    public void testLoginFormWithInvalidPwdNegative() {
        app.goToLoginPage();
        app.waitForLoginPageToLoad();
        app.getLoginPageHelper().fillAndSubmitLoginForm(invalidPwdUser);
        app.getLoginPageHelper().clickOnErrorAlert();
        Assert.assertTrue(app.getLoginPageHelper().isLoginErrorMessagePresent("Login Failed with code 400"), "Login error message is present");
        Assert.assertFalse(app.getMenuHelper().isUserSignedIn(), "User is not signed in");
    }

    @Test
    public void testLoginFormWithRecording() {
        UserLesson16 invalidPwdUser = new UserLesson16("michael@gmail.com", "invalid_pwd");
//        app.startRecording();
        app.deleteRecordings();
        app.startRecordingWithoutSound();
        app.waitForLoginPageToLoad();
        app.getLoginPageHelper().fillAndSubmitLoginForm(invalidPwdUser);
        app.sleep(1);
        app.getLoginPageHelper().clickOnErrorAlert();
        Assert.assertTrue(app.getLoginPageHelper().isLoginErrorMessagePresent("Login Failed with code 400"), "Login error message is present");
        Assert.assertFalse(app.getMenuHelper().hasSignOutButtonPresent(), "User is not signed in");
        app.sleep(2);
        app.stopRecording();
    }
}

//    @Test
//    public void testLoginFormWithInvalidEmailNegative() {
//        app.goToLoginPage();
//        app.waitForLoginPageToLoad();
//        app.getLoginPageHelper().fillAndSubmitLoginForm(invalidEmailUser);
//        app.getLoginPageHelper().clickOnErrorAlert();
//        Assert.assertTrue(app.getLoginPageHelper().isLoginErrorMessagePresent("Login Failed with code 500"), "Login error message is present");
//        Assert.assertFalse(app.getMenuHelper().hasSignOutButtonPresent(), "User is not signed in");
//    }
//}
