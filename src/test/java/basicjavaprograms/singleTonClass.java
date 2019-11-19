package basicjavaprograms;

public class singleTonClass {

	public int a;

	private singleTonClass() {
		a++;
	}

	public static void main(String[] args) {
		singleTonClass sc1 = new singleTonClass();
		singleTonClass sc2 = new singleTonClass();
		singleTonClass sc3 = new singleTonClass();
		System.out.println(sc1.a);
		System.out.println(sc2.a);
		System.out.println(sc3.a);
	}

}
