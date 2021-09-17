package co.com.lineru.credito.stepdefinitions;

import co.com.lineru.credito.tasks.Fill;
import co.com.lineru.credito.tasks.toEnter;
import co.com.lineru.credito.tasks.Go;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class CreditLineruStepDefinitions {

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that I am in the credit page$")
    public void thatIAmInTheCreditPage()  {
        OnStage.theActorCalled("I").wasAbleTo(Go.toLineruPage(), toEnter.toApplyCredit());
    }


    @When("^I apply for a credit with the values$")
    public void iApplyForACreditWithTheValues() {
        OnStage.theActorInTheSpotlight().attemptsTo(Fill.theForm());
    }

    @Then("^I verify the successful apply in the webpage$")
    public void iVerifyTheSuccessfulApplyInTheWebpage() {

    }


}
