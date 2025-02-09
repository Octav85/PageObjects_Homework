package tests;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AuthPage;
import pages.CartPage;
import pages.InventoryPage;

import java.time.Duration;

public class TestStore extends BaseTest {

    @Test
    public void addToCart(){

/*        AuthPage authPage = new AuthPage(driver);
        authPage.open();
        authPage.waitPageIsLoaded();
        authPage.enterUsername("standard_user");
        authPage.enterPassword("secret_sauce");
        authPage.clickToLogin();

        InventoryPage inventoryPage = new InventoryPage(driver);
        inventoryPage.waitPageIsLoaded();
        inventoryPage.addBagToCart();
        inventoryPage.navigateToCart();

        CartPage cartPage = new CartPage(driver);
        cartPage.isBagIsPresent();*/

        AuthPage authPage = new AuthPage();
        authPage
                .waitPageIsLoaded()
                .enterUsername("standard_user")
                .enterPassword("secret_sauce")
                .clickToLogin()
                .waitPageIsLoaded()
                .addBagToCart()
                .navigateToCart()
                .isBagIsPresent()
                .clickCheckout()
                .enterName("Jora")
                .enterLastName("Kardan")
                .enterZipCode("2041")
                .clickToContinue()
                .finishOrder()
                .backButton();












    }
}