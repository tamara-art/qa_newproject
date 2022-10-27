//package phonebookframeworklesson16.tests;
//
//
//import org.testng.Assert;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//import phonebookframeworklesson16.model.UserLesson16;
//
//public class ContactTestsLesson16 extends TestBaseLesson16 {
//    UserLesson16 userForTestingContacts = new UserLesson16("michael@gmail.com", "ZZxcv_1!");
//
//    @BeforeMethod
//    public void setUp() {
//        app.goToLoginPage();
//        app.getLoginPageHelper().fillAndSubmitLoginForm(userForTestingContacts);
//        Assert.assertTrue(app.getMenuHelper().isUserSignedIn(), "User is signed in");
//    }
//
//    @Test
//    public void testAddAndRemoveContactPositive() {
//        app.goToAddContactsPage();
//        //todo: you have to write your own implementation here
//        //Option 1:
////        app.getAddContactsPageHelper().fillContactFormFields(new Contact()
////                .setName("Test Name")
////                .setLastName("TestLastname"))
////                .....;
//        //Option 2:
//        // app.getAddContactsPageHelper().fillContactFormFields(new Contact("Test Name","TestLastname", ......));
//        Assert.assertEquals(app.getContactsPageHelper().getContactsSize() == 1, "Contact is added");
//        app.getContactsPageHelper().clickOnContactCard(1);
//        app.getContactsPageHelper().clickOnRemoveContact();
//        Assert.assertEquals(app.getContactsPageHelper().getContactsSize() == 0, "Contact is removed");
//    }
//}
