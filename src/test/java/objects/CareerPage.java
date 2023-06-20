package objects;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.util.Arrays;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CareerPage {
    private final SelenideElement careerKeywordField = $("#keyword"),
            careerCountryField = $(".form-group-select-country .career-jobs__text"),
            careerCountryInput = $(".form-group-select-country input"),
            careerSpecializationField = $(".form-group-select-specialization .career-jobs__text"),
            careerSpecializationInput = $(".form-group-select-specialization input"),
            submitCareerFilterButton = $(".career-jobs__btn");
    private final ElementsCollection careerTitles = $$("a[data-offers='title']"),
            fullCareerResults = $$("tbody[role='rowgroup'] tr");

    @Step("Initiate the career search by keyword {careerKeyword}")
    public CareerPage searchCareerKeyword(String careerKeyword) {
        careerKeywordField.setValue(careerKeyword).pressEnter();
        return this;
    }

    @Step("Verify that all search results have keyword {careerKeyword} in their title")
    public void verifyCareersHaveKeyword(String careerKeyword) {
        String[] careers = new String[10];
        Arrays.fill(careers, careerKeyword);
        careerTitles.shouldHave(CollectionCondition.texts(Arrays.asList(careers)));
    }

    @Step("Initiate the career search by country {careerCountry}")
    public CareerPage searchCareerCountry(String careerCountry) {
        careerCountryField.click();
        careerCountryInput.setValue(careerCountry).pressEnter();
        submitCareerFilterButton.click();
        return this;
    }

    @Step("Verify that all search results have keyword {careerCountryShort} in their title")
    public void verifyCareersFromCountry(String careerCountryShort) {
        String[] careers = new String[10];
        Arrays.fill(careers, careerCountryShort);
        fullCareerResults.shouldHave(CollectionCondition.texts(Arrays.asList(careers)));
    }

    @Step("Initiate the career search by specialization {careerSpecialization}")
    public CareerPage searchCareerSpecialization(String careerSpecialization) {
        careerSpecializationField.click();
        careerSpecializationInput.setValue(careerSpecialization).pressEnter();
        submitCareerFilterButton.click();
        return this;
    }

    @Step("Verify that all search results have keyword {careerSpecialization} in their title")
    public void verifyCareersSpecialization(String careerSpecialization) {
        String[] specializations = new String[10];
        Arrays.fill(specializations, careerSpecialization);
        fullCareerResults.shouldHave(CollectionCondition.texts(Arrays.asList(specializations)));
    }
}
