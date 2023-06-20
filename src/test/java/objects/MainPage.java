package objects;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    private final SelenideElement logo = $("[src='/theme/luxoft/assets/images/logo/luxoft-new-white.svg']"),
            searchButton = $("#search-btn"),
            careerButton = $(".header__new-menu").$(byText("Careers")),
            searchInputField = $("input[placeholder='Search...']"),
            caseStudiesButton = $(byText("View more case studies")),
            viewIndustriesButton = $(byText("View all industries"));
    private final ElementsCollection socialNetworks = $$(".btn-social-networks"),
            ourServicesBlocks = $(".container-services").$$(".col");

    @Step("Open the main page")
    public MainPage openMainPage() {
        open(baseUrl);
        return this;
    }

    @Step("Accept all the cookies")
    public MainPage acceptCookies() {
        $("#onetrust-accept-btn-handler").click();
        return this;
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

    @Step("Open the Careers section")
    public void openCareersSection() {
        careerButton.click();
    }

    @Step("Click on the 'View more case studies' button")
    public MainPage clickViewMoreCaseStudies() {
        caseStudiesButton.click();
        return this;
    }

    @Step("Click on the 'View all industries' button")
    public MainPage clickViewAllIndustries() {
        viewIndustriesButton.click();
        return this;
    }
}
