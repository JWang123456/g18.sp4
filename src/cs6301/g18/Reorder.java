package cs6301.g18;

public class Reorder {
	
	void rearrangeMinusPlus(int[] arr) {
		rearrangeMinusPlus(arr, 0, arr.length - 1);
	}
	
	void rearrangeMinusPlus(int[] arr, int i, int j) {
		if(i >= j) return;
		while(arr[i] < 0) i++;
		while(arr[j] > 0) j--;
		int m = i;
		int n = j;
		while(m < n && arr[m] > 0) m++;
		while(m < n && arr[n] < 0) n--;
		insertBack(arr, m, i);
		insertFront(arr, n, j);
		rearrangeMinusPlus(arr, i + 1, j - 1);
	}
	
	void insertBack(int[] arr, int m, int i) {
		int tmp = arr[m];
		
		int[] temp = new int[m - i];
		int p = 0;
		for(int k = i; k < m; k++) {
			temp[p++] = arr[k];
		}
		p = 0;
		for(int k = i + 1; k <= m; k++) {
			arr[k] = temp[p++];
		}
		
		arr[i] = tmp;
	}
	
	void insertFront(int[] arr, int n, int j) {
		int tmp = arr[n];
		
		int[] temp = new int[j - n];
		int p = 0;
		for(int k = j; k > n; k--) {
			temp[p++] = arr[k];
		}
		p = 0;
		for(int k = j - 1; k >= n; k--) {
			arr[k] = temp[p++];
		}
		
		arr[j] = tmp; 
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {6, 7, -5, 17, -10, 3, 4, 5, -9, -1, 30, -2};
		Reorder re = new Reorder();
		re.rearrangeMinusPlus(arr);
		for(int i: arr) {
			System.out.println(i);
		}
	}
}
