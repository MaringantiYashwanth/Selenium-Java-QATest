package com.dev.SeleniumFreeCodeCamp.saucedemo.pages;

import org.openqa.selenium.By;

public class PracticeLoginPage extends PracticeBasePage {
   private By usernameField = By.id("user-name");
   private By passwordField = By.id("password");
   private By loginButton = By.id("login-button");
   private By errorMessage = By.cssSelector("#login_button_container h3");
   // setter methods
    public void setUsername(String username) {
        set(usernameField, username);
    }
    public void setPassword(String password) {
        set(passwordField, password);
    }
    // transition method
    public ProductsPage clickLoginButton() {
        click(loginButton);
        return new ProductsPage();
    }
    // convenience method
    public ProductsPage loginIntoApplication() {
        return clickLoginButton();
    }
    // getter method
    public String getErrorMessage() {
        return find(errorMessage).getText();
    }
}
