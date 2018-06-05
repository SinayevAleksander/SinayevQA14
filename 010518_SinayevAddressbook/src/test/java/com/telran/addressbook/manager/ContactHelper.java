package com.telran.addressbook.manager;

import com.telran.addressbook.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver driver) {
        super(driver);
    }

    public void fillContactData(ContactData contact) {
        type(By.name("firstname"),contact.getFirstName());
        type(By.name("middlename"),contact.getMiddleName());
        type(By.name("lastname"),contact.getLastName());
        type(By.name("nickname"),contact.getNickname());
        type(By.name("title"),contact.getTitle());
        type(By.name("company"),contact.getCompany());
        type(By.name("address"),contact.getAddress());
        type(By.name("home"),contact.getHome());
        type(By.name("mobile"),contact.getMobile());
        type(By.name("work"),contact.getWork());
        type(By.name("fax"),contact.getFax());
        type(By.name("email"),contact.geteMail());
        type(By.name("email2"),contact.geteMail2());
        type(By.name("email3"),contact.geteMail3());
        type(By.name("homepage"),contact.getHomepage());
        type(By.name("address2"),contact.getAddress1());
        type(By.name("phone2"),contact.getHome1());
        type(By.name("notes"),contact.getNotes());
        attach(By.name("photo"),contact.getPhoto());
        if(!isElementPresent(By.xpath("option[contains(text(),"+"'"+contact.getGroup()+"'"+")]"))){

            new GroupHelper(driver).createGroup(contact.getGroup());
        }
        new Select(driver.findElement(By.xpath("//select[@name='new_group']")))
                .selectByVisibleText(contact.getGroup());



    }

    public void returnToHomePage() {
        click(By.xpath("//a[@href='index.php']"));
    }

    public void submitCreateContact() {
        click(By.name("submit"));
    }

    public void selectContact() {
       click(By.xpath("//input[@type='checkbox']"));
    }

    public void goToEditContactPage() {
        click(By.xpath("//img[@src='icons/pencil.png']"));
    }

    public void deleteContact() {
        click(By.xpath("//*[@value='Delete']"));
    }

    public int getContactCount() {
        return size(By.xpath("//*[@name='selected[]']"));
    }

    public boolean isThereContact() {
        return isElementPresent(By.name("selected[]"));
    }

    public void createContact() {
        NavigationHelper navigationHelper = new NavigationHelper(driver);
        navigationHelper.goToAddNewPage();
//        fillContactData(new ContactData());
        submitCreateContact();
        returnToHomePage();
    }

    public void submitContactModification() {
        click(By.xpath("//*[@value='Update']"));
    }
}
