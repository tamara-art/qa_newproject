//package phonebookframeworklesson14;
//
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//public class LoginPageTestsLesson14 extends TestBaseLesson14 {
//    UserLesson14 validUser = new UserLesson14("michael@gmail.com", "ZZxcv_1!");
//    UserLesson14 invalidPwdUser = new UserLesson14("michael@gmail.com", "invalid_pwd");
//    private final UserLesson14 invalidEmailUser = new UserLesson14("invalid_email@gmail.com", "ZZxcv_1!");
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
