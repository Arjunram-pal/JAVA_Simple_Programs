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
public class ButtonDemo {
    public static void main(String[] args)
    {
        Frame f=new Frame("Button Demo");
        f.setSize(400,300);
        f.setLayout(new FlowLayout());
        f.add(new Button("OK"));
        f.add(new Button("Cancel"));
        f.setVisible(true);
     }
}
