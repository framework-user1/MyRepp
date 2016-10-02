package customreports;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.testng.IInvokedMethod;
import org.testng.IReporter;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.internal.annotations.ITest;
import org.testng.xml.XmlSuite;

public class CustomReporter implements IReporter{

	@Override
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
		
		System.out.println("*****************Inside CustomReporter ********");
		
		for(int SuiteNum=0; SuiteNum<suites.size(); SuiteNum++){
		
		// current test suite 	
			ISuite currentTestSuite = suites.get(SuiteNum);
			System.out.println(currentTestSuite.getName());
		
		// all tests within a test suite
			Map<String, ISuiteResult> suiteResults = currentTestSuite.getResults();
			Set<String> suiteResultsKeys = suiteResults.keySet();
			Iterator<String> suiteResultsKeysItr = suiteResultsKeys.iterator();
			
			while(suiteResultsKeysItr.hasNext()){
				String testName = suiteResultsKeysItr.next();
				System.out.println("Test Name -> " + testName);
				
				ISuiteResult testResult = suiteResults.get(testName);
				
				IResultMap testsPassed = testResult.getTestContext().getPassedTests();
				IResultMap testsFailed = testResult.getTestContext().getFailedTests();
				IResultMap testsSkipped = testResult.getTestContext().getSkippedTests();
				ITestNGMethod[] allTestMethods = testResult.getTestContext().getAllTestMethods();
				System.out.println("Test Method Names -> ");
				
				for(int testNum = 0; testNum<allTestMethods.length; testNum++){
					if(testsFailed.getAllMethods().contains(allTestMethods[testNum])){
						System.out.println(allTestMethods[testNum].getMethodName() + " Failed");
						//reason for failure
						Collection<ITestNGMethod> allFailedMethods = testsFailed.getAllMethods();
						Iterator<ITestNGMethod> allFailedMethodsItr = allFailedMethods.iterator();
						
						while(allFailedMethodsItr.hasNext()){
							ITestNGMethod meth = allFailedMethodsItr.next();
							
							if(allTestMethods[testNum].getMethodName().equals(meth.getMethodName())) {
								Set<ITestResult> failurereasons = testsFailed.getResults(meth);
								Iterator<ITestResult> failurereasonsItr = failurereasons.iterator();
									while(failurereasonsItr.hasNext()) {
										System.out.println("Reason = " + failurereasonsItr.next().getThrowable().getMessage().toString());
									}
							}
						}
					}
					else if(testsPassed.getAllMethods().contains(allTestMethods[testNum])) {
						System.out.println(allTestMethods[testNum].getMethodName() + " Passed");
					}	
					else if(testsSkipped.getAllMethods().contains(allTestMethods[testNum])) {
						System.out.println(allTestMethods[testNum].getMethodName() + " Failed");
						//reason for skipped
						Collection<ITestNGMethod> allSkippedMethods = testsSkipped.getAllMethods();
						Iterator<ITestNGMethod> allSkippedMethodsItr = allSkippedMethods.iterator();
						
						while(allSkippedMethodsItr.hasNext()){
							ITestNGMethod meth = allSkippedMethodsItr.next();
							
							if(allTestMethods[testNum].getMethodName().equals(meth.getMethodName())) {
								Set<ITestResult> skippedreasons = testsSkipped.getResults(meth);
								Iterator<ITestResult> skippedreasonsItr = skippedreasons.iterator();
									while(skippedreasonsItr.hasNext()) {
										System.out.println("Reason = " + skippedreasonsItr.next().getThrowable().getMessage().toString());
								}
							}
						}
					}
				 }
			 }
		  }
	  }		
  }
