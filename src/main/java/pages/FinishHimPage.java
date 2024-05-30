package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.inNewBrowser;

public class FinishHimPage {

    private final SelenideElement finishButton = $(By.id("finish"));

    public BackHomePage finishOrder(){
        finishButton.should(Condition.clickable).click();
        return new BackHomePage();
    }

}
