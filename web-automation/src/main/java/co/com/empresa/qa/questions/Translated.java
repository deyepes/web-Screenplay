package co.com.empresa.qa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.openqa.selenium.By;

public class Translated implements Question<String> {
    public static Translated word() {
        return new Translated();
    }

    @Override
    public String answeredBy(Actor actor) {
        return actor.recall("wordInEnglish");
    }
}
