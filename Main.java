import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	
	public static void main(String[] args) {
		
		Integer arrayToSort[] = { 9, 179, 139, 38, 10, 5, 36 };
		ArrayList<Integer> arrayListToSort = new ArrayList<Integer>(Arrays.asList(arrayToSort));
		
		/* arrayListToSort is sorted in place */
		sort(arrayListToSort);
		System.out.println("Sorted list: " + arrayListToSort.toString());
	}

	private static void sort(ArrayList<Integer> list) {
		
		Integer maxElem = Collections.max(list);
		String maxElemString = maxElem.toString();
		int maxElemNumDigits = maxElemString.length();
		
		/* Instantiate 10 queues. (LinkedList implements Queue interface) */
		ArrayList<Queue<Integer>> queues = new ArrayList<Queue<Integer>>(10);
		for (int i = 0; i <= 9; ++i) {
			queues.add(new LinkedList<Integer>());
		}
		
		int power = 1;
		for (int step = 0; step < maxElemNumDigits; step++) {
			
			for (Integer elem : list) {
				
				int currentStepDigit = (elem.intValue() / power) % 10;
				queues.get(currentStepDigit).add(elem);
			}
			
			int numElems = 0;
			for (int i = 0; i <= 9; ++i) {
				
				while (!queues.get(i).isEmpty()) {
					list.set(numElems++, queues.get(i).remove());
				}
			}
			
			power *= 10;
		}	
	}
}
