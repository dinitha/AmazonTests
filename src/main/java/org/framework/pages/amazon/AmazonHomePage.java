package org.framework.pages.amazon;


import org.framework.base.BasePage;
import org.framework.utils.propertyreader.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;

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

    public String getDeliverToText() {

        return readText(deliverToLocationText);
    }

}
