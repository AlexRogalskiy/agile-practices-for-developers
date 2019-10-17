package com.acme.dbo.it.bdd;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("it")
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:/features",
        plugin = {"pretty", "html:target/cucumber-reports"},
        strict = false,
        tags = "not @WIP"
)
public class CucumberSuiteIT {
}
