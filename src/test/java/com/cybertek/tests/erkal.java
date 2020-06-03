package com.cybertek.tests;

import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.EventPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

            public class erkal extends TestBase {
                /*AC:User should be able to create events by clicking on Event tab under Activity Stream.
                   1-Hover over top module on the page and navigate Event module.
                   2-Click the Event module
                   3-Verify to see Event page
                 */
                @Test
                public void eventTest(){
                    extentLogger=report.createTest("Event Page");
                    LoginPage loginPage=new LoginPage();
                    extentLogger.info("Username:"+ ConfigurationReader.get("hr1_username"));
                    extentLogger.info("Password:"+"******");
                    loginPage.loginAsHR1();

                    new DashboardPage().navigateToModule("Activity Stream","Event");
                    EventPage eventP=new EventPage();
                    eventP.eventPage.click();

                    String expectedPage="EVENT";
                    String actualPage=eventP.eventPage.getText();
                    Assert.assertEquals(actualPage,expectedPage,"verify is Ok");
                    extentLogger.pass("Pass:");
                }
            }


