package com.dev.SeleniumFreeCodeCamp.saucedemo.pages;


import com.base.BasePage;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");
    private By errorMessage = By.cssSelector("#login_button_container h3");
    // Setter methods:
    public void setUsername(String username) {
        set(usernameField, username);
    }

    public void setPassword(String password) {
        set(passwordField, password);
    }

   // Transition method : transition from loginPage to Products page
    public ProductsPage clickLoginButton() {
        click(loginButton);
        return new ProductsPage();
    }
    // Convenience Method
    public ProductsPage logIntoApplication(String username, String password) {
        setUsername(username);
        setPassword(password);
        return clickLoginButton();
    }

    // getter message
    public String getErrorMessage() {
        return find(errorMessage).getText();
    }
}
