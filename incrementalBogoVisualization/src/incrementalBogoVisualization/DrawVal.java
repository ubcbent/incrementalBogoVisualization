package incrementalBogoVisualization;

import javax.swing.*;
import java.awt.*;

public class DrawVal extends JPanel{
	
	private int[] a;
	private int width;
	private int height;
	
	public DrawVal(int[] a, int width, int height) {
		this.a = a;
		this.width = width;
		this.height = height;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
	   super.paintComponent(g);
	   g.setColor(Color.white);
	   // draw the rectangle here
	   int w = width/a.length-1;
	   for(int i = 0; i<a.length; i++) {
			int x = i+w*i;
			int y = height-(int)(((double)a[i]/(double)a.length)*((double)height-200.0));
			int h = a[i]*((int)((height-200)/a.length));
			g.fillRect(x, y, w, h);
		}
	}

}
