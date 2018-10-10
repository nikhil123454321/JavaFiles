
public class MainClass {

	public static void main(String[] args) {
		FunctionalInterface1 f1 = () ->{
			System.out.println("Hello");
		};
		f1.greetUser();
		
		FunctionalInteface2 f2 = (a,b) ->a+b;
		System.out.println(f2.add(100,200));
	}

}
