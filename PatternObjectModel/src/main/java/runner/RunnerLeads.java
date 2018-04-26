package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//create leads
@RunWith(Cucumber.class)
@CucumberOptions(features="C:/Selenium_TestLeaf/PatternObjectModel/src/main/java/features/createLead.feature", 
glue= {"runner","pages"})
// tags= {"@Sanity", "@Regression"},monochrome=true)*/

/*//edit leads
@RunWith(Cucumber.class)
@CucumberOptions(features="C:/Selenium_TestLeaf/PatternObjectModel/src/main/java/features/editLead.feature", glue= {"runner","pages"})*/

/*//delete leads
@RunWith(Cucumber.class)
@CucumberOptions(features="C:/Selenium_TestLeaf/PatternObjectModel/src/main/java/features/deleteLead.feature", glue= {"runner","pages"})*/

/*//find leads
@RunWith(Cucumber.class)
@CucumberOptions(features="C:/Selenium_TestLeaf/PatternObjectModel/src/main/java/features/findLead.feature", glue= {"runner","pages"})*/

/*//duplicate leads
@RunWith(Cucumber.class)
@CucumberOptions(features="C:/Selenium_TestLeaf/PatternObjectModel/src/main/java/features/duplicateLead.feature", 
glue= {"runner","pages"},monochrome=true)*/

//merge leads- from lead icon value
/*@RunWith(Cucumber.class)
@CucumberOptions(features="C:/Selenium_TestLeaf/PatternObjectModel/src/main/java/features/mergeLead.feature", 
glue= {"runner","pages"},monochrome=true)*/

public class RunnerLeads {

}
