package org.framework.pages.homepage.components;


import org.framework.base.BasePage;
import org.framework.utils.propertyreader.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;

public class GoogleHomePage extends BasePage {
    private By searchBarTextField = By.id("APjFqb");

   private By amazonHomePageLink = RelativeLocator.with(By.tagName("h3")).below(By.xpath("//cite[text()='https://www.amazon.com']"));



    public GoogleHomePage(WebDriver driver) {
        super(driver);

    }

    public GoogleHomePage getGoogleHomePage(){
        driver.get(PropertyReader.getInstance().getProperty("googleUrl"));
        return this;
    }
    public GoogleHomePage searchAmazon() {
        typeText(searchBarTextField,"Amazon");
        new Actions(driver)
                .keyDown(Keys.ENTER)
                .perform();

      return this;
    }

    public GoogleHomePage selectAmazonFromSearchResult() {
        click(amazonHomePageLink);
        return this;
    }

}
