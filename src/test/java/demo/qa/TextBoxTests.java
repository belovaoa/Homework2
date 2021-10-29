package demo.qa;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxTests {
    @Test
    void fillFormTest() {
       open("https://demoqa.com/automation-practice-form");
       $("[id=firstName]").setValue("Name1");
       $("#lastName").setValue("Last1");
       $("#userEmail").setValue("last1@ya.ru");
       $(byText("Female")).click();
    }
}
