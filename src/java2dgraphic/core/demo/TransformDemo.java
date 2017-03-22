package java2dgraphic.core.demo;

import java.awt.EventQueue;
import java2dgraphic.core.model.ImagePanel;

import javax.swing.JFrame;

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
