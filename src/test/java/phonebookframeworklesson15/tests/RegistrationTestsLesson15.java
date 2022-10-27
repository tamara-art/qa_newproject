//package phonebookframeworklesson15.tests;
//
//
//import org.testng.Assert;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//import phonebookframeworklesson15.model.UserLesson15;
//
//public class RegistrationTestsLesson15 extends TestBaseLesson15 {
//
//    UserLesson15 newValidUser = new UserLesson15(generateUserEmail(), "ZZxcv_1!");
//
//    @BeforeMethod
//    public void SetUp() {
//        app.initApp();
//    }
//
//    @Test
//    public void testRegistrationPositive() {
//        app.getLoginPageHelper().registerUser(newValidUser);
//        Assert.assertTrue(app.getMenuHelper().isUserSignedIn(), "Registered user is signed in");
//    }
//
//    public String generateUserEmail() {
//        return "mail" + System.currentTimeMillis() + "@mail.com";
//    }
//}
