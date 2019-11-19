package basicjavaprograms;

public class printNumbersInString {

	// use character class

	public static void main(String[] args) {

		String s = "anilyadav106@gmail.com";
		char[] s1 = s.toCharArray();

		for (int i = 0; i < s1.length; i++) {
			if (Character.isDigit(s1[i])) {
				System.out.print(s1[i]);
			}

		}

	}

}
