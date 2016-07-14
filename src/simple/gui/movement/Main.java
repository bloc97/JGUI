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
        GUI = Gui.initGUI();
        PANEL = Gui.initPanel();
        
        Gui.displayGUI(GUI, PANEL, 400, 400);
        
    }
    
}
