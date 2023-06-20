package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CareerPageTests extends TestBase {
    @DisplayName("Correct job titles with keyword search")
    @Test
    void careerHasGivenKeyword() {
        String careerKeyword = "QA";
        mainPage.openMainPage()
                .acceptCookies()
                .openCareersSection();
        careerPage.searchCareerKeyword(careerKeyword)
                .verifyCareersHaveKeyword(careerKeyword);
    }

    @DisplayName("When searching for a jobs from the country, only this country's openings are shown")
    @Test
    void careerFromCorrectCountry() {
        String careerCountry = "United States",
                careerCountryShort = "US";
        mainPage.openMainPage()
                .acceptCookies()
                .openCareersSection();
        careerPage.searchCareerCountry(careerCountry)
                .verifyCareersFromCountry(careerCountryShort);
    }

    @DisplayName("When searching for a jobs with a specialization, only this specialization's openings are shown")
    @Test
    void careerWithCorrectSpecialization() {
        String careerSpecialization = "Java";
        mainPage.openMainPage()
                .acceptCookies()
                .openCareersSection();
        careerPage.searchCareerSpecialization(careerSpecialization)
                .verifyCareersSpecialization(careerSpecialization);
    }
}
