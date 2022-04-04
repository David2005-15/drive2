package ru.Drive.Tests;

import org.junit.Test;
import ru.Drive.Control.Button;
import ru.Drive.Control.InputField;
import ru.Drive.Selectors.LoginSelectors;
import ru.Drive.Settings.Settings;

public class MainTest extends Settings {
    private final Button button = new Button(driver);
    private final InputField inputField = new InputField(driver);
    private final LoginSelectors selectors = new LoginSelectors();

    @Test
    public void First() throws InterruptedException {
        button.Click(504, 1812);
        button.Click(selectors.ByMain());
        inputField.SendKeys(selectors.MainField(), "jksdbfkjdshfj");
        inputField.SendKeys(selectors.PasswordField(), "jshdfkjshdf");
        button.Click(selectors.SignButton());
    }
}
