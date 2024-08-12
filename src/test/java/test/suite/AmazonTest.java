package test.suite;

import org.framework.base.BaseTest;
import org.framework.pages.amazon.AmazonHomePage;
import org.framework.pages.amazon.SelectYourLocationPage;
import org.framework.pages.google.GoogleHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;



import java.util.logging.Logger;

public class AmazonTest extends BaseTest {
    static Logger log = Logger.getLogger(AmazonTest.class.getName());

    @Test(description = "The test to verify selecting E Gift card success scenario")
    public void verifySelectingEGGiftCardSuccessfullyTest() {
        GoogleHomePage googleHomePage = new GoogleHomePage(getDriver());
        googleHomePage.getGoogleHomePage()
                .searchAmazon()
                .selectAmazonFromSearchResult();

        AmazonHomePage amazonHomePage = new AmazonHomePage(getDriver());
        amazonHomePage.clickDeliveryLocation();

        SelectYourLocationPage selectYourLocationPage = new SelectYourLocationPage(getDriver());
        selectYourLocationPage.selectRandomLocation();
        String selectedLocationName = selectYourLocationPage.getSelectedLocationName();
        selectYourLocationPage.clickDone();
        String actualLocationName = amazonHomePage.getDeliverToText();
        Assert.assertEquals(actualLocationName,selectedLocationName);


    }

}
