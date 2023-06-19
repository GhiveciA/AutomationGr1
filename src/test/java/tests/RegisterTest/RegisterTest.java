package tests.RegisterTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.*;


public class RegisterTest extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(RegisterTest.class);
    private String newUrl = getBaseUrl() + "Register.html";
    String fname = "Adrian";
    String lname = "Ghiveci";
    String adress = "64 Oakfield Road, Street";
    String emailaddress = "ghiveci.adrian@yahoo.com";
    String phone = "07496798394";

    @Test
    public void register() {
        driver.get(newUrl);

        LOG.info("Complete the First name and Last name");
        registerPage.firstNameField(fname);
        registerPage.lastNameField(lname);
        sleep(3000);

        LOG.info("Complete the Adress");
        registerPage.adressField(adress);
        sleep(3000);

        LOG.info("Complete the Email Address");
        registerPage.emailAddressField(emailaddress);
        sleep(3000);

        LOG.info("Complete the Phone");
        registerPage.phoneField(phone)
        ;
        sleep(3000);

        LOG.info("Click gender radio button");
        registerPage.clickMaleGender();
        sleep(3000);

        LOG.info("Click gender radio button");
        registerPage.clickFeMaleGender();
        sleep(3000);

        LOG.info("Click checkbox button");
        registerPage.clickCricket();
        sleep(3000);

        LOG.info("Click checkbox button");
        registerPage.clickMovies();
        sleep(3000);

        LOG.info("Click checkbox button");
        registerPage.clickHockey();
        sleep(3000);
        //Test GIT

        //Test Git3



    }
}