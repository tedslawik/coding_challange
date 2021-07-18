package coding.challenge.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MainPage {

    public SelenideElement headerText(){
        return $(".container > h3");
    }


    public SelenideElement  searchDropDown() {
        return $("#search-column");
    }
    public SelenideElement searchDropDownOption(String optionSelector){
        return searchDropDown().$("option[value='"+optionSelector+"']");
    }

    public SelenideElement searchInput() {
        return $("#search-input");
    }

    public ElementsCollection customersList() {
        return $$("tbody >tr");
    }

    public SelenideElement resumeOfCustomerList() {
        return $("#table-resume");
    }

    public SelenideElement matchCaseCheckbox() {
        return $("#match-case") ;
    }
    public SelenideElement searchSloganResult(){
        return  $("#search-slogan");
    }

    public SelenideElement clearButton() {
        return $("#clear-button");
    }
}
