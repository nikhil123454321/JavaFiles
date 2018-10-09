/*public class MyThread extends Thread{                                                        
	public MyThread(String name) {
		super(name);
	}
	@Override
	public void run(){
		if(this.getName().equals("Odd"))
			for(int i=1;i<=100;i=i+2)
				System.out.println("Odd : "+i);
		if(this.getName().equals("Even"))
			for(int i=0;i<=100;i=i+2)
				System.out.println("Even : "+i);
	}	
}*/
public class RunnableResource implements Runnable{
	@Override
	public void run(){
		Thread t = Thread.currentThread();      //currentThread is a static method
		try {
			if(t.getName().equals("Odd"))
				for(int i=1;i<=10;i=i+2){
					System.out.println("Odd : "+i);
					Thread.sleep(1000);
				}
			if(t.getName().equals("Even"))
				for(int i=0;i<=10;i=i+2){
					System.out.println("Even : "+i);
					Thread.sleep(1000);
				}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}	