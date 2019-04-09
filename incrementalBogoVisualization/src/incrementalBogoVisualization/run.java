package incrementalBogoVisualization;

public class run {

	public static void main(String[] args) {
		
		IncrementalBogoSort sort = new IncrementalBogoSort();
		sort.initialize(14);
		SortFrame test = new SortFrame();
		while(!sort.isSorted()) {
			test.drawArray(sort.array,sort.numsorts);
			//try {Thread.sleep(100);}catch(Exception e) {}
			sort.shuffle();
		}
		test.drawArray(sort.array,sort.numsorts);

	}

}
