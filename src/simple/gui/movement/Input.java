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
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;

public class Input {
    private static boolean wPressed = false;
    private static boolean sPressed = false;
    private static boolean aPressed = false;
    private static boolean dPressed = false;
    public static boolean isWPressed() {
        synchronized (Input.class) {
            return wPressed;
        }
    }
    public static boolean isSPressed() {
        synchronized (Input.class) {
            return sPressed;
        }
    }
    public static boolean isAPressed() {
        synchronized (Input.class) {
            return aPressed;
        }
    }
    public static boolean isDPressed() {
        synchronized (Input.class) {
            return dPressed;
        }
    }

    public static void main(String[] args) {
        KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(new KeyEventDispatcher() {
            // Java Event Black Magic
            @Override
            public boolean dispatchKeyEvent(KeyEvent ke) {
                synchronized (Input.class) {
                    switch (ke.getID()) {
                    case KeyEvent.KEY_PRESSED:
                    switch (ke.getKeyCode()) {
                        case KeyEvent.VK_W:
                            wPressed = true;
                            break;
                        case KeyEvent.VK_S:
                            sPressed = true;
                            break;
                        case KeyEvent.VK_A:
                            aPressed = true;
                            break;
                        case KeyEvent.VK_D:
                            dPressed = true;
                            break;
                        default:
                            break;
                    }
                        break;

                    case KeyEvent.KEY_RELEASED:
                    switch (ke.getKeyCode()) {
                        case KeyEvent.VK_W:
                            wPressed = false;
                            break;
                        case KeyEvent.VK_S:
                            sPressed = false;
                            break;
                        case KeyEvent.VK_A:
                            aPressed = false;
                            break;
                        case KeyEvent.VK_D:
                            dPressed = false;
                            break;
                        default:
                            break;
                    }
                        break;
                    }
                    return false;
                }
            }
        });
    }
}