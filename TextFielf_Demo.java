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
public class TextFielf_Demo {
    public static void main(String[] args)
    {
        Frame f=new Frame();
        f.setLayout(new FlowLayout());
        f.add(new Label("Name"));
        f.add(new TextField());
        f.setVisible(true);
    }
    
}
