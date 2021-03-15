package com.trendsGoogle.pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage{


    @FindBy(id = "input-254")
    private WebElement input ;


    public void enterInput (String string){
        input.sendKeys(string,Keys.ENTER);
    }

}
