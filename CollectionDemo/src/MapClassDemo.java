import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;


public class MapClassDemo {

	public static void hashMapClassWork() {
		HashMap<Integer, Associate> associates = new HashMap<Integer, Associate>();
		associates.put(101, new Associate(101,15000,"Nikhil"));
		associates.put(104, new Associate(104,15256,"Aman"));
		associates.put(103, new Associate(103,15007,"Anmol"));
		associates.put(102, new Associate(102,15050,"Abhi"));
		associates.put(102, new Associate(102,15050,"Ahi"));  //new entry with same key will override the old value
		
//		System.out.println(associates.get(103));
//		System.out.println(associates);
		for (HashMap.Entry m : associates.entrySet()) {
			System.out.println(m.getValue());
		}
//	}
	TreeMap<Integer, Associate> t = new TreeMap<Integer, Associate>();
	t.putAll(associates);     //use tree map to sort by key
	System.out.println(t.get(102));

}
}
