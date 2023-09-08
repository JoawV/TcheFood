/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package drws.library;

import drws.library.swing.MainFrame;

/**
 *
 * @author drws
 */
public class App {
    public static BancoDados bancoDados = new BancoDados();
    
    public static void main(String[] args) {
        Options.changeTheme(Options.selectedTheme);
        MainFrame mainFrame = new MainFrame(bancoDados);
        mainFrame.setSize(795, 435);
        mainFrame.setVisible(true);
    }
}
