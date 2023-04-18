package tests;

import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Owner("Alena Shomanova")
@Tag("UITests")
public class MainPageTests extends TestBase {

    @Story("The main page logo should be visible")
    @Test
    void logoExistsTest() {
        mainPage.acceptCookies()
                .checkLogoVisible();
    }

    @Story("There are 7 services listed in the OUR SERVICES section")
    void ourServicesAmountTest() {
        mainPage.acceptCookies()
                .verifyOurServicesAmount();
    }

    @Story("The footer has a link to the 4 social networks")
    @Test
    void socialNetworkAmountTest() {
        mainPage.acceptCookies()
                .verifySocialNetworkAmount();
    }
}
