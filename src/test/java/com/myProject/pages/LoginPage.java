package com.myProject.pages;

import com.myProject.utilities.ConfigurationReader;
import com.myProject.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(name = "USER_LOGIN")
    public WebElement usernameInput;

    @FindBy(name = "USER_PASSWORD")
    public WebElement passwordInput;

    @FindBy(className = "login-btn")
    public WebElement loginBtn;

    public void login(String username,String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }


}

