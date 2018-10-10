
public class SavingsAccount extends Account{
	final static double minimumBalance=100;

	public SavingsAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SavingsAccount(double balance, Person accHolder) {
		super(balance, accHolder);
		// TODO Auto-generated constructor stub
	}

	@Override
	public long getAccNum() {
		// TODO Auto-generated method stub
		return super.getAccNum();
	}

	@Override
	public void setAccNum(long accNum) {
		// TODO Auto-generated method stub
		super.setAccNum(accNum);
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return super.getBalance();
	}

	@Override
	public void setBalance(double balance) {
		// TODO Auto-generated method stub
		super.setBalance(balance);
	}

	@Override
	public Person getAccHolder() {
		// TODO Auto-generated method stub
		return super.getAccHolder();
	}

	@Override
	public void setAccHolder(Person accHolder) {
		// TODO Auto-generated method stub
		super.setAccHolder(accHolder);
	}

	@Override
	public void deposit(double d) {
		// TODO Auto-generated method stub
		super.deposit(d);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	public SavingsAccount(long accNum, double balance, Person accHolder) {
		super(accNum, balance, accHolder);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(double w) {
		super.withdraw(w);
		if(super.getBalance()-w<1000){
			System.out.println("Can't Withdraw");
			super.setBalance(super.getBalance()+w);
		}
	}
	
}
