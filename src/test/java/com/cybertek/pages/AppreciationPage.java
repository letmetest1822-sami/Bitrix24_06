package com.cybertek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AppreciationPage extends BasePage{

    //Added by sami
    @FindBy(xpath = "//span[contains(text(),'Activity Stream')]")
    public WebElement activityStreamBtn;

    @FindBy(xpath = "//span[@id='feed-add-post-form-link-text']")
    public  WebElement morePullDownInActStreamTab;

    @FindBy(xpath = "(//span[@class='menu-popup-item-text'])[2]")
    public  WebElement appreciationBtn;

    @FindBy(className = "bx-editor-iframe")
    public WebElement appreciationIframe;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement appreciationMessageInputBox;

    @FindBy(id = "feed-add-post-destination-input")
    public WebElement appreciationMessageAdressInputBox;

    @FindBy(xpath = "//div[@id='feed-add-post-destination-container']")
    public  WebElement clickAdresInput;

    @FindBy(xpath = "//span[@class='feed-add-post-del-but']")
    public  WebElement deleteOldAdress;

    @FindBy(id = "blog_post_body_303")
    public WebElement confirmAppreciation;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public  WebElement sendAppreciationBtn;

}
