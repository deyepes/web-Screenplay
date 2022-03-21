package co.com.empresa.qa.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MainPage {
    public static final Target SOURCETEXT = Target.the("source text").located(By.id("queryinput"));
    public static final Target DESTINATIONTEXT = Target.the("destination text").locatedBy("/html/body/div[1]/div/div/div[3]/div[1]/div[4]/div[2]/div[2]/div[1]/div[1]/div[1]/div/div/div/div/div/div[1]/h3/span[1]/a[1]");
}
