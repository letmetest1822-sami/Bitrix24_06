package com.cybertek.tests;

import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.ExcelUtil;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTestWithDDF extends TestBase {

    @DataProvider
    public Object[][] userData(){
        ExcelUtil credentials = new ExcelUtil("src\\test\\resources\\_NextBaseCRDM_USs_credentials_27052020.xlsx","Credentials-G6");

        String [][] dataArray = credentials.getDataArrayWithoutFirstRow();

        return dataArray;
    }


    @Test(dataProvider = "userData")
    public void loginTestDDF(String username,String password){
        extentLogger = report.createTest("Test for: "+username);

        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);

        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.waitUntilLoaderScreenDisappear();

        String actualUserName = dashboardPage.getUserName();
        String expectedUserName = username;

        Assert.assertEquals(actualUserName,expectedUserName);
        extentLogger.pass("PASS");
    }

}