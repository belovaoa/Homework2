package demo.qa;

import com.codeborne.selenide.Configuration;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxTests {

    @BeforeAll
    static void ConfigAllTests() {
        Configuration.startMaximized = true;
    }

    @Test
    void fillFormTest() {
       open("https://demoqa.com/automation-practice-form");

       $("[id=firstName]").setValue("Oleg");
       $("#lastName").setValue("Last");
       $("#userEmail").setValue("last1@ya.ru");

       $(byText("Female")).click();

       $("#userNumber").setValue("7991977777");

       $("#dateOfBirthInput").click();
       $(".react-datepicker__month-select").selectOptionByValue("5");
       $(".react-datepicker__year-select").selectOptionByValue("2000");
        // $$(".react-datepicker__day").find(text("10")).click();
       $(".react-datepicker__day--010:not(.react-datepicker__day--outside-month)").click();

       $("#subjectsInput").click();
       $("#subjectsInput").setValue("P");
       $(byText("Physics")).click();

       $("#hobbiesWrapper").$(byText("Sports")).click();

        //$("#uploadPicture").uploadFile(new File("src/test/resources/img/imade.jpg"));
       $("#uploadPicture").uploadFromClasspath("img/imade.jpg");

       $("#currentAddress").setValue("1Street 12");

       $("#state").click();
       $(byText("NCR")).click();

       $("#city").click();
       $(byText("Delhi")).click();

       $("#submit").click();
       $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
       $(".table-responsive").shouldHave(text("Oleg Last"),
               text("last1@ya.ru"), text("Female"), text("7991977777"),
               text("10 June,2000"), text("Physics"), text("Sports"),
               text("imade.jpg"), text("1Street 12"), text("NCR Delhi"));
    }
}
