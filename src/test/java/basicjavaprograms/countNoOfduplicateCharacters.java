package basicjavaprograms;

public class countNoOfduplicateCharacters {
	public static void main(String[] args) {
		String string = "harshit Yadav";
		int count = 0;

		// Converts given string into character array
		char[] charArray = string.toCharArray(); // so that we can traverse
													// through index nos.

		System.out.println("Duplicate characters in a given string: ");
		// Counts each character present in the string
		for (int i = 0; i < charArray.length; i++) {
			count = 1;
			for (int j = i + 1; j < charArray.length; j++) {
				if (charArray[i] == charArray[j] && charArray[i] != ' ') {
					count++;
					// Set string[j] to 0 to avoid printing visited character
					charArray[j] = '0';
				}
			}
			// A character is considered as duplicate if count is greater than 1
			if (count > 1 && charArray[i] != '0')
				System.out.println(charArray[i] + " character repeats " + count + " times");
		}
	}

}
