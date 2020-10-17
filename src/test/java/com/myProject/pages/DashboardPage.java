package com.myProject.pages;

import com.myProject.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends BasePage{

    @FindBy(id = "feed-add-post-form-tab-message")
    public WebElement message;

    @FindBy(id = "feed-add-post-form-tab-tasks")
    public WebElement task;

    @FindBy(id="feed-add-post-form-tab-calendar")
    public WebElement event;

    @FindBy(id = "feed-add-post-form-tab-vote")
    public WebElement poll;

    @FindBy(id ="feed-add-post-form-link-more")
    public WebElement more;

    @FindBy(xpath = "//*[@id=\"popup-window-content-menu-popup-feed-add-post-form-popup\"]/div/div/span[1]")
    public WebElement file;

    @FindBy(xpath = "//*[@id=\"popup-window-content-menu-popup-feed-add-post-form-popup\"]/div/div/span[2]")
    public WebElement appreciation;

    @FindBy(xpath = "//*[@id=\"popup-window-content-menu-popup-feed-add-post-form-popup\"]/div/div/span[3]")
    public WebElement announcement;

    @FindBy(xpath = "//*[@id=\"popup-window-content-menu-popup-feed-add-post-form-popup\"]/div/div/span[4]")
    public WebElement workflow;

    @FindBy(xpath = "//span[@id='bx-b-uploadfile-blogPostForm_calendar']")
    public WebElement uploadfilesLink;

    @FindBy(xpath = "(//*/div[2]/table/tbody/tr[1]/td[1]/div/input)[2]")
    public WebElement uploadFileOption;

    @FindBy(xpath = "(//*/div[2]/table/tbody/tr[1]/td[3]/span/span/span[1]/span)[2]")
    public WebElement bitrix24;

    @FindBy(xpath = "//a[contains(text(),'file.txt')]")
    public WebElement selecttheFile;

    @FindBy(xpath = "//body/div[@id='DiskFileDialog']/div[1]/span[1]")
    public WebElement selectDocument;

    @FindBy(xpath = "(//*/div[2]/table/tbody/tr[3]/td[1]/span/span/span[1]/span)[2]")
    public WebElement downloadfrExDrive;

    @FindBy(xpath = "//body/div[@id='DiskFileDialog']/div[1]/span[1]")
    public WebElement cancel;

    @FindBy(xpath = "(//*/div[2]/table/tbody/tr[3]/td[3]/span/span/span[1]/span/span[1]/span[1])[2]")
    public WebElement googleDocs;

    @FindBy(xpath = "(//body/div[7]/div[1]/div/div/a[1])")
    public WebElement desktopApps;

    @FindBy(xpath = "(//body/div[7]/div[1]/div/div/a[2])")
    public WebElement googleDocs2;

    @FindBy(xpath = "(//body/div[7]/div[1]/div/div/a[3])")
    public WebElement office365;

    @FindBy(xpath = "(//body/div[7]/div[1]/div/div/a[4])")
    public WebElement msOfficeOnline;

    @FindBy(xpath = "(//*/div[2]/table/tbody/tr[3]/td[3]/span/span/span[2]/a[1]/span[2])[2]")
    public WebElement createDocument;

    @FindBy(xpath = "(//*/div[2]/table/tbody/tr[3]/td[3]/span/span/span[2]/a[2]/span[2])[2]")
    public WebElement createSpreadSheet;

    @FindBy(xpath = "(//*/div[2]/table/tbody/tr[3]/td[3]/span/span/span[2]/a[3]/span[2])[2]")
    public WebElement createPresentation;

    @FindBy(xpath = "(//body/div[9]/div[2]/span[2])")
    public WebElement cancelForCreate;

    @FindBy(xpath = "//*[@id=\"bx-disk-select-doc-service\"]/div[3]/span[1]")
    public WebElement save;

    @FindBy(xpath = "//*[@id=\"bx-gedit-convert-confirm\"]/div[2]/span[1]")
    public WebElement downloadButton;

    @FindBy(xpath = "//*[@id=\"bx-b-link-blogPostForm_calendar\"]/span/i")
    public WebElement linkIcon;

    @FindBy(xpath = "(//input[@id='linkoCalEditorcal_3Jcl-text'])[1]")
    public WebElement textInput;

    @FindBy(xpath = "(//input[@id='linkoCalEditorcal_3Jcl-href'])[1]")
    public WebElement linkInput;

    @FindBy(xpath = "(//input[@id='undefined'])[1]")
    public WebElement saveLinkButton;

    @FindBy(xpath = "(//input[@id='cancel'])[1]")
    public WebElement cancelLinkButton;

    @FindBy(xpath = "//*[@id=\"bx-b-video-blogPostForm_calendar\"]/span/i")
    public WebElement videoButton;

    @FindBy(xpath = "//*[@id=\"video_oCalEditorcal_3Jcl-source\"]")
    public WebElement videoSource;

    @FindBy(xpath = "//*[@id=\"undefined\"]")
    public WebElement saveVideoSource;

    @FindBy(xpath = "//*[@id=\"video_oCalEditorcal_3Jcl-size\"]")
    public WebElement videoSize;

    @FindBy(xpath = "//*[@id=\"bx-b-quote-blogPostForm_calendar\"]/span/i")
    public WebElement quoteButton;

    @FindBy(xpath = "//*[@id=\"feed-cal-event-namecal_3Jcl\"]")
    public WebElement eventName;

    @FindBy(xpath = "//blockquote[1]")
    public WebElement quoteBlock;

    @FindBy(xpath = "(//iframe)[2]")
    public WebElement iFrame;

    @FindBy(xpath = "(//*[@id=\"blog-submit-button-save\"])[1]")
    public WebElement sendButton;

    @FindBy(xpath = "//*[@id=\"lhe_button_editor_blogPostForm_calendar\"]")
    public WebElement visualEditor;

    @FindBy(xpath = "//*[@id=\"bx-html-editor-tlbr-oCalEditorcal_3Jcl\"]")
    public WebElement toolBar;

    @FindBy(xpath = "//*[@id=\"feed-cal-event-fromcal_3Jcl\"]")
    public WebElement startingDate;

    @FindBy(xpath = "//*[@id=\"feed_cal_event_from_timecal_3Jcl\"]")
    public WebElement startingTime;

    @FindBy(xpath = "//*[@id=\"feed-cal-event-tocal_3Jcl\"]")
    public WebElement endingDate;

    @FindBy(xpath = "//*[@id=\"feed_cal_event_to_timecal_3Jcl\"]")
    public WebElement endingTime;

    @FindBy(xpath = "//*[@id=\"feed-cal-tz-switchcal_3Jcl\"]/span[1]")
    public WebElement timeZone;

    @FindBy(xpath = "//*[@id=\"feed-cal-tz-fromcal_3Jcl\"]")
    public WebElement fromTimeZone;

    @FindBy(xpath = "//*[@id=\"feed-cal-tz-tocal_3Jcl\"]")
    public WebElement toTimeZone;

    @FindBy(xpath = "//*[@id=\"event-remind_countcal_3Jcl\"]")
    public WebElement reminderNumber;

    @FindBy(xpath = "//*[@id=\"event-remind_typecal_3Jcl\"]")
    public WebElement reminderValuetype;

    @FindBy(xpath = "//*[@id=\"event-remindercal_3Jcl\"]")
    public WebElement setRemCheckBx;

    @FindBy(xpath = "//*[@id=\"event-locationcal_3Jcl\"]")
    public WebElement eventLocation;

    @FindBy(xpath = "//div[@id='bxecmr_0']")
    public WebElement eventOpsPopUp;

    @FindBy(xpath = "//*[@id=\"feed-event-dest-add-link\"]")
    public WebElement addMember;

    @FindBy(xpath = "//*[@id=\"feed-event-dest-add-link\"]")
    public WebElement addMore;

    @FindBy(xpath = "//*[@id=\"feed-event-dest-input\"]")
    public WebElement memberInput;

    @FindBy(xpath = "//*[@id=\"feed-event-dest-input-box\"]")
    public WebElement memberInputBox;

    @FindBy(xpath = "//*[@id=\"destDepartmentTab_calnAJEM3\"]")
    public WebElement employeesAndDepart;

    @FindBy(xpath = "//*[@id=\"bx-lm-box-last-content\"]/table/tr/td/div[2]/div[2]/div[1]/a/div[2]")
    public  WebElement itOption;

    @FindBy(xpath = "//*[@id=\"bx-lm-box-last-content\"]/table/tr/td/div[2]/div[2]/div[2]/a/span/div[1]")
    public WebElement checkforAll;

    @FindBy(xpath = "//*[@id=\"calnAJEM3_search_U493\"]")
    public WebElement searchForGroup;

    @FindBy(xpath = "//*[@id=\"popup-window-content-BXSocNetLogDestination\"]")
    public WebElement memberPopUp;

    @FindBy(xpath = "//*[@id=\"feed-cal-additional-show\"]/span[1]")
    public WebElement moreButton;



    public DashboardPage(){

        PageFactory.initElements(Driver.get(), this);

    }





}
