package stepDefinition;

import static org.junit.Assert.assertTrue;

//import io.cucumber.core.internal.gherkin.SymbolCounter;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.chrome.ChromeOptions;
/**
 * Unit test for simple App.
 */
public class StepDefinition {
    @After
    public void closeBrowser() {
         driver.close();
    }

    WebDriver driver;

    @Given("i am on waltz home page")
    public void i_am_on_waltz_home_page() {
        System.out.println("launch waltz");
        //System.setProperty("webdriver.chrome.driver", "driver/chromedriver_old.exe");
        
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors");
        driver = new ChromeDriver(options);
        
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //driver = new HtmlUnitDriver();
        //driver.get("http://db.lab.sealights.co:8081/waltz-web/");
        driver.get(" http://localhost:8081/waltz-web/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @When("i search application {string}")
    public void iSearchApplication(String string) {
        System.out.println("Search Application");
        driver.findElement(By.xpath("//a[text()=' Search ']")).click();
        driver.findElement(By.xpath("//input[@type='search']")).click();
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys(string);
        driver.findElement(By.xpath("//span[contains(text(),'" + string + "')]")).click();
        //driver.findElement(By.xpath("//a[contains(text(),'View')]")).click();
    }

    @Then("application details should be displayed")
    public void application_details_should_be_displayed() {
        System.out.println("results displayed");
    }

    @Then("view the {string} associated wth it")
    public void view_the_associated_wth_it(String string) {
        System.out.println("view " + string);
        driver.findElement(By.xpath("//span[text()='" + string + "']")).click();
    }


    @And("create a tag")
    public void createATag() {
        System.out.println("tag created");
    }

    @And("sleep a while")
    public void sleepAWhile() {
        try {
            Thread.sleep(20000);
        }
        catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }
    }
    
    @When("i want to search {string}")
    public void iWantToSearch(String arg0) {
    }

    @Then("person details should be displayed")
    public void personDetailsShouldBeDisplayed() {
    }

    @And("create a tag {string}")
    public void createATag(String strTag) {
        driver.findElement(By.xpath("//i[contains(text(),'tags')]/a[contains(text(),'add one')]")).click();
        driver.findElement(By.xpath("//input[@class='input ng-pristine ng-untouched ng-valid ng-empty']")).sendKeys(strTag);
        driver.findElement(By.xpath("//div[contains(text(),'Tags')]")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-xs']")).click();
        driver.findElement(By.xpath("//span[text()='People']")).click();

    }

    @And("remove tag {string}")
    public void removeTag(String strRemove) {

        driver.findElement(By.xpath("//a[contains(text(),'update')]")).click();
        driver.findElement(By.xpath("//a[@class='remove-button']")).click();
        driver.findElement(By.xpath("//div[contains(text(),'Tags')]")).click();
        driver.findElement(By.xpath("//div[contains(text(),'Aliases')]")).click();
        driver.findElement(By.xpath("//div[contains(text(),'Name')]")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-xs']")).click();
    }

    @And("attest the physical flow data")
    public void attestThePhysicalFlowData() {
        driver.findElement(By.xpath("//span[text()='Attestations']")).click();
        boolean varFirst = false;
        System.out.println(varFirst);
        driver.findElement(By.xpath("//a[text()='Attest physical flows']")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Confirm')]")).click();
        driver.switchTo().alert().accept();
    }


    @When("i want to  view logical flow for {string} Organisational unit")
    public void iWantToViewLogicalFlowForOrganisationalUnit(String arg0) {
        driver.findElement(By.xpath("//span[text()='Org Units']")).click();
        driver.findElement(By.xpath("//span//span[text()='Risk IT']")).click();
    }

    @Then("summary for logical flow should be displayed")
    public void summaryForLogicalFlowShouldBeDisplayed() {
        driver.findElement(By.xpath("//span[text()='Logical Flows']")).click();

    }

    @And("view graphical representation")
    public void viewGraphicalRepresentation() {
        driver.findElement(By.xpath("//a[text()='Graph']")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @And("view  tabular representation")
    public void viewTabularRepresentation() {
        driver.findElement(By.xpath("//a[text()='Table']")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("view the Physical Flow Details")
    public void view_the_Physical_Flow_Details() {
       driver.findElement(By.xpath("//a[contains(text(),'Physical Flow Detail')]")).click();
    }

    @Then("view the flows by  it {string}")
    public void view_the_flows_by_it(String strVar) {
        driver.findElement(By.xpath("//button[contains(text(),'"+strVar+"')]")).click();
    }

    @When("i want to  view details  for {string}")
    public void i_want_to_view_details_for(String string) {
        driver.findElement(By.xpath("//span[text()='Other Viewpoints']")).click();
        driver.findElement(By.xpath("//span[text()='Equities']")).click();
    }

    @When("view the {string} of applications under it")
    public void view_the_of_applications_under_it(String string) {
        driver.findElement(By.xpath("//span[text()='" + string + "']")).click();
    }

    @Given("i want to login in waltz application")
    public void i_want_to_login_in_waltz_application() {
        i_am_on_waltz_home_page();
        driver.findElement(By.xpath("//waltz-icon[@name='user']")).click();
        driver.findElement(By.xpath("//span[text()='Login']")).click();
    }

    @When("i enter credentials as {string}")
    public void i_enter_credentials_as(String strUser) {
        driver.findElement(By.xpath("//input[@ng-model='username']")).sendKeys(strUser);
    }

    @When("i enter password as {string}")
    public void i_enter_password_as(String strPass) {
        driver.findElement(By.xpath("//input[@ng-model='password']")).sendKeys(strPass);
    }

    @When("click on {string}")
    public void click_on(String strButton) {
        driver.findElement(By.xpath("//button[contains(text(),'"+strButton+"')]")).click();
    }

    @Then("invalid credentials message is displayed")
    public void invalid_credentials_message_is_displayed() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.switchTo().alert().accept();

    }

    @When("view the {string} for it")
    public void view_the_for_it(String string) {
        driver.findElement(By.xpath("//span[text()='" + string + "']")).click();
    }

    @Then("its relations details should be displayed")
    public void its_relations_details_should_be_displayed() {

    }


    @Then("view {string} under it")
    public void view_under_it(String string) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//div[text()='"+string+"']")).click();
    }

    @Then("view servers detail")
    public void view_servers_detail() {

        driver.findElement(By.xpath("//a[text()='Servers']")).click();
    }



}

