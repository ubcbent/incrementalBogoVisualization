package incrementalBogoVisualization;

import java.util.ArrayList;
import java.util.Collections;

public class InsertionSort extends Sort{
	
	private ArrayList<Integer> sorted;
	private ArrayList<Integer> unsorted;
	
	public InsertionSort(SortFrame f, int size) {
		super(f, size);
		
		// in insertion sort we also should initialize the sorted and unsorted portions
		sorted = new ArrayList<Integer>();
		sorted.add(array.get(0));
		unsorted = new ArrayList<Integer>();
		for(int i = 1; i<array.size();i++) {
			unsorted.add(array.get(i));
		}
	}
	
	/** currently displays between each full placement (wont show the element moving into place)
	 * on each given frame, the compared (red) elements will actually be the last place an element was placed
	 * as well as the next element to be placed.
	 * This sort of fails to achieve the purpose (showing compared elements) but at a high speed it looks fine.
	 * (don't tell anyone, shh)
	 */
	public boolean sortStep() {
		// terminate when done
		if(unsorted.size()==0) {
			return true;
		}
		
		nummoves++;
		// perform one step of the sort
		int val = unsorted.remove(0);
		int index = sorted.size();
		comparingIndex[0] = index+1;
		for(;index>0;index--) {
			if(val>sorted.get(index-1)) {break;}
		}
		comparingIndex[1] = index;
		sorted.add(index, val);
		
		array = new ArrayList<Integer>();
		array.addAll(sorted);
		array.addAll(unsorted);
		frame.drawArray(this);
		
		return false;
	}
	
}
