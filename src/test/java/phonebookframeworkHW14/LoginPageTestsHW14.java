//package phonebookframeworkHW14;
//
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//public class LoginPageTestsHW14 extends TestBaseHW14 {
//    UserHW14 validUser = new UserHW14("nre79368@nezid.com", "ZYxcv_2!");
//    UserHW14 invalidPwdUser = new UserHW14("nre79368@nezid.com", "invalid_pwd");
//    private final UserHW14 invalidEmailUser = new UserHW14("invalid_email@gmail.com", "ZYxcv_2!");
//
//    @Test
//    public void testLoginFormPositive() throws InterruptedException {
//        app.getLoginPageHelper().fillAndSubmitLoginForm(validUser);
//        Assert.assertTrue(app.getMenuHelper().isUserSignedIn(), "Log Out button is present");
//    }
//
//    @Test
//    public void testLoginFormWithInvalidPwdNegative() {
//        app.getLoginPageHelper().fillAndSubmitLoginForm(invalidPwdUser);
//        app.getLoginPageHelper().clickOnErrorAlert();
//        Assert.assertTrue(app.getLoginPageHelper().isLoginErrorMessagePresent("Login Failed with code 400"), "Login error message is present");
//        Assert.assertFalse(app.getMenuHelper().isUserSignedIn(), "User is not signed in");
//    }
//
//    @Test
//    public void testLoginFormWithInvalidEmailNegative() {
//        app.getLoginPageHelper().fillAndSubmitLoginForm(invalidEmailUser);
//        app.getLoginPageHelper().clickOnErrorAlert();
//        Assert.assertTrue(app.getLoginPageHelper().isLoginErrorMessagePresent("Login Failed with code 400"), "Login error message is present");
//        Assert.assertFalse(app.getMenuHelper().isUserSignedIn(), "User is not signed in");
//    }
//}
