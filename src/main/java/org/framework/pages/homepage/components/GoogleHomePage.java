package org.framework.pages.homepage.components;


import org.framework.base.BasePage;
import org.framework.utils.propertyreader.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleHomePage extends BasePage {
    private By hamburgerMenu = By.id("nav-hamburger-menu");
    private String subItemMenu = "//a[@data-menu-id='%s']";


    public GoogleHomePage(WebDriver driver) {
        super(driver);

    }



    public GoogleHomePage getGoogleHomePage(){
        driver.get(PropertyReader.getInstance().getProperty("url"));
        return this;
    }
    public GoogleHomePage openHamburgerMenu() {
        click(hamburgerMenu);
        return this;
    }
    public GoogleHomePage scrollToTVAppliencesElectronics(){
        WebElement element = driver.findElement(By.xpath(String.format(subItemMenu, String.valueOf(9))));
        scrollToElement(element);
        return this;
    }
    public GoogleHomePage expandTVAppliencesElectronics() {
        click(By.xpath(String.format(subItemMenu, String.valueOf(9))));
        return this;
    }



}
