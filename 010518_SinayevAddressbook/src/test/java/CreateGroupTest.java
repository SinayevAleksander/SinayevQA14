//package com.example.tests;

import org.testng.annotations.Test;

public class CreateGroupTest extends TestBase{

  @Test(priority = 1)
  public void testCreateGroup() throws Exception {
    goToGroupsPage();
    goToAddGroupPage();
    enterDataGroup("name_2", "header", "footer");
    submitCreateContact();
    returnToGroupPage();
  }

  @Test(priority = 2)
  public void testCreateGroupShortName() throws Exception {
    goToAddGroupPage();
    enterDataGroup("n", "h", "f");
    submitCreateContact();
    returnToGroupPage();
  }

  @Test(priority = 3)
  public void testCreateGroupLongName() throws Exception {
    goToAddGroupPage();
    enterDataGroup("LongName", "LongHeader", "LongFooter");
    submitCreateContact();
    returnToGroupPage();
  }

  @Test(enabled = true, priority = 4)
  public void testCreateGroupEmptyName() throws Exception {
    goToAddGroupPage();
    enterDataGroup("", "", "");
    submitCreateContact();
    returnToGroupPage();
  }
}
