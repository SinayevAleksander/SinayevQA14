package com.telran.addressbook.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteContactTest extends TestBase {

    @Test (priority = 1)
    public void contactDeletionTest(){
        appManager.getNavigationHelper().goToHomePage();
        if(!appManager.getContactHelper().isThereContact()){
            appManager.getContactHelper().createContact();
        }
        int before= appManager.getContactHelper().getContactCount();
        appManager.getContactHelper().goToEditContactPage();
        appManager.getContactHelper().deleteContact();
        appManager.getNavigationHelper().goToHomePage();
        int after= appManager.getContactHelper().getContactCount();
        Assert.assertEquals(after,before-1);
    }

    @Test (priority = 2)
    public void contactDeletionHomePageTest(){
        appManager.getNavigationHelper().goToHomePage();
        if(!appManager.getContactHelper().isThereContact()){
            appManager.getContactHelper().createContact();
        }
        int before= appManager.getContactHelper().getContactCount();
        appManager.getContactHelper().selectContact();
        appManager.getContactHelper().deleteContact();
        appManager.getContactHelper().acceptAlert();
        appManager.getNavigationHelper().goToHomePage();
        int after= appManager.getContactHelper().getContactCount();
        Assert.assertEquals(after,before-1);
    }


}
