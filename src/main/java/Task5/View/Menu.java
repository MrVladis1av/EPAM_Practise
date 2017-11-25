package Task5.View;

import Task5.Util.ResourceManager;

public class Menu {
    ResourceManager resourceManager = ResourceManager.INSTANCE;

    public void printMainMenu() {
        System.out.println(resourceManager.getString(IMenuInfo.MENU_FIRST_ITEM));
        System.out.println(resourceManager.getString(IMenuInfo.MENU_SECOND_ITEM));
    }

    public void printChooseLanguage() {
        System.out.println(resourceManager.getString(IMenuInfo.MENU_CHOOSE_LANGUAGE));
    }




}
