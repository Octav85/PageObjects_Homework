package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BackHomePage {

    private final SelenideElement backButton = $(By.cssSelector("#back-to-products"));
    public AuthPage backButton(){
        backButton.should(Condition.clickable).click();
        return new AuthPage();
    }
}
