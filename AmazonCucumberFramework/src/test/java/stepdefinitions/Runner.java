package stepdefinitions;

import org.junit.runner.RunWith;

import io.cucumber.core.snippets.SnippetType;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import cucumber.api.*;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./Feature/Login.feature",
				glue={"stepdefinitions"},
				monochrome =true,
				dryRun = false,
				plugin= {"html:target/test-output"}
				)
				
				
public class Runner {

}


