package coding.challenge.steps;

import coding.challenge.pages.MainPage;
import io.cucumber.java.en.Then;

import static com.codeborne.selenide.Condition.exactText;

public class MainSteps {

    MainPage mainPage = new MainPage();
    @Then("user should see {string} header")
    public void userShouldSeeCustomerHeader(String headerText) {

        mainPage.headerText().shouldBe(exactText(headerText));

        // assertThat(mainPage.headerText().text()).isEqualTo(headerText);
    }
}
