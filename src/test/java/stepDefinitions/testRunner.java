package stepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/resources/features", glue= {"stepDefinitions"},
        //tags="@test",
        dryRun = false,
        monochrome=true,
        plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "pretty","html:reports/CucumberReports/CucumberHtmlReport.html",
                "json:reports/CucumberReports/CucumberJsonReport.json",
                "junit:reports/CucumberReports/CucumberJunitReport.xml"}
)

public class testRunner {
}
