//package phonebookframeworklesson14;
//
//import org.testng.Assert;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//public class RegistrationTestsLesson14 extends TestBaseLesson14 {
//
//    UserLesson14 newValidUser = new UserLesson14(generateUserEmail(), "ZZxcv_1!");
//
//    @BeforeMethod
//    public void SetUp() {
//        app.initApp();
//    }
//
//    @Test
//    public void testRegistration() {
//        app.getLoginPageHelper().registerUser(newValidUser);
//        Assert.assertTrue(app.getMenuHelper().isUserSignedIn(), "Registered user is signed in");
//    }
//}
