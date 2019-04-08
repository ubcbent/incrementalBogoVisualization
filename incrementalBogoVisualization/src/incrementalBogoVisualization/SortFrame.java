package incrementalBogoVisualization;

import javax.swing.*;
import java.awt.Color;

public class SortFrame{
	JFrame window;
	DrawVal draw;
	private static int width = 1000;
	private static int height = 700;
	
	public SortFrame() {
		window = new JFrame();
		window.setResizable(false);
		window.setTitle("BogoSort");
		window.getContentPane().setBackground(Color.black);
		window.setSize(width, height);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
	
	public void drawArray(int[] a, int[] numsorts) {
		draw = new DrawVal(a,width,height,numsorts);
		window.add(draw);
		window.repaint();
	}
}

