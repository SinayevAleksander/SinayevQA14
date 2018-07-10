package com.telran.addressbook.test;

import com.telran.addressbook.model.GroupDate;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.List;

public class EditGroupTest extends TestBase {
    @Test
    public void editGroupTest() {
        appManager.getNavigationHelper().goToGroupsPage();
        if (!appManager.getGroupHelper().isThereGroup()) {
            appManager.getGroupHelper().createGroup();
        }
        List<GroupDate> before = appManager.getGroupHelper().getGroupList();
//        int before = appManager.getGroupHelper().getGroupCount();
        appManager.getGroupHelper().selectGroupByIndex(before.size() - 1);

        appManager.getGroupHelper().goToEditGroupPage();
        GroupDate group = new GroupDate().
                withId(before.get(before.size()-1).getId())
                .withName("newTest1")
                .withHeader("EditHeader")
                .withFooter("EditFooter");
        appManager.getGroupHelper().fillGroupData(group);
        appManager.getGroupHelper().submitGroupModification();
        appManager.getGroupHelper().returnToGroupPage();
        List<GroupDate> after = appManager.getGroupHelper().getGroupList();
//        int after = appManager.getGroupHelper().getGroupCount();
        Assert.assertEquals(after.size(), before.size());

        System.out.println("After:" + after.size() + " " + "Before:" + before.size());
        before.remove(before.size() - 1);
        before.add(group);
        Assert.assertEquals(new HashSet<>(before),new HashSet<>(after));
        System.out.println("Before" + " " + before);
        System.out.println("After" + " " + after);
    }
}
