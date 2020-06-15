package com.cybertek.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class hiltas73 {


        WebDriver driver;

        @BeforeMethod
        public void setUpMethod() {

            driver = com.cybertek.utilities.WebDriverFactory.getDriver("chrome");
        }

        @AfterMethod
        public void afterMethod() throws InterruptedException {
            Thread.sleep(3000);
            driver.quit();
        }

    /*
    1.Hover Over to More Tab
    2.Click on More
    3.Click on Announcement module
    4.Verify to see Announcement module page

     */
        @Test
        public void test1() throws InterruptedException {
            public void test1() throws InterruptedException {
            extentLogger = report.createTest("Access Announcement Module Test");

            extentLogger = report.createTest("Login as hr11@cybertekschool.com");
            LoginPage loginPage = new LoginPage();
            loginPage.login("hr11@cybertekschool.com","UserUser");

            DashboardPage dashboardPage = new DashboardPage();
            dashboardPage.navigateToModule("Activity Stream", "More");

            new ActivityStreamPage().announcementBtn.click();
            //BrowserUtils.verifyElementDisplayed(new AnnouncementPage().showAnnouncementText);
            BrowserUtils.waitFor(2);

            Assert.assertTrue(new AnnouncementPage().showAnnouncementText.isDisplayed(),"Verify to see Announcement module page");
            extentLogger.pass("PASS : Access Announcement Module Test");
        }
}
