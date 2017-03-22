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
public class ImageRotate implements ImageTransform {

    private Image img;
    
    private double theta;
    
    @Override
    public Image transform() {
        if (img == null) {
            throw new NullPointerException("Transformation error: Image source not set");
        }
        this.img.rotate(theta);
        return this.img.clone();
    }

    @Override
    public void setImage(Image img) {
        this.img = img;
    }

    public ImageRotate(double theta) {
        this.theta = theta;
    }
    
}
