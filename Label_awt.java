/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package college_practicals;

/**
 *
 * @author Arjunram Pal
 */
import java.awt.*;
public class Label_awt {
    public static void main(String[] args)
    {
        Frame f=new Frame();
        f.setSize(300,200);
        Label l=new Label("Hello World");
        f.add(l);
        f.setVisible(true);
        
    }
    
}
