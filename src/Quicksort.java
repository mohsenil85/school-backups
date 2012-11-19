public class Quicksort {

	
	private int[] numbersArray;
	private int number;
	
	public void quickSort()
	

	public void sort(int[] arrayToBeSorted) {
		if (arrayToBeSorted == null || arrayToBeSorted.length == 0) {
			return;
		}
		this.numbersArray = arrayToBeSorted;
		number = arrayToBeSorted.length;
		partition(0, (number - 1));
		
	}

	public void partition(int low, int high){
		int i = low;
		int j = high;
		int pivot = numbersArray[low + (high - low) / 2];

		while (i <= j) {
			while (numbersArray[i] < pivot) {
				i++;
			}
			while (numbersArray[j] > pivot) {
				j--;
			}
			if (i <= j) {
				exchange(i, j);
				i++;
				j--;
			}
		}
		
	}
	
	

	private void exchange(int i, int j) {
		int temp = numbersArray[i];
		numbersArray[i] = numbersArray[j];
		numbersArray[j] = temp;
	}
	
//	 SortThread thread1 = new SortThread();
//     SortThread thread2 = new SortThread();
//     // Start threads.
//     thread1.start();
//     thread2.start();
//     // Wait for both threads to stop
//     try {
//         thread1.join();
//     } catch (InterruptedException ignore) {
//     }
//     try {
//         thread2.join();
//     } catch (InterruptedException ignore) {
//     }

}
