package incrementalBogoVisualization;

public class run {

	public static void main(String[] args) {
		
		SortFrame test = new SortFrame();
		InsertionSort sort = new InsertionSort(test,300);
		while(!sort.sortStep()) {
			try {Thread.sleep(20);}catch(Exception e) {}
		}
		test.drawArray(sort);

	}

}
