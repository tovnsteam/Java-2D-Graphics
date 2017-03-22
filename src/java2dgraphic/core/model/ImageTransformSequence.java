/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2dgraphic.core.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author toantv
 */
public class ImageTransformSequence {
    
    private Image img;
    
    private List<ImageTransform> transformSequence;

    private Image currentTransformImg;
    
    private int currentTransform;
    
    public ImageTransformSequence(Image img) {
        this.img = img;
        this.transformSequence = new ArrayList<ImageTransform>();
        this.currentTransformImg = img.clone();
        this.currentTransform = 0;
    }
    
    public void addTransform(ImageTransform transform){
        this.transformSequence.add(transform);
    }
    
    public Image getNextImage(){
        ImageTransform transformer = this.transformSequence.get(currentTransform);
        transformer.setImage(this.img);
        this.currentTransformImg = transformer.transform();
        this.currentTransform ++;
        
        return currentTransformImg;
    }

    public Image getImg() {
        return img;
    }

    public List<ImageTransform> getTransformSequence() {
        return transformSequence;
    }

    public Image getCurrentTransformImg() {
        return currentTransformImg;
    }

    public int getCurrentTransform() {
        return currentTransform;
    }
    
}
