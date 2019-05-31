package incrementalBogoVisualization;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DrawVal extends JPanel{
	
	public ArrayList<Integer> a;
	public int width;
	public int height;
	public int[] comparingIndex;
	public double nummoves;
	private double start;
	public int numcorrect;
	
	public DrawVal(ArrayList<Integer> a, int width, int height, double numsorts) {
		this.a = a;
		this.width = width;
		this.height = height;
		comparingIndex = new int[] {-1,-1};
		this.nummoves = numsorts;
		this.setBackground(Color.black);
		this.start = System.currentTimeMillis();
		numcorrect = 0;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
	   super.paintComponent(g);
	   // draw the rectangles here
	   int w = width/a.size();
	   for(int i = 0; i<a.size(); i++) {
		    //get dimensions
			int x = w*i;
			int y = height-(int)(((double)a.get(i)/(double)a.size())*((double)height-230.0)) - 30; // bottom pixels get cut so I pulled all the bars up a bit
			int h = height; //may as well let the bars extend off screen

			//choose colour
			g.setColor(Color.white);
			if(i<numcorrect) {
				g.setColor(Color.green);
			}else if(comparingIndex[0]==i || comparingIndex[1]==i) {
				g.setColor(Color.red);
			}
			g.fillRect(x, y, w, h);
		}
	   //System.exit(0);
	   //System.out.println(a);
	   g.setColor(Color.white);
	   g.drawString("Total Moves: "+String.format("%.0f",nummoves), 10, 15);
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
