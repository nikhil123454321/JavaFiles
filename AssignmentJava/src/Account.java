public class Account {
	private long accNum;
	private double balance;
	Person accHolder = new Person();
	public long account_counter = 1000000;
	public Account(long accNum, double balance, Person accHolder) {
		super();
		this.accNum = accNum;
		this.balance = balance;
		this.accHolder = accHolder;
	}
	
	public Account(double balance, Person accHolder) {
		super();
		this.accNum=++account_counter;
		this.balance = balance;
		this.accHolder = accHolder;
	}

	public Account() {
		super();
	}
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	public void deposit(double d){
		this.balance = balance + d;
	}
	public void withdraw(double w){
		this.balance = balance - w;
	}

	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", balance=" + balance
				+ ", accHolder=" + accHolder + ", account_counter="
				+ account_counter + "]";
	}
}
