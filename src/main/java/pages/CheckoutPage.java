package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class CheckoutPage {

    private final SelenideElement firstNameField = $(By.id("first-name"));
    private final SelenideElement lastNameField = $(By.id("last-name"));
    private final SelenideElement zipCodeField = $(By.id("postal-code"));
    private final SelenideElement finishButton = $(By.id("continue"));
    private final SelenideElement backButton = $(By.id("back-to-products"));

    public CheckoutPage enterName(String name) {
        firstNameField.setValue(name);
        return this;
    }

    public CheckoutPage enterLastName(String lastName) {
        lastNameField.setValue(lastName);
        return this;
    }

    public CheckoutPage enterZipCode(String zipCode) {
        zipCodeField.setValue(zipCode);
        return this;
    }

    public FinishHimPage clickToContinue() {
        finishButton.should(Condition.clickable).click();
        return new FinishHimPage();
    }


}
