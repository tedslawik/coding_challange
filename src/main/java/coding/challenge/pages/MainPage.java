package coding.challenge.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    public SelenideElement headerText(){
        return $(".container > h3");
    }
}
