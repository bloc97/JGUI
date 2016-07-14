/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple.gui.movement;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

/**
 *
 * @author bowen
 */
public class Gui extends JPanel {

    
    public static JFrame initGUI(){ 
         JFrame frame = new JFrame("Plotter"); 
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
         return frame; 
     } 
      
     public static JPanel initPanel(){ 
         JPanel content = new JPanel(); 
         content.setOpaque(true); 
         content.setBackground(Color.WHITE); 
         content.setLayout(null); 
         return content; 
     } 

    public static void displayGUI(JFrame frame, JPanel panel, int XSIZE, int YSIZE){ 
         frame.setContentPane(panel); 
         frame.setSize(XSIZE, YSIZE); 
         frame.setLocationByPlatform(true); 
         frame.setVisible(true);    
     } 
    
    public static void newLabel(){
        JLabel label = new JLabel();
        Main.PANEL.add(label);
    }
    
    public static void newLabel(String text, int xpos, int ypos){
        JLabel label = new JLabel(text);
        label.setLocation(xpos,ypos);
        label.setSize(30, 30);
        Main.PANEL.add(label);
    }
    


}
