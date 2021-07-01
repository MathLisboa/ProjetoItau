package br.com.itau;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

    @CucumberOptions(
            features = {"classpath:feature"},
            plugin = {"json:target/cluecumber-report/json/cucumber.json", "junit:target/junit.xml"},
            glue = {"br.com.itau.steps"},
            tags = "@Calculadora"
    )
    public class CucumberRunnerTest extends AbstractTestNGCucumberTests {

        @Override
        @DataProvider(parallel = false)
        public Object[][] scenarios() {
            return super.scenarios();
        }
    }
