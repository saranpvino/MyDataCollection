package utils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class RetrySuiteListener implements IAnnotationTransformer {//step1
	// step2:rightclick- source- override/implement method- Edit body of method
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		// step3:use RetryFailedTests class here for setting RetryAnalyzer
		annotation.setRetryAnalyzer(RetryFailedTests.class);
		//step4: give <listener> in testng.xml
	}

}
