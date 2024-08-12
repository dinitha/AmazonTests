package org.framework.pages.amazon;


import org.framework.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AmazonHomePage extends BasePage {

    private By deliverToLocationButton = By.id("nav-global-location-popover-link");

    private By deliverToLocationText = By.id("glow-ingress-line2");

    public AmazonHomePage(WebDriver driver) {
        super(driver);

    }

    public AmazonHomePage clickDeliveryLocation() {
        click(deliverToLocationButton);
        return this;
    }

    public Boolean checkDeliverToTextUpdated(String expectedText) {
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));
       return wait.until(ExpectedConditions.textToBePresentInElementLocated((deliverToLocationText), expectedText));

    }

}
