import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Lab7 {
	public static void main(String[] args) {
		//7.1
		/*int a[] = {312,231,345};
		function(a);*/
		
		//7.2.1
		/*String s1 = new String("Nikhil");
		String s2 = new String("xyzw");
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		for(int i=0;i<c2.length;i+=2){
			c1[i]=c2[i];
		}
		for (char c : c1) {
			System.out.println(c);
		}
		String s3 = new String(c1);
		System.out.println(s3);
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add(s3);*/
		
		//7.2.2
		/*String s1 = new String("abdecdef");
		String s2 = new String("de");
		int firstindex = s1.indexOf(s2);
		int lastindex = s1.lastIndexOf(s2);
		StringBuilder sb1 = new StringBuilder(s1);
		StringBuilder sb2 = new StringBuilder(s2);
		String s3 = new String(sb2.reverse());
		if(lastindex>firstindex){
			sb1.replace(lastindex, lastindex+2, s3);
		}
		System.out.println(sb1);
		arrList.add(new String(sb1));*/
		
		
 		//7.3
		/*ArrayList<String> l1 = new ArrayList<String>();
		l1.add("Nik");
		l1.add("Abhi");
		l1.add("Aman");
		l1.add("Anmol");
		ArrayList<String> l2 = new ArrayList<String>();
		l2.add("Anmol");
		l2.add("Aman");
		l1.removeAll(l2);
		System.out.println(l1);*/
		
		//7.4
		/*int a[] = {5,4,6,3};
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		for(int i=0;i<a.length;i++){
			hmap.put(a[i], a[i]*a[i]);
		}
		System.out.println(hmap);*/
		
		
	}
	//7.1
	/*static Object[] function(int arr[]){
		ArrayList<StringBuilder> arrList = new ArrayList<StringBuilder>();
		for(int i=0;i<arr.length;i++)
			arrList.add(new StringBuilder(Integer.toString(arr[i])));		
		for (int i=0;i<arrList.size();i++) 
			arrList.set(i, arrList.get(i).reverse());
		System.out.println(arrList);
		ArrayList<String> strList = new ArrayList<String>();
		for (int i =0;i<arrList.size();i++)
			strList.add(new String(arrList.get(i)));

		Collections.sort(strList);
		System.out.println(strList);
		Object b[] = strList.toArray();
		for(int i=0;i<b.length;i++)
			System.out.println(b[i]);
		return b;
	}*/
}
