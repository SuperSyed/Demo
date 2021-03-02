package step_definitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import pages.APHomePage;
import pages.APSearchPage;
import utilities.ConfigurationReader;
import utilities.Driver;



public class APHomeStep {
    APHomePage aPHomePage = new APHomePage();
    APSearchPage aPSearchPage = new APSearchPage();
    static final Logger oLog = LogManager.getLogger(APHomeStep.class);

    @Given("I'm on AP homepage")
    public void i_m_on_AP_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("apUrl"));
        oLog.info("Navigated to the Automation Practice URL");
    }
    @Given("I search for {string} on AP")
    public void i_search_for_on_AP(String keyword) {
        aPHomePage.searchBox.sendKeys(keyword);
        }


    @Then("I click on search button on AP")
    public void i_click_on_search_button_on_AP() {
        aPHomePage.searchButton.click();
    }
    @Then("I hover over womens tab")
    public void i_hover_over_womens_tab() {
        Actions act = new Actions(Driver.getDriver());
        act.moveToElement(aPHomePage.womensTab).build().perform();
    }
    @Then("I click on casual dresses link")
    public void i_click_on_casual_dresses_link() {
        aPHomePage.casualDressLink.click();
        oLog.warn("Clicked on the woman casual dress button ");
    }
    @Then("I am navigated to causal dresses page")
    public void i_am_navigated_to_causal_dresses_page() {
        Assert.assertEquals(aPHomePage.casualDressTitle.getText().trim(), "CASUAL DRESSES");
    }

    @Given("I' on swisnl page")
    public void iOnSwisnlPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("swisnl.url"));
    }
    @Then("I right click on element and verify functionality")
    public void iRightClickOnElementAndVerifyFunctionality() {
        Actions act = new Actions(Driver.getDriver());
        act.contextClick(aPHomePage.clickMeButton).build().perform();
        aPHomePage.copyButton.click();
        Alert alert = Driver.getDriver().switchTo().alert();
        Assert.assertEquals("clicked: copy", alert.getText());
        alert.accept();
    }
    @Given("I'm on the dhtmlgoodies page")
    public void i_m_on_the_dhtmlgoodies_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("dhtmlgoodies.url"));
    }
    @Then("I can drag and drop city")
    public void i_can_drag_and_drop_city() {
        Actions act = new Actions(Driver.getDriver());
        act.dragAndDrop(aPHomePage.washington, aPHomePage.unitedStates).perform();
    }
    @Then("I verify color of answer")
    public void i_verify_color_of_answer() {
        Assert.assertEquals(aPHomePage.washington.getCssValue("background-color"), "rgba(0, 255, 0, 1)");
    }
    @Given("I'm on jQuery page")
    public void iMOnJQueryPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("jQueryToolti.url"));
    }
    @Then("I see tooltip on the age inputbox")
    public void iSeeTooltipOnTheAgeInputbox() {
        Driver.getDriver().switchTo().frame(0);
//        WaitHelper.waitForVisibility(aPHomePage.ageInputBox, 3);
        Assert.assertEquals("We ask for your age only for statistical purposes.", aPHomePage.ageInputBox.getAttribute("title"));
        Driver.getDriver().switchTo().defaultContent();
    }

    @Given("I'm on automation practice page")
    public void iMOnAutomationPracticePage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("automationPractice.url"));
    }
    @Then("I should be able to upload a file")
    public void iShouldBeAbleToUploadAFile() throws InterruptedException {
        Thread.sleep(5000);
        Driver.getDriver().switchTo().frame(0);
        aPHomePage.uploadButton2.sendKeys("C:\\Users\\Syed\\Desktop\\DownloadedSelenium\\YFramework\\src\\test\\resources\\testData");
        // aPHomePage.uploadButton2.sendKeys("../src/test/resources/testData/BiggestTroll.txt");
        Driver.getDriver().switchTo().defaultContent();
    }
    @Given("I'm on automation demo page")
    public void iMOnAutomationDemoPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("automationDemo.url"));
    }
    @Then("I download a file")
    public void iDownloadAFile() throws InterruptedException {
        Driver.getDriver().navigate().refresh();
        Driver.getDriver().navigate().refresh();
        Driver.getDriver().navigate().refresh();
        Thread.sleep(2000);
        Driver.getDriver().findElement(By.cssSelector(".btn-primary")).click();
    }
}