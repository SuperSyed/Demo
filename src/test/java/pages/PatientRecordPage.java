package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PatientRecordPage {
    WebDriver driver;

    public PatientRecordPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(className = "icon-search")
    public WebElement patientRecordbutton;
    @FindBy(id = "patient-search")
    public WebElement searchBox;
    @FindBy (id = "patient-search-results-table_next")
    public WebElement nextPage;
    @FindBy (id = "patient-search-results-table_last")
    public WebElement lastPage;
    @FindBy (xpath = "//tr[1]//td[2]")
    public WebElement patientName;
    @FindBy (xpath =  "//h3[contains(text(),'General Actions')]")
    public WebElement generalAction;
    @FindBy(id = "org.openmrs.module.coreapps.createVisit")
    public WebElement startVisit;
    @FindBy(id = "org.openmrs.module.coreapps.createRetrospectiveVisit")
    public WebElement addPastVisit;
    @FindBy(id = "org.openmrs.module.coreapps.mergeVisits")
    public WebElement mergeVisits;
    @FindBy(id = "chartsearch.chartSearchLink")
    public WebElement chartSearch;
    @FindBy(id = "appointmentschedulingui.schedulingAppointmentDashboardLink")
    public WebElement scheduleAppointment;
    @FindBy(id = "appointmentschedulingui.requestAppointmentDashboardLink")
    public WebElement requestAppointment;
    @FindBy(id = "org.openmrs.module.coreapps.markPatientDead")
    public WebElement markPatientDeceased;
    @FindBy(id = "org.openmrs.module.coreapps.deletePatient")
    public WebElement deletePatient1;


    @FindBy (id = "org.openmrs.module.coreapps.deletePatient")
    public WebElement deletePatient;
    @FindBy (id = "delete-reason")
    public WebElement deleteReason;
    @FindBy (xpath = "//html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/button[1]")
    public WebElement confirmDelete;
    @FindBy(xpath = "//*[@id='content']/div[9]/div/div[2]/div[4]/div[1]/i[2]")
    public WebElement allerigiesPencil;
    @FindBy(id = "allergyui-addNewAllergy")
    public WebElement addAllergButton;
    @FindBy(id = "allergen-80106")
    public WebElement morphineButton;
    @FindBy(id = "reaction-142412")
    public WebElement diarrehaButton;
    @FindBy(id = "reaction-143264")
    public WebElement coughButton;
    @FindBy(id = "reaction-139084")
    public WebElement headacheButton;
    @FindBy(id = "reaction-139581")
    public WebElement giUpset;
    @FindBy(id = "severity-1500")
    public WebElement severityButton;
    @FindBy(id = "allergy-comment")
    public WebElement allergyComment;
    @FindBy(id = "addAllergyBtn")
    public WebElement submitButton;
    @FindBy(xpath = "//*[@id='content']/div[1]/div[1]/h1/span[1]/span")
    public WebElement clickOnFirstName;
    @FindBy (xpath = "//*[@id='content']/div[9]/div/div[2]/div[4]/div[2]/ul/li/span[1]")
    public WebElement morphineVerify;

}
