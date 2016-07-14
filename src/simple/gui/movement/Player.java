/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple.gui.movement;

import javax.swing.JLabel;
import static simple.gui.movement.Main.SPEED;

/**
 *
 * @author bowen
 */
public class Player extends Object {
    
    

    public Player(float posx, float posy, String text) {
        this.posx = posx;
        this.posy = posy;
        this.isBox = false;
        this.text = text;
    }
    
    public void updateInput() {
        if (Input.isWPressed()){
            this.posy=this.posy-SPEED;
        }
        if (Input.isSPressed()){
            this.posy=this.posy+SPEED;
        }
        if (Input.isAPressed()){
            this.posx=this.posx-SPEED;
        }
        if (Input.isDPressed()){
            this.posx=this.posx+SPEED;
        }
    }

    
}
