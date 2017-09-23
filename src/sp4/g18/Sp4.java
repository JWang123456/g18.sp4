package sp4.g18;

public class Sp4 {
	/*[20 points]
   Binary search: in class we saw a version of binary search that returned
   a boolean to indicate whether x occurs in the array or not.
   Rewrite the function to return the index of the largest element that
   is less than or equal to x.

   // Preconditions: arr[0..n-1] is sorted, and arr[0] <= x < arr[n-1].
   // Returns index i such that arr[i] <= x < arr[i+1].*/
   public <T extends Comparable<? super T>> int binarySearch(T[] arr, T x) {
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
}
   



