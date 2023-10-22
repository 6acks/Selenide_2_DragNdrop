package gmail.backswork;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;

public class GitHubHoverTesting {
    @BeforeAll
    static void beforeAll(){
        Configuration.baseUrl = "https://github.com/";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }
    @Test
    void enterprisePage(){
    open("/");
    $(".header-menu-wrapper").$(byTagAndText("button","Solutions")).hover();
    $(".header-menu-wrapper").$(byTagAndText("a","Enterprise")).click();
    $(withText("To build, scale, and deliver secure software.")).shouldBe(visible);
    }
}
