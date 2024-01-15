import Components.Buttons.Buttons;

public class Client {
    public static void main(String[] args) {
        Fluter fluter = new Fluter();
        fluter.changeRefreshRate();
        UiFactory uiFactory = fluter.createUiFactory("Android");
        Buttons button = uiFactory.createButton();
        button.resizeButton();
    }
}
