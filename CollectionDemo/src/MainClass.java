import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class MainClass {

	public static void main(String[] args) {
		
		ArrayList<Associate> associateList = new ArrayList<Associate>();
		//insert
		associateList.add(new Associate(101, 15000, "Nikhil"));
		associateList.add(new Associate(103, 15022, "Abhi"));
		associateList.add(new Associate(102, 15011, "Anmol"));
		
		Associate associateToBeSearched = new Associate(102, 15022, "Abhi");     
		//System.out.println(associateList.indexOf(associateToBeSearched));     //find an associate
		//System.out.println(associateList.contains(new Associate(101, 15000, "Nikhil"))); // search and return t/f
		/*
		//sorting
		Collections.sort(associateList);
		for (Associate associate : associateList) {
			System.out.println(associate.getName());
		}
		
		//Collections.sort(associateList, new AssociateComparatorSalary());
*/		
		/*Comparator<Associate> associateComparator = (a1,a2)->{
			return a1.getSalary()-a2.getSalary();                                                                                without making any comparable class (by using lambda expression)
		};                                                                                                                                                 Similar thing we can do in thread becoz Runnable interface has only run method
		Collections.sort(associateList, associateComparator);
		System.out.println(associateList);*/
		
		//iteration
		for (Associate associate : associateList) {
			if(associate.getAssociateId()==102 && associate.getName().equals("Anmol"))
				System.out.println("True");
		}
		MapClassDemo.hashMapClassWork();
		//SetClassDemo.myHashset();
	}

}
