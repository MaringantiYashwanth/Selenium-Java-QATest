package com.dev.SeleniumFreeCodeCamp.com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

import java.util.Set;

import static com.dev.SeleniumFreeCodeCamp.utilities.SwitchToUtility.switchToWindow;

public class BrowserWindowsPage extends Alerts_Frames_WindowsPage {
    private By newWindowButton = By.id("windowButton");

    public void clickNewWindowButton() {
        click(newWindowButton);
    }

    public void switchToNewWindow() {
        // Step 1: Get the Current "Main" Window Handle
        String currentHandle = driver.getWindowHandle();
        System.out.println("Main Window ID: " + currentHandle + "\n");
        // Step 2: Get all the window handles
        Set<String> allHandles = driver.getWindowHandles();
        System.out.println("# of Open Windows: " + allHandles.size());

        for (String handle: allHandles) {
            if (currentHandle.equals(handle)) {
                System.out.println("1st window id: " + handle);
            } else {
//                driver.switchTo().window(handle);
                switchToWindow(handle);
                System.out.println("2nd Window ID" + handle);
            }
        }
        // Step 3: Switch to the new window using the window handle
    }
}
