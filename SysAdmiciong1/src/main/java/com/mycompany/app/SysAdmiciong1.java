/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.app;

import com.mycompany.app.gui.GUIMain;
import com.mycompany.app.util.UtilsX;
import java.util.prefs.Preferences;

/**
 *
 * @author Data_Science
 */
public class SysAdmiciong1 {

    static Preferences userPrefs = Preferences.systemRoot();

    public static void main(String[] args) {
        userPrefs.put("IDIOMAX", new UtilsX().readLanguageFile());
        userPrefs.put("PERFIL", "Admin");
        new GUIMain().setVisible(true);
        
        System.out.println("Hello World!");
    }
}