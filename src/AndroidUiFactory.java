import Components.Buttons.AndroidButton;
import Components.Dropdowns.AndroidDropdown;
import Components.Menus.AndroidMenu;

public class AndroidUiFactory implements UiFactory{

    @Override
    public AndroidButton createButton() {
        System.out.println("Create an Android button");
        return new AndroidButton();
    }

    @Override
    public AndroidDropdown createDropdown() {
        System.out.println("Create an Android dropdown");
        return new AndroidDropdown();
    }

    @Override
    public AndroidMenu createMenu() {
        System.out.println("Create an Android dropdown");
        return new AndroidMenu();
    }
}
