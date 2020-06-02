package com.cybertek.tests;

import com.cybertek.pages.ActivityStreamPage;
import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class hiltas73 extends TestBase{


    /*
    AC1: User should be able to see Announcement module under More tab
    1.Hover Over to More Tab
    2.Click on More
    3.Click on Announcement module
    4.Verify to see Announcement module page

     */
        @Test(description = "Access Announcement Module Test")
        public void test1() throws InterruptedException {
            extentLogger = report.createTest("Access Announcement Module Test");

            extentLogger = report.createTest("Login as hr11@cybertekschool.com");
            LoginPage loginPage = new LoginPage();
            loginPage.login("hr11@cybertekschool.com","UserUser");

            DashboardPage dashboardPage = new DashboardPage();
            dashboardPage.navigateToModule("Activity Stream", "More");

            //Actions actions = new Actions(driver);
            //JavascriptExecutor jse = (JavascriptExecutor) driver;

            String expectedResult = "show announcement:";

            new ActivityStreamPage().announcementBtn.click();


            //Assert.assertEquals(actualResult.getText(), expectedResult,"Verify to see Announcement module page");
            //Assert.assertTrue(actualResult.isDisplayed(),"Verify to see Announcement module page");
        }
}
