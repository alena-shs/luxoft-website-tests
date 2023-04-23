package tests;

import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Owner("Alena Shomanova")
@Story("The main page's content")
@Tag("MainPageTests")
public class MainPageTests extends TestBase {

    @DisplayName("The main page logo visibility")
    @Test
    void logoExistsTest() {
        mainPage.acceptCookies()
                .checkLogoVisible();
    }

    @DisplayName("The correct amount of services listed in the OUR SERVICES section")
    @Test
    void ourServicesAmountTest() {
        mainPage.acceptCookies()
                .verifyOurServicesAmount();
    }

    @DisplayName("The correct amount of social media links in the footer")
    @Test
    void socialNetworkAmountTest() {
        mainPage.acceptCookies()
                .verifySocialNetworkAmount();
    }

    @Test
    void RandomTest() {
    }

    @Test
    void RandomTest1() {
    }

    @Test
    void RandomTest3() {
        Assertions.fail();
    }
}
