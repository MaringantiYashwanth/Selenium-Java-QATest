package com.dev.SeleniumFreeCodeCamp.com.demoqa.pages.alerts_frames_windows;

import com.dev.SeleniumFreeCodeCamp.com.demoqa.pages.elements.ElementsPage;
import org.openqa.selenium.By;

import static com.dev.SeleniumFreeCodeCamp.utilities.JavaScriptUtility.scrollToElementJS;

public class Alerts_Frames_WindowsPage extends ElementsPage {
    private final By modalDialoguesMenuItem = By.xpath("//li[@id=\"item-4\"]/span[text()=\"Modal Dialogs\"]");
    private final By alertsMenuItem = By.xpath("//li[@id='item-1']/span[text()='Alerts']");
    private final By framesMenuItem = By.xpath("//li[@id='item-2']/span[text()='Frames']");
    private final By browserWindowsMenuItem = By.xpath("//li[@id='item-0']/span[contains(text(), 'Browser')]");

    public BrowserWindowsPage clickBrowserWindows() {
        scrollToElementJS(browserWindowsMenuItem);
        click(browserWindowsMenuItem);
        return new BrowserWindowsPage();
    }
    public FramesPage clickFrames() {
        scrollToElementJS(framesMenuItem);
        click(framesMenuItem);
        return new FramesPage();
    }

    public AlertsPage clickAlerts() {
        scrollToElementJS(alertsMenuItem);
        click(alertsMenuItem);
        return new AlertsPage();
    }

    public ModalDialogsPage clickModalDialogs() {
        scrollToElementJS(modalDialoguesMenuItem);
        click(modalDialoguesMenuItem);
        return new ModalDialogsPage();
    }
}
