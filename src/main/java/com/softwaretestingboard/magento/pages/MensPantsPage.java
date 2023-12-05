package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class MensPantsPage extends Utility {
   //Mouse Hover on product name Cronus Yoga Pant’ and click on size 32.
    By mouseHoverOnCronusYogaPant = (By.xpath("//strong[@class='product name product-item-name']"));
    By clickOnSize32 = (By.id("option-label-size-143-item-175"));
    public void mouseHoverOnCronusPants(){
        mouseHoverToElement(mouseHoverOnCronusYogaPant);
    }
    public void clickOnSize32(){
        clickOnElement(clickOnSize32);
    }
    //Mouse Hover on product name Cronus Yoga Pant’ and click on colour Black.
      By clickOnColourBlack = (By.id("option-label-color-93-item-49"));
    public void clickOnColourBlack(){
        clickOnElement(clickOnColourBlack);
    }
// Mouse Hover on product name ‘Cronus Yoga Pant’ and click on ‘Add To Cart’ Button.
    By addToCartCronusPant = (By.xpath("//button[@title='Add to Cart']"));
    public void clickOnAddToCartCronus(){
        clickOnElement(addToCartCronusPant);
    }
    // Verify the text ‘You added Cronus Yoga Pant to your shopping cart.’
By addedToYourShoppingCartMethodText = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    public String youAddedCronusYogaPantToYourShoppingCartMethodTextMethodText() {
        return getTextFromElement(addedToYourShoppingCartMethodText);
    }
    //Click on Shopping Cart Text
    By shoppingCartText = (By.xpath("//a[text()='shopping cart']"));
    public void clickOnShoppingCartText(){
        clickOnElement(shoppingCartText);
    }

    }


