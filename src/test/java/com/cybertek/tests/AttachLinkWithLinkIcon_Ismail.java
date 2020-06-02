package com.cybertek.tests;

import com.cybertek.pages.ActivityStreamPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.BrowserUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AttachLinkWithLinkIcon_Ismail extends TestBase{

    // User Story 1 - Acceptance Criteria 3
    @Test
    public void VerifyAttachLink(){

        LoginPage loginPage = new LoginPage();
        loginPage.loginAsHR1();

        ActivityStreamPage activityStreamPage = new ActivityStreamPage();

        BrowserUtils.waitForVisibility(activityStreamPage.messageInput,3);
        activityStreamPage.messageInput.click();
        BrowserUtils.waitForVisibility(activityStreamPage.linkIcon,3);
        activityStreamPage.linkIcon.click();
        BrowserUtils.waitForVisibility(activityStreamPage.linkTextInput,3);
        activityStreamPage.linkTextInput.sendKeys("cybertek");
        activityStreamPage.linkURLInput.sendKeys("https://cybertekschool.com/");
        activityStreamPage.linkSave.click();

        driver.switchTo().frame(activityStreamPage.iFrame);
        String actual = activityStreamPage.messageInputIFrame.getText();
        System.out.println("actual :" + actual);

        Assert.assertTrue(activityStreamPage.messageInputIFrame.getText().contains("cybertek"),
                "verify message contains attached link text");

    }

}
