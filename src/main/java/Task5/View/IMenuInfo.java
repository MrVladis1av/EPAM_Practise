package Task5.View;

public interface IMenuInfo {
    String MENU_CHOOSE_LANGUAGE = "menu.choose.language";
    String MENU_FIRST_ITEM = "menu.get_all_entries";
    String MENU_SECOND_ITEM = "menu.add_new_entry";
    String GET_ALL_ENTRIES = "1";
    String ADD_NEW_ENTRY = "2";

    interface ISubMenu {
        String WRITE_THE_NAME = "menu.submenu.write_first_name";
        String WRITE_THE_SURNAME = "menu.submenu.write_second_name";
        String WRITE_THE_BIRTHDAY = "menu.submenu.write_birthday";
        String WRITE_THE_PHONE_NUMBER = "menu.submenu.write_phone_number";
        String WRITE_THE_ADDRESS = "menu.submenu.write_address";
    }

    interface IRegularExpressions {
        String CHECK_FIRST_NAME = "regular.expression.for_firstName";
        String CHECK_SECOND_NAME = "regular.expression.for_secondName";
        String CHECK_PHONE_NUMBER = "regular.expression.for_phoneNumber";
        String CHECK_BIRTHDAY = "regular.expression.for_birthday";
        String CHECK_ADDRESS = "regular.expression.for_address";
    }
    interface Errors{
        String EMPTY_JOURNAL_ERROR = "error.empty_journal";
    }
}
