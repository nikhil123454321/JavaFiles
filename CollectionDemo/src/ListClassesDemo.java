import java.util.ArrayList;
import java.util.Collections;


public class ListClassesDemo {

	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("Nik");
		strList.add("Abhi");
		strList.add("Anm");
		strList.add("Ama");
		
		//searching
		System.out.println(strList.contains("Nik"));
		System.out.println(strList.indexOf("Abhi"));
		
		//sorting
		Collections.sort(strList);
		System.out.println(strList);
		
		//traversal | iteration
		for(int i=0;i<strList.size();i++){
			System.out.println(strList.get(i));
		}
		//Enhanced for loop
		for (String name : strList)
			System.out.println(name);
	}

}
