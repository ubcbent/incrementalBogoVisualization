package incrementalBogoVisualization;

import javax.swing.*;
import java.awt.*;

public class DrawVal extends JPanel{
	
	private int[] a;
	private int width;
	private int height;
	private int[] numsorts;
	
	public DrawVal(int[] a, int width, int height, int[] numsorts) {
		this.a = a;
		this.width = width;
		this.height = height;
		this.numsorts = numsorts;
		this.setBackground(Color.black);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
	   super.paintComponent(g);
	   g.setColor(Color.white);
	   // draw the rectangles here
	   int w = width/a.length-1;
	   for(int i = 0; i<a.length; i++) {
			int x = i+w*i;
			int y = height-(int)(((double)a[i]/(double)a.length)*((double)height-200.0));
			int h = a[i]*((int)((height-200)/a.length));
			g.fillRect(x, y, w, h);
		}
	   g.drawString("Total Shuffles: "+this.numsorts[0], 10, 15);
	   g.drawString("Number of Elements: "+a.length, 10, 30);
	   
	}

}
