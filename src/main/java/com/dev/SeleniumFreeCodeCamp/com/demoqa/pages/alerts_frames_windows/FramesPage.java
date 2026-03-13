package com.dev.SeleniumFreeCodeCamp.com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

import static com.dev.SeleniumFreeCodeCamp.utilities.SwitchToUtility.*;

public class FramesPage extends Alerts_Frames_WindowsPage {
    private final By textInFrame = By.id("sampleHeading");
    private final String iFramesBigBox = "frame1";
    private final By headerFramesText = By.xpath("//div[@id='app']//h1[text()='Frames']");
    private By iFrameSmallBox = By.xpath("//div[@id='frame2Wrapper']/iframe");
    public String getHeaderFramesText() {
        return find(headerFramesText).getText();
    }

    private void switchToBigBox() {
//        driver.switchTo().frame(iFramesBigBox);
        switchToFrameString(iFramesBigBox);
    }

    private void switchToSmallBox() {
//        switchToFrameIndex(2);
        switchToFrameElement(find(iFrameSmallBox));
    }
    public String getTextInBigFrame() {
        switchToBigBox();
        String bigFrameText = find(textInFrame).getText();
        System.out.println("Big Frame Text: " + bigFrameText);
//        driver.switchTo().parentFrame(); // both these functions will pass the test
//        driver.switchTo().defaultContent();
        switchToDefaultContent();
        return bigFrameText;
    }

    public String getTextInSmallFrame() {
        switchToSmallBox();
        String smallFrameText = find(textInFrame).getText();
        System.out.println("Small frame text: " + smallFrameText);
        switchToDefaultContent();
        return smallFrameText;
    }


}
