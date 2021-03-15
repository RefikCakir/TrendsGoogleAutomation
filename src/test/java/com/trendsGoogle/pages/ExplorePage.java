package com.trendsGoogle.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class ExplorePage extends BasePage{


    @FindBy(xpath = "//h2[@class='header-sub-title']/span")
    private WebElement pageName;

    @FindBy(xpath = "//button[@class='compare-term-container add-term-button pill-outline md-button md-ink-ripple']")
    private WebElement compareBtn;

    @FindBy(xpath = "(//input[contains(@id,'input-')])[2]")
    private WebElement compareTextBox;

    public void PageName(){
        pageName.getText();

    }
    public void compareSearchBox(String JSText){

        compareBtn.click();
        compareTextBox.sendKeys(JSText);
        compareTextBox.sendKeys(Keys.ARROW_DOWN);
        compareTextBox.sendKeys(Keys.ENTER);

    }

}



