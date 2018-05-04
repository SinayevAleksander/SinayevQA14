//package com.example.tests;

import org.testng.annotations.Test;

public class CreateGroupTest extends TestBase{

  @Test(priority = 1)
  public void testCreateGroup() throws Exception {

    // goToGroupsPage
    goToGroupsPage();

    // goToAddGroupPage
    goToAddGroupPage();

    // enterDataGroup
    enterDataGroup("name_2", "header", "footer");

    // submitCreateContact
    submitCreateContact();

    // returnToGroupPage
    returnToGroupPage();
  }

  @Test(priority = 2)
  public void testCreateGroupShortName() throws Exception {

    // goToAddGroupPage
    goToAddGroupPage();

    // enterDataGroup
    enterDataGroup("n", "h", "f");

    // submitCreateContact
    submitCreateContact();

    // returnToGroupPage
    returnToGroupPage();
  }

  @Test(priority = 3)
  public void testCreateGroupLongName() throws Exception {

    // goToAddGroupPage
    goToAddGroupPage();

    // enterDataGroup
    enterDataGroup("LongName", "LongHeader", "LongFooter");

    // submitCreateContact
    submitCreateContact();

    // returnToGroupPage
    returnToGroupPage();
  }

  @Test(enabled = false)
  public void testCreateGroupEmptyName() throws Exception {

    // goToAddGroupPage
    goToAddGroupPage();

    // enterDataGroup
    enterDataGroup("", "", "");

    // submitCreateContact
    submitCreateContact();

    // returnToGroupPage
    returnToGroupPage();
  }
}
