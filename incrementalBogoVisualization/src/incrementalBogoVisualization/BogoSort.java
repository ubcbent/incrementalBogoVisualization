package incrementalBogoVisualization;

import java.util.ArrayList;
import java.util.Collections;

public class BogoSort extends Sort{
	
	public BogoSort(SortFrame f, int size) {
		super(f,size);
	}
	
	public boolean isSorted() {
		// check if array is sorted
		numcorrect = 0;
		for(int i = 0; i<array.size()-1; i++) {
			if(array.get(i)!=i+1) {	//array.get(i)>array.get(i+1) works but we can assume list is incrementing 1 to n
				return false;
			}
			// for smartbogo
			numcorrect++;
		}
		numcorrect++;
		return true;
	}
	public void shuffle() {
		//using collections cause im lazy
		nummoves++;
		//System.out.println(numsorts[0]);
		Collections.shuffle(array);
	}
	
	public void smartbogo() {
		//using collections cause im lazy
		nummoves++;
		// correct part
		ArrayList<Integer> temp1 = new ArrayList<Integer>();
		for(int i = 0; i<numcorrect;i++) {
			temp1.add(array.get(i));
		}
		// incorrect part
		ArrayList<Integer> temp2 = new ArrayList<Integer>();
		for(int i = numcorrect; i<array.size();i++) {
			temp2.add(array.get(i));
		}
		Collections.shuffle(temp2);
		//TODO figure out how to get array.clear() working without messing up the draw thread
		array = new ArrayList<Integer>();
		
		array.addAll(temp1);
		array.addAll(temp2);
	}
	
}
