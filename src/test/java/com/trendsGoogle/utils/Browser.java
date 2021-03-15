package com.trendsGoogle.utils;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Browser {


    private static WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);

    public static void wait(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void clickOnElement(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public static void clickWithJS(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        ((JavascriptExecutor) (Driver.getDriver())).executeScript("arguments[0].click()", element);
    }

    public static void enterText(WebElement element, String text){
        wait.until(ExpectedConditions.visibilityOf(element));
        element.clear();
        element.sendKeys(text);
//        wait.until(ExpectedConditions.attributeToBe(element, "value", text));
        Browser.wait(1);
        System.out.println("Entering text: " + text);
    }


    /*
      elements represents collection of WebElements
      @return collection of strings
     */
    public static List<String> getTextFromWebElements(List<WebElement> elements) {
        List<String> textValues = new ArrayList<>();
        for (WebElement element : elements) {
            if (!element.getText().isEmpty()) {
                textValues.add(element.getText());
            }
        }
        return textValues;
    }

    public static void scroll(WebElement element) {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", element);
    }

     // This method takes a screenshot and saves it with a date&time stamp.

    public static String takeAScreenshotAndSave(String testName) {
        String path = System.getProperty("user.dir") + "/src/test/resources/screenshots/" + testName + "/";
        path = path.replace("/", File.separator);
        File file = new File(path);
        file.mkdirs();
        Date date = new Date();
        path += date + "screenshot.jpeg";
        try (OutputStream outputStream = new FileOutputStream(path)) {
            TakesScreenshot takesScreenshot = (TakesScreenshot) Driver.getDriver();
            byte[] screenshot = takesScreenshot.getScreenshotAs(OutputType.BYTES);
            outputStream.write(screenshot);
        } catch (IOException e) {

            e.printStackTrace();
            throw new RuntimeException("Failed to create a screenshot :: " + path);
        }

        return path;
    }



}
