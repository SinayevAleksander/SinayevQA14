package com.telran.addressbook.test;

import com.telran.addressbook.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateContactTest extends TestBase {

    @Test
    public void testCreateContact() throws Exception {
        int before = appManager.getContactHelper().getContactCount();
        appManager.getNavigationHelper().goToAddNewPage();
        appManager.getContactHelper().fillContactData(
                new ContactData("First name", "Middle name", "Last name",
                        "Nickname", "Title", "Company", "Address", "Home",
                        "Mobile", "Work", "Fax", "E-mail", "E-mail2",
                        "E-mail3", "Homepage", "Address", "Home", "Notes"));
        appManager.getContactHelper().submitCreateContact();
        appManager.getContactHelper().returnToHomePage();
        int after = appManager.getContactHelper().getContactCount();
        Assert.assertEquals(after, before + 1);


    }


}
