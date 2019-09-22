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
public class Gridlayout_Demo {
    public static void main(String[] args)
    {
        Frame f =new Frame();
        Panel p=new Panel();
        f.setLayout(new FlowLayout());
        p.setLayout(new GridLayout());
        f.setSize(400,300);
        p.add(new Label("Login"));
        p.add(new TextField());
        p.add(new Label("Password"));
        TextField pass=new TextField();
        f.setVisible(true);
        
    }
    
}
