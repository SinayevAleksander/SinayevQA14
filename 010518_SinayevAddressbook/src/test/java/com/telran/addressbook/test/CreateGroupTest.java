package com.telran.addressbook.test;

import com.telran.addressbook.model.GroupDate;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CreateGroupTest extends TestBase{
  @DataProvider
  public Iterator<Object[]> validGroups() throws IOException {
    List<Object[]> list = new ArrayList<>();
    BufferedReader reader = new BufferedReader(
            new FileReader(new File("src/test/resources/groups.csv")));
    String line = reader.readLine();
    while (line != null){
      String[] split = line.split(";");
      list.add(new Object[]{ new GroupDate().withName(split[0]).withHeader(split[1]).withFooter(split[2])});
      line = reader.readLine();
    }
    return list.iterator();
  }

  @Test (dataProvider = "validGroups")
  public void testCreateGroup(GroupDate groupDate) throws Exception {
    appManager.getNavigationHelper().goToGroupsPage();

    int before = appManager.getGroupHelper().getGroupCount();
    appManager.getGroupHelper().goToNewGroupPage();
    appManager.getGroupHelper().fillGroupData(new GroupDate()
            .withName(groupDate.getNameGroup())
            .withHeader(groupDate.getHeader())
            .withFooter(groupDate.getFooter()));
    appManager.getGroupHelper().submitCreateGroup();
    appManager.getGroupHelper().returnToGroupPage();

    int after = appManager.getGroupHelper().getGroupCount();
//    Assert.assertEquals(after,before+1);
    System.out.println("After:"+after+" "+ "Before:"+before);
  }



  @Test
  public void testCreateGroupShortName() throws Exception {
    appManager.getNavigationHelper().goToGroupsPage();
    List<GroupDate> before = appManager.getGroupHelper().getGroupList();
//    int before = appManager.getGroupHelper().getGroupCount();
    appManager.getGroupHelper().goToNewGroupPage();
    GroupDate group = new GroupDate().withName("new");
    appManager.getGroupHelper().fillGroupData(group);
    appManager.getContactHelper().submitCreateContact();
    appManager.getGroupHelper().returnToGroupPage();
    List<GroupDate> after = appManager.getGroupHelper().getGroupList();
//    int after = appManager.getGroupHelper().getGroupCount();
//    Assert.assertEquals(after,before+1);
    System.out.println("After:"+after+" "+ "Before:"+before);
  }

//
//  @Test
//  public void testCreateGroupLongName() throws Exception {
//    appManager.getNavigationHelper().goToGroupsPage();
//    int before = appManager.getGroupHelper().getGroupCount();
//    appManager.getGroupHelper().goToNewGroupPage();
//    appManager.getGroupHelper().fillGroupData(new GroupDate()
//            .withName("LongName")
//            .withHeader("LongHeader")
//            .withFooter("LongFooter"));
//    appManager.getContactHelper().submitCreateContact();
//    appManager.getGroupHelper().returnToGroupPage();
//    int after = appManager.getGroupHelper().getGroupCount();
//    Assert.assertEquals(after,before+1);
//    System.out.println("After:"+after+" "+ "Before:"+before);
//
//  }
//
//  @Test
//  public void testCreateGroupEmptyName() throws Exception {
//    int before = appManager.getGroupHelper().getGroupCount();
//    appManager.getGroupHelper().goToNewGroupPage();
//    appManager.getGroupHelper().fillGroupData(new GroupDate());
//    appManager.getGroupHelper().submitCreateGroup();
//    appManager.getGroupHelper().returnToGroupPage();
//    int after = appManager.getGroupHelper().getGroupCount();
//    Assert.assertEquals(after,before+1);
//    System.out.println("After:"+after+" "+ "Before:"+before);
//  }
}
