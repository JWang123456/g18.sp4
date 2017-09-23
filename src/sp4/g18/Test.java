package sp4.g18;

import java.util.Arrays;
import java.util.Random;

public class Test {

	public static void main(String[] args) {
		
			Sp4 s = new Sp4();
			
	    	int size = 2000000;
	    	
	    	
			int[] arr = new int[size];
			Integer[] iarr = new Integer[size];
			Random rand = new Random();
			for(int i=0; i<size; i++) {
			    arr[i] = rand.nextInt(size);
			}
			Arrays.sort(arr);

			for(int i=0; i<size; i++) {
			    iarr[i] = new Integer(arr[i]);
			}


			/* Search for many random elements to find time taken */
		
			Integer x = 50000;
			System.out.println(s.binarySearch(iarr, x));
			
	}

}


