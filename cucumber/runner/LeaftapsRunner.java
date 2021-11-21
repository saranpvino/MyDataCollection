package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import steps.BaseClass;

@CucumberOptions(features = "src/test/java/features", 
					glue = "steps", 
					monochrome = true, 
					publish = true,
					tags="@createleads or @editleads or @mergeleads or @duplicateleads or @deleteleads"
					//tags="not @createlead"
					//tags="@logincredential or @addlead"
					//tags="@logincredential and @login"
				)
public class LeaftapsRunner extends BaseClass {

}
