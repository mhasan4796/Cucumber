package com.step;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by mhasan on 3/10/17.
 */
public class Login_Step {
    WebDriver dr;


    @Given("^User is on Home Page$")
    public void user_is_on_Home_Page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        dr=new FirefoxDriver();
        dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );

        dr.get("http://www.macys.com");
    }

    @When("^User Navigate to SignIn Page$")
    public void user_Navigate_to_SignIn_Page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        dr.findElement(By.xpath(".//*[@id='globalMastheadSignIn']")).click();
    }

    @When("^User enters UserName and Password$")
    public void user_enters_UserName_and_Password() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        dr.findElement(By.xpath(".//*[@id='email']")).sendKeys("mhasan4796@gmail.com");
        dr.findElement(By.xpath(".//*[@id='password']")).sendKeys("5060709mh");
        dr.findElement(By.xpath(".//*[@id='signInBtn']")).click();
        System.out.println("SignIn Successfully");
        Thread.sleep(3000);
    }

    @Then("^Message displayed Signin Successfully$")
    public void message_displayed_Signin_Successfully() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        String sName=dr.getCurrentUrl();
        System.out.println(sName);

    }

    @When("^User SignOut from the Application$")
    public void user_SignOut_from_the_Application() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        String sText= dr.findElement(By.id("globalMastheadSignIn")).getText();

        System.out.println(sText);
        dr.findElement(By.xpath(sText)).click();
    }

    @Then("^Message displayed SignOut Successfully$")
    public void message_displayed_SignOut_Successfully() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        String st= dr.getTitle();
        System.out.println(st);
        System.out.println("SignOut Successfully");
        dr.quit();
    }

}
