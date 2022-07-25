package org.cucujenkinsreport;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReportJenkins {
	
public static void genReport(String jsonFile) {
		
		File file = new File("C:\\Users\\Welcome\\eclipse-workspace\\Jenkins2507\\src\\test\\resources\\Reports");
		
		Configuration configuration = new Configuration(file, "Facebook Verification");
		
		configuration.addClassifications("OS", "Windows");
		configuration.addClassifications("Browser", "Chrome");
		
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(jsonFile);
		
		ReportBuilder builder = new ReportBuilder(jsonFiles, configuration);
		
		builder.generateReports();
		
	}

}
