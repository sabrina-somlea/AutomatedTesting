package org.example.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class LoginPage extends PageObject {

//    @FindBy(className = "login-icon")
//    private WebElementFacade loginIcon;


    @FindBy(name = "email")
    private WebElementFacade writeEmail;
    @FindBy(name = "password")
    private WebElementFacade writePassword;

    @FindBy(className = "help-block")
    private WebElementFacade loginError;

    public void go_to_login_page() {
        WebElementFacade loginMenu = find(By.id("_desktop_user_info"));
        loginMenu.click();
//        JavascriptExecutor je = (JavascriptExecutor) loginMenu;
//        je.executeScript("arguments[0].scrollIntoView(true);",loginMenu);
        WebElement login = find(By.className("user-info"));
        login.click();
    }

    public void enter_credentials(String email, String password) {
        writeEmail.type(email);
        writePassword.type(password);

    }
    public void submit() {
        WebElementFacade submitButton = find(By.xpath("//*[@id=\"submit-login\"]"));
        submitButton.click();
    }

    public String error_message(){
        return loginError.getText();
    }
}
