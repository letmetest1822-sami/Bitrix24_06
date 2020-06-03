package com.cybertek.tests;

import com.cybertek.pages.ActivityStreamPage;
import com.cybertek.pages.AppreciationPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.BrowserUtils;
import org.testng.annotations.Test;

public class US6sendAppreciationSami extends TestBase{
    /*
    US06 :  As a user, I should be able to send appreciation by clicking on
        - Appreciation subheading from
        - "More" tab under
        - Activity Stream.
     */

    @Test
    public void sendAppreciation() {

        LoginPage loginPage = new LoginPage();
        loginPage.loginAsHR2();
        // extentLogger.info("Use loginAsHR2 method from LoginPage and log in successfully");

        AppreciationPage appreciationPage = new AppreciationPage();

        appreciationPage.activityStreamBtn.click();
        //extentLogger.info("Activity Stream Tab displayed successfully");

        BrowserUtils.waitForVisibility(appreciationPage.morePullDownInActStreamTab, 3);
        appreciationPage.morePullDownInActStreamTab.click();
        // extentLogger.info("Options including Appreciation is displayed successfully");

        appreciationPage.clickAdresInput.click();

        driver.switchTo().frame(appreciationPage.appreciationIframe);
        //extentLogger.info("Inputbox to write Appreciation is displayed successfully");

        appreciationPage.appreciationMessageInputBox.clear();

        appreciationPage.appreciationMessageInputBox.sendKeys("I present my appreciations. Thanks.");
        // extentLogger.info("-I present my appreciations. Thanks.- message is written successfully");

        driver.switchTo().defaultContent();
        //activityStreamPage.appreciationMessageAdressInputBox.click();
        appreciationPage.deleteOldAdress.click();
        //activityStreamPage.appreciationMessageAdressInputBox.clear();

        //activityStreamPage.appreciationMessageAdressInputBox.click();

        appreciationPage.appreciationMessageAdressInputBox.sendKeys("helpdesk11@cybertekschool.com");
        //  extentLogger.info("helpdesk11@cybertekschool.com is written as address successfully");

        AppreciationPage appreciationPage1 = new AppreciationPage();
        appreciationPage.sendAppreciationBtn.click();


        //System.out.println(activityStreamPage1.confirmAppreciation.getText());


        // extentLogger.info("'Send Appreciation' Test is passed");

    }
}