/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple.gui.movement;

import jdk.nashorn.internal.runtime.JSType;

/**
 *
 * @author bowen
 */
public class Player extends Object {
    
    double pposx;
    double pposy;

    public Player(double pposx, double pposy, String text) {
        this.pposx = pposx;
        this.pposy = pposy;
        this.isBox = false;
        this.text = text;
    }
  
    @Override
    public void displayObjectUpdate(){
        Gui.updateLabel(aLabel, (int)pposx, (int)pposy);
    }

    public double getPposx() {
        return pposx;
    }

    public void setPposx(double pposx) {
        this.pposx = pposx;
    }

    public double getPposy() {
        return pposy;
    }

    public void setPposy(double pposy) {
        this.pposy = pposy;
    }
    
}
