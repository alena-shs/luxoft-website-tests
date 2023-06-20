package tests;

import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Owner("Alena Shomanova")
@Story("The main page's content")
@Tag("MainPageTests")
public class MainPageTests extends TestBase {
    @DisplayName("Industry page opens after clicking on 'View all industries' button")
    @Test
    void industriesPageOpens() {
        mainPage.openMainPage()
                .acceptCookies()
                .clickViewAllIndustries();
        industryPage.industryTitleCorrect()
                .verifyIndustryList();
    }

    @DisplayName("Case studies page opens after clicking on 'View more case studies' button")
    @Test
    void caseStudiesPageOpens() {
        mainPage.openMainPage()
                .acceptCookies()
                .clickViewMoreCaseStudies();
        caseStudiesPage.caseStudiesTitleCorrect()
                .caseStudiesHasContent();
    }
}
