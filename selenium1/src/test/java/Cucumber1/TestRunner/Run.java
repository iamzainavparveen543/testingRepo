package Cucumber1.TestRunner;

import io.cucumber.core.gherkin.Feature;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
//            single feature file execute
        features = "src/test/java/Cucumber1/Feature/Create_new_account.feature",
//        multiple feature file executed
//        features = "src/test/java/Cucumber1/Feature",
        glue = "Cucumber1.StepDefinition",
        dryRun =true,
//          tags = "@sanity and @regression",
        tags = "@regression",


        monochrome = true,
        plugin = {"pretty","html:target/Cucumber_reports/report2.html"}

//    single format report
//  plugin = {"pretty","json:target/Cucumber_reports/report_json.json"}
//        single format report
//  plugin = {"pretty","html:target/Cucumber_reports/reports1.html"}
//        third formats in reports
//  plugin = {"pretty","junit:target/Cucumber_reports/report2.xml,json:target/Cucumber_reports/report_json.json,html:target/Cucumber_reports/reports1.html"}

)

public class Run {
    //Empty
}
