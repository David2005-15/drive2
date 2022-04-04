package ru.Drive.Control;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InputField extends UiElement{
    public InputField(AndroidDriver driver) {
        super(driver);
    }

    public void SendKeys(By locator, String value) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        Find(locator).sendKeys(value);
    }
}
