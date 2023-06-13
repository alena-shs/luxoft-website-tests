package tests;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import config.ProjectConfiguration;
import helpers.Attach;
import io.qameta.allure.Story;
import io.qameta.allure.selenide.AllureSelenide;
import objects.MainPage;
import objects.SearchPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.closeWebDriver;

public class TestBase {
    static ProjectConfiguration projectConfiguration = new ProjectConfiguration();
    MainPage mainPage = new MainPage();
    SearchPage searchPage = new SearchPage();


    @BeforeAll
    static void beforeAll() {
        projectConfiguration.configure();
    }

    @BeforeEach
    @Story("Open the main page")
    void addListener() {
        Selenide.open(baseUrl);
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
