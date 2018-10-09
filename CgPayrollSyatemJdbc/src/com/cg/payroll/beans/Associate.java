package com.cg.payroll.beans;

public class Associate {
	private int associateId ,yearlyInvestmentUnder80C;
	private static int ASSOCIATE_COUNTER=111;
	private String firstName,lastName,department,designation,pancard,emailid;
	private BankDetails bankdetails;
	private Salary salary;
	
	public static int getASSOCIATE_COUNTER(){
		return ASSOCIATE_COUNTER;
	}

	public Associate(int yearlyInvestmentUnder80C, String firstName,
			String lastName, String department, String designation,
			String pancard, String emailid, BankDetails bankdetails,
			Salary salary) {
		super();
		this.yearlyInvestmentUnder80C = yearlyInvestmentUnder80C;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.designation = designation;
		this.pancard = pancard;
		this.emailid = emailid;
		this.bankdetails = bankdetails;
		this.salary = salary;
	}

	public Associate(int associateId, int yearlyInvestmentUnder80C,
			String firstName, String lastName, String department,
			String designation, String pancard, String emailid,
			BankDetails bankdetails, Salary salary) {
		super();
		this.associateId = associateId;
		this.yearlyInvestmentUnder80C = yearlyInvestmentUnder80C;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.designation = designation;
		this.pancard = pancard;
		this.emailid = emailid;
		this.bankdetails = bankdetails;
		this.salary = salary;
	}

	public int getAssociateId() {
		return associateId;
	}

	public void setAssociateId(int associateId) {
		this.associateId = associateId;
	}

	public int getYearlyInvestmentUnder80C() {
		return yearlyInvestmentUnder80C;
	}

	public void setYearlyInvestmentUnder80C(int yearlyInvestmentUnder80C) {
		this.yearlyInvestmentUnder80C = yearlyInvestmentUnder80C;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getPancard() {
		return pancard;
	}

	public void setPancard(String pancard) {
		this.pancard = pancard;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public BankDetails getBankdetails() {
		return bankdetails;
	}

	public void setBankdetails(BankDetails bankdetails) {
		this.bankdetails = bankdetails;
	}

	public Salary getSalary() {
		return salary;
	}

	public void setSalary(Salary salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Associate [associateId=" + associateId
				+ ", yearlyInvestmentUnder80C=" + yearlyInvestmentUnder80C
				+ ", firstName=" + firstName + ", lastName=" + lastName
				+ ", department=" + department + ", designation=" + designation
				+ ", pancard=" + pancard + ", emailid=" + emailid
				+ ", bankdetails=" + bankdetails + ", salary=" + salary + "]";
	}

} 	
