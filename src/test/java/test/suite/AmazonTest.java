package test.suite;

import org.framework.base.BaseTest;
import org.framework.pages.homepage.components.GoogleHomePage;
import org.testng.annotations.Test;



import java.util.logging.Logger;

public class AmazonTest extends BaseTest {
    static Logger log = Logger.getLogger(AmazonTest.class.getName());

    @Test(description = "The test to verify the second highest expensive television's properties")
    public void verifySelectingEGiftCardTest() {
        GoogleHomePage googleHomePage = new GoogleHomePage(getDriver());
        googleHomePage.getGoogleHomePage()
                .searchAmazon()
                .selectAmazonFromSearchResult();

    }

}
