package dev.graphics2d.demo;

import java.awt.EventQueue;

import javax.swing.JFrame;

import dev.graphics2d.model.ImagePanel;

public class TransformDemo extends JFrame {
	public TransformDemo() {
        initUI();
    }
     
    private void initUI() {
         
        setTitle("Rotation");
        add(new ImagePanel(100,100));
 
        setSize(300, 200);
        setLocationRelativeTo(null);        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
 
    public static void main(String[] args) {
 
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
 
            	TransformDemo ex = new TransformDemo();
                ex.setVisible(true);
            }
        });                    
    }
}
