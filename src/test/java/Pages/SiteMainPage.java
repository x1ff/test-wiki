package Pages;

import Base.BaseElement;
import org.openqa.selenium.By;

public class SiteMainPage extends BaseElement {
    public SiteMainPage() {
        super();
    }

    public String getLeftSideBarHeader () {
        return getText(By.xpath("//div[@id='leftsitebar_game_block_1']/span"));
    }

    @Override
    public void waitVisibility() {
        super.waitVisibility();
        waitVisibility(By.xpath("//span[text()='Энциклопедия L2 >>']"));
        waitVisibility(By.id("leftsitebar_game_block_1"));
    }
}
