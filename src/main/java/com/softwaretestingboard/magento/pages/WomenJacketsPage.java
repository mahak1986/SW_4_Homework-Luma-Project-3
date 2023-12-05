package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WomenJacketsPage extends Utility {
    //Click on sorter
    By sortByOption = (By.xpath("//div[@class='page-wrapper']//div[2]//div[3]//select[1]"));
    public void clickOnSortByOption(){
        clickOnElement(sortByOption);
    }


    //Select Sort By filter “Product Name”
    By sortProductNameInDropDownOption = (By.xpath("(//select[@id='sorter'])[1]"));

    public void productSortByProductName(String product) {
        selectByVisibleText(sortProductNameInDropDownOption, product);
    }
    //Verify the products name display in alphabetical order

    By productNameInAplhabeticalOrder = (By.xpath("//strong[@class = 'product name product-item-name']"));
    public String getProductNameInAlphabeticalOrder(){
        return getTextFromElement(productNameInAplhabeticalOrder);
    }
    //Select Sort By filter “Price”
   By sortProductByPriceFilter = (By.xpath("//select[@id='sorter']"));
    public void productsSortByPriceFilter(String product){

        selectByVisibleText(sortProductByPriceFilter, product);
    }

    //Verify the products price display in Low to High
    public boolean verifyProductsInLowToHigh() {
        // Find the elements representing the product prices
        List<WebElement> priceElements = driver.findElements(By.xpath("//select[@id='sorter']"));

        // Get the prices and store them in an array or list
        List<Double> prices = new ArrayList<>();
        for (WebElement element : priceElements) {
            String priceText = element.getText().replaceAll("[^0-9.]", ""); // Extracting the price from text
            prices.add(Double.parseDouble(priceText));
        }
        // Verify if the prices are sorted in ascending order
        List<Double> sortedPrices = new ArrayList<>(prices);
        Collections.sort(sortedPrices);

        return prices.equals(sortedPrices); // Compare original prices with sorted prices
    }

    }

