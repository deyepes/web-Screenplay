package co.com.empresa.qa.stepsdefinitions;

import co.com.empresa.qa.questions.Translated;
import co.com.empresa.qa.tasks.Navigate;
import co.com.empresa.qa.tasks.Translate;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static org.hamcrest.Matchers.is;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class GoogleTranslateStepsDefinitions {
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("I'm on the google translator page")
    public void iMOnTheGoogleTranslatorPage() {
        theActorCalled("Daniel").wasAbleTo(Navigate.to("https://translate.google.com/?hl=es#view=home&op=translate&sl=es&tl=en"));
    }

    @When("I write {string} in spanish")
    public void iWriteInSpanish(String word) {
        theActorInTheSpotlight().attemptsTo(Translate.a(word));
    }

    @Then("should see the {string} in english")
    public void shouldSeeTheInEnglish(String wordInEnglish) {
        theActorInTheSpotlight().should(seeThat(Translated.word(), is(wordInEnglish)));
    }
}
