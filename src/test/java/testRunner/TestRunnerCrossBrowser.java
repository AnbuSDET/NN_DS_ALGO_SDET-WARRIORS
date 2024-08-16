package testRunner;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import org.testng.annotations.Parameters;

import Utilities.ConfigReader;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
	       	  //features={".//FeatureFiles/"},
		 	  //features={".//FeatureFiles/Home.feature"},
		      features={".//FeatureFiles/GetStarted.feature"},
		      //features ={".//FeatureFiles/SignIn.feature"},
		      //features ={".//FeatureFiles/Register.feature"},
			  //features={".//FeatureFiles/DataStructure.feature"},
		      //features={".//FeatureFiles/Array.feature"},
	          //features={".//FeatureFiles/LinkedList.feature"},
		      //features={".//FeatureFiles/Stack.feature"},
		      //features={".//FeatureFiles/Queue.feature"},
		 	  //features={".//FeatureFiles/Tree.feature"},
			  //features={".//FeatureFiles/Graph.feature"},
			  
			  glue = "stepDefinitions",
			  plugin = {"pretty", "html:reports/myreport.html", //----Cucumber Report
					  "rerun:target/rerun.txt",
					  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",//---Extent Report 
					  "timeline:target/timeline" //-----Timeline report
					   },
			  dryRun = false,
			  monochrome = true,
			  publish = true
			  //tags="@sanity"  // this will execute scenarios tagged with @sanity
			  //tags="@Trial"
			  //tags="@sanity and @regression" //Scenarios tagged with both @sanity and @regression
			  //tags="@sanity and not @regression" //Scenarios tagged with @sanity but not tagged with @regression
			  //tags="@sanity or @regression" //Scenarios tagged with either @sanity or @regression	
			  
		)


public class TestRunnerCrossBrowser extends AbstractTestNGCucumberTests {
	
	    
		@Override
	    @DataProvider(parallel = true)
	    public Object[][] scenarios() {
	        return super.scenarios();
		    }
		
		
		@BeforeTest
		@Parameters({"browser"})
			public void defineBrowser(String browser) throws Throwable {
				ConfigReader.setBrowserType(browser);
		}
		
	}