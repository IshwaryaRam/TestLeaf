package runnerMyntra;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


//myntra search
@RunWith(Cucumber.class)
@CucumberOptions(features="C:/Selenium_TestLeaf/LearnGit/PatternObjectModel/src/main/java/myntraFeature/MyntraSearch.feature", 
glue= {"runnerMyntra","myntraPages"},monochrome=true)


public class RunnerMyntra {

}
