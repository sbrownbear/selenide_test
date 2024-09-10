package demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = false;
    }

    @Test
    void fillFormTest() {
        open("/text-box");
        $(".text-center").shouldHave(text("Text Box"));
        $("#userName").setValue("Sergey Konoplev");
        $("#userEmail").setValue("sergeyKonoplev@gmail.com");
        $("#currentAddress").setValue("Penza");
        $("#permanentAddress").setValue("Planetnaya 34");
        $("#submit").click();

        $("#output").shouldBe(visible);
        $("#output").$("#name").shouldHave(text("Sergey Konoplev"));
        $("#output").$("#email").shouldHave(text("sergeyKonoplev@gmail.com"));
        $("#output").$("#currentAddress").shouldHave(text("Penza"));
        $("#output").$("#permanentAddress").shouldHave(text("Planetnaya 34"));

    }

}
