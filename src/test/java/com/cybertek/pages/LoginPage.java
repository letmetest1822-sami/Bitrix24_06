package com.cybertek.pages;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

        public LoginPage(){
            PageFactory.initElements(Driver.get(),this);
        }

        //same with driver.findElement(By.id("prependedInput"));
        @FindAll({
                @FindBy(xpath = "//input[@placeholder='Login']"),
                @FindBy(name = "USER_LOGIN"),
        })
        public WebElement usernameInput;

        @FindBy(xpath = "//input[@placeholder='Password']")
        public WebElement passwordInput;

        @FindBy(xpath = "//input[@class='login-btn']")
        public WebElement loginBtn;

        public void login(String usernameStr,String passwordStr){

            usernameInput.sendKeys(usernameStr);
            passwordInput.sendKeys(passwordStr);
            loginBtn.click();

        }

        public void loginAsHelpdesk1(){
            String username = ConfigurationReader.get("helpdesk1_username");
            String password = ConfigurationReader.get("helpdesk1_password");
            usernameInput.sendKeys(username);
            passwordInput.sendKeys(password);
            loginBtn.click();
        }

        public void loginAsHelpdesk2(){
        String username = ConfigurationReader.get("helpdesk2_username");
        String password = ConfigurationReader.get("helpdesk2_password");
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
        }
        public void loginAsMarketing1(){
            String username = ConfigurationReader.get("marketing1_username");
            String password = ConfigurationReader.get("marketing1_password");
            usernameInput.sendKeys(username);
            passwordInput.sendKeys(password);
            loginBtn.click();
        }

        public void loginAsMarketing2(){
        String username = ConfigurationReader.get("marketing2_username");
        String password = ConfigurationReader.get("marketing2_password");
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
        }

        public void loginAsHR1(){
            String username = ConfigurationReader.get("hr1_username");
            String password = ConfigurationReader.get("hr1_password");
            usernameInput.sendKeys(username);
            passwordInput.sendKeys(password);
            loginBtn.click();
        }

        public void loginAsHR2(){
        String username = ConfigurationReader.get("hr2_username");
        String password = ConfigurationReader.get("hr2_password");
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
        }
    }