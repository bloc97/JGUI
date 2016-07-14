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
    static boolean FOLLOW = false;
    //static ArrayList<Object> objects;
    
    public static void initObjects(ArrayList<Object> list){
        for (Object object: list){
                object.initObjectDisplay();
        }
    }
    
    public static void updateObjects(ArrayList<Object> list){
        for (Object object: list){
            object.updateObjectDisplay();
            }
        
    }
    
    public static void updateObjectsTranslated(ArrayList<Object> list, Player player){
        for (Object object: list){
            object.updateObjectDisplayTranslated(player);
            }
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Object> objectlist = new ArrayList<>();
        Input.main(args);
        
        Main.GUI = Gui.initGUI();
        Main.PANEL = Gui.initPanel();
        
        Object test1 = new Object(0, 0, false, "A");
        Object test2 = new Object(172, 18, false, "B");
        Object test3 = new Object(22, 172, false, "C");
        Object test4 = new Object(293, 118, false, "D");
        objectlist.add(test1);
        objectlist.add(test2);
        objectlist.add(test3);
        objectlist.add(test4);
        
        Random random = new Random();
        
        if (Main.FOLLOW==false){
            Player player = new Player(200, 200, "[ ]");
            player.initObjectDisplay();
            initObjects(objectlist);
        
            Gui.displayGUI(Main.GUI, Main.PANEL, 400, 400);
        
            while (true){
                player.updateInput();
            
                test1.setPosx(test1.getPosx()+(random.nextFloat()-0.5F)*0.05F);
                test1.setPosy(test1.getPosy()+(random.nextFloat()-0.5F)*0.05F);
                updateObjects(objectlist);
                player.updateObjectDisplay();
            }
        
        
        }
        
        else{
            Player player = new Player(0, 0, "[]");
            Immobile iplayer = new Immobile(200, 200, "[ ]");
            iplayer.initObjectDisplay();
            initObjects(objectlist);
            
            Gui.displayGUI(Main.GUI, Main.PANEL, 400, 400);
            
            while (true){
                player.updateInput();
            
                test1.setPosx(test1.getPosx()+(random.nextFloat()-0.5F)*0.05F);
                test1.setPosy(test1.getPosy()+(random.nextFloat()-0.5F)*0.05F);
                updateObjectsTranslated(objectlist, player); 
            }
            
        }
        
    }
    
}
