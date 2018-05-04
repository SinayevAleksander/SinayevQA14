import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CreateContactTest extends TestBase {

    @Test
    public void testCreateContact() throws Exception {
        openSite();
        authorization();
        goToAddContact();
        enterContantInformation();
        submitCreateContact();
        returnToHomePage();
    }


}
