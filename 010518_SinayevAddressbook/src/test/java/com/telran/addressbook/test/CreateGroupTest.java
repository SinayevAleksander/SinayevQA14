package com.telran.addressbook.test;

import com.telran.addressbook.model.GroupDate;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateGroupTest extends TestBase{

  @Test(priority = 1)
  public void testCreateGroup() throws Exception {
    appManager.getNavigationHelper().goToGroupsPage();
    int before = appManager.getGroupHelper().getGroupCount();
    appManager.getGroupHelper().goToNewGroupPage();
    appManager.getGroupHelper().fillGroupData(new GroupDate(null, "header", "footer"));
    appManager.getGroupHelper().submitCreateGroup();
    appManager.getGroupHelper().returnToGroupPage();
    int after = appManager.getGroupHelper().getGroupCount();
    Assert.assertEquals(after,before+1);
    System.out.println("After:"+after+" "+ "Before:"+before);
  }

  @Test(priority = 2)
  public void testCreateGroupShortName() throws Exception {
    appManager.getNavigationHelper().goToGroupsPage();
    int before = appManager.getGroupHelper().getGroupCount();
    appManager.getGroupHelper().goToNewGroupPage();
    appManager.getGroupHelper().fillGroupData(new GroupDate("n", "h", "f"));
    appManager.getContactHelper().submitCreateContact();
    appManager.getGroupHelper().returnToGroupPage();
    int after = appManager.getGroupHelper().getGroupCount();
    Assert.assertEquals(after,before+1);
    System.out.println("After:"+after+" "+ "Before:"+before);
  }


  @Test(priority = 3)
  public void testCreateGroupLongName() throws Exception {
    appManager.getNavigationHelper().goToGroupsPage();
    int before = appManager.getGroupHelper().getGroupCount();
    appManager.getGroupHelper().goToNewGroupPage();
    appManager.getGroupHelper().fillGroupData(new GroupDate("LongName", "LongHeader", "LongFooter"));
    appManager.getContactHelper().submitCreateContact();
    appManager.getGroupHelper().returnToGroupPage();
    int after = appManager.getGroupHelper().getGroupCount();
    Assert.assertEquals(after,before+1);
    System.out.println("After:"+after+" "+ "Before:"+before);

  }

  @Test(priority = 4)
  public void testCreateGroupEmptyName() throws Exception {
    int before = appManager.getGroupHelper().getGroupCount();
    appManager.getGroupHelper().goToNewGroupPage();
    appManager.getGroupHelper().fillGroupData(new GroupDate("", "", ""));
    appManager.getGroupHelper().submitCreateGroup();
    appManager.getGroupHelper().returnToGroupPage();
    int after = appManager.getGroupHelper().getGroupCount();
    Assert.assertEquals(after,before+1);
    System.out.println("After:"+after+" "+ "Before:"+before);
  }
}
