package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="Feature/scenariooutline.feature", glue= {"stepDefination"})

//Run only valid scenario
//@CucumberOptions(features="Feature/hooks.feature", glue= {"stepDefination"},tags= {"@invalid"},plugin= {"pretty"},monochrome=true)

//Run scenario in GROUPS
//@CucumberOptions(features="Feature/", glue= {"stepDefination"},tags= {"@smoke"})

//Create Report in PRETTY format using monochrome=true
//@CucumberOptions(features="Feature/", glue= {"stepDefination"},tags= {"@smoke"},plugin= {"pretty"},monochrome=true)

//Create Report in using "USAGE" It show execution in reports
//@CucumberOptions(features="Feature/", glue= {"stepDefination"},tags= {"@smoke"},plugin= {"usage"})

//To Create Report in HTML format
//@CucumberOptions(features="Feature/", glue= {"stepDefination"},tags= {"@smoke"},plugin= {"pretty","html:targethtml/Htmlreport"})

//To Create Report in JSON format
//@CucumberOptions(features="Feature/", glue= {"stepDefination"},tags= {"@smoke"},plugin= {"pretty","json:targetjson/Jsonreport"})

//To Create Report in JUNIT format
//@CucumberOptions(features="Feature/", glue= {"stepDefination"},tags= {"@smoke"},plugin= {"pretty","junit:targetjunit/JUnitreport"})

//To Create Multiple Report 
//@CucumberOptions(features="Feature/", glue= {"stepDefination"},tags= {"@smoke"},plugin= {"pretty","junit:targetjunitmulti/JUnitmultireport","json:targetmultirepo/JSONmultirepo.json"})

public class Testrunner {

	
}



















