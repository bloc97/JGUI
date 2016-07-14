/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple.gui.movement;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

/**
 *
 * @author bowen
 */
public class Main {
    
    static JFrame GUI;
    static JPanel PANEL;
    static float SPEED = 0.0008F;
    //static ArrayList<Object> objects;
    
    public static void initObjects(ArrayList<Object> objects){
        
    }
    
    public static void updateObjects(ArrayList<Object> objects){
        for (Object object: objects){
            object.updateObjectDisplay();
            }
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Object> objects = new ArrayList<>();
        Input.main(args);
        
        Main.GUI = Gui.initGUI();
        Main.PANEL = Gui.initPanel();
        
        Object test1 = new Object(0, 0, false, "A");
        Object test2 = new Object(72, 18, false, "B");
        Player player = new Player(200, 200, "[]");
        
        objects.add(test1);
        objects.add(test2);
        
        Gui.displayGUI(Main.GUI, Main.PANEL, 400, 400);
        
        for (Object object: objects){
            object.initObjectDisplay();
        }
        
        player.initObjectDisplay();
        Random random = new Random();
        
        
        while (true){
            
            player.updateInput();
            player.updateObjectDisplay();
            
            test1.setPosx(random.nextInt(400));
            test1.setPosy(random.nextInt(400));
        
            updateObjects(objects);
        
        }
    }
    
}
