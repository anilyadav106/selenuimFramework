package basicjavaprograms;

public class SumOfNums {

	public static int sum(int N) {

		int sum = 0;
		for (int i = 0; i <= N; i++) {
			sum = sum + i;
		}

		return sum;

	}

	public static void main(String[] args) {

		System.out.println("sum of nos is " + SumOfNums.sum(5));

	}
}
