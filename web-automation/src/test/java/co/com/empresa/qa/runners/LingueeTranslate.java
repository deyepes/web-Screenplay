package co.com.empresa.qa.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static cucumber.api.SnippetType.CAMELCASE;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/linguee_translate.feature",
                    glue = "co.com.empresa.qa.stepsdefinitions",
        snippets = CAMELCASE
)
public class LingueeTranslate {
}
