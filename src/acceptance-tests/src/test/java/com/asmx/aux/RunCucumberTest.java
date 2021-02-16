package com.asmx.aux;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty:target/acceptance-tests-report.txt", "json:target/acceptance-tests-report.json"})
public class RunCucumberTest {
}
