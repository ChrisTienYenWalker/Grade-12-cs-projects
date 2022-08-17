package SortingAlgorithmsPractice;

import java.util.Arrays;

public class AlgorithmPract {
	public static void main(String args[]) {
		int[] intArrayBucket = {5, 3, 4, 3,4,8,6,9,2};
		int[] intArrayBubble = {5, 3, 4, 3,4,8,6,9,2};
		int[] intArrayInsertion = {5, 3, 4, 3,4,8,6,9,2};
		int[] intArraySelection = {5, 3, 4, 3,4,8,6,9,2};


		//bucket
		int[] counterarray= new int[10];
		Arrays.fill(counterarray, 0);
		for(int i = 0; i < intArrayBucket.length; i++) {
			counterarray[intArrayBucket[i]] = counterarray[intArrayBucket[i]] + 1;
		}
		for(int i = 0; i < counterarray.length; i ++) {
			for(int j = 0; j < counterarray[i]; j++) {
				System.out.print(i);
			}
		}
		
		System.out.println();

		for(int i = 0; i < intArrayBubble.length; i++) {
			for(int j = 1; j < intArrayBubble.length - i; j++) {
				if(intArrayBubble[j-1] > intArrayBubble[j]) {
					int a = intArrayBubble[j-1];
					intArrayBubble[j-1] = intArrayBubble[j];
					intArrayBubble[j] = a;
				}
			}
		}
		for(int i = 0; i < intArrayBubble.length; i++) {
			System.out.print(intArrayBubble[i]);
		}
		
		System.out.println();
		for(int i = 0; i < intArrayInsertion.length; i++) {
			for(int j = 0; j < intArrayInsertion.length; j++) {
				if(intArrayInsertion[i] < intArrayInsertion[j]) {
					int a = intArrayInsertion[i];
					intArrayInsertion[i] = intArrayInsertion[j];
					intArrayInsertion[j] = a;
				}
			}
		}
		for(int i = 0; i < intArrayInsertion.length; i++) {
			System.out.print(intArrayInsertion[i]);
		}
		
		System.out.println();
		//selection sort
		for(int i = 0; i < intArraySelection.length; i++ ) {
			int a = i;
			for(int j = i; j < intArraySelection.length; j++ ) {
				if(intArraySelection[i] > intArraySelection[j]) {
					a = j;
				}
			}
			int b= intArraySelection[i];
			intArraySelection[i] = intArraySelection[a];
			intArraySelection[a] = b;
		}
		for(int i = 0; i < intArraySelection.length; i++) {
			System.out.print(intArraySelection[i]);
		}
		
	}

}
