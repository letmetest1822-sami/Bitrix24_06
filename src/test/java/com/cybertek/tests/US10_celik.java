package com.cybertek.tests;

import com.cybertek.pages.ActivityStreamPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US10_celik extends TestBase {

    //If the post is liked, unlike it and assert like icon is disappered, then like again and
    //assert that like icon appeared

    //If the post is not liked, like it and verify the like icon is appeared

    @Test
    public void likePost() {
        new LoginPage().loginAsHelpdesk1();
        ActivityStreamPage activityStreamPage =new ActivityStreamPage();

        if(!activityStreamPage.likeSign.isDisplayed()) {
            activityStreamPage.likePost();
            Assert.assertTrue(activityStreamPage.likeSign.isDisplayed(),"verify apearence of like icon");
        }else{
            activityStreamPage.likePost();
            Assert.assertFalse(activityStreamPage.likeSign.isDisplayed(),"verify disapearence of like icon");
            activityStreamPage.likePost();
            Assert.assertTrue(activityStreamPage.likeSign.isDisplayed(),"verify apearence of like icon");
        }

    }
    //go to activity stream page

    @Test
    public void makeComment() throws InterruptedException {
        new LoginPage().loginAsHelpdesk1();

        ActivityStreamPage activityStreamPage = new ActivityStreamPage();
        //add comment
        activityStreamPage.addComment();

        //get comment from page and assert it is displaying
        String actualText = activityStreamPage.commentItself.getText();
        String expectedText = "A bad workman always blames his tools.";

        Assert.assertEquals(actualText,expectedText,"verify your comment is availible");

    }

    @Test
    public void unFollow(){
        new LoginPage().loginAsHelpdesk1();

        try{
            new ActivityStreamPage().unFollow();
            Assert.assertTrue(new ActivityStreamPage().follow.isDisplayed());

        }catch (Exception e){
            new ActivityStreamPage().follow.click();
            System.out.println("the user was not followed, but now you are floowing");
            Assert.assertTrue(new ActivityStreamPage().unfollow.isDisplayed(), "verify unfollow is displayed" );
            new ActivityStreamPage().unFollow();
            Assert.assertTrue(new ActivityStreamPage().follow.isDisplayed(),"verify follow button is displayed");
        }
    }


//    @Test
//    public void likeComment() throws Exception {
//        new LoginPage().loginAsHelpdesk1();
//        ActivityStreamPage activityStreamPage =new ActivityStreamPage();
//
//        new ActivityStreamPage().addComment();
//
//       try {
//           new ActivityStreamPage().likeComment();
//           Assert.assertTrue(new ActivityStreamPage().commentLikeSign.isDisplayed(),"verify, comment like sign is displayed");
//
//       }catch (Exception e){
//           new ActivityStreamPage().likeComment();
//           Thread.sleep(1500);
//           Assert.assertTrue(new ActivityStreamPage().commentLikeSign.isDisplayed(),"verify, comment like sign is displayed, you were already like this  ");
////           throw new Exception("the comment is already liked, unliked and liked again");
////           System.out.println("the comment was already liked, unliked and liked again");
//       }
//
//
//    }
@Test
public void likeComment() throws Exception {
    new LoginPage().loginAsHelpdesk1();
    ActivityStreamPage activityStreamPage =new ActivityStreamPage();

    new ActivityStreamPage().getFirstCommentInThePage();

    try {
        new ActivityStreamPage().likeComment();
        Assert.assertTrue(new ActivityStreamPage().commentLikeSign.isDisplayed(),"verify, comment like sign is displayed");

    }catch (Exception e){
        new ActivityStreamPage().likeComment();
        Thread.sleep(1500);
        Assert.assertTrue(new ActivityStreamPage().commentLikeSign.isDisplayed(),"verify, comment like sign is displayed, you were already like this  ");
//           throw new Exception("the comment is already liked, unliked and liked again");
//           System.out.println("the comment was already liked, unliked and liked again");
    }


}
    @Test
    public void lookForAComment_DoneByOthers(){
        String commentDynamic = "(//div[contains(@id,'blg-post-') and @class='feed-post-block feed-post-block-files feed-post-block-separator feed-post-block-short'])[1]//div[@class='feed-com-text-inner']";

    }


}
