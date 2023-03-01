/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traffic.signal;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


// extend jframe and implement itemlistener
public class TrafficSignal extends JFrame implements ItemListener{
    JRadioButton rb1;
    JRadioButton rb2;
    JRadioButton rb3;
    
    JTextField tf=new JTextField(10);
    ButtonGroup bg=new ButtonGroup();
    String msg="";
    
    int x=0,y=0,z=0;
    
    TrafficSignal(){
        
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(3);
        setTitle("Traffic Signal");
        rb1=new JRadioButton("Red");
        rb2=new JRadioButton("Yellow");
        rb3=new JRadioButton("Green");
        
        rb1.addItemListener(this);
        rb2.addItemListener(this);
        rb3.addItemListener(this);
        
       
        this.add(rb1);
        this.add(rb2);
        this.add(rb3);
       
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);
        
        this.add(tf);
        
    }       
    public static void main(String[] args) {
 TrafficSignal ts=new TrafficSignal();

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
     
        if(e.getSource()==rb1){
        if(e.getStateChange()==1)

        {
          msg="STOP";
          x=1;
          
          repaint();
        }
        else
            msg="";
            
            }
if(e.getSource()==rb2){
        if(e.getStateChange()==1)

        {
          msg="Get Ready To Go";
          y=1;
          
          repaint();
        }
        else
            msg="";
            
            } 

if(e.getSource()==rb3){
        if(e.getStateChange()==1)

        {
          msg="GO";
          z=1;
          
          repaint();
        }
        else
            msg="";
            
            }
    tf.setText(msg);
    
    
    }
    public void paint(Graphics g)
    {
        g.drawRect(100, 105, 110, 270);
        g.drawOval(120, 150, 60, 60);
        g.drawOval(120, 230, 60, 60);
        g.drawOval(120, 300, 60, 60);
 
        //Red
        if (x == 1) {
            g.setColor(Color.RED);
            g.fillOval(120, 150, 60, 60);
            g.setColor(Color.WHITE);
            g.fillOval(120, 230, 60, 60);
            g.setColor(Color.WHITE);
            g.fillOval(120, 300, 60, 60);
            x = 0;
        }
 
        //Yellow
        if (y == 1) {
            g.setColor(Color.WHITE);
            g.fillOval(120, 150, 60, 60);
            g.setColor(Color.YELLOW);
            g.fillOval(120, 230, 60, 60);
            g.setColor(Color.WHITE);
            g.fillOval(120, 300, 60, 60);
            y = 0;
        }
 
        //Green
        if (z == 1) {
            g.setColor(Color.WHITE);
            g.fillOval(120, 150, 60, 60);
            g.setColor(Color.WHITE);
            g.fillOval(120, 230, 60, 60);
            g.setColor(Color.GREEN);
            g.fillOval(120, 300, 60, 60);
            z = 0;
}
    }  }
