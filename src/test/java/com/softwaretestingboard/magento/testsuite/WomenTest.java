package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.WomenJacketsPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WomenTest extends BaseTest {
    HomePage homePage = new HomePage();
    WomenJacketsPage womenJacketsPage = new WomenJacketsPage();

    @Test
    public void verifyTheSortByProductNameFilter() throws InterruptedException {
        homePage.mouseHoverOnWomenMenuTab();
        homePage.mouseHoverOnTopsTab();
        homePage.clickOnJacketsTab();
        womenJacketsPage.clickOnSortByOption();
        womenJacketsPage.productSortByProductName("Product Name");
        // Storing jackets names in list
        List<WebElement> jacketsElementsList = driver.findElements(By.xpath("//strong[@class='product name product-item-name']//a"));
        List<String> jacketsNameListBefore = new ArrayList<>();
        for (WebElement value : jacketsElementsList) {
            jacketsNameListBefore.add(value.getText());
            System.out.println(value.getText());
        }
    }


    @Test
    public void verifyTheSortByPriceFilter() throws InterruptedException {
        homePage.mouseHoverOnWomenMenuTab();
        homePage.mouseHoverOnTopsTab();
        homePage.clickOnJacketsTab();
        womenJacketsPage.clickOnSortByOption();
        // Storing jackets price in list
        List<WebElement> jacketsPriceElementList = driver.findElements(By.xpath("//span[@class='price-wrapper ']//span"));
        List<Double> jacketsPriceListBefore = new ArrayList<>();
        for (WebElement value : jacketsPriceElementList) {
            //Converting price in to Double and Removing $ from price
            jacketsPriceListBefore.add(Double.valueOf(value.getText().replace("$", "")));
        }
        // Select Sort By filter “Price”
        selectByVisibleText(By.xpath("(//select[@id='sorter'])[1]"), "Price");
        Thread.sleep(1000);
        // After Sorting Products by Price
        jacketsPriceElementList = driver.findElements(By.xpath("//span[@class='price-wrapper ']//span"));
        List<Double> jacketsPriceListAfter = new ArrayList<>();
        Thread.sleep(1000);
        for (WebElement value : jacketsPriceElementList) {
            //Converting price in to Double and Removing $ from price
            jacketsPriceListAfter.add(Double.valueOf(value.getText().replace("$", "")));
            System.out.println(value.getText());
        }
        // Sort the jacketPriceListBefore to Ascending Order
        Collections.sort(jacketsPriceListBefore);
        // Verify the products price display in Low to High
        Assert.assertEquals(jacketsPriceListBefore, jacketsPriceListAfter);
    }
}


