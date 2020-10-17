package com.myProject.tests;

import com.myProject.pages.DashboardPage;
import com.myProject.pages.LoginPage;
import com.myProject.utilities.BrowserUtils;
import com.myProject.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


import java.util.List;

public class AC9 extends TestBase {

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

        //Set Start and Ending date and time, and specify the time zone
        BrowserUtils.waitForVisibility(dashboard.startingDate,20);

        extentLogger.info("Set Starting Date");
        dashboard.startingDate.clear();
        dashboard.startingDate.sendKeys("10/10/2020");

        extentLogger.info("Set Ending Date");
        dashboard.endingDate.clear();
        dashboard.endingDate.sendKeys("10/12/2020");

        extentLogger.info("Set Starting Time");
        dashboard.startingTime.clear();
        dashboard.startingTime.sendKeys("09:00 pm");

        extentLogger.info("Set Ending Time");
        dashboard.endingTime.clear();
        dashboard.endingTime.sendKeys("10:00 pm");

        extentLogger.info("Click Specify the Time Zone");
        dashboard.timeZone.click();

        extentLogger.info("Specify the First Time Zone Option");
        Select fromTime = new Select(dashboard.fromTimeZone);

        fromTime.selectByVisibleText("(UTC +02:00) Europe/Berlin");

        extentLogger.info("Specify the Second Time Zone Option");
        Select toTime = new Select(dashboard.toTimeZone);

        toTime.selectByVisibleText("(UTC +02:00) Europe/Amsterdam");

        if(dashboard.setRemCheckBx.isSelected()) {

            extentLogger.info("Set Reminder - Number");
            dashboard.reminderNumber.clear();
            dashboard.reminderNumber.sendKeys("20");

            extentLogger.info("Set Reminder - Value");
            Select options = new Select(dashboard.reminderValuetype);

            options.selectByVisibleText("days");

        }else {

            extentLogger.info("Click Set Reminder Check Box");
            dashboard.setRemCheckBx.click();

            extentLogger.info("Set Reminder - Number");
            dashboard.reminderNumber.clear();
            dashboard.reminderNumber.sendKeys("20");

            extentLogger.info("Set Reminder - Value");
            Select options = new Select(dashboard.reminderValuetype);

            options.selectByVisibleText("days");


        }

        extentLogger.info("Select Event Location");
        dashboard.eventLocation.click();
        List<WebElement> options = driver.findElements(By.xpath("//*[@id=\"popup-window-content-cal_3Jcl_loc_mr\"]/div/div"));

        options.get(2).click();

        extentLogger.info("Select an Individual");
        dashboard.addMember.click();
        dashboard.memberInput.sendKeys("James");

        //gather all texts that contains James
        List<WebElement> memberOptions = driver.findElements(By.xpath("//table/tr/td/div[1]/span/span[2]/a"));

        memberOptions.get(1).click();

        //write Group
        dashboard.memberInputBox.click();
        dashboard.memberInput.sendKeys("Group");

        //gather all texts that contains group
        List<WebElement> memberOptions2 = driver.findElements(By.xpath("//table/tr/td/div[1]/span/span[2]/a"));

        if(memberOptions2.size()>1)
            memberOptions2.get(1).click();
        else
            dashboard.searchForGroup.click();

        //click Member Input Box
        dashboard.memberInputBox.click();

        extentLogger.info("Select From Employees and Departments");
        dashboard.employeesAndDepart.click();

        extentLogger.info("Choose IT option");
        dashboard.itOption.click();

        extentLogger.info("Check for All");
        dashboard.checkforAll.click();

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

        //Set Start and Ending date and time, and specify the time zone
        BrowserUtils.waitForVisibility(dashboard.startingDate,20);

        extentLogger.info("Set Starting Date");
        dashboard.startingDate.clear();
        dashboard.startingDate.sendKeys("10/10/2020");

        extentLogger.info("Set Ending Date");
        dashboard.endingDate.clear();
        dashboard.endingDate.sendKeys("10/12/2020");

        extentLogger.info("Set Starting Time");
        dashboard.startingTime.clear();
        dashboard.startingTime.sendKeys("09:00 pm");

        extentLogger.info("Set Ending Time");
        dashboard.endingTime.clear();
        dashboard.endingTime.sendKeys("10:00 pm");

        extentLogger.info("Click Specify the Time Zone");
        dashboard.timeZone.click();

        extentLogger.info("Specify the First Time Zone Option");
        Select fromTime = new Select(dashboard.fromTimeZone);

        fromTime.selectByVisibleText("(UTC +02:00) Europe/Berlin");

        extentLogger.info("Specify the Second Time Zone Option");
        Select toTime = new Select(dashboard.toTimeZone);

        toTime.selectByVisibleText("(UTC +02:00) Europe/Amsterdam");

        if(dashboard.setRemCheckBx.isSelected()) {

            extentLogger.info("Set Reminder - Number");
            dashboard.reminderNumber.clear();
            dashboard.reminderNumber.sendKeys("20");

            extentLogger.info("Set Reminder - Value");
            Select options = new Select(dashboard.reminderValuetype);

            options.selectByVisibleText("days");

        }else {

            extentLogger.info("Click Set Reminder Check Box");
            dashboard.setRemCheckBx.click();

            extentLogger.info("Set Reminder - Number");
            dashboard.reminderNumber.clear();
            dashboard.reminderNumber.sendKeys("20");

            extentLogger.info("Set Reminder - Value");
            Select options = new Select(dashboard.reminderValuetype);

            options.selectByVisibleText("days");


        }

        extentLogger.info("Select Event Location");
        dashboard.eventLocation.click();
        List<WebElement> options = driver.findElements(By.xpath("//*[@id=\"popup-window-content-cal_3Jcl_loc_mr\"]/div/div"));

        options.get(2).click();

        extentLogger.info("Select an Individual");
        dashboard.addMember.click();
        dashboard.memberInput.sendKeys("James");

        //gather all texts that contains James
        List<WebElement> memberOptions = driver.findElements(By.xpath("//table/tr/td/div[1]/span/span[2]/a"));

        memberOptions.get(1).click();

        //write Group
        dashboard.memberInputBox.click();
        dashboard.memberInput.sendKeys("Group");

        //gather all texts that contains group
        List<WebElement> memberOptions2 = driver.findElements(By.xpath("//table/tr/td/div[1]/span/span[2]/a"));

        if(memberOptions2.size()>1)
            memberOptions2.get(1).click();
        else
            dashboard.searchForGroup.click();

        //click Member Input Box
        dashboard.memberInputBox.click();

        extentLogger.info("Select From Employees and Departments");
        dashboard.employeesAndDepart.click();

        extentLogger.info("Choose IT option");
        dashboard.itOption.click();

        extentLogger.info("Check for All");
        dashboard.checkforAll.click();

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

        //Set Start and Ending date and time, and specify the time zone
        BrowserUtils.waitForVisibility(dashboard.startingDate,20);

        extentLogger.info("Set Starting Date");
        dashboard.startingDate.clear();
        dashboard.startingDate.sendKeys("10/10/2020");

        extentLogger.info("Set Ending Date");
        dashboard.endingDate.clear();
        dashboard.endingDate.sendKeys("10/12/2020");

        extentLogger.info("Set Starting Time");
        dashboard.startingTime.clear();
        dashboard.startingTime.sendKeys("09:00 pm");

        extentLogger.info("Set Ending Time");
        dashboard.endingTime.clear();
        dashboard.endingTime.sendKeys("10:00 pm");

        extentLogger.info("Click Specify the Time Zone");
        dashboard.timeZone.click();

        extentLogger.info("Specify the First Time Zone Option");
        Select fromTime = new Select(dashboard.fromTimeZone);

        fromTime.selectByVisibleText("(UTC +02:00) Europe/Berlin");

        if(dashboard.setRemCheckBx.isSelected()) {

            extentLogger.info("Set Reminder - Number");
            dashboard.reminderNumber.clear();
            dashboard.reminderNumber.sendKeys("20");

            extentLogger.info("Set Reminder - Value");
            Select options = new Select(dashboard.reminderValuetype);

            options.selectByVisibleText("days");

        }else {

            extentLogger.info("Click Set Reminder Check Box");
            dashboard.setRemCheckBx.click();

            extentLogger.info("Set Reminder - Number");
            dashboard.reminderNumber.clear();
            dashboard.reminderNumber.sendKeys("20");

            extentLogger.info("Set Reminder - Value");
            Select options = new Select(dashboard.reminderValuetype);

            options.selectByVisibleText("days");


        }

        extentLogger.info("Select Event Location");
        dashboard.eventLocation.click();
        List<WebElement> options = driver.findElements(By.xpath("//*[@id=\"popup-window-content-cal_3Jcl_loc_mr\"]/div/div"));

        options.get(2).click();

        extentLogger.info("Select an Individual");
        dashboard.addMember.click();
        dashboard.memberInput.sendKeys("James");

        //gather all texts that contains James
        List<WebElement> memberOptions = driver.findElements(By.xpath("//table/tr/td/div[1]/span/span[2]/a"));

        memberOptions.get(1).click();

        //write Group
        dashboard.memberInputBox.click();
        dashboard.memberInput.sendKeys("Group");

        //gather all texts that contains group
        List<WebElement> memberOptions2 = driver.findElements(By.xpath("//table/tr/td/div[1]/span/span[2]/a"));

        if(memberOptions2.size()>1)
            memberOptions2.get(1).click();
        else
            dashboard.searchForGroup.click();

        //click Member Input Box
        dashboard.memberInputBox.click();

        extentLogger.info("Select From Employees and Departments");
        dashboard.employeesAndDepart.click();

        extentLogger.info("Choose IT option");
        dashboard.itOption.click();

        extentLogger.info("Check for All");
        dashboard.checkforAll.click();

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

        //Set Start and Ending date and time, and specify the time zone
        BrowserUtils.waitForVisibility(dashboard.startingDate,20);

        extentLogger.info("Set Starting Date");
        dashboard.startingDate.clear();
        dashboard.startingDate.sendKeys("10/10/2020");

        extentLogger.info("Set Ending Date");
        dashboard.endingDate.clear();
        dashboard.endingDate.sendKeys("10/12/2020");

        extentLogger.info("Set Starting Time");
        dashboard.startingTime.clear();
        dashboard.startingTime.sendKeys("09:00 pm");

        extentLogger.info("Set Ending Time");
        dashboard.endingTime.clear();
        dashboard.endingTime.sendKeys("10:00 pm");

        extentLogger.info("Click Specify the Time Zone");
        dashboard.timeZone.click();

        extentLogger.info("Specify the First Time Zone Option");
        Select fromTime = new Select(dashboard.fromTimeZone);

        fromTime.selectByVisibleText("(UTC +02:00) Europe/Berlin");

        extentLogger.info("Specify the Second Time Zone Option");
        Select toTime = new Select(dashboard.toTimeZone);

        toTime.selectByVisibleText("(UTC +02:00) Europe/Amsterdam");

        if(dashboard.setRemCheckBx.isSelected()) {

            extentLogger.info("Set Reminder - Number");
            dashboard.reminderNumber.clear();
            dashboard.reminderNumber.sendKeys("20");

            extentLogger.info("Set Reminder - Value");
            Select options = new Select(dashboard.reminderValuetype);

            options.selectByVisibleText("days");

        }else {

            extentLogger.info("Click Set Reminder Check Box");
            dashboard.setRemCheckBx.click();

            extentLogger.info("Set Reminder - Number");
            dashboard.reminderNumber.clear();
            dashboard.reminderNumber.sendKeys("20");

            extentLogger.info("Set Reminder - Value");
            Select options = new Select(dashboard.reminderValuetype);

            options.selectByVisibleText("days");


        }

        extentLogger.info("Select Event Location");
        dashboard.eventLocation.click();
        List<WebElement> options = driver.findElements(By.xpath("//*[@id=\"popup-window-content-cal_3Jcl_loc_mr\"]/div/div"));

        options.get(2).click();

        extentLogger.info("Select an Individual");
        dashboard.addMember.click();
        dashboard.memberInput.sendKeys("James");

        //gather all texts that contains James
        List<WebElement> memberOptions = driver.findElements(By.xpath("//table/tr/td/div[1]/span/span[2]/a"));

        memberOptions.get(1).click();

        //write Group
        dashboard.memberInputBox.click();
        dashboard.memberInput.sendKeys("Group");

        //gather all texts that contains group
        List<WebElement> memberOptions2 = driver.findElements(By.xpath("//table/tr/td/div[1]/span/span[2]/a"));

        if(memberOptions2.size()>1)
            memberOptions2.get(1).click();
        else
            dashboard.searchForGroup.click();

        //click Member Input Box
        dashboard.memberInputBox.click();

        extentLogger.info("Select From Employees and Departments");
        dashboard.employeesAndDepart.click();

        extentLogger.info("Choose IT option");
        dashboard.itOption.click();

        extentLogger.info("Check for All");
        dashboard.checkforAll.click();
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

        //Set Start and Ending date and time, and specify the time zone
        BrowserUtils.waitForVisibility(dashboard.startingDate,20);

        extentLogger.info("Set Starting Date");
        dashboard.startingDate.clear();
        dashboard.startingDate.sendKeys("10/10/2020");

        extentLogger.info("Set Ending Date");
        dashboard.endingDate.clear();
        dashboard.endingDate.sendKeys("10/12/2020");

        extentLogger.info("Set Starting Time");
        dashboard.startingTime.clear();
        dashboard.startingTime.sendKeys("09:00 pm");

        extentLogger.info("Set Ending Time");
        dashboard.endingTime.clear();
        dashboard.endingTime.sendKeys("10:00 pm");

        extentLogger.info("Click Specify the Time Zone");
        dashboard.timeZone.click();

        extentLogger.info("Specify the First Time Zone Option");
        Select fromTime = new Select(dashboard.fromTimeZone);

        fromTime.selectByVisibleText("(UTC +02:00) Europe/Berlin");

        extentLogger.info("Specify the Second Time Zone Option");
        Select toTime = new Select(dashboard.toTimeZone);

        toTime.selectByVisibleText("(UTC +02:00) Europe/Amsterdam");

        if(dashboard.setRemCheckBx.isSelected()) {

            extentLogger.info("Set Reminder - Number");
            dashboard.reminderNumber.clear();
            dashboard.reminderNumber.sendKeys("20");

            extentLogger.info("Set Reminder - Value");
            Select options = new Select(dashboard.reminderValuetype);

            options.selectByVisibleText("days");

        }else {

            extentLogger.info("Click Set Reminder Check Box");
            dashboard.setRemCheckBx.click();

            extentLogger.info("Set Reminder - Number");
            dashboard.reminderNumber.clear();
            dashboard.reminderNumber.sendKeys("20");

            extentLogger.info("Set Reminder - Value");
            Select options = new Select(dashboard.reminderValuetype);

            options.selectByVisibleText("days");


        }

        extentLogger.info("Select Event Location");
        dashboard.eventLocation.click();
        List<WebElement> options = driver.findElements(By.xpath("//*[@id=\"popup-window-content-cal_3Jcl_loc_mr\"]/div/div"));

        options.get(2).click();

        extentLogger.info("Select an Individual");
        dashboard.addMember.click();
        dashboard.memberInput.sendKeys("James");

        //gather all texts that contains James
        List<WebElement> memberOptions = driver.findElements(By.xpath("//table/tr/td/div[1]/span/span[2]/a"));

        memberOptions.get(1).click();

        //write Group
        dashboard.memberInputBox.click();
        dashboard.memberInput.sendKeys("Group");

        //gather all texts that contains group
        List<WebElement> memberOptions2 = driver.findElements(By.xpath("//table/tr/td/div[1]/span/span[2]/a"));

        if(memberOptions2.size()>1)
            memberOptions2.get(1).click();
        else
            dashboard.searchForGroup.click();

        //click Member Input Box
        dashboard.memberInputBox.click();

        extentLogger.info("Select From Employees and Departments");
        dashboard.employeesAndDepart.click();

        extentLogger.info("Choose IT option");
        dashboard.itOption.click();

        extentLogger.info("Check for All");
        dashboard.checkforAll.click();

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

        //Set Start and Ending date and time, and specify the time zone
        BrowserUtils.waitForVisibility(dashboard.startingDate,20);

        extentLogger.info("Set Starting Date");
        dashboard.startingDate.clear();
        dashboard.startingDate.sendKeys("10/10/2020");

        extentLogger.info("Set Ending Date");
        dashboard.endingDate.clear();
        dashboard.endingDate.sendKeys("10/12/2020");

        extentLogger.info("Set Starting Time");
        dashboard.startingTime.clear();
        dashboard.startingTime.sendKeys("09:00 pm");

        extentLogger.info("Set Ending Time");
        dashboard.endingTime.clear();
        dashboard.endingTime.sendKeys("10:00 pm");

        extentLogger.info("Click Specify the Time Zone");
        dashboard.timeZone.click();

        extentLogger.info("Specify the First Time Zone Option");
        Select fromTime = new Select(dashboard.fromTimeZone);

        fromTime.selectByVisibleText("(UTC +02:00) Europe/Berlin");

        extentLogger.info("Specify the Second Time Zone Option");
        Select toTime = new Select(dashboard.toTimeZone);

        toTime.selectByVisibleText("(UTC +02:00) Europe/Amsterdam");

        if(dashboard.setRemCheckBx.isSelected()) {

            extentLogger.info("Set Reminder - Number");
            dashboard.reminderNumber.clear();
            dashboard.reminderNumber.sendKeys("20");

            extentLogger.info("Set Reminder - Value");
            Select options = new Select(dashboard.reminderValuetype);

            options.selectByVisibleText("days");

        }else {

            extentLogger.info("Click Set Reminder Check Box");
            dashboard.setRemCheckBx.click();

            extentLogger.info("Set Reminder - Number");
            dashboard.reminderNumber.clear();
            dashboard.reminderNumber.sendKeys("20");

            extentLogger.info("Set Reminder - Value");
            Select options = new Select(dashboard.reminderValuetype);

            options.selectByVisibleText("days");


        }

        extentLogger.info("Select Event Location");
        dashboard.eventLocation.click();
        List<WebElement> options = driver.findElements(By.xpath("//*[@id=\"popup-window-content-cal_3Jcl_loc_mr\"]/div/div"));

        options.get(2).click();

        extentLogger.info("Select an Individual");
        dashboard.addMember.click();
        dashboard.memberInput.sendKeys("James");

        //gather all texts that contains James
        List<WebElement> memberOptions = driver.findElements(By.xpath("//table/tr/td/div[1]/span/span[2]/a"));

        memberOptions.get(1).click();

        //write Group
        dashboard.memberInputBox.click();
        dashboard.memberInput.sendKeys("Group");

        //gather all texts that contains group
        List<WebElement> memberOptions2 = driver.findElements(By.xpath("//table/tr/td/div[1]/span/span[2]/a"));

        if(memberOptions2.size()>1)
        memberOptions2.get(1).click();
        else
        dashboard.searchForGroup.click();

        //click Member Input Box
        dashboard.memberInputBox.click();

        extentLogger.info("Select From Employees and Departments");
        dashboard.employeesAndDepart.click();

        extentLogger.info("Choose IT option");
        dashboard.itOption.click();

        extentLogger.info("Check for All");
        dashboard.checkforAll.click();



    }
}
