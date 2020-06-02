package com.cybertek.tests;

import com.cybertek.pages.ActivityStreamPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.BrowserUtils;
import org.testng.annotations.Test;

public class US6_sami extends TestBase{
    /*
    US06 6 :  As a user, I should be able to send appreciation by clicking on
        - Appreciation subheading from
        - "More" tab under
        - Activity Stream.


     */

    @Test
    public void sendAppreciation() {

        LoginPage loginPage = new LoginPage();
        loginPage.loginAsHR1();

        ActivityStreamPage activityStreamPage = new ActivityStreamPage();

        activityStreamPage.activityStreamBtn.click();

        BrowserUtils.waitForVisibility(activityStreamPage.morePullDownInActStreamTab, 3);
        activityStreamPage.morePullDownInActStreamTab.click();

        activityStreamPage.appreciationBtn.click();

        driver.switchTo().frame(activityStreamPage.appreciationIframe);

        activityStreamPage.appreciationInputBox.sendKeys("I present my apreciations. Thanks.");


    }
}
