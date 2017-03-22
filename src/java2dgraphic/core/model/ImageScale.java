/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2dgraphic.core.model;

/**
 *
 * @author toantv
 */
public class ImageScale implements ImageTransform {

    private Image img;
    
    public double scaleX;
    
    public double scaleY;
    
    @Override
    public Image transform() {
        if (img == null) {
            throw new NullPointerException("Transformation error: Image source not set");
        }
        img.scale(scaleX, scaleY);
        return img;
    }

    @Override
    public void setImage(Image img) {
        this.img = img;
    }

    public ImageScale(double scaleX, double scaleY) {
        this.scaleX = scaleX;
        this.scaleY = scaleY;
    }
    
}
