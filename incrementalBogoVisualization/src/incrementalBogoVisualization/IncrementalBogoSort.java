package incrementalBogoVisualization;

import java.util.ArrayList;
import java.util.Collections;


public class IncrementalBogoSort {
	
	public int[] array;
	public int[] numsorts;
	
	public void initialize(int size) {
		// only for starting things off, keep even if we change the sort
		ArrayList<Integer> temp = new ArrayList<>();
		array = new int[size];
		numsorts = new int[1];
		for(int i = 0; i<size; i++) {
			temp.add(i+1); //1 to size
		}
		Collections.shuffle(temp);
		
		for(int i = 0; i<size; i++) {
			array[i] = temp.get(i);
		}
		
	}
	public boolean isSorted() {
		// check if array is sorted
		for(int i = 0; i<array.length-1; i++) {
			if(array[i]>array[i+1]) {
				return false;
			}
		}
		return true;
	}
	public void shuffle() {
		//using collections cause im lazy
		numsorts[0]++;
		//System.out.println(numsorts[0]);
		ArrayList<Integer> temp = new ArrayList<>();
		for(int n : array) {
			temp.add(n);
		}
		Collections.shuffle(temp);
		for(int i = 0; i<temp.size(); i++) {
			array[i] = temp.get(i);
		}
	}
	
}
