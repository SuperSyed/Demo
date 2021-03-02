package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutoTradePage {
    WebDriver driver;
    public AutoTradePage(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@title='Browse by Make']")
    public WebElement browseByMake;
    @FindBy(xpath = "//button[@title='Browse by Style']")
    public WebElement browseByStyle;
    @FindBy (xpath = "//a[normalize-space()='Advanced Search']")
    public WebElement AdvancedSearch;
    @FindBy (xpath = "//button[normalize-space()='Search']")
    public  WebElement searchButton;
    @FindBy (xpath = "//select[@id='makeCode']")
    public  WebElement makeDropDown;
    @FindBy (xpath = "//select[@name='makeCode']/optgroup[1]/option[3]")
    public WebElement selectBMW;
    @FindBy (xpath = "//select[@name='ModelCode']")
    public  WebElement modelDropDown;
    @FindBy (xpath = "//input[@name='zip']")
    public WebElement enterZipCode;
    @FindBy (xpath = "//div[contains(text(),'Certified')]")
    public WebElement clickCertified;



}
