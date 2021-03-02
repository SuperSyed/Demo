package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import java.util.List;
public class APHomePage {
    WebDriver driver;
    public APHomePage(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "search_query_top")
    public WebElement searchBox;
    @FindBy(name="submit_search")
    public WebElement searchButton;
    @FindBy(css= "[title='Women'][class='sf-with-ul']")
    public WebElement womensTab;
    @FindBy(xpath = "(//*[@title=\"Casual Dresses\"])[1]")
    public WebElement casualDressLink;
    @FindBy(css = ".cat-name")
    public WebElement casualDressTitle;
    @FindBy(css =".rst-content .context-menu-one")
    public WebElement clickMeButton;
    @FindBy(css = ".context-menu-icon-copy")
    public WebElement copyButton;
    @FindBy(id = "box3")
    public  WebElement washington;
    @FindBy(id = "box103")
    public  WebElement unitedStates;
    @FindBy(id="age")
    public WebElement ageInputBox;
    @FindBy(css = "input[id^='RESULT_FileUpload']")
    public WebElement uploadButton2;
    @FindBy(xpath = "//div[@id='resizable']")
    public WebElement downloadButton;


    @FindBy(id = "email_create")
    public WebElement emailInputBox;
    @FindBy(id = "SubmitCreate")
    public WebElement createAccountBtn;
    @FindBy(id = "customer_firstname")
    public WebElement firstname;
    @FindBy(id = "customer_lastname")
    public WebElement lastname;
    @FindBy(id = "passwd")
    public WebElement password;
    @FindBy(id = "address1")
    public WebElement streetName;
    @FindBy(id = "city")
    public WebElement cityName;
    @FindBy(id = "id_state")
    public WebElement stateName;
    @FindBy(id = "postcode")
    public WebElement zipCode;
    @FindBy(id = "phone_mobile")
    public WebElement phoneNumber;
    @FindBy(id = "submitAccount")
    public WebElement registerButton;
    @FindBy(css = ".page-heading")
    public WebElement pageHeading;
    @FindBy(css=".login")
    public WebElement signInButton;
}
