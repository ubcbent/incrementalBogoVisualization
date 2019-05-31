package incrementalBogoVisualization;

import javax.swing.*;
import java.awt.Color;
import java.util.ArrayList;

public class SortFrame{
	JFrame window;
	DrawVal draw;
	private static int width = 1500;
	private static int height = 700;
	
	public SortFrame() {
		// dumb stuff
		ArrayList<Integer> temp = new ArrayList<Integer>();
		temp.add(1);
		System.out.println("construct");
		draw  = new DrawVal(temp,width,height,0);
		window = new JFrame();
		window.setResizable(false);
		window.setTitle("BogoSort");
		window.getContentPane().setBackground(Color.black);
		window.setSize(width, height);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(draw);
		window.setVisible(true);
	}
	
	public void drawArray(Sort b) {
		draw.a = b.array;
		draw.nummoves = b.nummoves;
		draw.numcorrect = b.numcorrect; // for green elements
		draw.comparingIndex = b.comparingIndex;
		window.add(draw);
		window.repaint();
	}
}

