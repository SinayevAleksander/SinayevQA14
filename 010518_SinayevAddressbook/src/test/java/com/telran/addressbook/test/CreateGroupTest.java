package com.telran.addressbook.test;

import com.telran.addressbook.model.GroupDate;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateGroupTest extends TestBase{

  @Test
  public void testCreateGroup() throws Exception {
    appManager.getNavigationHelper().goToGroupsPage();
    int before = appManager.getGroupHelper().getGroupCount();
    appManager.getGroupHelper().goToNewGroupPage();
    appManager.getGroupHelper().fillGroupData(new GroupDate()
            .withName("Name")
            .withHeader("Header")
            .withFooter("Footer"));
    appManager.getGroupHelper().submitCreateGroup();
    appManager.getGroupHelper().returnToGroupPage();
    int after = appManager.getGroupHelper().getGroupCount();
    Assert.assertEquals(after,before+1);
    System.out.println("After:"+after+" "+ "Before:"+before);
  }

  @Test
  public void testCreateGroupShortName() throws Exception {
    appManager.getNavigationHelper().goToGroupsPage();
    int before = appManager.getGroupHelper().getGroupCount();
    appManager.getGroupHelper().goToNewGroupPage();
    appManager.getGroupHelper().fillGroupData(new GroupDate()
            .withName("N")
            .withHeader("H")
            .withFooter("F"));
    appManager.getContactHelper().submitCreateContact();
    appManager.getGroupHelper().returnToGroupPage();
    int after = appManager.getGroupHelper().getGroupCount();
    Assert.assertEquals(after,before+1);
    System.out.println("After:"+after+" "+ "Before:"+before);
  }


  @Test
  public void testCreateGroupLongName() throws Exception {
    appManager.getNavigationHelper().goToGroupsPage();
    int before = appManager.getGroupHelper().getGroupCount();
    appManager.getGroupHelper().goToNewGroupPage();
    appManager.getGroupHelper().fillGroupData(new GroupDate()
            .withName("LongName")
            .withHeader("LongHeader")
            .withFooter("LongFooter"));
    appManager.getContactHelper().submitCreateContact();
    appManager.getGroupHelper().returnToGroupPage();
    int after = appManager.getGroupHelper().getGroupCount();
    Assert.assertEquals(after,before+1);
    System.out.println("After:"+after+" "+ "Before:"+before);

  }

  @Test
  public void testCreateGroupEmptyName() throws Exception {
    int before = appManager.getGroupHelper().getGroupCount();
    appManager.getGroupHelper().goToNewGroupPage();
    appManager.getGroupHelper().fillGroupData(new GroupDate());
    appManager.getGroupHelper().submitCreateGroup();
    appManager.getGroupHelper().returnToGroupPage();
    int after = appManager.getGroupHelper().getGroupCount();
    Assert.assertEquals(after,before+1);
    System.out.println("After:"+after+" "+ "Before:"+before);
  }
}
