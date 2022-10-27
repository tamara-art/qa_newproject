//package phonebookframeworkHW14;
//
//import org.testng.Assert;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//public class RegistrationTestsHW14 extends TestBaseHW14 {
//    UserHW14 newValidUser = new UserHW14(generateUserEmail(), "ZYxcv_2!");
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
