package learnselenuim;

public class objectarrays {

	public static void main(String[] args) {

		Object[] intArray = new Object[3]; // type(int, string,double,
											// char,object) ,dimension( [] or
											// [][]) , name
		// Object intArray[] = new Object[3]; // correct
		// Object intArray [] = new Object[3]; // correct

		int length = intArray.length;
		System.out.println("length of array is :" + length);

		intArray[0] = 12;
		intArray[1] = 13;
		intArray[2] = 14;

		for (Object obj : intArray) {

			System.out.println(obj);

		}

	}

}
