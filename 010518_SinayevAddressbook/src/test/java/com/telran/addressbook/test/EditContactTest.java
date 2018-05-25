package com.telran.addressbook.test;


import com.telran.addressbook.model.ContactData;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class EditContactTest extends TestBase {

    @Test
    public void testEditContact(){
        appManager.getNavigationHelper().goToHomePage();
        if(!appManager.getContactHelper().isThereContact()){
            appManager.getContactHelper().createContact();
        }
        int before = appManager.getContactHelper().size(By.name("selected[]"));
        appManager.getContactHelper().goToEditContactPage();
        appManager.getContactHelper().fillContactData(new ContactData());
        appManager.getContactHelper().submitContactModification();


    }
}
