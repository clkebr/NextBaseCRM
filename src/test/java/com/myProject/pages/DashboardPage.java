package com.myProject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage{

    @FindBy(css = "#feed-add-post-form-tab-message>span")
    public WebElement messageTab;

    @FindBy(css = "#LIVEFEED_search")
    public WebElement searchBox;



}
