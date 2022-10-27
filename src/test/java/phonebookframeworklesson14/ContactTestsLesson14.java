package phonebookframeworklesson14;

//import org.testng.Assert;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//public class ContactTestsLesson14 extends TestBaseLesson14 {
//    UserLesson14 userForTestingContacts = new UserLesson14("michael@gmail.com", "ZZxcv_1!");
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
