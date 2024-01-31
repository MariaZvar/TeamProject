package com.openMRS.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/PatientRecord.feature",
        glue = "com/openMRS/step_defenitions",
        dryRun =false
      //  tags ="@Task3",
        //plugin = {"pretty", "html:target/uiReport.html", "rerun:target/uiFailedTests.txt"}
)
public class OpenMRS_Runner {
}
