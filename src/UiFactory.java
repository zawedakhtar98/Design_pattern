import Components.Buttons.Buttons;
import Components.Dropdowns.Dropdowns;
import Components.Menus.Menu;


public interface UiFactory {
    Buttons createButton();
    Dropdowns createDropdown();
    Menu createMenu();
}
