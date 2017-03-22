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
public class ImageTransit implements ImageTransform {

    Image img;
    
    private int x;
    
    private int y;
    
    @Override
    public Image transform() {
        if (img == null) {
            throw new NullPointerException("Transformation error: Image source not set");
        }
        this.img.transit(x, y);
        return img.clone();
    }

    @Override
    public void setImage(Image img) {
        this.img = img;
    }

    public ImageTransit(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
}
