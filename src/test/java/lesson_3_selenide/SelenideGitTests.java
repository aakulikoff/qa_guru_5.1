package lesson_3_selenide;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.conditions.Text;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class SelenideGitTests {

    @Test
    void selenideGithubTest() {

        open("https://github.com/");
        $(byName("q")).setValue("Selenide").pressEnter();
        $((".f4.text-normal"),0).shouldHave(text("selenide/selenide"));
        getFocusedElement().click();
        $(byLinkText("selenide/selenide")).click();
        $(byText("Wiki")).click();
        $(byText("Soft assertions")).shouldBe(Condition.visible).click();
        $(".markdown-body").shouldHave(text("Using JUnit5 extend test class"));

    }
}
