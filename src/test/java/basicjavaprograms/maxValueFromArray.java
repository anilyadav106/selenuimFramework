package basicjavaprograms;

public class maxValueFromArray {

	public static void main(String[] args) {

		int[] array = { 1, 2, 5, 7 };
		int max = array[0];

		for (int i = 0; i < array.length; i++) {

			if (array[i] > max) {
				max = array[i];
			}
		}

		System.out.println("The larget no is :" + max);
	}

}
