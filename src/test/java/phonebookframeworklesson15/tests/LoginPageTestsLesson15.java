//package phonebookframeworklesson15.tests;
//
//
//import org.testng.Assert;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//import phonebookframeworklesson15.model.UserLesson15;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//public class LoginPageTestsLesson15 extends TestBaseLesson15 {
//    UserLesson15 validUser = new UserLesson15("michael@gmail.com", "ZZxcv_1!");
//    UserLesson15 invalidPwdUser = new UserLesson15("michael@gmail.com", "invalid_pwd");
//   UserLesson15 invalidEmailUser = new UserLesson15("invalid_email@gmail.com", "ZZxcv_1!");
//
//    @DataProvider
//    public Iterator<Object[]> newUsers(){
//        List<Object[]> list = new ArrayList<>();
//        list.add(new Object[]{ new UserLesson15("michael@gmail.com","ZZxcv_1!")});
//        list.add(new Object[]{ new UserLesson15("michael1@gmail.com","ZZxcv_1!")});
//        return list.iterator();
//    }
//
//    @DataProvider
//    public Iterator<Object[]> newUsersFromFile() {
//        List<Object[]> list = new ArrayList<>();
//        try {
//            BufferedReader bufferedReader = new BufferedReader(new FileReader("src/test/resources/usersPositive.csv"));
//            String line = bufferedReader.readLine();
//            while(line!=null){
//                // line = "michael@gmail.com,ZZxcv_1!"
//                String[] lineValues =  line.split(",");
//                // lineValues = ["michael@gmail.com","ZZxcv_1!"]
//                list.add(new Object[]{ new UserLesson15(lineValues[0],lineValues[1])});
//                line = bufferedReader.readLine();
//            }
//        } catch (IOException e){
//            e.printStackTrace();
//        }
//        return list.iterator();
//    }
//
//    @Test (dataProvider = "newUsersFromFile")
//    public void testLoginFormWithDataProviderFromFilePositive(UserLesson15 user) throws InterruptedException {
//        app.getLoginPageHelper().fillAndSubmitLoginForm(user);
//        Assert.assertTrue(app.getMenuHelper().isUserSignedIn(), "Log Out button is present");
//        TimeUnit.SECONDS.sleep(2);
//    }
//
//    @Test (dataProvider = "newUsers")
//    public void testLoginFormWithDataProviderPositive(UserLesson15 user) throws InterruptedException {
//        app.getLoginPageHelper().fillAndSubmitLoginForm(user);
//        Assert.assertTrue(app.getMenuHelper().isUserSignedIn(), "Log Out button is present");
//        TimeUnit.SECONDS.sleep(2);
//    }
//
//    @Test
//    public void testLoginFormPositive()  {
//        app.getLoginPageHelper().fillAndSubmitLoginForm(validUser);
////        Assert.assertTrue(false);
//        Assert.assertTrue(app.getMenuHelper().isUserSignedIn(), "Log Out button is present");
//    }
//
//    @Test
//    public void testLoginFormWithInvalidPwdNegative(){
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
