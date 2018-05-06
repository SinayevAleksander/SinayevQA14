import org.testng.annotations.Test;

public class CreateContactTest extends TestBase {

    @Test
    public void testCreateContact() throws Exception {

        goToAddContact();
        enterContantInformation("First name", "Middle name", "Last name",
                "Nickname", "Title", "Company", "Address", "Home",
                "Mobile", "Work", "Fax", "E-mail", "E-mail2", "E-mail3",
                "Homepage", "Address", "Home", "Notes");
        submitCreateContact();
        returnToHomePage();
    }


}
