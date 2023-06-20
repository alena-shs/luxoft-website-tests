package objects;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CaseStudiesPage {
    private final SelenideElement caseStudiesTitle = $("h1"),
            caseStudiesSubtitle = $(".content p");
    private final ElementsCollection caseStudiesCardsText = $$(".mycasestudies__card-text"),
            caseStudiesCardsImage = $$("img[alt='case study image']");

    @Step("The opened page's title and subtitle shows that it's a Case Studies page")
    public CaseStudiesPage caseStudiesTitleCorrect() {
        caseStudiesTitle.shouldHave(exactText("Case studies"));
        caseStudiesSubtitle.shouldHave(exactText("See how we have helped global clients to address their challenges and achieve impressive results."));
        return this;
    }

    @Step("The case studies page has content (case studies)")
    public void caseStudiesHasContent() {
        caseStudiesCardsText.shouldHave(CollectionCondition.size(6));
        caseStudiesCardsImage.shouldHave(CollectionCondition.size(6));
    }


}
