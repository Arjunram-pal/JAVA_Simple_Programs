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
public class BorderLaoyout_demo {
    public static void main(String[] args)
    {
        Frame f=new Frame("Border layout");
        f.setSize(200,120);
        f.setLayout(new BorderLayout());
        f.add(new Button("North"),BorderLayout.NORTH);
        f.add(new Button("South"),BorderLayout.SOUTH);
        f.setVisible(true);
        
    }
    
}
