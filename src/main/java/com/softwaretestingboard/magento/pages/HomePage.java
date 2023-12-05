package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    //Mouse Hover on Women Menu
    By womenMenuTab = (By.id("ui-id-4"));

    public void mouseHoverOnWomenMenuTab() {
        mouseHoverToElement(womenMenuTab);
    }

    //Mouse Hover on Tops
    By topsMenuTab = (By.id("ui-id-9"));

    public void mouseHoverOnTopsTab() {
        mouseHoverToElement(topsMenuTab);
    }

    //Click on Jackets
    By jacketsTab = (By.id("ui-id-11"));

    public void clickOnJacketsTab() {
        clickOnElement(jacketsTab);
    }

    //Mouse Hover on Mens Menu
    By mensMenu = (By.id("ui-id-5"));

    public void mouseHoverOnMensMenu() {
        mouseHoverToElement(mensMenu);
    }
    //Mouse Hover on bottoms

    By mensBottoms = (By.xpath("//a[@id='ui-id-18']"));

    public void mouseHoverOnMensBottoms() {
        mouseHoverToElement(mensBottoms);
    }

    //Click on pants
    By pantsOption = (By.xpath("//a[@id='ui-id-23']"));

    public void clickOnPantsOption() {
        clickOnElement(pantsOption);
    }
    //Mouse hover on gear menu
    By gearOption= (By.cssSelector("#ui-id-6"));
    public void mouseHOverToGearOption(){
        mouseHoverToElement(gearOption);
    }
    By bagsoption = (By.xpath("(//a[@id='ui-id-25'])[1]"));
    public void clickOnBagsOption(){
        clickOnElement(bagsoption);
    }
}
