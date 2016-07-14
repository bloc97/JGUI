/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple.gui.movement;

import javax.swing.*;

/**
 *
 * @author bowen
 */
public class Main {
    
    static JFrame GUI;
    static JPanel PANEL;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Main.GUI = Gui.initGUI();
        Main.PANEL = Gui.initPanel();
        
        Object test1 = new Object(0, 0, false, "A");
        Object test2 = new Object(72, 18, false, "B");
        
        test1.displayObject();
        test2.displayObject();
        
        Gui.displayGUI(Main.GUI, Main.PANEL, 400, 400);
        
    }
    
}
