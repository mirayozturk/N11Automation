package com.keytorc.auto;

import org.openqa.selenium.By;

public class N11Constants {
    public String URL = "http://www.n11.com/";
    public String URL_INFO = "www.n11.com";
    public String EMAIL = "n11automation@gmail.com";
    public String PASSWORD = "n11a1234";

    public String ChromeWebDriver ="webdriver.chrome.driver";
    public String ChromeWebDriverPath ="driver/chromedriver.exe";

    public By EMAIL_ID = By.id("email");
    public By PASSWORD_ID = By.id("password");
    public By LOGIN_BUTTON_ID = By.id("loginButton");
    public By SEARCH_DATA_ID = By.id("searchData");
    public By SEARCH_RESULT_ID = By.id("view");

    public By MY_ACCOUNT_LINK_TEXT = By.linkText("Hesabım");
    public By MY_FAV_LINK_TEXT = By.linkText("İstek Listem / Favorilerim");
    public By PAGE2_LINK_TEXT = By.linkText("2");

    public By PRODUCT_FAV_CLICK_XPATH = By.xpath("//*[@id=\"view\"]/ul/li[3]/div/div[2]/span");
    public By MY_FAV_CHART_CLICK_XPATH = By.xpath("//*[@id=\"view\"]/ul/li/div/span");
    public By LOGIN_XPATH = By.xpath("//*[@id=\"header\"]/div/div/div[2]/div[2]/div[2]/div/div/a[1]");
    public By SEARCH_BUTTON_XPATH = By.xpath("//*[@id=\"header\"]/div/div/div[2]/div[1]/a/span");
    public By MY_FAV_PRODUCT_XPATH = By.xpath("//*[@id=\"myAccount\"]/div[3]/ul/li[1]/div/ul/li/a/img");
    public By DELETE_FROM_FAVORITES_XPATH = By.xpath("//div[@id='view']/ul/li/div//span[@class='deleteProFromFavorites']");
    public By FAV_LIST_DATA_XPATH = By.xpath("//*[@id=\"myAccount\"]/div[3]/ul/li[1]/div/ul");
    public By SELECTED_PRODUCT_XPATH = By.xpath("//li[3]/div/div/a/h3");
    public By PRODUCT_TİTLE = By.xpath("//*[@class='productTitle']/p/a");

}
