package incrementalBogoVisualization;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DrawVal extends JPanel{
	
	public ArrayList<Integer> a;
	public int width;
	public int height;
	public double numsorts;
	private double start;
	public int numcorrect;
	
	public DrawVal(ArrayList<Integer> a, int width, int height, double numsorts) {
		this.a = a;
		this.width = width;
		this.height = height;
		this.numsorts = numsorts;
		this.setBackground(Color.black);
		this.start = System.currentTimeMillis();
		numcorrect = 0;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
	   super.paintComponent(g);
	   // draw the rectangles here
	   //System.out.println(a.size());
	   //System.out.println(a);
	   //System.out.println(width);
	   int w = width/a.size()-1;
	   for(int i = 0; i<a.size(); i++) {
			int x = i+w*i;
			int y = height-(int)(((double)a.get(i)/(double)a.size())*((double)height-200.0));
			int h = a.get(i)*((int)((height-200)/a.size()));
			g.setColor(Color.white);
			if(i<numcorrect) {g.setColor(Color.green);}
			g.fillRect(x, y, w, h);
		}
	   //System.out.println(a);
	   g.drawString("Total Shuffles: "+String.format("%.0f",numsorts), 10, 15);
	   g.drawString("Number of Elements: "+a.size(), 10, 30);
	   g.drawString("Time Elapsed: "+formatTime(), 10, 45);
	   
	}
	
	private String formatTime() {
		int seconds = (int)((System.currentTimeMillis()-start)/1000.0);
		int minutes = 0;
		int hours = 0;
		if(seconds>=3600) {
			hours = seconds/3600;
			seconds = seconds%3600;
		}
		if(seconds>=60) {
			minutes = seconds/60;
			seconds = seconds%60;
		}
		
		String h = String.valueOf(hours);
		String m = String.valueOf(minutes);
		String s = String.valueOf(seconds);
		if(h.length()==1) {h="0"+h;}
		if(m.length()==1) {m="0"+m;}
		if(s.length()==1) {s="0"+s;}
		return h+":"+m+":"+s;
	}

}
