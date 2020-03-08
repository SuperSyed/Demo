package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import java.util.List;
public class OhrmEmployeesPage {
    WebDriver driver;
    public OhrmEmployeesPage(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "txtUsername")
    public WebElement userNameInput;
    @FindBy(id = "txtPassword")
    public WebElement passwordInput;
    @FindBy(id = "btnLogin")
    public WebElement loginBtn;
    @FindBy(id = "menu_pim_viewPimModule")
    public WebElement pImTab;
    @FindBy(id = "menu_pim_viewEmployeeList")
    public WebElement employeeTab;
    @FindBy(xpath = "//table[@id='resultTable']/tbody/tr")
    public List<WebElement> employeeRecords;
    @FindBy(id="empsearch_employee_name_empName")
    public WebElement nameSearchBox;
    @FindBy(id= "searchBtn")
    public WebElement searchButton;
    @FindBy(xpath = "//table[@id = 'resultTable']/tbody/tr[1]/td[3]/a")
    public WebElement firstNameInTable;
}