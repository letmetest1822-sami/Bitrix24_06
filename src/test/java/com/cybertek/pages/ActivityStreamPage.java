package com.cybertek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActivityStreamPage extends BasePage{

    @FindBy(id = "microoPostFormLHE_blogPostForm_inner")
    public WebElement messageInput;

    @FindBy(css = "span[title='Link']")
    public WebElement linkIcon;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-text")
    public WebElement linkTextInput;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-href")
    public WebElement linkURLInput;

    @FindBy(id = "undefined")
    public WebElement linkSave;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement iFrame;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement messageInputIFrame;

}
