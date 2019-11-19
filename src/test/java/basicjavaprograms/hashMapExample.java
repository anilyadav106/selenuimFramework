package basicjavaprograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class hashMapExample {

	public static void main(String[] args) {

		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("RollNo1", 111);
		hm.put("RollNo2", 123);
		hm.put("RollNo3", 133);
		System.out.println(hm);
		System.out.println(hm.size()); // 3
		System.out.println(hm.isEmpty());
		System.out.println(hm.get("RollNo3"));
		hm.remove("RollNo2");
		System.out.println(hm.size()); // 2
		System.out.println(hm.containsKey("test"));
		System.out.println("********list interface and its implemented class arraylist");
		List<String> list = new ArrayList<String>();
		list.add(0, "Bunny");
		list.add(1, "Hunny");
		list.add(2, "Punny");
		System.out.println(list.size()); // 3

		list.remove(0);
		System.out.println(list.size());// 2
		System.out.println(list.get(0)); // Hunny

	}

}
