package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class MensShoppingCartPage extends Utility {
    //Verify the text ‘Shopping Cart.’
    By verifyShoppingCartText = (By.xpath("//span[@class='base']"));
    public String getShoppingCartText(){
        return getTextFromElement(verifyShoppingCartText);
    }
    //Verify the product name ‘Cronus Yoga Pant’
    By verifyCronusYogaPantText = (By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']"));
    public String getTextFromCronusYogaPant(){
        return getTextFromElement(verifyCronusYogaPantText);
    }
    //Verify the product size ‘32’
    By verifySize32 = (By.xpath("//dd[contains(text(),'32 ')]"));
    public String getTextFromSize32(){
        return getTextFromElement(verifySize32);
    }
    //Verify the product colour ‘Black’
    By verifyColourBlackText = (By.xpath("//dd[contains(text(),'Black ')]"));
    public String getTextBlack(){
        return getTextFromElement(verifyColourBlackText);
    }
}
