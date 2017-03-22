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
public class ImageGenerator {
    
    public enum SimpleImage {CROSS, CIRCLE, SQUARE};
    
    public int imgWidth;
    
    public int imgHeight;
    
    public final static int DEFAULT_IMAGE_SIZE = 25;

    public ImageGenerator() {
        this.imgHeight = DEFAULT_IMAGE_SIZE;
        this.imgWidth = DEFAULT_IMAGE_SIZE;
    }
    
    public Image generate(SimpleImage imageType){
        Image img = null;
        switch (imageType) {
            case CROSS:
                img = createCrossImage();
                break;
            case CIRCLE:
                img = createCirCleImage();
                break;
            case SQUARE:
                img = createSquareImage();
                break;
            default:
                throw new IllegalArgumentException("Image generate error: Unknow image type");
        }
        
        return img;
    }
    
    private Image createCrossImage() {
        Image img = new Image(imgWidth, imgHeight);
        
        int middleX = imgWidth / 2;
        int middleY = imgHeight / 2;
        
        img.drawLine(0, middleY, imgWidth, middleY);
        img.drawLine(middleX, 0, middleX, imgHeight);
        
        return img;
    }

    private Image createCirCleImage() {
        Image img = new Image(imgWidth, imgHeight);

        img.drawOval(0, 0, imgWidth, imgHeight);
        
        return img;
    }

    private Image createSquareImage() {
        Image img = new Image(imgWidth, imgHeight);

        img.drawRect(imgWidth/4, imgHeight/4, imgWidth/2, imgHeight/2);
        
        return img;
    }

    public int getImgWidth() {
        return imgWidth;
    }

    public void setImgWidth(int imgWidth) {
        this.imgWidth = imgWidth;
    }

    public int getImgHeight() {
        return imgHeight;
    }

    public void setImgHeight(int imgHeight) {
        this.imgHeight = imgHeight;
    }

}
