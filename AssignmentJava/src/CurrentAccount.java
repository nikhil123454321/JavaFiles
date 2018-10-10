public class CurrentAccount extends Account{
	private static double overDraftLimit = 5000;

	@Override
	public void withdraw(double w) {
		super.withdraw(w);
		if(w>overDraftLimit){
			System.out.println("OverDraftLimit Exceeded");
			super.setBalance(super.getBalance()+w);
		}
	}

	public CurrentAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CurrentAccount(double balance, Person accHolder) {
		super(balance, accHolder);
		// TODO Auto-generated constructor stub
	}

	public CurrentAccount(long accNum, double balance, Person accHolder) {
		super(accNum, balance, accHolder);
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
	
	
	
}
