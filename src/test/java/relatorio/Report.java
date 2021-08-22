package relatorio;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		         features = "src/test/resources/Features", 
                 glue = "executarMetodos",
                 plugin = { "pretty", "html:target/report.html","json:target/report.json"}, 
                 monochrome = true
		         )

public class Report {

}
