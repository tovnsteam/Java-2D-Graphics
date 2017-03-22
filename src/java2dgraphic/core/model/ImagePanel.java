package java2dgraphic.core.model;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class ImagePanel extends JPanel {
	private BufferedImage bufferedImage;
	private int width;
	private int height;

	private void generateRandomPixel() {
		ImageGenerator g = new ImageGenerator();
		g.imgHeight = 25;
		g.imgWidth = 25;
		
		Image img = g.generate(ImageGenerator.SimpleImage.CIRCLE);
		
//		ImageScale imageScale = new ImageScale(2, 2);
//		imageScale.setImage(img);
//		imageScale.transform();
		
		ImageTransit transitImage = new ImageTransit(10, 10);
		transitImage.setImage(img);
		Image img2 = transitImage.transform();
		

		bufferedImage = transitImage.getImage().image;
		
//		bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
//		for (int y = 0; y < bufferedImage.getHeight(); y++) {
//			for (int x = 0; x < bufferedImage.getWidth(); x++) {
//				int a = (int) (Math.random() * 256); // alpha
//				int r = (int) (Math.random() * 256); // red
//				int g = (int) (Math.random() * 256); // green
//				int b = (int) (Math.random() * 256); // blue
//
//				int p = (a << 24) | (r << 16) | (g << 8) | b; // pixel
//
//				bufferedImage.setRGB(x, y, p);
//			}
//		}
	}

	public ImagePanel(int width, int height) {
		
		super();
		this.width = width;
		this.height = height;
		generateRandomPixel();
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public void paintComponent(Graphics g){
        super.paintComponent(g);
        if(bufferedImage != null){
            g.drawImage(bufferedImage, 0, 0, this);
        }
    }
}
