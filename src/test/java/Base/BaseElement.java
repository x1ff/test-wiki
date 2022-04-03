package Base;

import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
public class BaseElement {
    public BaseElement() {
        waitVisibility();
    }

    public void waitVisibility(By elementBy) {
        $(elementBy).shouldBe(visible, Duration.ofSeconds(30));
    }

    public void click(By elementBy) {
        waitVisibility(elementBy);
        $(elementBy).click();
    }

    public String getText(By elementBy) {
        waitVisibility(elementBy);
        return  $(elementBy).getText();
    }

    public void waitVisibility() {
    }
}
