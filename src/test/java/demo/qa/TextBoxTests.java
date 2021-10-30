package demo.qa;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
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
       $("#userNumber").setValue("7991977777");
       $("#dateOfBirthInput").click();
       $(".react-datepicker__month-select").click();
       $(byText("May")).click();
       $(".react-datepicker__year-select").find("2000").click();
       $$(".react-datepicker__day").find(text("1")).click();
       $("#subjectsInput").setValue("Subject");

    }
}
