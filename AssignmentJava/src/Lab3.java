import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;


public class Lab3 {

	public static void main(String[] args) {
		//3.1
		/*Scanner ref = new Scanner(System.in);
		String str = ref.nextLine();
		StringBuilder sb = new StringBuilder(str);
		System.out.println("1) Add the String to itself");
		System.out.println("2) Replace odd positions with #");
		System.out.println("3) Remove duplicate characters in the String");
		System.out.println("4) Change odd characters to upper case");
		int num = ref.nextInt();
		switch (num) {
		case 1:
			sb = sb.append(sb);
			System.out.println(sb);
			break;
		
		case 2:
			for (int i=0;i<sb.length();i++)
				if(i%2!=0)
					sb.setCharAt(i, '#');
			System.out.println(sb);
			break;
		case 3:
			String stb = "";
			for(int i=0;i<str.length();i++){
				char c = str.charAt(i);
				if(stb.indexOf(c)<0)
					stb = stb + c;
			}
			str = stb;
			System.out.println(str);
			break;
		
		case 4:
			for (int i=0;i<sb.length();i++)
				if(i%2!=0){
					String s = str.substring(i, i+1).toUpperCase();
					sb.replace(i, i+1, s);
				}
			System.out.println(sb);
			break;
		default:
			break;
		}*/
		
		//3.2
		/*Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		char c[] = str.toCharArray();
		Arrays.sort(c);
		String sortedstr = new String(c);
		System.out.println();
		if(sortedstr.equals(str))
			System.out.println("Positive");
		else
			System.out.println("Negative");*/
		
		//3.7
		/*Scanner ref = new Scanner(System.in);
		String s = ref.next();
		if(s.substring(s.length()-4, s.length()).equals("_job") && s.substring(0, s.length()-4).length()>=8)
			System.out.println("True");
		else
			System.out.println("False");*/
		
		//3.8
		/*ArrayList<String> strList = new ArrayList<String>();
		strList.add("Nikhil");
		strList.add("Abhi");
		strList.add("Tara");
		//strList.add("Yara");
		Collections.sort(strList);
		System.out.println(strList);
		for(int i=0;i<strList.size();i++){
			if(strList.size()%2==0){
				if(i<(strList.size())/2)
					strList.set(i,	 strList.get(i).toUpperCase());
				else
					strList.set(i,	 strList.get(i).toLowerCase());
			}
			else
				if(i<(strList.size())/2+1)
					strList.set(i,	 strList.get(i).toUpperCase());	
				else
					strList.set(i,	 strList.get(i).toLowerCase());
		}
		System.out.println(strList);*/
 	}
}
