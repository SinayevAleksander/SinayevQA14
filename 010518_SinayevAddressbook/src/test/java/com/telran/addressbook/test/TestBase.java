package com.telran.addressbook.test;

import com.telran.addressbook.manager.ApplicationManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class TestBase {

    protected static ApplicationManager appManager = new ApplicationManager(BrowserType.CHROME);

    @BeforeSuite(alwaysRun = true)
    public void setUp() throws Exception {
        appManager.start();

    }

    @AfterSuite(alwaysRun = true)
    public void tearDown() throws Exception {
        appManager.stop();
    }




}
