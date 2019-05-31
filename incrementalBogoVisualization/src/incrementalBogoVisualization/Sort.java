package incrementalBogoVisualization;

import java.util.ArrayList;
import java.util.Collections;

public abstract class Sort {
	
	public SortFrame frame;
	public ArrayList<Integer> array;
	public double nummoves;
	public double numcomparisons;
	public int[] comparingIndex;
	public int numcorrect;
	
	public Sort(SortFrame f, int size) {
		frame = f;
		
		// only for starting things off, keep even if we change the sort
		array = new ArrayList<Integer>();
		comparingIndex = new int[] {-1,-1};
		numcorrect = 0;
		nummoves = 0;
		numcomparisons = 0;
		for(int i = 0; i<size; i++) {
			array.add(i+1); //1 to size
		}
		Collections.shuffle(array);
	}
	
}
