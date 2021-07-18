package coding.challenge.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static coding.challenge.allure.AllureReport.attachScreenshot;
import static com.codeborne.selenide.Selenide.open;

public class CommonSteps {
    @Given("user opened customer page")
    @When("user opens customers page")
    public void userOpensMainPage() {
        open("");
        attachScreenshot("main-page");
    }
}
