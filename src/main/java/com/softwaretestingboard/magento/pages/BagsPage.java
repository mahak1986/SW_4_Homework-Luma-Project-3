package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class BagsPage extends Utility {
    //Click on Product Name ‘Overnight Duffle’
    By clickOnOvernightDuffle = (By.xpath("//a[normalize-space()='Overnight Duffle']"));

    public void clickOnOvernightDuffleBag() {
        clickOnElement(clickOnOvernightDuffle);
    }

    //Verify the text ‘Overnight Duffle'
    By overNightDuffleText = (By.cssSelector(".base"));
    public String verifyOvernightDuffleText() {
        return getTextFromElement(overNightDuffleText);
    }

    //Change quantity to 3
    By quantityOption = (By.id("qty"));

    public void updateQuantityOption() {
        clickOnElement(quantityOption);
        sendTextToElement(quantityOption, Keys.CONTROL + "a");
        sendTextToElement(quantityOption, "3");
    }

    //Mouse Hover On Add to Cart button
    By mouseHoverToAddToCart = (By.xpath("//button[@id='product-addtocart-button']"));
    public void mouseHOverToAddToCarButton(){
        mouseHoverToElement(mouseHoverToAddToCart);
    }

    //Click on ‘Add to Cart’ Button.


    By cartOption = (By.xpath("//button[@id='product-addtocart-button']"));
    public void clickOnShoppingCartLinkOption() {
        clickOnElement(cartOption);
    }
    //Verify the text ‘You added Overnight Duffle to your shopping cart.’

    By nightDuffleText = (By.cssSelector("div[data-bind='html: $parent.prepareMessageForHtml(message.text)']"));

    public String verifyOvernightDuffleTextMethod() {
        return getTextFromElement(nightDuffleText);
    }

    //Click on ‘shopping cart’ Link into message
    By shoppingCartButton = (By.xpath("//a[normalize-space()='shopping cart']"));
    public void clickOnShoppigCartButton(){
        clickOnElement(shoppingCartButton);
    }
}
