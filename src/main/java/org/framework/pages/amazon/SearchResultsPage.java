package org.framework.pages.amazon;


import org.framework.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchResultsPage extends BasePage {

    private By giftCardsSideMenu = By.xpath("(//span[text()='Gift Cards'])[3]");


    public SearchResultsPage(WebDriver driver) {
        super(driver);

    }

    public void clickGiftCards() {
        click(giftCardsSideMenu);
    }
}
