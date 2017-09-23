package sp4.g18;

import java.util.Arrays;
import java.util.Random;

public class BinarySearch {
	public static <T extends Comparable<? super T>> int binarySearch(T[] arr, T x) {
		   int p = 0;
		   int r = arr.length - 1;
		   int q = 0;
		   while(p <= r) {
				    q = (p+r) >>> 1;
			        int cmp = arr[q].compareTo(x);
			        if(cmp > 0) {
			        	r = q -1;
			        }else if (cmp == 0) {
			        	break;
			        }else {
			        	if(arr[q+1].compareTo(x) > 0) {
			        		break;
			        	}else {
			        		p = q + 1;
			        	}
			        }
		   }
		   return q;
	   }
	
	 public static void main(String[] args) {
		
		//Sp4 s = new Sp4();
		
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
	
		Integer x = 59000;
		System.out.println(binarySearch(iarr, x));
		
	 }
}
