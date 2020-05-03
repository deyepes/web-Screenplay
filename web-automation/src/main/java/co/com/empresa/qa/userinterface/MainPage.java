package co.com.empresa.qa.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MainPage {
    public static final Target SOURCETEXT = Target.the("source text").located(By.id("source"));
    public static final Target DESTINATIONTEXT = Target.the("destination text").locatedBy("//span[@class='tlid-translation translation']");
}
