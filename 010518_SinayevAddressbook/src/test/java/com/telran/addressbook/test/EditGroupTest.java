package com.telran.addressbook.test;

import com.telran.addressbook.model.GroupDate;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EditGroupTest extends TestBase {
    @Test
    public void editGroupTest(){
        appManager.getNavigationHelper().goToGroupsPage();
        if(!appManager.getGroupHelper().isThereGroup()){
            appManager.getGroupHelper().createGroup();
        }
        int before = appManager.getGroupHelper().getGroupCount();
        appManager.getGroupHelper().selectGroup();
        appManager.getGroupHelper().goToEditGroupPage();
        appManager.getGroupHelper().fillGroupData(new GroupDate(null,"headerEdit","footerEdit"));
        appManager.getGroupHelper().submitGroupModification();
        appManager.getGroupHelper().returnToGroupPage();
        int after = appManager.getGroupHelper().getGroupCount();
        Assert.assertEquals(after,before);
        System.out.println("After:"+after+" "+"Before:"+before);
    }
}
