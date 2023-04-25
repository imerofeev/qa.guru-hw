import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class FormTests {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void fillFormTest() {
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        $("#firstName").setValue("Ilya");
        $("#lastName").setValue("Erofeev");
        $("#userEmail").setValue("imerofeev@inbox.ru");
        $("#genterWrapper").$(byText("Other")).click();
        $("#userNumber").setValue("1204256461");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("September");
        $(".react-datepicker__year-select").selectOption("1984");
        $(".react-datepicker__day--026:not(.react-datepicker__day--outside-month)").click();
        $("#subjectsInput").setValue("MTG").pressEnter();
        $("#hobbiesWrapper").$(byText("Reading")).click();
        $("#uploadPicture").uploadFile(new File("src/test/resources/img/photo.jpg"));
        $("#currentAddress").setValue("Tver");
        $("#state").click();
        $("#stateCity-wrapper").$(byText("NCR")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Delhi")).click();
        $("#submit").click();

        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(text("Ilya Erofeev"),
                text("imerofeev@inbox.ru"),
                text("Other"),
                text("1204256461"),
                text("26 September,1984"),
                text("MTG"),
                text("Reading"),
                text("photo.jpg"),
                text("Tver"),
                text("NCR Delhi"));

        $("#closeLargeModal").click();
    }

}