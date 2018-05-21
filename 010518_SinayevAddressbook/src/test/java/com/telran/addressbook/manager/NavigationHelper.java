package com.telran.addressbook.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase {

    public NavigationHelper(WebDriver driver) {
        super(driver);
    }

    public void goToHomePage() {
        if (isElementPresent(By.tagName("table")) && isElementPresent(By.xpath("//*[@value='Send e-Mail']"))) {
            return;
        }
        click(By.xpath("//a[@href='./']"));
    }

    public void goToAddNewPage() {
        if (isElementPresent(By.tagName("form")) && isElementPresent(By.xpath("//*[@value='Enter']"))) {
            return;
        }
        click(By.linkText("add new"));
    }

    public void goToGroupsPage() {
        if (isElementPresent(By.xpath("//*[@value='New group']"))) {
            return;
        }
        click(By.xpath("//a[@href='group.php']"));
    }





}
