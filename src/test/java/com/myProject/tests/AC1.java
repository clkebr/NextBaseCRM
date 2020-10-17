package com.myProject.tests;

import com.myProject.pages.DashboardPage;
import com.myProject.pages.LoginPage;
import com.myProject.utilities.BrowserUtils;
import com.myProject.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AC1 extends TestBase {


    @Test
    public void loginAshelpDesk35() {
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

        extentLogger.info("Click Upload");
        BrowserUtils.waitForVisibility(dashboard.uploadfilesLink,20).click();

        //upload sth
        extentLogger.info("Upload File");
        dashboard.uploadFileOption.sendKeys("C:\\Users\\nb\\Desktop\\file.txt");

        //click bitrix24
        extentLogger.info("Click Select document from Bitrix24");
        BrowserUtils.waitForVisibility(dashboard.bitrix24,20).click();
        //select File&click Select the Document
        BrowserUtils.waitForVisibility(dashboard.selecttheFile,20).click();
        BrowserUtils.waitForVisibility(dashboard.selectDocument,20).click();

        extentLogger.info("Click Download from external drive");
        //click download from external drive
        BrowserUtils.waitForVisibility(dashboard.downloadfrExDrive,20).click();

        extentLogger.info("Click Cancel");
        //click cancel
        BrowserUtils.waitForVisibility(dashboard.cancel,20).click();

        extentLogger.info("Click Create using Google Docs");
        //click create using desktop app
        BrowserUtils.waitForVisibility(dashboard.googleDocs,20).click();

        extentLogger.info("Choose Desktop Apps");
        //Choose desktop Apps
        BrowserUtils.waitForVisibility(dashboard.desktopApps,20).click();

        extentLogger.info("Click Cancel");
        //click cancel
        BrowserUtils.waitForVisibility(dashboard.cancelForCreate,20).click();

        extentLogger.info("Click Create again");
        //click create again
        BrowserUtils.waitForVisibility(dashboard.googleDocs,20).click();

        extentLogger.info("Choose Office365");
        //click office 365
        BrowserUtils.waitForVisibility(dashboard.office365,20).click();

        extentLogger.info("Click Create again");
        //click create again
        BrowserUtils.waitForVisibility(dashboard.googleDocs,20).click();

        extentLogger.info("Choose MS Office Online");
        //click office 365
        BrowserUtils.waitForVisibility(dashboard.office365,20).click();



    }

    @Test
    public void loginAshelpDesk36() {
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

        extentLogger.info("Click Upload");
        BrowserUtils.waitForVisibility(dashboard.uploadfilesLink,20).click();

        //upload sth
        extentLogger.info("Upload File");
        dashboard.uploadFileOption.sendKeys("C:\\Users\\nb\\Desktop\\file.txt");

        //click bitrix24
        extentLogger.info("Click Select document from Bitrix24");
        BrowserUtils.waitForVisibility(dashboard.bitrix24,20).click();
        //select File&click Select the Document
        BrowserUtils.waitForVisibility(dashboard.selecttheFile,20).click();
        BrowserUtils.waitForVisibility(dashboard.selectDocument,20).click();

        extentLogger.info("Click Download from external drive");
        //click download from external drive
        BrowserUtils.waitForVisibility(dashboard.downloadfrExDrive,20).click();

        extentLogger.info("Click Cancel");
        //click cancel
        BrowserUtils.waitForVisibility(dashboard.cancel,20).click();

        extentLogger.info("Click Create using Google Docs");
        //click create using desktop app
        BrowserUtils.waitForVisibility(dashboard.googleDocs,20).click();

        extentLogger.info("Choose Desktop Apps");
        //Choose desktop Apps
        BrowserUtils.waitForVisibility(dashboard.desktopApps,20).click();

        extentLogger.info("Click Cancel");
        //click cancel
        BrowserUtils.waitForVisibility(dashboard.cancelForCreate,20).click();

        extentLogger.info("Click Create again");
        //click create again
        BrowserUtils.waitForVisibility(dashboard.googleDocs,20).click();

        extentLogger.info("Choose Office365");
        //click office 365
        BrowserUtils.waitForVisibility(dashboard.office365,20).click();

        extentLogger.info("Click Create again");
        //click create again
        BrowserUtils.waitForVisibility(dashboard.googleDocs,20).click();

        extentLogger.info("Choose MS Office Online");
        //click office 365
        BrowserUtils.waitForVisibility(dashboard.office365,20).click();
    }

    @Test
    public void loginAsmarketing35() {
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

        extentLogger.info("Click Upload");
        BrowserUtils.waitForVisibility(dashboard.uploadfilesLink,20).click();

        //upload sth
        extentLogger.info("Upload File");
        dashboard.uploadFileOption.sendKeys("C:\\Users\\nb\\Desktop\\file.txt");

        //click bitrix24
        extentLogger.info("Click Select document from Bitrix24");
        BrowserUtils.waitForVisibility(dashboard.bitrix24,20).click();
        //select File&click Select the Document
        BrowserUtils.waitForVisibility(dashboard.selecttheFile,20).click();
        BrowserUtils.waitForVisibility(dashboard.selectDocument,20).click();

        extentLogger.info("Click Download from external drive");
        //click download from external drive
        BrowserUtils.waitForVisibility(dashboard.downloadfrExDrive,20).click();

        extentLogger.info("Click Cancel");
        //click cancel
        BrowserUtils.waitForVisibility(dashboard.cancel,20).click();

        extentLogger.info("Click Create using Google Docs");
        //click create using desktop app
        BrowserUtils.waitForVisibility(dashboard.googleDocs,20).click();

        extentLogger.info("Choose Desktop Apps");
        //Choose desktop Apps
        BrowserUtils.waitForVisibility(dashboard.desktopApps,20).click();

        extentLogger.info("Click Cancel");
        //click cancel
        BrowserUtils.waitForVisibility(dashboard.cancelForCreate,20).click();

        extentLogger.info("Click Create again");
        //click create again
        BrowserUtils.waitForVisibility(dashboard.googleDocs,20).click();

        extentLogger.info("Choose Office365");
        //click office 365
        BrowserUtils.waitForVisibility(dashboard.office365,20).click();

        extentLogger.info("Click Create again");
        //click create again
        BrowserUtils.waitForVisibility(dashboard.googleDocs,20).click();

        extentLogger.info("Choose MS Office Online");
        //click office 365
        BrowserUtils.waitForVisibility(dashboard.office365,20).click();


    }

    @Test
    public void loginAsmarketing36() {
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

        extentLogger.info("Click Upload");
        BrowserUtils.waitForVisibility(dashboard.uploadfilesLink,20).click();

        //upload sth
        extentLogger.info("Upload File");
        dashboard.uploadFileOption.sendKeys("C:\\Users\\nb\\Desktop\\file.txt");

        //click bitrix24
        extentLogger.info("Click Select document from Bitrix24");
        BrowserUtils.waitForVisibility(dashboard.bitrix24,20).click();
        //select File&click Select the Document
        BrowserUtils.waitForVisibility(dashboard.selecttheFile,20).click();
        BrowserUtils.waitForVisibility(dashboard.selectDocument,20).click();

        extentLogger.info("Click Download from external drive");
        //click download from external drive
        BrowserUtils.waitForVisibility(dashboard.downloadfrExDrive,20).click();

        extentLogger.info("Click Cancel");
        //click cancel
        BrowserUtils.waitForVisibility(dashboard.cancel,20).click();

        extentLogger.info("Click Create using Google Docs");
        //click create using desktop app
        BrowserUtils.waitForVisibility(dashboard.googleDocs,20).click();

        extentLogger.info("Choose Desktop Apps");
        //Choose desktop Apps
        BrowserUtils.waitForVisibility(dashboard.desktopApps,20).click();

        extentLogger.info("Click Cancel");
        //click cancel
        BrowserUtils.waitForVisibility(dashboard.cancelForCreate,20).click();

        extentLogger.info("Click Create again");
        //click create again
        BrowserUtils.waitForVisibility(dashboard.googleDocs,20).click();

        extentLogger.info("Choose Office365");
        //click office 365
        BrowserUtils.waitForVisibility(dashboard.office365,20).click();

        extentLogger.info("Click Create again");
        //click create again
        BrowserUtils.waitForVisibility(dashboard.googleDocs,20).click();

        extentLogger.info("Choose MS Office Online");
        //click office 365
        BrowserUtils.waitForVisibility(dashboard.office365,20).click();


    }

    @Test
    public void loginAshr35() {
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

        extentLogger.info("Click Upload");
        BrowserUtils.waitForVisibility(dashboard.uploadfilesLink,20).click();

        //upload sth
        extentLogger.info("Upload File");
        dashboard.uploadFileOption.sendKeys("C:\\Users\\nb\\Desktop\\file.txt");

        //click bitrix24
        extentLogger.info("Click Select document from Bitrix24");
        BrowserUtils.waitForVisibility(dashboard.bitrix24,20).click();
        //select File&click Select the Document
        BrowserUtils.waitForVisibility(dashboard.selecttheFile,20).click();
        BrowserUtils.waitForVisibility(dashboard.selectDocument,20).click();

        extentLogger.info("Click Download from external drive");
        //click download from external drive
        BrowserUtils.waitForVisibility(dashboard.downloadfrExDrive,20).click();

        extentLogger.info("Click Cancel");
        //click cancel
        BrowserUtils.waitForVisibility(dashboard.cancel,20).click();

        extentLogger.info("Click Create using Google Docs");
        //click create using desktop app
        BrowserUtils.waitForVisibility(dashboard.googleDocs,20).click();

        extentLogger.info("Choose Desktop Apps");
        //Choose desktop Apps
        BrowserUtils.waitForVisibility(dashboard.desktopApps,20).click();

        extentLogger.info("Click Cancel");
        //click cancel
        BrowserUtils.waitForVisibility(dashboard.cancelForCreate,20).click();

        extentLogger.info("Click Create again");
        //click create again
        BrowserUtils.waitForVisibility(dashboard.googleDocs,20).click();

        extentLogger.info("Choose Office365");
        //click office 365
        BrowserUtils.waitForVisibility(dashboard.office365,20).click();

        extentLogger.info("Click Create again");
        //click create again
        BrowserUtils.waitForVisibility(dashboard.googleDocs,20).click();

        extentLogger.info("Choose MS Office Online");
        //click office 365
        BrowserUtils.waitForVisibility(dashboard.office365,20).click();


    }

    @Test
    public void loginAshr36() {
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

        extentLogger.info("Click Upload");
        BrowserUtils.waitForVisibility(dashboard.uploadfilesLink,20).click();

        //upload sth
        extentLogger.info("Upload File");
        dashboard.uploadFileOption.sendKeys("C:\\Users\\nb\\Desktop\\file.txt");

        //click bitrix24
        extentLogger.info("Click Select document from Bitrix24");
        BrowserUtils.waitForVisibility(dashboard.bitrix24,20).click();
        //select File&click Select the Document
        BrowserUtils.waitForVisibility(dashboard.selecttheFile,20).click();
        BrowserUtils.waitForVisibility(dashboard.selectDocument,20).click();

        extentLogger.info("Click Download from external drive");
        //click download from external drive
        BrowserUtils.waitForVisibility(dashboard.downloadfrExDrive,20).click();

        extentLogger.info("Click Cancel");
        //click cancel
        BrowserUtils.waitForVisibility(dashboard.cancel,20).click();

        extentLogger.info("Click Create using Google Docs");
        //click create using desktop app
        BrowserUtils.waitForVisibility(dashboard.googleDocs,20).click();

        extentLogger.info("Choose Desktop Apps");
        //Choose desktop Apps
        BrowserUtils.waitForVisibility(dashboard.desktopApps,20).click();

        extentLogger.info("Click Cancel");
        //click cancel
        BrowserUtils.waitForVisibility(dashboard.cancelForCreate,20).click();

        extentLogger.info("Click Create again");
        //click create again
        BrowserUtils.waitForVisibility(dashboard.googleDocs,20).click();

        extentLogger.info("Choose Office365");
        //click office 365
        BrowserUtils.waitForVisibility(dashboard.office365,20).click();

        extentLogger.info("Click Create again");
        //click create again
        BrowserUtils.waitForVisibility(dashboard.googleDocs,20).click();

        extentLogger.info("Choose MS Office Online");
        //click office 365
        BrowserUtils.waitForVisibility(dashboard.office365,20).click();

    }
}
