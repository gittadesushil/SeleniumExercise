import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RegressionSuite {
    WebDriver driver = new ChromeDriver();

    @Given("Foodstore website should up and running")
    public void foodstoreWebsiteShouldUpAndRunning() {
        driver.get("https://foodstore-1.web.app/");
        driver.manage().window().maximize();
    }

    @When("I Go to homepage")
    public void iGoToHomepage() {
    }

    @Then("I should available on home page")
    public void iShouldAvailableOnHomePage() {
        String actualHeading = driver.findElement(By.className("coverTitle")).getText();
        Assertions.assertEquals("You order we deliver", actualHeading, "User is available on home page");
    }

    @When("I Enter Mumbai in search box and click on Search button")
    public void iEnterMumbaiInSearchBoxAndClickOnSearchButton() {
        driver.findElement(By.className("cityInput")).sendKeys("Mumbai");
        driver.findElement(By.id("citySearchbtn")).click();
    }

    @Then("I should see list of hotels")
    public void iShouldSeeListOfHotels() throws InterruptedException {
        List<WebElement> hotels = driver.findElements(By.className("mainPage_restaurent_inner_container"));
        Thread.sleep(4000);
        List<WebElement> hotelNames = driver.findElements(By.className("res_title"));
        boolean condition = (hotels.size() > 0 && hotelNames.size() > 0);
        Assertions.assertTrue(condition,"You are available on list of hotels page");

        //Option of verification
//        if (hotels.size() > 0 && hotelNames.size()> 0) {
//            System.out.println("PASS: You are available on list of hotels page");
//        } else {
//            Assertions.fail("FAIL: You are not available on list of hotels page");
//        }
    }

    @When("I Go back to homepage")
    public void iGoBackToHomepage() {
        driver.navigate().back();
    }

    @Then("I should see search box again")
    public void iShouldSeeSearchBoxAgain() {
        boolean isSearchBoxDisplyed = driver.findElement(By.className("cityInput")).isDisplayed();
        Assertions.assertTrue(isSearchBoxDisplyed,"Search box is available");
    }


    @When("I Enter Pune in search box and hit ENTER button from keyboard")
    public void iEnterPuneInSearchBoxAndHitENTERButtonFromKeyboard() {
        driver.findElement(By.className("cityInput")).sendKeys("Pune" + Keys.ENTER);
    }

    @When("close the browser")
    public void closeTheBrowser() {
        driver.quit();
    }

    @When("user enter {}")
    public void userEnterName(String value) {
        System.out.println("When I enter : " + value);
    }

    @Then("I should see {}")
    public void iShouldSeeErrorMessage(String error) {
        System.out.println("Then I should see : " + error);
    }


}
