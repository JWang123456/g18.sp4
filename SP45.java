package cs6301.g18;

public class SP45 {
	 /*void rearrangeMinusPlus(int[] arr) { 
		 for(int a=0 ; a<arr.length ; a++ ){
			 if(arr[a] < 0){
				 int b = 0;
				 while(arr[b]<0 ){
					 b++;
				 }
				 int temp = arr[a];
				 for(int c=a-1 ; c<=b ; c--){
					 arr[c+1] = arr[c];
				 }
				 arr[b] = temp;
			 }
		 }
	 }*/
	 void rearrangeMinusPlus(int[] arr){ 
		 sort(arr, 0, arr.length-1);
	 }
	 int sort(int arr[], int p, int r){
		 int q = (p+r) / 2;
		 int frontPointer = sort(arr, p, q);
		 int backPointer = sort(arr, q+1, r);
		 int pointer = merge(arr, p, r, q, frontPointer, backPointer);
		 return pointer;
	 }
	 // The backPointer and front... indicate the first positive number
	 int merge(int[] arr, int p, int r, int q, int frontPointer, int backPointer){
		 for(int i=q+1 ; i<backPointer ; i++){
			 int temp = arr[i];
			 for(int j=i-1 ; j>frontPointer ; j--){
				 arr[j] = arr[j-1];
			 }
			 arr[frontPointer] = temp;
		 }
		 return frontPointer + backPointer - q-2;
	 }
	 
	 public static void main(String args[]){
		 int[] newArray = {};
		 SP45 newProgram = new SP45();
		 newProgram.rearrangeMinusPlus(newArray);
		 System.out.println(newArray.toString());
		 
	 }
}
