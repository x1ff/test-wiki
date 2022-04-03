package Elements;

import Base.BaseElement;
import org.openqa.selenium.By;

public class DropdownMenu extends BaseElement {
    public DropdownMenu() {
        super();
    }

    public String getMenuItemText(int index) {
        String menuItemText = getText(By.xpath(String.format(
                "//ul[@class='suckerfish todo']/li[%d]/a",
                index
        )));
        System.out.println(String.format("Test item for index %d is %s", index, menuItemText));
        //info(String.format("Test item for index %d is %s", index, menuItemText));
        return  menuItemText;
    }

    public void clickItemByText(String itemName) {
        click(By.xpath(String.format("//ul[@class='suckerfish todo']//a[text()='%s']", itemName)));
    }

    @Override
    public void waitVisibility() {
        super.waitVisibility();
        waitVisibility(By.xpath("//ul[@class='suckerfish todo']/li/a"));
    }
}
