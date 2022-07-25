package org.testrunnerjenkins;

import org.cucujenkinsreport.JvmReportJenkins;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\FeatureFiles\\FaceBookLogin.feature",
					glue="org.stepdefjenkins", 
					plugin= {"pretty","json:src\\test\\resources\\Reports\\output1.json"}, 
					monochrome = true
					)
public class JenkinsTestRunner {
	
	@AfterClass
	public static void reportGen() {
		JvmReportJenkins
		.genReport("C:\\Users\\Welcome\\eclipse-workspace\\Jenkins2507\\src\\test\\resources\\Reports\\output1.json");
	}

}
