package incrementalBogoVisualization;

import java.util.ArrayList;
import java.util.Collections;

public class IncrementalBogoSort extends Sort{
	
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
		numsorts++;
		//System.out.println(numsorts[0]);
		Collections.shuffle(array);
	}
	
	public void smartbogo() {
		//using collections cause im lazy
		numsorts++;
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
		array = new ArrayList<Integer>();
		
		array.addAll(temp1);
		array.addAll(temp2);
	}
	
}
