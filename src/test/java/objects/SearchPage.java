package objects;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchPage {
    private final SelenideElement searchHeader = $(".search-results__header h3"),
            activePage = $("nav[aria-label$='Search page navigation'] .active"),
            searchResultsAmountText = $(".search-results__results--total");
    private final ElementsCollection searchResults = $$(".search-results__results--item");

    @Step("Verify that the header text is: Results for \"{searchText}\"")
    public void verifyHeaderText(String searchText) {
        searchHeader.shouldHave(text("Results for \"" + searchText + "\""));
    }

    @Step("Verify that after search, the first active page is number 1")
    public void verifyPageNumberOne() {
        activePage.shouldHave(exactText("1"));
    }

    @Step("Verify that there's a text saying that there will be 10 results on the first page")
    public void verifySearchItemsAmountText() {
        searchResultsAmountText.shouldHave(text("Showing 1 - 10 of"));
    }

    @Step("Verify that there's are 10 results on the first page")
    public void verifySearchItemsAmount() {
        searchResults.shouldHave(CollectionCondition.size(10));
    }


}
