package com.telran.addressbook.manager;

import com.telran.addressbook.model.GroupDate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

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

    public void createGroup(String groupName) {
        new NavigationHelper(driver).goToGroupsPage();
        goToNewGroupPage();
        fillGroupData(new GroupDate().withName(groupName));
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

    public void selectGroupByIndex(int index) {
        driver.findElements(By.name("selected[]")).get(index).click();
    }

    public List<GroupDate> getGroupList() {
        List<GroupDate> groups = new ArrayList<>();
        List<WebElement> elements = driver.findElements(By.cssSelector("span.group"));
        for(WebElement element:elements){
            String name = element.getText();
            int id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));
            GroupDate group = new GroupDate().withId(id).withName(name);
            groups.add(group);
        }
        return groups;
    }


    // Edit Group Finish





}
