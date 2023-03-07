package org.example.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.example.pages.LoginPage;
import org.example.pages.RegatulJocurilorPage;

import static org.junit.Assert.assertEquals;

public class LoginSteps {
    LoginPage loginPage;
    RegatulJocurilorPage regatulJocurilorPage;
    @Step
    public void is_the_home_page() {
        regatulJocurilorPage.open();
    }
    @Step
    public void close_newsletter(){
        regatulJocurilorPage.close_newsletter_warning();}
    @Step
    public void click_on_login_icon(){
        loginPage.go_to_login_page();
    }
    @Step
    public void write_credentials(String email, String password) {
        loginPage.enter_credentials(email, password);
    }

    @Step
    public void submit_credentials() {
        loginPage.submit();
    }

    @Step
    public void should_receive_error_message(String loginError) {
        assertEquals(loginError, loginPage.error_message());
    }

}
