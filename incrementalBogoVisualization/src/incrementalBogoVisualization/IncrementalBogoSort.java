package incrementalBogoVisualization;

import java.util.ArrayList;
import java.util.Collections;


public class IncrementalBogoSort {
	
	public ArrayList<Integer> array;
	public int[] numsorts;
	
	public void initialize(int size) {
		// only for starting things off, keep even if we change the sort
		array = new ArrayList<Integer>();
		numsorts = new int[1];
		for(int i = 0; i<size; i++) {
			array.add(i+1); //1 to size
		}
		Collections.shuffle(array);
	}
	public boolean isSorted() {
		// check if array is sorted
		for(int i = 0; i<array.size()-1; i++) {
			if(array.get(i)>array.get(i+1)) {
				return false;
			}
		}
		return true;
	}
	public void shuffle() {
		//using collections cause im lazy
		numsorts[0]++;
		//System.out.println(numsorts[0]);
		Collections.shuffle(array);
	}
	
}
