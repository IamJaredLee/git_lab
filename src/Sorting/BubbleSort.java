package Sorting;
public class BubbleSort {
	/**
	 * bubbleSort				sorts an array of integers using bubble sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] bubbleSort(int[] unsortedArray) {
		//TODO: S1 implements bubble sort
		int arrayLength = unsortedArray.size();
		boolean swapped = true;
		int j = 0;
		int temp;
		while(swapped){
			swapped = false;
			j++
			for(int i = 0; i < arrayLength - j; i++){
				if(unsortedArray[i] > unsortedArray[i + 1]){
					temp = unsortedArray[i];
					unsortedArray[i] = unsortedArray[i+1];
					unsortedArray[i + 1] = temp;
					swapped = true;
				}
			}
		}
		return unsortedArray;
	}
}
