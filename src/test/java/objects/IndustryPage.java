package objects;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class IndustryPage {
    private final SelenideElement industryTitle = $("h1");
    private final ElementsCollection industriesCardTexts = $$("div[class=container] h5");

    @Step("The opened page's title shows that it's the Industry page")
    public IndustryPage industryTitleCorrect() {
        industryTitle.shouldHave(exactText("Industry expertise"));
        return this;
    }

    @Step("The Industries page lists all the necessary industries")
    public IndustryPage verifyIndustryList() {
        industriesCardTexts.shouldHave(CollectionCondition.texts("Automotive", "Banking", "Capital Markets",
                "Insurance", "Media", "Telecommunications", "Networking & Technology", "Retail and E-commerce", "Energy and Utilities",
                "Oil and gas", "Manufacturing", "Healthcare and life sciences", "Travel and Hospitality",
                "Transportation and logistics", "Consumer Goods"));
        return this;
    }
}
