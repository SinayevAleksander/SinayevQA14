package com.telran.addressbook.manager;

import com.telran.addressbook.model.GroupDate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GroupHelper extends HelperBase{


    public GroupHelper(WebDriver driver) {
        super(driver);
    }

    public int getGroupCount() {
        return size(By.name("selected[]"));
    }

    // Create New Group Start

    public void goToNewGroupPage() {
        click(By.name("new"));
    }

    public void fillGroupData(GroupDate group) {
        type(By.name("group_name"), group.getNameGroup());
        type(By.name("group_header"), group.getHeader());
        type(By.name("group_footer"), group.getFooter());
    }

    public void submitCreateGroup() {
        click(By.xpath("//*[@value=\'Enter information\']"));
    }

    public void returnToGroupPage() {
        click(By.xpath("//a[@href='group.php'][contains(text(),'group page')]"));
    }

    // Create New Group Finish

    // Delete Group Start

    public void selectGroup() {
        click(By.name("selected[]"));
    }

    public void deleteGroup() {
        click(By.name("delete"));
    }

    public boolean isThereGroup(){
        return isElementPresent(By.name("selected[]"));
    }

    public void createGroup() {
        goToNewGroupPage();
//        fillGroupData(new GroupDate(null, "header", "footer"));
        submitCreateGroup();
        returnToGroupPage();
    }

    // Delete Group Finish

    // Edit Group Start

    public void goToEditGroupPage() {
        click(By.xpath("//*[@value='Edit group']"));
    }

    public void submitGroupModification() {
        click(By.xpath("//*[@type='submit']"));
    }


    // Edit Group Finish





}
