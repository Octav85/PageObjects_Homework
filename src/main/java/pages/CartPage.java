package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class CartPage {

    private final SelenideElement bagItem = $(By.id("item_4_title_link"));
    private final SelenideElement checkoutButton = $(By.id("checkout"));

    public CartPage isBagIsPresent() {
        bagItem.should(Condition.appear);
        return this;
    }

    public CheckoutPage clickCheckout() {
        checkoutButton.click();
        return new CheckoutPage();
    }
}
