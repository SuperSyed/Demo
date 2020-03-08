package step_definitions;

import java.sql.ResultSet;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.OhrmEmployeesPage;
import utilities.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
public class OhrmEmployeesStep {
    OhrmEmployeesPage ohrmEmployeesPage = new OhrmEmployeesPage();
    GridHelper gridHelper = new GridHelper();
    String firstName;
    @Given("I'm on logged in to OrangeHRM as admin")
    public void i_m_on_logged_in_to_OrangeHRM_as_admin() {
        Driver.getDriver().get(ConfigurationReader.getProperty("yollhrm.url"));
        ohrmEmployeesPage.userNameInput.sendKeys(ConfigurationReader.getProperty("yollhrm.username"));
        ohrmEmployeesPage.passwordInput.sendKeys(ConfigurationReader.getProperty("yollhrm.password"));
        ohrmEmployeesPage.loginBtn.click();
    }
    @Given("I click on the Employee List")
    public void i_click_on_the_Employee_List() {
        Helper.hover(ohrmEmployeesPage.pImTab);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ohrmEmployeesPage.employeeTab.click();
    }
    @Then("I see the list of employees in OrangeHRM")
    public void iSeeTheListOfEmployeesInOrangeHRM() {
        String customQuery = "select * from hs_hr_employee;";
        List<Map<String, Object>> dbResult=new ArrayList<Map<String, Object>>();
        try {
            DBUtility.openConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        int count = ohrmEmployeesPage.employeeRecords.size();
        try {
            dbResult = DBUtility.executeSQLQuery(customQuery);
            for(int i=1; i<=count; i++){
                String actualValue = gridHelper.getGridElement("//table[@id='resultTable']", i, 3).getText();
                Assert.assertEquals(dbResult.get(i).get("emp_firstname"), actualValue );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @And("I enter employee first name")
    public void iEnterEmployeeFirstName() throws InterruptedException {
        //Create Connection to Database
        List<Map<String, Object>> result=null;
        try {
            DBUtility.openConnection();
            result = DBUtility.executeSQLQuery("select * from hs_hr_employee");
            firstName = (String) result.get(7).get("emp_firstname");
            ohrmEmployeesPage.nameSearchBox.sendKeys(firstName);
            Thread.sleep(3000);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Then("I click on search button on OrangeHRM")
    public void iClickOnSearchButtonOnOrangeHRM() throws InterruptedException {
        ohrmEmployeesPage.searchButton.click();
        Thread.sleep(3000);
    }
    @Then("I see the employee in results of OrangeHRM")
    public void iSeeTheEmployeeInResultsOfOrangeHRM()  {
        Assert.assertEquals(firstName, ohrmEmployeesPage.firstNameInTable.getText());
    }
}




/*


import java.sql.ResultSet;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.OhrmEmployeesPage;
import utilities.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class OhrmEmployeesStep {

    OhrmEmployeesPage ohrmEmployeesPage = new OhrmEmployeesPage();
   // GridHelper gridHelper = new GridHelper();

    @Given("I'm on logged in to OrangeHRM as admin")
    public void i_m_on_logged_in_to_OrangeHRM_as_admin() {
        Driver.getDriver().get(ConfigurationReader.getProperty("yollhrm.url"));
        ohrmEmployeesPage.userNameInput.sendKeys(ConfigurationReader.getProperty("yollhrm.username"));
        ohrmEmployeesPage.passwordInput.sendKeys(ConfigurationReader.getProperty("yollhrm.password"));
        ohrmEmployeesPage.loginBtn.click();
    }
    @Given("I click on the Employee List")
    public void i_click_on_the_Employee_List() {
        Helper.hover(ohrmEmployeesPage.pImTab);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ohrmEmployeesPage.employeeTab.click();
    }
    @And("I enter employee first name")
    public void iEnterEmployeeFirstName() {
        //Register Driver for MySQL
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String databaseUrl = ConfigurationReader.getProperty("mysql.url");
        String databaseUserName = ConfigurationReader.getProperty("yollhrm.database.username");
        String databasePassword = ConfigurationReader.getProperty("yollhrm.database.password");
        Connection connection =null;
        Statement statement=null;
        ResultSet resultSet = null;
        //Create Connection to Database
        try {
            connection = DriverManager.getConnection(databaseUrl, databaseUserName, databasePassword);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //Create statement object to run your queries with
        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            //Execute SQL query
            resultSet = statement.executeQuery("select * from hs_hr_employee");
            while(resultSet.next()){
                String firstName =   resultSet.getString("emp_firstname");
                System.out.println(firstName);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
//        String firstName;
//        ohrmEmployeesPage.nameSearchBox.sendKeys(firstName);
    }

    @Then("I click on search button on OrangeHRM")
    public void iClickOnSearchButtonOnOrangeHRM() {

    }

    @Then("I see the employee in results of OrangeHRM")
    public void iSeeTheEmployeeInResultsOfOrangeHRM() {
    }
}
*/
