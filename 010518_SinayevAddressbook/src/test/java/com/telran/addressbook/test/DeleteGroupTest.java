package com.telran.addressbook.test;

import com.telran.addressbook.model.GroupDate;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class DeleteGroupTest extends TestBase {

    @Test
    public void groupDeletionTest(){
        appManager.getNavigationHelper().goToGroupsPage();
        if(!appManager.getGroupHelper().isThereGroup()){
            appManager.getGroupHelper().createGroup();
        }
        List<GroupDate> before = appManager.getGroupHelper().getGroupList();
//        int before = appManager.getGroupHelper().getGroupCount();
        appManager.getGroupHelper().selectGroupByIndex(before.size()-1);
        appManager.getGroupHelper().deleteGroup();
        appManager.getGroupHelper().returnToGroupPage();
        List<GroupDate> after =appManager.getGroupHelper().getGroupList();
//        int after = appManager.getGroupHelper().getGroupCount();
        Assert.assertEquals(after.size(),before.size()-1);
        System.out.println("After:"+after.size()+" "+"Before:"+before.size());
        before.remove(before.size()-1);
        Assert.assertEquals(before,after);
    }


}
