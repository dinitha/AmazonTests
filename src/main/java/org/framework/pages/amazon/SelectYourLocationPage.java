package org.framework.pages.amazon;


import org.framework.base.BasePage;
import org.framework.utils.propertyreader.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.util.List;

public class SelectYourLocationPage extends BasePage {
    private By locationDropdown = By.xpath("//span[@class='a-dropdown-container']");

    private By locationList = By.xpath("//li[@class='a-dropdown-item']");

    private By doneButton = By.id("a-autoid-3-announce");

    private String selectedLocationText;
    public SelectYourLocationPage(WebDriver driver) {
        super(driver);

    }


    public SelectYourLocationPage selectRandomLocation() {
        click(locationDropdown);

        List<WebElement> randomLocationElement = getElementList(locationList);
        int maxLocationIndex = randomLocationElement.size();
        int minLocationIndex = 0;
        int range = maxLocationIndex - minLocationIndex + 1;
        int randomIndex = (int)(Math.random() * range) + minLocationIndex;
        selectedLocationText = randomLocationElement.get(randomIndex).getText();
        randomLocationElement.get(randomIndex).click();

        return this;
    }

    public String getSelectedLocationName() {
        return selectedLocationText;
    }

    public void clickDone() {
        click(doneButton);
    }
}
