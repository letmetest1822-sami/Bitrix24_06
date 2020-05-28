package com.cybertek.tests;

import com.cybertek.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTestSami extends TestBase {

    @Test
    public  void loginTest1(){

        LoginPage loginPage = new LoginPage();
        loginPage.usernameInput.sendKeys("helpdesk11@cybertekschool.com");
        extentLogger.info("Enter Username : helpdesk11@cybertekschool.com");

        loginPage.passwordInput.sendKeys("something");
        extentLogger.info("Enter password : somepassword");

        loginPage.loginBtn.click();
        extentLogger.info("Click login button");

        extentLogger.info("Verify page url");

        Assert.assertEquals(driver.getCurrentUrl(),"https://login.nextbasecrm.com/stream/?login=yes");
        //we put after assertion so if the assertion fails, it will not send pass to report
        extentLogger.info("Wrong Password Test is passed");
    }
}
