package com.cybertek.pages;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

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

    // yusuf celik area starts

    //-----------------







    //-----------------

    @FindBy(xpath = "(//div[contains(@id,'blg-post-')])[1]//a[.='Like']")
    public WebElement likeBtn;

    @FindBy(xpath = "((//div[contains(@id,'blg-post-')])[1]//a[.='Like'])[2]")
    public WebElement commentLikeBtn;

    @FindBy(xpath = "(//div[contains(@id,'blg-post-')])[1]//SPAN[contains(@data-like-id,'BLOG_POST')]")
    public WebElement likeSign;

    @FindBy(xpath = "(//div[contains(@id,'blg-post-')])[1]//span[@title='Like']")
    public WebElement commentLikeSign;

    @FindBy(xpath = "(//div[contains(@id,'blg-post-')])[1]//a[.='Follow']")
    public WebElement follow;

    @FindBy(xpath = "(//div[contains(@id,'blg-post-')])[1]//a[.='Unfollow']")
    public WebElement unfollow;

    @FindBy(xpath = "(//div[contains(@id,'blg-post-')])[1]//a[.='Comment']")
    public WebElement makeComment;

    @FindBy(xpath = "(//div[contains(@id,'blg-post-')])[1]//iframe")
    public WebElement commentIFrame;

    @FindBy(xpath = "//body")
    public WebElement commentIFrameTextBox;

    @FindBy(xpath = "//*[.='A bad workman always blames his tools.']")
    public WebElement commentItself;


    @FindBy(xpath = "(//div[contains(@id,'blg-post-')])[1]//button[.='Send']")
    public WebElement sendBtn;

    @FindBy(xpath = "(//div[contains(@id,'blg-post-')])[1]//a[.='Add comment']")
    public WebElement addComment;



    //Yusuf celik area finish


    public void likePost(){
        likeBtn.click();
    }
    public void likeComment(){ commentLikeBtn.click(); }

    public void addComment() throws InterruptedException {
        makeComment.click();
        Thread.sleep(1500);

        Driver.get().switchTo().frame(commentIFrame);
        commentIFrameTextBox.sendKeys("A bad workman always blames his tools.");
        Driver.get().switchTo().defaultContent();
        Thread.sleep(1000);
        sendBtn.click();
    }

    public void unFollow(){
        unfollow.click();
    }



    //first comment--------------------------------starts
    public WebElement getFirstCommentInThePage(){
        List<WebElement> allComments = Driver.get().findElements(By.xpath("//div[@class='feed-com-text-inner']"));
        WebElement element =null;
        if(allComments.size()!=0){
            for (WebElement comment : allComments) {

            }
        }
        return element;
    }
//    public WebElement getFirstCommentLikeBtnInThePage(){
//        WebElement element = null;
//        Driver.get().findElements(By.xpath("(//span[contains(@id,'bx-ilike-button-BLOG_COMMENT_')])[1]"));
//
//
//
//    }

    //first comment--------------------------------ends


}
