package utils;

import page.LoginPage;

public class PageInitializer {

    public static LoginPage loginPage;

    public static void initializeObjects(){
        loginPage = new LoginPage();
    }


}
