package com.myProject.tests;


import com.myProject.pages.DashboardPage;
import com.myProject.pages.LoginPage;
import com.myProject.utilities.ConfigurationReader;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @Test
    public void test(){
        LoginPage loginPage = new LoginPage();
        loginPage.login(ConfigurationReader.get("username"),ConfigurationReader.get("password"));




    }
}
