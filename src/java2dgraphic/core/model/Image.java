/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2dgraphic.core.model;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

/**
 *
 * @author toantv
 */
public class Image {
    
    public BufferedImage image;
    
    private Graphics2D drawer;

    public Image(int width, int height) {
        this.image = new BufferedImage(width, height, BufferedImage.TYPE_BYTE_BINARY);
        this.drawer = this.image.createGraphics();
    }
    
    public void drawLine(int x1, int y1, int x2, int y2){
        this.drawer.drawLine(x1, y1, x2, y2);
    }
    
    public void drawOval(int x, int y, int width, int height){
        this.drawer.drawOval(x, y, width, height);
    }
    
    public void drawRect(int x, int y, int width, int height){
        this.drawer.drawRect(x, y, width, height);
    }
    
    public void transit(int x, int y){
        drawer.translate(x, y);
    }
    
    public void scale(double scalex, double scaley)
    {
        drawer.scale(scalex, scaley);
    }
    
    public void rotate(double theta){
        drawer.rotate(theta);
    }
    
    public int getHeight(){
        return this.image.getHeight();
    }
    
    public int getWidth(){
        return this.image.getWidth();
    }
    
    @Override
    public Image clone(){
        Image cloneImage = new Image(this.image.getWidth(), this.image.getHeight());
        BufferedImage b = new BufferedImage(this.image.getWidth(), this.image.getHeight(), this.image.getType());
        Graphics2D cloneDrawer = b.createGraphics();
        cloneDrawer.drawImage(this.image, 0, 0, null);
        
        cloneImage.image = image;
        cloneImage.drawer = cloneDrawer;
        
        return cloneImage;
    }
    
}
