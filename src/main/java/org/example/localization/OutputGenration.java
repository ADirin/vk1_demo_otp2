package org.example.localization;

import java.util.Locale;
import java.util.ResourceBundle;

public class OutputGenration {
    public void printTheLanguage (String language, String country){
        Locale myLocale = new Locale(language, country);
        ResourceBundle rb = ResourceBundle.getBundle("MessagesBundle", myLocale);
        System.out.println(rb.getString("wish"));
        System.out.println(rb.getString("greeting"));

    }

}
