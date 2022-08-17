package arrayPractice;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayQuestion1 implements Comparable<ArrayQuestion1> {
	int[] question_one_array = {0,1,2,3,4,5,6,7,8,9};
	private int age;
	public String name;
	public void question_one() {
		for(int i:question_one_array) {
			System.out.print(i + ",");
		}
		System.out.println("\nnext");
		int a = question_one_array[question_one_array.length-1];
		question_one_array[question_one_array.length-1] = question_one_array[0];
		question_one_array[0] = a;
		for(int i:question_one_array) {
			System.out.print(i + ",");
		}
		System.out.println("");
	}
	
	public void question_two() {
		int[] question_two_array = new int[10];
		for(int i = 0; i < 10; i++) {
			System.out.println("Enter a number:");
			question_two_array[i] = new Scanner(System.in).nextInt();	
		}
		
		Arrays.sort(question_two_array);
		System.out.println(question_two_array[0] + " " + question_two_array[question_two_array.length-1]);
	}
	
	public void question_three() {
		int[] question_three_array = new int[10];
		int[] numbers = {3, 7, 8, 2, 4, 9, 5, 5};
		Arrays.fill(question_three_array, 0);
		for(int i = 0; i < 8; i++) {
			question_three_array[i] = numbers[i];
		}

		Arrays.sort(question_three_array);
		question_three_array[0] = 3;
		question_three_array[1] = 6;
		Arrays.sort(question_three_array);
		for(int i:question_three_array) {
			System.out.print(i + ", ");
		}
		System.out.print("\n");
	}
	public ArrayQuestion1 (int a, String n) {
		age = a;
		name = n;
	}
	
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}

	public String toString() {
		return Integer.toString(age);
	}
	public int compareTo(ArrayQuestion1 o)
    {
        if (this.age != o.getAge()) {
            return this.age - o.getAge();
        }
        return this.name.compareTo(o.getName());
    }
}
