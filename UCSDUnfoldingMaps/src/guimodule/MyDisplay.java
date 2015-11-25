package guimodule;
import processing.core.PApplet;

public class MyDisplay extends PApplet {
	
	public void setup()
	{
		size(600, 600);
		background(170, 63, 57);
		
	}

	public void draw()
	{
		ellipse(width/2, height/2, 300, 300);
	}
}
