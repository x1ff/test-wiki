package tests;

import Elements.DropdownMenu;
import Pages.SiteMainPage;
import Pages.StartHf5Page;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.open;

public class MenuTests extends BaseTest {

    @Test
    public void checkMenu() {
        open("https://www.rpg-club.com/lineage/info/hf5/");
        StartHf5Page startHf5Page = new StartHf5Page();
        DropdownMenu menu = startHf5Page.navigationHeaderBar.clickPlus();

        Assertions.assertEquals("Энциклопедия", menu.getMenuItemText(1));
        Assertions.assertEquals("Сайт RPG-CLUB", menu.getMenuItemText(2));
        Assertions.assertEquals("Основы игры", menu.getMenuItemText(3));
        Assertions.assertEquals("Библиотека", menu.getMenuItemText(4));
        Assertions.assertEquals("Расы и классы", menu.getMenuItemText(5));
        Assertions.assertEquals("Локации и Зоны Охоты", menu.getMenuItemText(6));
        Assertions.assertEquals("Предметы", menu.getMenuItemText(7));
        Assertions.assertEquals("Квесты", menu.getMenuItemText(8));
        Assertions.assertEquals("Монстры", menu.getMenuItemText(9));
        Assertions.assertEquals("Игровые обновления", menu.getMenuItemText(10));
        Assertions.assertEquals("Зарабатываем деньги", menu.getMenuItemText(11));
        Assertions.assertEquals("Руководства", menu.getMenuItemText(12));
        Assertions.assertEquals("Пасхальные яйца", menu.getMenuItemText(13));
    }

    @Test
    public void navigateToSite() {
        open("https://www.rpg-club.com/lineage/info/hf5/");
        StartHf5Page startHf5Page = new StartHf5Page();
        startHf5Page.navigationHeaderBar.clickPlus().clickItemByText("Сайт RPG-CLUB");
        Assertions.assertEquals("Выбери сервер:", new SiteMainPage().getLeftSideBarHeader());
    }
}
