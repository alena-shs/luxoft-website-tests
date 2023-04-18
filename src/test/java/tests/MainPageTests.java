package tests;

import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Owner("Alena Shomanova")
@Story("The main page's content is correct")
@Tag("MainPageTests")
public class MainPageTests extends TestBase {

    @DisplayName("The main page logo should be visible")
    @Test
    void logoExistsTest() {
        mainPage.acceptCookies()
                .checkLogoVisible();
    }

    @DisplayName("There are 7 services listed in the OUR SERVICES section")
    @Test
    void ourServicesAmountTest() {
        mainPage.acceptCookies()
                .verifyOurServicesAmount();
    }

    @DisplayName("The footer has a link to the 4 social networks")
    @Test
    void socialNetworkAmountTest() {
        mainPage.acceptCookies()
                .verifySocialNetworkAmount();
    }
}
