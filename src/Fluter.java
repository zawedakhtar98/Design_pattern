public class Fluter {
    public void setTheme(){
        System.out.println("Theme setting");
    }
    public void changeRefreshRate(){
        System.out.println("changing refresh rate");
    }

    public UiFactory createUiFactory(String platform){
//        if(platform.equals("Android"))
//            return new AndroidUiFactory();
//        if(platform.equals("iOS"))
//            return new iOSUiFactory();
//            return null;
        return UiFactoryFactory.createUiFactory(platform);//this is example of the practical factory
    }
}
