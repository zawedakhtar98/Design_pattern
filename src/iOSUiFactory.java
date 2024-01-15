import Components.Buttons.iOSButton;
import Components.Dropdowns.iOSDropdown;
import Components.Menus.iOSMenu;

public class iOSUiFactory implements UiFactory{

    @Override
    public iOSButton createButton() {
        System.out.println("create a iOS button");
        return new iOSButton();
    }

    @Override
    public iOSDropdown createDropdown() {
        System.out.println("create a iOS dropdown");
        return new iOSDropdown();
    }

    @Override
    public iOSMenu createMenu() {
        System.out.println("create a iOS menu");
        return new iOSMenu();
    }
}
