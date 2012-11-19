import java.util.Random;

public class Main {
	
	public static void main(String [] args){
		
		for(int m = 0; m < 10; m++){
		
			int[] testArr = new int[10];
			
			Random generator = new Random();
			System.out.println("BEFORE");
			System.out.print("[");
			for(int i = 0; i < testArr.length; i++){
				testArr[i] = generator.nextInt(10);
	
				System.out.print(testArr[i] + " ");
			}
			System.out.print("]");
			System.out.println();
			Quicksort sortnonesense = new Quicksort();
			sortnonesense.sort(testArr);
			
			System.out.println("AFTER");
			System.out.print("[");
			
			for(int i = 0; i < testArr.length; i++){
	
				System.out.print(testArr[i] + " ");
			}
			System.out.print("]");
			
			System.out.println("\n");
		}
	}
}
