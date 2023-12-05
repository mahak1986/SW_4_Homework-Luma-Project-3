package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class BagsShoppingCartPage extends Utility {
    //Verify the Qty is ‘3
    By qtyText = (By.xpath("//span[@class='counter-number']"));
    public String verifyQuantityText() {

        return getTextFromElement(qtyText);
    }
    //Verify the product price ‘$135.00
    By priceText = (By.cssSelector("td[class='col subtotal'] span[class='price']"));
    public String verifyProductPrice() {

        return getTextFromElement(priceText);
    }
    //Change Qty to ‘5’
    By qtyOption = (By.xpath("//td[@class='col qty']/child::div[1]/descendant::input"));
    public void quantityUpdateText() {
        clickOnElement(qtyOption);
        sendTextToElement(qtyOption, Keys.CONTROL + "a");
        sendTextToElement(qtyOption,"5");
    }
    //Click on ‘Update Shopping Cart’ button
    By shopCartOption = (By.xpath("//button[@title='Update Shopping Cart']"));
    public void clickOnShoppingCartButtonOption() {

        clickOnElement(shopCartOption);
    }
    //Verify the product price ‘$225.00'
    By priceTextMethod = (By.xpath("//span[contains(text(),'$225.00')]"));
    public String verifyUpdatedPriceText() {
        return getTextFromElement(priceTextMethod);
    }
}


