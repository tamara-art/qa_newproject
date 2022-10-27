//package phonebookframeworklesson15.tests;
//
//
//import org.testng.Assert;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//import phonebookframeworklesson15.model.UserLesson15;
//
//public class ContactTestsLesson15 extends TestBaseLesson15 {
//    UserLesson15 userForTestingContacts = new UserLesson15("michael@gmail.com", "ZZxcv_1!");
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
//        Assert.assertEquals(app.getContactsPageHelperl().getContactsSize() == 1, "Contact is added");
//        app.getContactsPageHelperl().clickOnContactCard(1);
//        app.getContactsPageHelperl().clickOnRemoveContact();
//        Assert.assertEquals(app.getContactsPageHelperl().getContactsSize() == 0, "Contact is removed");
//    }
//}
