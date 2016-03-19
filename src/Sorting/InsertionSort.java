package Sorting;

public class InsertionSort {
	/**
	 * insertionSort			sorts an array of integers using insertion sort
	 * 
	 * @param array		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
  public static int[] insertionSort(int array[]) {
    int len = array.length;
    for (int i=1; i<len; i++) {
      int n = array[i];
      int j = i-1;
      while ((j>=0) && (array[j]>n)) {
        array[j+1] = array[j];
        j--;
      }
      array[j+1] = n;
    }
    return array;
  }
}
