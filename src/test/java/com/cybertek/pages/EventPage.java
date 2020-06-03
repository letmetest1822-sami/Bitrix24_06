package com.cybertek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EventPage extends BasePage{
    @FindBy(xpath = "//span[@class='feed-add-post-form-link feed-add-post-form-link-active']//span[contains(text(),'Event')]")
    public WebElement eventPage;


}
