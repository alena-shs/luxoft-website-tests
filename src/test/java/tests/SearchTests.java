package tests;

import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Owner("Alena Shomanova")
@Story("Popular keyword search")
@Tag("SearchTests")
public class SearchTests extends TestBase {
    @DisplayName("The search header text correctness")
    @Test
    void searchHeaderCorrectText() {
        String searchText = "QA";
        mainPage.initiateSearchWithText(searchText);
        searchPage.verifyHeaderText(searchText);
    }

    @DisplayName("The search results start from the first page")
    @Test
    void searchStartsWithFirstPageTest() {
        String searchText = "QA";
        mainPage.initiateSearchWithText(searchText);
        searchPage.verifyPageNumberOne();
    }

    @DisplayName("The correct amount of items on the search first page")
    @Test
    void searchFirstPageAmountTest() {
        String searchText = "QA";
        mainPage.initiateSearchWithText(searchText);
        searchPage.verifySearchItemsAmountText();
        searchPage.verifySearchItemsAmount();
    }
}
