/**
Sorting Methods
*/

public class Sorter<T extends Comparable<T>>{
	
	/**Method sorts objects using selection sort algorithm.
	@param list List of comparable objects.
	*/
	public void selectionSort(T[] list){
		int min;
		T temp;

		for (int index = 0; index < list.length-1; index++){
			min = index;
			for (int scan = index+1; scan < list.length; scan++)
		    	if (list[scan].compareTo(list[min]) < 0)
					min = scan;

			// Swap the values
			temp = list[min];
			list[min] = list[index];
			list[index] = temp;
	    }
	}

	/**Method sorts objects insertion sort algorithm.
	@param list List of comparable objects.
	*/
	public void insertionSort(T[] list){
		T temp;
		int scan;

		for (int index = 1; index < list.length; index++){
			temp = list[index];
			scan = index-1;
			while (scan >= 0 && list[scan].compareTo(temp) > 0){
				list[scan+1] = list[scan];
				scan--;
			}
			list[scan+1] = temp;
	    }
	}
	
}