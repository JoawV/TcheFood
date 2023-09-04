/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package drws.library;

import com.formdev.flatlaf.intellijthemes.FlatCarbonIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatDarkPurpleIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatHighContrastIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatMonocaiIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatSolarizedDarkIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatSolarizedLightIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatLightFlatIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatGrayIJTheme;
import java.awt.Color;

/**
 *
 * @author drws
 */
public class Options {
    public static int selectedTheme = 0;
    public static Color[] colors = {Color.decode("#3a384d"), null, Color.decode("#fdf6e3"), Color.decode("#1b4854"), Color.decode("#2d2a2f"), Color.decode("#172030"), Color.white, null, null};
    public static Color textFieldcolor = colors[0];
    
    
    public static void changeTheme(int theme) {
        textFieldcolor = colors[theme];
        
        switch (theme) {
            case 0:
                FlatDarkPurpleIJTheme.setup();
                break;
            case 1:
                FlatHighContrastIJTheme.setup();
                break;
            case 2:
                FlatSolarizedLightIJTheme.setup();
                break;
            case 3:
                FlatSolarizedDarkIJTheme.setup();
                break;
            case 4:
                FlatMonocaiIJTheme.setup();
                break;
            case 5:
                FlatCarbonIJTheme.setup();
                break;
            case 6:
                FlatLightFlatIJTheme.setup();
                break;
            case 7:
                FlatGrayIJTheme.setup();
                break;
            default:
                break;
        }
    }
}
