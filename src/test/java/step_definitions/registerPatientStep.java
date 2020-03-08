package step_definitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Before;
import org.openqa.selenium.Keys;
import pages.registerPatientPage;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class registerPatientStep {

    Faker faker = new Faker();

    registerPatientPage registerPatient = new registerPatientPage();
    @Then("User clicks register a patient")
    public void user_clicks_register_a_patient() {
       registerPatient.registerPatientButton.click();
    }

    @And("User enters Given name")
    public void userEntersGivenName() throws InterruptedException {
        String gName = ConfigurationReader.getProperty("givenName");
        registerPatient.givenName.sendKeys(faker.name().firstName());
        Thread.sleep(1000);
        //registerPatient.givenName.sendKeys(gName);

    }
    @And("User enters Family name")
    public void userEntersFamilyName() throws InterruptedException {
        String famName = ConfigurationReader.getProperty("familyName");
       Thread.sleep(1000);
        registerPatient.familyName.sendKeys(faker.name().lastName());
      //registerPatient.familyName.sendKeys(famName);

        Thread.sleep(2000);
        registerPatient.familyName.sendKeys(Keys.ENTER);
        registerPatient.familyName.sendKeys(Keys.ENTER);
        registerPatient.familyName.sendKeys(Keys.ENTER);
    }

    @Then("User clicks {string} to register as male")
    public void userClicksToRegisterAsMale(String arg0) throws InterruptedException {
        registerPatient.clickMale.click();
        registerPatient.birthDate.click();

    }

    @Then("User enters Birthdate information")
    public void userEntersBirthdateInformation() {
        registerPatient.birthdateYears.sendKeys("30");
        registerPatient.birthdateMonths.sendKeys("11");
        registerPatient.address.click();

    }

    @And("User fills out contact information")
    public void userFillsOutContactInformation() {
        registerPatient.enterAddress.sendKeys(faker.address().streetAddress());
        registerPatient.cityVillage.sendKeys(faker.address().city());
        registerPatient.stateProvince.sendKeys(faker.address().state());
        registerPatient.country.sendKeys(faker.address().country());
        registerPatient.postalCode.sendKeys(faker.address().zipCode());
        registerPatient.phoneNum.click();
        registerPatient.phoneNumber.sendKeys(faker.phoneNumber().cellPhone());
        registerPatient.relatives.click();

    }

    @And("User chooses relationship")
    public void userChoosesRelationship() {
        registerPatient.relationshipType.click();
        registerPatient.selectDoctor.click();
        registerPatient.personName.sendKeys(faker.name().firstName()+" "+faker.name().lastName());
        registerPatient.confirmation.click();
    }

    @Then("User confirms registration")
    public void userConfirmsRegistration() {
        registerPatient.confirmButton.click();
    }

    @Then("User clicks {string} to register as female")
    public void userClicksToRegisterAsFemale(String arg0) throws InterruptedException {
        registerPatient.clickFemale.click();
       Thread.sleep(2000);
        registerPatient.birthDate.click();
    }
}
