package Pages;

import Base.BaseElement;
import Elements.NavigationHeaderBar;
import org.openqa.selenium.By;

public class StartHf5Page extends BaseElement {
  public NavigationHeaderBar navigationHeaderBar;

  public StartHf5Page() {
    super();
    navigationHeaderBar = new NavigationHeaderBar();
  }

  @Override
  public void waitVisibility() {
    super.waitVisibility();
    waitVisibility(By.xpath("//h1[@id='firstHeading'][text()='Энциклопедия Lineage 2']"));
  }
}
