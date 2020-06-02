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
            driver.get("https://login.nextbasecrm.com");
            driver.manage().window().maximize();
            driver.findElement(By.name("USER_LOGIN")).sendKeys("hr11@cybertekschool.com");
            driver.findElement(By.name("USER_PASSWORD")).sendKeys("UserUser"+ Keys.ENTER);

            driver.findElement(By.id("feed-add-post-form-link-text")).click();
            Thread.sleep(3000);

            //Actions actions = new Actions(driver);
            //JavascriptExecutor jse = (JavascriptExecutor) driver;

            String expectedResult = "show announcement:";

            WebElement announceBtn = driver.findElement(By.xpath("//span[.='Announcement']"));
            announceBtn.click();


            //  Assert.assertEquals(actualResult.getText(), expectedResult,"Verify to see Announcement module page");
            //  Assert.assertTrue(actualResult.isDisplayed(),"Verify to see Announcement module page");
        }
}
