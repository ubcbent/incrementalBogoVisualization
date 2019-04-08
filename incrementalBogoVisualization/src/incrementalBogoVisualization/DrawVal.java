package incrementalBogoVisualization;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DrawVal extends JPanel{
	
	public ArrayList<Integer> a;
	public int width;
	public int height;
	public int[] numsorts;
	
	public DrawVal(ArrayList<Integer> a, int width, int height, int[] numsorts) {
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
	   //System.out.println(a.size());
	   //System.out.println(a);
	   //System.out.println(width);
	   int w = width/a.size()-1;
	   for(int i = 0; i<a.size(); i++) {
			int x = i+w*i;
			int y = height-(int)(((double)a.get(i)/(double)a.size())*((double)height-200.0));
			int h = a.get(i)*((int)((height-200)/a.size()));
			g.fillRect(x, y, w, h);
		}
	   //System.out.println(a);
	   g.drawString("Total Shuffles: "+this.numsorts[0], 10, 15);
	   g.drawString("Number of Elements: "+a.size(), 10, 30);
	   
	}

}
