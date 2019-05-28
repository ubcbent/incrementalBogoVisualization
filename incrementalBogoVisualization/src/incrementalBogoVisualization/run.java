package incrementalBogoVisualization;

public class run {

	public static void main(String[] args) {
		
		IncrementalBogoSort sort = new IncrementalBogoSort();
		sort.initialize(500);
		SortFrame test = new SortFrame();
		while(!sort.isSorted()) {
			test.drawArray(sort);
			//try {Thread.sleep(500);}catch(Exception e) {}
			sort.smartbogo();
		}
		test.drawArray(sort);

	}

}
