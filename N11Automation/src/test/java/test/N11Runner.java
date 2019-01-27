package test;

import com.keytorc.auto.BaseUtil;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class N11Runner extends BaseUtil {
    WebDriver webDriver;

    @Before
    public void setup() {
        System.setProperty(ChromeWebDriver, ChromeWebDriverPath);
        webDriver = new ChromeDriver();
        webDriver.navigate().to(URL);
        webDriver.manage().window().maximize();
    }

    @Test
    public void testRun() throws InterruptedException {
        // Case 1
        String baseUrl = webDriver.getCurrentUrl();
        Assert.assertTrue(baseUrl.contains(URL_INFO));

        // Case 2
        click(webDriver, LOGIN_XPATH);
        sendKeys(webDriver, EMAIL_ID, EMAIL);
        sendKeys(webDriver, PASSWORD_ID, PASSWORD);
        click(webDriver, LOGIN_BUTTON_ID);

        //Case 3
        sendKeys(webDriver, SEARCH_DATA_ID, "Samsung");
        click(webDriver, SEARCH_BUTTON_XPATH);

        //Case 4
        WebElement viewElement = webDriver.findElement(SEARCH_RESULT_ID);
        Assert.assertTrue(viewElement.getText().contains("Samsung"));

        //Case 5
        sleep(3);
        click(webDriver, PAGE2_LINK_TEXT);
        WebElement elementPage2 = findElement(webDriver, PAGE2_LINK_TEXT);
        String classAttribute = elementPage2.getAttribute("class");
        Assert.assertTrue(classAttribute.contains("active"));

        //Case 6
        String dataProductId = findElement(webDriver, PRODUCT_FAV_CLICK_XPATH).getAttribute("data-productid");
        click(webDriver, PRODUCT_FAV_CLICK_XPATH);
        String selectedProduct = findElement(webDriver, SELECTED_PRODUCT_XPATH).getText();

        //Case 7
        moveToElement(webDriver, MY_ACCOUNT_LINK_TEXT);
        click(webDriver, MY_FAV_LINK_TEXT);

        //Case 8
        click(webDriver, MY_FAV_PRODUCT_XPATH);
        String favDataProductId = findElement(webDriver, MY_FAV_CHART_CLICK_XPATH).getAttribute("data-pid");
        Assert.assertTrue(favDataProductId.equalsIgnoreCase(dataProductId));

        //Case 9
        click(webDriver, DELETE_FROM_FAVORITES_XPATH);

        //Case10
        boolean isCointains = false;
        List<WebElement> products = webDriver.findElements(PRODUCT_TİTLE);
        for (WebElement product : products) {
            if (product.getText().equals(selectedProduct))
                isCointains = true;
        }
        Assert.assertTrue(!isCointains);
    }

    @After
    public void close(){
        webDriver.quit();
    }
}