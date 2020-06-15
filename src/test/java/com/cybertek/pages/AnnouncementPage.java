package com.cybertek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AnnouncementPage extends BasePage {


    @FindBy(xpath = "//*[.='show announcement:']")
    public WebElement showAnnouncementText;


}
