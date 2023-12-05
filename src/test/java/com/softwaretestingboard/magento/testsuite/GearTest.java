package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.BagsPage;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.BagsShoppingCartPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest extends BaseTest {
    HomePage homePage = new HomePage();
    BagsPage bagsPage = new BagsPage();
    BagsShoppingCartPage shoppingCartPage = new BagsShoppingCartPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        homePage.mouseHOverToGearOption();
        homePage.clickOnBagsOption();
        bagsPage.clickOnOvernightDuffleBag();
        String expected = "Overnight Duffle";
        Assert.assertEquals(bagsPage.verifyOvernightDuffleText(), expected, "Wrong message");
        bagsPage.updateQuantityOption();
        bagsPage.mouseHOverToAddToCarButton();
        bagsPage.clickOnShoppingCartLinkOption();
        String expected1 = "You added Overnight Duffle to your shopping cart.";
        Assert.assertEquals(bagsPage.verifyOvernightDuffleTextMethod(), expected1, "Incorrect page");
        bagsPage.clickOnShoppigCartButton();
        Thread.sleep(2000);
        String expected2= "3";
        Assert.assertEquals(shoppingCartPage.verifyQuantityText(),expected2,"Incorrect quantity");
        Thread.sleep(2000);
        String expected3 = "$135.00";
        Assert.assertEquals(shoppingCartPage.verifyProductPrice(),expected3,"Incorrect Price");
        Thread.sleep(2000);
        shoppingCartPage.quantityUpdateText();
        shoppingCartPage.clickOnShoppingCartButtonOption();
        String expected4 = "$225.00";
        Assert.assertEquals(shoppingCartPage.verifyUpdatedPriceText(),expected4,"Incorrect total");
    }
}
