/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple.gui.movement;


/**
 *
 * @author bowen
 */
public class Object{
    
    int posx;
    int posy;
    boolean isBox;
    
    public Object(int posx, int posy) {
        this.posx=posx;
        this.posy=posy;
        this.isBox=false;
    }

    public Object(int posx, int posy, boolean isBox) {
        this.posx = posx;
        this.posy = posy;
        this.isBox = isBox;
    }
    
    public void displayObject(Object object){
        Gui.newLabel(Main.PANEL, text, posx, posx);
    }

    public int getPosx() {
        return posx;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public int getPosy() {
        return posy;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

    public boolean isIsBox() {
        return isBox;
    }

    public void setIsBox(boolean isBox) {
        this.isBox = isBox;
    }
    
    
    
}
