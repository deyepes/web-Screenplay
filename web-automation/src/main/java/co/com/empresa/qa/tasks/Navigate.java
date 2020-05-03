package co.com.empresa.qa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Navigate implements Task {

    private String url;
    public Navigate(String url){this.url=url;}
    public static Performable to(String url) {
        return instrumented(Navigate.class, url);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Open.url(url));
    }


}
