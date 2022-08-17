package arrayPractice;
import java.util.Arrays;
public class ArrayQuestionOutput {
	public static void main(String args[]) {
		ArrayQuestion1 array1 = new ArrayQuestion1(1,"sam");
		ArrayQuestion1[] objectArray = {new ArrayQuestion1(3,"jeff"), new ArrayQuestion1(1,"sam"), new ArrayQuestion1(5,"bill")};
		Arrays.sort(objectArray);

		array1.question_three();
		array1.question_one();
		array1.question_two();

	}
}
