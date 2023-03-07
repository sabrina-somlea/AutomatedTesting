package org.example.features.login;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.example.steps.serenity.GameResultsSteps;
import org.example.steps.serenity.LoginSteps;
import org.example.steps.serenity.SearchGameSteps;
import org.example.steps.serenity.UserInfoSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginStory {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public SearchGameSteps searchGameSteps;
    @Steps
    public LoginSteps loginSteps;

    @Steps
    public UserInfoSteps userInfoSteps;

    @Issue("#regat-2")
    @Test
    public void login_succesfully() {
        searchGameSteps.is_the_home_page();
        loginSteps.close_newsletter();
        loginSteps.click_on_login_icon();
        loginSteps.write_credentials("sabrina.groza@gmail.com", "test123");
        loginSteps.submit_credentials();
        userInfoSteps.should_see_account_message("Contul tau");
    }
    @Test
    public void login_invalid(){
        searchGameSteps.is_the_home_page();
        loginSteps.close_newsletter();
        loginSteps.click_on_login_icon();
        loginSteps.write_credentials("sabrina.groza@gmail.com", "test1");
        loginSteps.submit_credentials();
        loginSteps.should_receive_error_message("Autentificare esuata.");
    }

} 