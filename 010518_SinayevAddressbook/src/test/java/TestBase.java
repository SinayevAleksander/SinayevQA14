import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBase {

    protected WebDriver driver;


    public void openSite() {
        driver.get("http://localhost/addressbook/");
    }


    public void enterContantInformation(String firstName, String middleName, String lastName, String nickname, String title, String company, String address, String home, String mobile, String work, String fax, String eMail, String eMail2, String eMail3, String homepage, String address1, String home1, String notes) {
        driver.findElement(By.name("firstname")).click();
        driver.findElement(By.name("firstname")).clear();
        driver.findElement(By.name("firstname")).sendKeys(firstName);
        driver.findElement(By.name("middlename")).click();
        driver.findElement(By.name("middlename")).clear();
        driver.findElement(By.name("middlename")).sendKeys(middleName);
        driver.findElement(By.name("lastname")).click();
        driver.findElement(By.name("lastname")).clear();
        driver.findElement(By.name("lastname")).sendKeys(lastName);
        driver.findElement(By.name("nickname")).click();
        driver.findElement(By.name("nickname")).clear();
        driver.findElement(By.name("nickname")).sendKeys(nickname);
        driver.findElement(By.name("title")).click();
        driver.findElement(By.name("title")).clear();
        driver.findElement(By.name("title")).sendKeys(title);
        driver.findElement(By.name("company")).click();
        driver.findElement(By.name("company")).clear();
        driver.findElement(By.name("company")).sendKeys(company);
        driver.findElement(By.name("address")).click();
        driver.findElement(By.name("address")).clear();
        driver.findElement(By.name("address")).sendKeys(address);
        driver.findElement(By.name("home")).click();
        driver.findElement(By.name("home")).clear();
        driver.findElement(By.name("home")).sendKeys(home);
        driver.findElement(By.name("mobile")).click();
        driver.findElement(By.name("mobile")).clear();
        driver.findElement(By.name("mobile")).sendKeys(mobile);
        driver.findElement(By.name("work")).click();
        driver.findElement(By.name("work")).clear();
        driver.findElement(By.name("work")).sendKeys(work);
        driver.findElement(By.name("fax")).click();
        driver.findElement(By.name("fax")).clear();
        driver.findElement(By.name("fax")).sendKeys(fax);
        driver.findElement(By.name("email")).click();
        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("email")).sendKeys(eMail);
        driver.findElement(By.name("email2")).click();
        driver.findElement(By.name("email2")).clear();
        driver.findElement(By.name("email2")).sendKeys(eMail2);
        driver.findElement(By.name("email3")).click();
        driver.findElement(By.name("email3")).clear();
        driver.findElement(By.name("email3")).sendKeys(eMail3);
        driver.findElement(By.name("homepage")).click();
        driver.findElement(By.name("homepage")).clear();
        driver.findElement(By.name("homepage")).sendKeys(homepage);
        driver.findElement(By.name("address2")).click();
        driver.findElement(By.name("address2")).clear();
        driver.findElement(By.name("address2")).sendKeys(address1);
        driver.findElement(By.name("phone2")).click();
        driver.findElement(By.name("phone2")).clear();
        driver.findElement(By.name("phone2")).sendKeys(home1);
        driver.findElement(By.name("notes")).click();
        driver.findElement(By.name("notes")).clear();
        driver.findElement(By.name("notes")).sendKeys(notes);
    }

    public void goToAddContact() {
        driver.findElement(By.linkText("add new")).click();
    }

    public void authorization(String admin, String secret) {
        driver.findElement(By.name("user")).click();
        driver.findElement(By.name("user")).clear();
        driver.findElement(By.name("user")).sendKeys(admin);
        driver.findElement(By.name("pass")).click();
        driver.findElement(By.name("pass")).clear();
        driver.findElement(By.name("pass")).sendKeys(secret);
        driver.findElement(By.xpath("//input[@value='Login']")).click();
    }

    public void goToGroupsPage() {
        driver.findElement(By.linkText("groups")).click();
    }

    public void selectGroup() {
        driver.findElement(By.name("selected[]")).click();
    }


    public void returnToGroupPage() {
        driver.findElement(By.linkText("group page")).click();
    }

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        // openSite
        openSite();

        // authorization
        authorization("admin", "secret");
    }

    public void returnToHomePage() {
        driver.findElement(By.linkText("home page")).click();
    }

    public void submitCreateContact() {
        driver.findElement(By.name("submit")).click();
    }

    public void enterDataGroup(String nameGroup, String header, String footer) {
        driver.findElement(By.name("group_name")).click();
        driver.findElement(By.name("group_name")).clear();
        driver.findElement(By.name("group_name")).sendKeys(nameGroup);
        driver.findElement(By.name("group_header")).click();
        driver.findElement(By.name("group_header")).clear();
        driver.findElement(By.name("group_header")).sendKeys(header);
        driver.findElement(By.name("group_footer")).click();
        driver.findElement(By.name("group_footer")).clear();
        driver.findElement(By.name("group_footer")).sendKeys(footer);
    }

    public void goToAddGroupPage() {
        driver.findElement(By.name("new")).click();
    }


    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();
    }

    public void deleteGroup() {
        driver.findElement(By.name("delete")).click();
    }
}
