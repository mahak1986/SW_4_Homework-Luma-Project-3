package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.MensPantsPage;
import com.softwaretestingboard.magento.pages.MensShoppingCartPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {

    HomePage homePage = new HomePage();
    MensPantsPage mensPantsPage = new MensPantsPage();
    MensShoppingCartPage mensShoppingCartPage = new MensShoppingCartPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppinCart() {
        homePage.mouseHoverOnMensMenu();
        homePage.mouseHoverOnMensBottoms();
        homePage.clickOnPantsOption();
        mensPantsPage.mouseHoverOnCronusPants();
        mensPantsPage.clickOnSize32();
        mensPantsPage.mouseHoverOnCronusPants();
        mensPantsPage.clickOnColourBlack();
        mensPantsPage.mouseHoverOnCronusPants();
        mensPantsPage.clickOnAddToCartCronus();
        String expected = "You added Cronus Yoga Pant to your shopping cart.";
        Assert.assertEquals(mensPantsPage.youAddedCronusYogaPantToYourShoppingCartMethodTextMethodText(), expected, "Error in display");
        mensPantsPage.clickOnShoppingCartText();
        String expected1= "Shopping Cart";
        Assert.assertEquals(mensShoppingCartPage.getShoppingCartText(),expected1,"Error Message");
        String expected2 = "Cronus Yoga Pant";
        Assert.assertEquals(mensShoppingCartPage.getTextFromCronusYogaPant(),expected2,"Error Message");
        String expected3 = "32";
        Assert.assertEquals(mensShoppingCartPage.getTextFromSize32(),expected3,"Error Message");
        String expected4 = "Black";
        Assert.assertEquals(mensShoppingCartPage.getTextBlack(),expected4,"Error Message");
    }

}
