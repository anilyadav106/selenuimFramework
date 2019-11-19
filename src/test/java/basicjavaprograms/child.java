package basicjavaprograms;

public class child extends parent {

	public static void m1() {

		System.out.println("child method");
	}

	public static void main(String[] args) {

		m1();
		parent.m1();

	}

}
