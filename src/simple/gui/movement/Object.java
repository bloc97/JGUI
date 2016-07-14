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
    String text;
    
    public Object(){
        this.posx=0;
        this.posy=0;
        this.isBox=false;
        this.text="";
    }
    
    public Object(int posx, int posy) {
        this.posx=posx;
        this.posy=posy;
        this.isBox=false;
        this.text="";
    }

    public Object(int posx, int posy, boolean isBox, String text) {
        this.posx = posx;
        this.posy = posy;
        this.isBox = isBox;
        this.text = text;
    }
    
    public void displayObject(){
        if (this.isBox) { // Not yet created box label.
            Gui.newLabel(Main.PANEL, this.text, this.posx, this.posx);
        }
        else{
            Gui.newLabel(Main.PANEL, this.text, this.posx, this.posx);
        }
        
    }
    
    public void displayTranslatedObject(Player player){
        Gui.newLabel(Main.PANEL, this.text, this.posx+player.posx, this.posx+player.posy);
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
