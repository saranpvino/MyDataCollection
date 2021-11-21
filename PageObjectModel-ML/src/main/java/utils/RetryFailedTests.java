package utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTests implements IRetryAnalyzer {
	//step1:set max retry failed testcases
	int maxRetry=2,count=1;
	public boolean retry(ITestResult result) {
		if(count<maxRetry) {
			count++;
			return true;
		}
		return false;
	}
	//step2:Give everypage @Test with retryanalyzer attribute.. 
	//To overcome this writing retryanalyzer for every page 
	//Go for RetrySuiteListener class implements IAnnotationTransfromer

}
