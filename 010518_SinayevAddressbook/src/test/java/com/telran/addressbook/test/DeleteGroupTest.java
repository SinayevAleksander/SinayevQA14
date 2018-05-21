package com.telran.addressbook.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteGroupTest extends TestBase {

    @Test
    public void groupDeletionTest(){
        appManager.getNavigationHelper().goToGroupsPage();
        if(!appManager.getGroupHelper().isThereGroup()){
            appManager.getGroupHelper().createGroup();
        }
        int before = appManager.getGroupHelper().getGroupCount();
        appManager.getGroupHelper().selectGroup();
        appManager.getGroupHelper().deleteGroup();
        appManager.getGroupHelper().returnToGroupPage();
        int after = appManager.getGroupHelper().getGroupCount();
        Assert.assertEquals(after,before-1);
        System.out.println("After:"+after+" "+"Before:"+before);
    }

}
