import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;


public class SetClassDemo {

	public static void myHashset() {
		HashSet<Associate> associateList = new HashSet<Associate>();
		
		associateList.add(new Associate(101, 15000, "Nikhil"));
		associateList.add(new Associate(103, 15022, "Abhi"));
		associateList.add(new Associate(102, 15011, "Anmol"));
		
		for (Associate associate : associateList) 
			System.out.println(associate);
		
		/*ArrayList<Associate> al = new ArrayList<Associate>(associateList);
		Collections.sort(al);
		for (Associate asso : al) 
			System.out.println(asso);
	}*/
	}

}
