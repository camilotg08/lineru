package co.com.lineru.credito.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
        features = "src/test/resources/features/lineruCredito.feature",
        tags = "@stories",
        glue = "co.com.lineru.credito.stepdefinitions",
        snippets = SnippetType.CAMELCASE )

public class ApplyCredit {
}
