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
    static boolean FOLLOW = true;
    //static ArrayList<Object> objects;
    
    public static void initObjects(ArrayList<Object> objects){
        
    }
    
    public static void updateObjects(ArrayList<Object> objects){
        for (Object object: objects){
            object.updateObjectDisplay();
            }
        
    }
    
    public static void updateObjectsTranslated(ArrayList<Object> objects, Player player){
        for (Object object: objects){
            object.updateObjectDisplayTranslated(player);
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
        Object test2 = new Object(172, 18, false, "B");
        Object test3 = new Object(22, 172, false, "C");
        Object test4 = new Object(293, 118, false, "D");
        objects.add(test1);
        objects.add(test2);
        objects.add(test3);
        objects.add(test4);
        
        Random random = new Random();
        
        if (Main.FOLLOW==false){
            Player player = new Player(200, 200, "[ ]");
            player.initObjectDisplay();
        
            Gui.displayGUI(Main.GUI, Main.PANEL, 400, 400);
        
            for (Object object: objects){
                object.initObjectDisplay();
            }
        
            while (true){
                player.updateInput();
            
                test1.setPosx(test1.getPosx()+(random.nextFloat()-0.5F)*0.1F);
                test1.setPosy(test1.getPosy()+(random.nextFloat()-0.5F)*0.1F);
                updateObjects(objects);
                player.updateObjectDisplay();
            }
        
        
        }
        
        else{
            Player player = new Player(0, 0, "[]");
            Immobile iplayer = new Immobile(200, 200, "[ ]");
            iplayer.initObjectDisplay();
            
            Gui.displayGUI(Main.GUI, Main.PANEL, 400, 400);
        
            for (Object object: objects){
                object.initObjectDisplay();
                }
            
            while (true){
                player.updateInput();
            
                test1.setPosx(test1.getPosx()+(random.nextFloat()-0.5F)*0.1F);
                test1.setPosy(test1.getPosy()+(random.nextFloat()-0.5F)*0.1F);
                updateObjectsTranslated(objects, player); 
            }
            
        }
        
    }
    
}
