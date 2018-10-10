import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MainClass {

	public static void main(String[] args) {
		//method1();
		//method2();
		//method3();
		//method4();
		method5();
	}
	private static void method1(){
		Pattern pat = Pattern.compile("H[abce]");
		Matcher matcher = pat.matcher("Hello World How Are You");
		while(matcher.find())
			System.out.println(matcher.start()+" "+matcher.end()+" "+matcher.group());
	}
	private static void method2(){
		Pattern pat = Pattern.compile("\\s");
		Matcher matcher = pat.matcher("Hello World How Are You");
		while(matcher.find())
			System.out.println(matcher.start()+" "+matcher.end()+" "+matcher.group());
	}
	private static void method3(){
		Pattern pat = Pattern.compile("\\d");
		Matcher matcher = pat.matcher("Hello World5 How Are You");
		while(matcher.find())
			System.out.println(matcher.start()+" "+matcher.end()+" "+matcher.group());
	}
	private static void method4(){
		Pattern pat = Pattern.compile("H[^a-e]");
		Matcher matcher = pat.matcher("Hello World5 How Are You");
		while(matcher.find())
			System.out.println(matcher.start()+" "+matcher.end()+" "+matcher.group());
	}
	private static void method5(){
		Pattern pat = Pattern.compile("Hel?");
		Matcher matcher = pat.matcher("Hello World5 How Are You");
		while(matcher.find())
			System.out.println(matcher.start()+" "+matcher.end()+" "+matcher.group());
	}
}
