package pages.stat;

import com.codeborne.selenide.Condition;
import helpers.Locators;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$$;

public class StartPage {
    public static final By LINKS = Locators.get("start.links");

    public static void open(String linkText) {
        $$(LINKS).filter(Condition.exactTextCaseSensitive(linkText)).get(0).click();
    }
}
