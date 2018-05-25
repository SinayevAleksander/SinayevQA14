package com.telran.addressbook.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    private ContactHelper contactHelper;
    private NavigationHelper navigationHelper;
    private GroupHelper groupHelper;
    private HelperBase helperBase;
    protected WebDriver driver;
    private String browser;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }

    public void start() {
        if (browser.equals(BrowserType.CHROME)) {
            driver = new ChromeDriver();
        }else if (browser.equals(BrowserType.FIREFOX)) {
            driver = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        }else if(browser.equals(BrowserType.IE)){
            driver = new InternetExplorerDriver();
        }else if(browser.equals(BrowserType.EDGE)){
            driver = new EdgeDriver();
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        navigationHelper = new NavigationHelper(driver);
        groupHelper = new GroupHelper(driver);
        contactHelper = new ContactHelper(driver);
        helperBase = new HelperBase(driver);
        openSite("http://localhost/addressbook/");
        authorization("admin", "secret");
    }

    public void stop() {
        driver.quit();
    }

    public void openSite(String url) {
        driver.get(url);
    }

    public void authorization(String user, String pwd) {
        helperBase.type(By.name("user"), user);
        helperBase.type(By.name("pass"), pwd);
        helperBase.click(By.xpath("//input[@value='Login']"));
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }
}
