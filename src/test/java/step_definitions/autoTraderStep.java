package step_definitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AutoTradePage;
import pages.OhrmEmployeesPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.GridHelper;


public class autoTraderStep {

    AutoTradePage autoPage = new AutoTradePage();
    GridHelper gridHelper = new GridHelper();
    String firstName;


    @Given("User navigates to auto trader home page")
    public void user_navigates_to_auto_trader_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("autoTraderUrl"));

    }

    @Then("User can click Browse by Make, Browse by Style and Advanced Search")
    public void userCanClickBrowseByMakeBrowseByStyleAndAdvancedSearch() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue((autoPage.browseByMake.getText()).contains("Browse by Make"));
        Thread.sleep(2000);
        Assert.assertTrue((autoPage.browseByStyle.getText()).contains("Browse by Style"));
        Thread.sleep(2000);
        Assert.assertTrue((autoPage.AdvancedSearch.getText()).contains("Advanced Search"));
        Thread.sleep(2000);
    }

    @And("User has the option to click Search button")
    public void userHasTheOptionToClickSearchButton() throws InterruptedException {
        Assert.assertTrue((autoPage.searchButton.getText()).contains("Search"));
        Thread.sleep(2000);
    }

    @Then("Make sure can see Make and Model in drop down option on the website")
    public void makeSureCanSeeMakeAndModelInDropDownOptionOnTheWebsite() throws InterruptedException {

//        String s = autoPage.makeDropDown.getText();
//        System.out.println(s);
        Thread.sleep(1000);
        Assert.assertTrue((autoPage.makeDropDown.getText()).contains("Make"));
//        autoPage.makeDropDown.click();
//        Thread.sleep(1000);
//        autoPage.selectBMW.click();
//        autoPage.selectBMW.click();
//        Thread.sleep(10000);
//        Assert.assertTrue((autoPage.modelDropDown.getText()).contains("Model"));
//        autoPage.modelDropDown.click();
        Thread.sleep(1000);
        System.out.println(autoPage.modelDropDown.getText());
        Assert.assertTrue((autoPage.modelDropDown.getText()).contains("Model"));

    }


    @Then("User clicks advanced search button")
    public void user_clicks_advanced_search_button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions

        Thread.sleep(10000);
        System.out.println(autoPage.AdvancedSearch);
        Thread.sleep(10000);
        autoPage.AdvancedSearch.click();
        Thread.sleep(10000);
//        autoPage.enterZipCode.sendKeys("30004");
//        Thread.sleep(3000);
//        autoPage.clickCertified.click();

}
    }
