import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class AssertionsDemo{
    @Given("I have a method")
    public void iHaveAMethod() {
        System.out.println("My pre-condition");
    }

    @When("I do something")
    public void iDoSomething() {
        if("ibaseererwerwerwerwerwre".equals("ibase")){
            System.out.println("ibase string is matched");
        }else{
            Assertions.fail("ibase string is not matched");
        }
    }

    @Then("I see some result")
    public void iSeeSomeResult() {
        Assertions.assertEquals('A','A',"A should match with A");
    }
}
