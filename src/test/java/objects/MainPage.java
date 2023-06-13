package objects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    private final SelenideElement logo = $("[src='/theme/luxoft/assets/images/logo/luxoft-new-white.svg']"),
            searchButton = $("#search-btn"),
            searchInputField = $("input[placeholder='Search...']");
    private final ElementsCollection socialNetworks = $$(".btn-social-networks"),
            ourServicesBlocks = $(".container-services").$$(".col");

    @Step("Open the main page")
    @Deprecated
    public MainPage openMainPage() {
        open("https://www.luxoft.com/");
        return this;
    }

    @Step("Accept all the cookies")
    public MainPage acceptCookies() {
        $("#onetrust-accept-btn-handler").click();
        return this;
    }

    @Step("Check if the logo is visible")
    public void checkLogoVisible() {
        logo.shouldBe(Condition.visible);
    }

    @Step("Check if there are 4 official social network icons")
    public void verifySocialNetworkAmount() {
        socialNetworks.shouldHave(size(4));
    }

    @Step("Check if there are 7 blocks in Our Services section")
    public void verifyOurServicesAmount() {
        ourServicesBlocks.shouldHave(size(7));
    }

    @Step("Initiate the search from the main page with text {searchText}")
    public void initiateSearchWithText(String searchText) {
        searchButton.click();
        searchInputField.setValue(searchText).pressEnter();
    }
}
