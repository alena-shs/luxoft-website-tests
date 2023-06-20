package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import config.ProjectConfiguration;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import objects.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class TestBase {
    static ProjectConfiguration projectConfiguration = new ProjectConfiguration();
    MainPage mainPage = new MainPage();
    SearchPage searchPage = new SearchPage();
    CareerPage careerPage = new CareerPage();
    CaseStudiesPage caseStudiesPage = new CaseStudiesPage();
    IndustryPage industryPage = new IndustryPage();


    @BeforeAll
    static void beforeAll() {
        projectConfiguration.configure();
    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
        closeWebDriver();
    }

}
