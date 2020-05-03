package co.com.empresa.qa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Translate implements Task {
    String word;

    public Translate(String word) {
        this.word = word;
    }

    public static Performable a(String word) {
        return instrumented(Translate.class, word);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(word).into(By.id("source")),
                Hit.the(Keys.ENTER).into(By.id("source"))
        );
        actor.remember("wordInEnglish", Target.the("texto").locatedBy("//span[@class='tlid-translation translation']").resolveFor(actor).getText());
    }
}
