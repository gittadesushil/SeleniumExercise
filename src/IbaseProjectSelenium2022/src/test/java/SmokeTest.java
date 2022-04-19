import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class SmokeTest {
    @Given("I have a pre-condition")
    public void iHaveAPreCondition() {
        System.out.println("I am from GIVEN step");
    }

    @When("I perform some action")
    public void iPerformSomeAction() {
        Assertions.fail();
        System.out.println("I am from WHEN step");
    }

    @Then("I should some result")
    public void iShouldSomeResult() {
        System.out.println("I am from THEN step");
    }

    @Given("I have toy ABC")
    public void iHaveToyABC() {

    }

    @When("I insert battery inside toy")
    public void iInsertBatteryInsideToy() {
    }

    @Then("toy starts working")
    public void toyStartsWorking() {
    }
}
