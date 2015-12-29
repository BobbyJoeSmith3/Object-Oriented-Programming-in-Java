package guimodule;
import processing.core.PApplet;
import processing.core.PImage;

public class MyDisplay extends PApplet {
	//badlands image url
	private String URL = "http://images.boomsbeat.com/data/images/full/40877/39-jpg.jpg";
	private PImage webImg = loadImage(URL, "jpg");
	
	public void setup()
	{
		size(600, 600);
		background(170, 63, 57);
		
		
	}

	public void draw()
	{
		image(webImg, 0, 0);
		ellipse(width/2, height/2, 300, 300);
	}
}
