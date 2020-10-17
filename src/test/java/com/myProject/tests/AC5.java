package com.myProject.tests;

import com.myProject.pages.DashboardPage;
import com.myProject.pages.LoginPage;
import com.myProject.utilities.BrowserUtils;
import com.myProject.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AC5 extends TestBase {

    @Test
    public void loginAshelpDesk35() throws InterruptedException {
        //name of the test
        extentLogger = report.createTest("Login as HelpDesk35 User Test");

        LoginPage loginPage = new LoginPage();

        String username = ConfigurationReader.get("helpdesk35_username");
        String password = ConfigurationReader.get("helpdesk35_password");

        extentLogger.info("Enter Username: helpdesk35@cybertekschool.com");
        loginPage.usernameInput.sendKeys(username);

        extentLogger.info("Enter Password: UserUser");
        loginPage.passwordInput.sendKeys(password);

        extentLogger.info("Click Login Button");
        loginPage.loginBtn.click();

        extentLogger.info("Verify page URL");
        Assert.assertEquals(driver.getCurrentUrl(), "https://login2.nextbasecrm.com/stream/?login=yes");

        DashboardPage dashboard = new DashboardPage();

        extentLogger.info("Click Event");
        dashboard.event.click();

        extentLogger.info("Click Visual Editor Button");
        BrowserUtils.waitForVisibility(dashboard.visualEditor,20).click();

        extentLogger.info("Check if text-bar visible");
        Assert.assertTrue(dashboard.toolBar.isDisplayed());


    }

    @Test
    public void loginAshelpDesk36() throws InterruptedException {
        //name of the test
        extentLogger = report.createTest("Login as HelpDesk36 User Test");

        LoginPage loginPage = new LoginPage();

        String username = ConfigurationReader.get("helpdesk36_username");
        String password = ConfigurationReader.get("helpdesk36_password");

        extentLogger.info("Enter Username: helpdesk36@cybertekschool.com");
        loginPage.usernameInput.sendKeys(username);

        extentLogger.info("Enter Password: UserUser");
        loginPage.passwordInput.sendKeys(password);

        extentLogger.info("Click Login Button");
        loginPage.loginBtn.click();

        extentLogger.info("Verify page URL");
        Assert.assertEquals(driver.getCurrentUrl(), "https://login2.nextbasecrm.com/stream/?login=yes");

        DashboardPage dashboard = new DashboardPage();

        extentLogger.info("Click Event");
        dashboard.event.click();

        extentLogger.info("Click Visual Editor Button");
        BrowserUtils.waitForVisibility(dashboard.visualEditor,20).click();

        extentLogger.info("Check if text-bar visible");
        Assert.assertTrue(dashboard.toolBar.isDisplayed());
    }

    @Test
    public void loginAsmarketing35() throws InterruptedException {
        //name of the test
        extentLogger = report.createTest("Login as Marketing35 User Test");

        LoginPage loginPage = new LoginPage();

        String username = ConfigurationReader.get("marketing35_username");
        String password = ConfigurationReader.get("marketing35_password");

        extentLogger.info("Enter Username: marketing35@cybertekschool.com");
        loginPage.usernameInput.sendKeys(username);

        extentLogger.info("Enter Password: UserUser");
        loginPage.passwordInput.sendKeys(password);

        extentLogger.info("Click Login Button");
        loginPage.loginBtn.click();

        extentLogger.info("Verify page URL");
        Assert.assertEquals(driver.getCurrentUrl(), "https://login2.nextbasecrm.com/stream/?login=yes");

        DashboardPage dashboard = new DashboardPage();

        extentLogger.info("Click Event");
        dashboard.event.click();

        extentLogger.info("Click Visual Editor Button");
        BrowserUtils.waitForVisibility(dashboard.visualEditor,20).click();

        extentLogger.info("Check if text-bar visible");
        Assert.assertTrue(dashboard.toolBar.isDisplayed());


    }

    @Test
    public void loginAsmarketing36() throws InterruptedException {
        //name of the test
        extentLogger = report.createTest("Login as Marketing36 User Test");

        LoginPage loginPage = new LoginPage();

        String username = ConfigurationReader.get("marketing36_username");
        String password = ConfigurationReader.get("marketing36_password");

        extentLogger.info("Enter Username: marketing36@cybertekschool.com");
        loginPage.usernameInput.sendKeys(username);

        extentLogger.info("Enter Password: UserUser");
        loginPage.passwordInput.sendKeys(password);

        extentLogger.info("Click Login Button");
        loginPage.loginBtn.click();

        extentLogger.info("Verify page URL");
        Assert.assertEquals(driver.getCurrentUrl(), "https://login2.nextbasecrm.com/stream/?login=yes");

        DashboardPage dashboard = new DashboardPage();

        extentLogger.info("Click Event");
        dashboard.event.click();

        extentLogger.info("Click Visual Editor Button");
        BrowserUtils.waitForVisibility(dashboard.visualEditor,20).click();

        extentLogger.info("Check if text-bar visible");
        Assert.assertTrue(dashboard.toolBar.isDisplayed());

    }

    @Test
    public void loginAshr35() throws InterruptedException {
        //name of the test
        extentLogger = report.createTest("Login as Hr35 User Test");

        LoginPage loginPage = new LoginPage();

        String username = ConfigurationReader.get("hr35_username");
        String password = ConfigurationReader.get("hr35_password");

        extentLogger.info("Enter Username: hr35@cybertekschool.com");
        loginPage.usernameInput.sendKeys(username);

        extentLogger.info("Enter Password: UserUser");
        loginPage.passwordInput.sendKeys(password);

        extentLogger.info("Click Login Button");
        loginPage.loginBtn.click();

        extentLogger.info("Verify page URL");
        Assert.assertEquals(driver.getCurrentUrl(), "https://login2.nextbasecrm.com/stream/?login=yes");

        DashboardPage dashboard = new DashboardPage();

        extentLogger.info("Click Event");
        dashboard.event.click();

        extentLogger.info("Click Visual Editor Button");
        BrowserUtils.waitForVisibility(dashboard.visualEditor,20).click();

        extentLogger.info("Check if text-bar visible");
        Assert.assertTrue(dashboard.toolBar.isDisplayed());


    }

    @Test
    public void loginAshr36() throws InterruptedException {
        //name of the test
        extentLogger = report.createTest("Login as Hr36 User Test");

        LoginPage loginPage = new LoginPage();

        String username = ConfigurationReader.get("hr36_username");
        String password = ConfigurationReader.get("hr36_password");

        extentLogger.info("Enter Username: hr36@cybertekschool.com");
        loginPage.usernameInput.sendKeys(username);

        extentLogger.info("Enter Password: UserUser");
        loginPage.passwordInput.sendKeys(password);

        extentLogger.info("Click Login Button");
        loginPage.loginBtn.click();

        extentLogger.info("Verify page URL");
        Assert.assertEquals(driver.getCurrentUrl(), "https://login2.nextbasecrm.com/stream/?login=yes");

        DashboardPage dashboard = new DashboardPage();

        extentLogger.info("Click Event");
        dashboard.event.click();

        extentLogger.info("Click Visual Editor Button");
        BrowserUtils.waitForVisibility(dashboard.visualEditor,20).click();

        extentLogger.info("Check if text-bar visible");
        Assert.assertTrue(dashboard.toolBar.isDisplayed());

    }
}
