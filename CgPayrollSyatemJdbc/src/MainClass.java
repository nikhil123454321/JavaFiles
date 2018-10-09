import com.cg.payroll.util.ConnectionProvider;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		if(ConnectionProvider.getDBConnection()!=null)
			System.out.println("Connection Open");
		else
			System.out.println("Some Problem");
	}

}
