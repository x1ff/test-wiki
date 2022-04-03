package Pages;

import Base.BaseElement;
import Elements.NavigationHeaderBar;

public class StartHf5Page extends BaseElement {
    public NavigationHeaderBar navigationHeaderBar;
    public StartHf5Page() {
        super();
        navigationHeaderBar = new NavigationHeaderBar();
    }

    @Override
    public void waitVisibility() {
        super.waitVisibility();
    }
}
