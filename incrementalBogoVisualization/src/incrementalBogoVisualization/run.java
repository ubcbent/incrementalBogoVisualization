package incrementalBogoVisualization;

public class run {

	public static void main(String[] args) {
		
		InsertionSort sort = new InsertionSort();
		sort.initialize(300);
		SortFrame test = new SortFrame();
		while(!sort.sortStep()) {
			test.drawArray(sort);
			try {Thread.sleep(20);}catch(Exception e) {}
			//sort.smartbogo();
		}
		test.drawArray(sort);

	}

}
