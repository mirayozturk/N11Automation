package com.keytorc.auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BaseUtil extends N11Constants{

    public WebElement findElement(WebDriver driver, By by){
        return driver.findElement(by);
    }

    public void click(WebDriver driver, By by){
        findElement(driver,by).click();
    }

    public void sendKeys(WebDriver driver, By by, String text){
        findElement(driver, by).sendKeys(text);
    }

    public void sleep(int time){
        try{
            Thread.sleep(time*1000);
        }catch (Exception e){
            System.out.println("Error :" + e.getMessage());
        }
    }

    public void moveToElement(WebDriver driver, By by){
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(by)).perform();
    }
}
