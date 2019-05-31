package incrementalBogoVisualization;

public class run {

	public static void main(String[] args) {
		
		SortFrame test = new SortFrame();
		InsertionSort sort = new InsertionSort(test,300);
		while(!sort.sortStep()) {
			//test.drawArray(sort);
			try {Thread.sleep(20);}catch(Exception e) {}
			//sort.smartbogo();
		}
		test.drawArray(sort);

	}

}
