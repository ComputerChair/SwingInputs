/*
 * gcDataTechnology Research, Learn, Develop, Deploy, Repeat
 * 
 * 
 */

package swinginputs;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



/**
 *
 * @author gcDataTechnology
 */
public class AdamTester {
    private JFrame mainFrame;
    private JPanel controlPanel;
    private JLabel header;
    private JButton button;
    private KeyListener keyboard;
    
    public AdamTester(){
        init();
        
    }
    private void init(){
        mainFrame = new JFrame();
        mainFrame.setSize(400, 400);
        controlPanel = new JPanel();
        keyboard = new AdamKeyboard();
        header = new JLabel("This is a Heaader",JLabel.CENTER);
        button = new JButton("ADAM");
        button.setSize(20, 20);
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
               System.exit(0);
            }        
         });
       
        button.addKeyListener(keyboard);
        controlPanel.add(button);
        controlPanel.add(header);
        mainFrame.add(controlPanel);
        //mainFrame.add(button);
        mainFrame.setVisible(true);  
    }
    public void showWindow(){
        
        header.setText("This is a header");
        
        //controlPanel.setFocusTraversalKeysEnabled(false);
        button.setFocusable(true);
        button.requestFocus();
        mainFrame.setVisible(true);
    }
}
