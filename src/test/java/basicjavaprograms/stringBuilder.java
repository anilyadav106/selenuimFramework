package basicjavaprograms;

public class stringBuilder {

	public static void main(String[] args) {

		String s2 = "This is sunil";
		System.out.println(s2);

		System.out.println("************StringBuilder*****************");

		StringBuilder sbu = new StringBuilder("This is hunny");// not thread
																// safe, at a
																// time >1
																// thread can
																// work on this
																// object
		sbu.append(" Kumar"); // methods are NOT synchronized
		System.out.println(sbu);
		sbu.insert(5, "Yadav ");
		System.out.println(sbu);

		System.out.println("************StringBuffer*****************");

		StringBuffer sb = new StringBuffer("This is Sunil"); // thread safe, at
																// a time only
																// one thread
																// can work on
																// this
																// object,all
		sb.append(" Kumar"); // methods are synchronized
		System.out.println(sb);
		sb.insert(5, "Yadav ");
		System.out.println(sb);

	}

}
