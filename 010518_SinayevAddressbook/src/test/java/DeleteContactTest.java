import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DeleteContactTest extends TestBase{

    @Test
    public void contactDeletionTest{
        selectContact();
        goToEditContact();
        deleteContact();
        returnToHomePage();
    }

    public void selectContact() {
        driver.findElement(By.name("selected[]")).click();
    }

    public void goToEditContact() {

    }


    public void deleteContact() {

    }


}
