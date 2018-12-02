/*
 * gcDataTechnology Research, Learn, Develop, Deploy, Repeat
 * 
 * 
 */

package swinginputs;

import java.awt.Component;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Set;
import javax.swing.JButton;

/**
 *
 * @author gcDataTechnology
 */
public class AdamKeyboard implements KeyListener, InterfaceAdam {
    Component myComponent;
    double incrementBy = 10;
    public AdamKeyboard(){
        System.out.println("keyboard created ");
    }

    
    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("key typed " + e.getKeyChar());
        
        switch( e.getKeyChar()) {
            case 'w':
            case 'W':
                moveForward(e.getComponent());
                break;
            case 's':
            case 'S':
                 moveBackward(e.getComponent());
                break;
            case 'a':
            case 'A':
                 moveLeft(e.getComponent());
                break;
            case 'd':
            case 'D':
                 moveRight(e.getComponent());
                break;
            default: break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("key pressed " + e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("key released " + e.getKeyChar());
    }
    
    private void moveLeft(Component c){
        Point compPoint;
        double x;
        double y;
        myComponent = c;
        compPoint = myComponent.getLocation();
        x = compPoint.getX();
        y = compPoint.getY();
        x -= 10;
        compPoint.setLocation(x, y);
        myComponent.setLocation(compPoint);
    }
    private void moveRight(Component c){
        Point compPoint;
        double x;
        double y;
        myComponent = c;
        compPoint = myComponent.getLocation();
        x = compPoint.getX();
        y = compPoint.getY();
        x += 10;
        compPoint.setLocation(x, y);
        myComponent.setLocation(compPoint);
    }
    private void moveForward(Component c){
        Point compPoint;
        double x;
        double y;
        myComponent = c;
        compPoint = myComponent.getLocation();
        x = compPoint.getX();
        y = compPoint.getY();
        y -= 10;
        compPoint.setLocation(x, y);
        myComponent.setLocation(compPoint);
        
    }
    private void moveBackward(Component c){
        System.out.println("move backward " + c.getLocation());
        Point compPoint;
        myComponent = c;
        compPoint = myComponent.getLocation();
        compPoint.setLocation(compPoint.getX(), incrementValue(compPoint.getY(),10));
        myComponent.setLocation(compPoint);
        
    }

    @Override
    public double incrementValue(double d, double a) {
        return d + a;
    }

    @Override
    public double decrementValue(double d, double a) {
        return d -a;
    }
    
}
