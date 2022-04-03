package Elements;

import Base.BaseElement;
import org.openqa.selenium.By;


public class NavigationHeaderBar extends BaseElement {
    public NavigationHeaderBar() {
        super();
    }

    public DropdownMenu clickPlus() {
        //info("Click plus");
        click(By.xpath("//div[@class='bUIButton__eShine ']/span[text()='+']"));
        return new DropdownMenu();
    }
    @Override
    public void waitVisibility() {
        super.waitVisibility();

    }
}
