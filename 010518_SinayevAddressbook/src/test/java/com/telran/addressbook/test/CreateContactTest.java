package com.telran.addressbook.test;

import com.telran.addressbook.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class CreateContactTest extends TestBase {

    @Test
    public void testCreateContact() throws Exception {
        appManager.getNavigationHelper().goToHomePage();
        int before = appManager.getContactHelper().getContactCount();
        appManager.getNavigationHelper().goToAddNewPage();
        File photo = new File("src/test/resources/cat.jpg");

        appManager.getContactHelper().fillContactData(
                new ContactData()
                        .withFirstName("First name")
                        .withMiddleName("Middle name")
                        .withLastName("Last name")
                        .withNickname("Nickname")
                        .withTitle("Title")
                        .withCompany("Company")
                        .withAddress("Address")
                        .withHome("Home")
                        .withMobile("Mobile")
                        .withWork("Work")
                        .withFax("Fax")
                        .withEMail("eMail")
                        .withEMail2("eMail2")
                        .withEMail3("eMail3")
                        .withHomepage("HomePage")
                        .withAddress1("Address1")
                        .withHome1("Home1")
                        .withNotes("Notes")
                        .withPhoto(photo)
                        .withGroup("LongName"));
        appManager.getContactHelper().submitCreateContact();
        appManager.getContactHelper().returnToHomePage();
        int after = appManager.getContactHelper().getContactCount();
        Assert.assertEquals(after, before + 1);



    }


}
