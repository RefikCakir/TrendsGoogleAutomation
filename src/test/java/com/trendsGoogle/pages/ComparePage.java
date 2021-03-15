package com.trendsGoogle.pages;

import com.trendsGoogle.utils.Browser;
import com.trendsGoogle.utils.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ComparePage extends BasePage {

    @FindBy(xpath = "(//div[@id='compare-pickers-wrapper']//hierarchy-picker)[1]")
   private WebElement locationsDropDown;

    @FindBy(xpath = "(//input[contains(@id,'input-')])[3]")
    private WebElement searchLocation;

    @FindBy(xpath = "//h2[@class='header-sub-title']/span")
    private WebElement pageName;

    @FindBy(xpath = "//div[@id='compare-pickers-wrapper']//custom-date-picker")
    private WebElement timeDropDownClick;

    @FindBy(xpath = "//div[contains(text(),'Past 90 days')]")
    private WebElement timeDropDown;

    @FindBy(xpath = "//span[@class='progress-bar-multi-heat-volume']")
    private WebElement percentual;




    public void getComparePageName(){
        pageName.getText();


    }
    public void selectLocation(String text){

        locationsDropDown.click();

        searchLocation.sendKeys(text);

       searchLocation.sendKeys(Keys.ARROW_DOWN);

        searchLocation.sendKeys(Keys.ENTER);

    }
    public void  selectTime(){



        timeDropDownClick.click();
        timeDropDown.click();

    }



    public void getPercentual (){

        percentual.getText();
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(percentual).perform();



    }


}
