public class MainClass {
	public static void main(String[] args) {
		RunnableResource r1 = new RunnableResource();
		Thread th1 = new Thread(r1, "Odd");
		Thread th2 = new Thread(r1, "Even");
		th1.start();
		//th1.setPriority();     //priority can be from 1 to 10
		
		th2.start();
	}
}
