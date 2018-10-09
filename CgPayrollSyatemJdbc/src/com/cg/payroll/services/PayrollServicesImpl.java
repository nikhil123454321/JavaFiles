package com.cg.payroll.services;

import com.cg.payroll.beans.Associate;
import com.cg.payroll.beans.BankDetails;
import com.cg.payroll.beans.Salary;
import com.cg.payroll.daoservices.AssociateDAO;
//import com.cg.payroll.daoservices.AssociateDAOImpl;
import com.cg.payroll.exceptions.AssociateDetailNotFoundException;
import com.cg.payroll.exceptions.PayrollServicesDownException;

public class PayrollServicesImpl implements PayrollServices {
	//AssociateDAO associateDAO = new AssociateDAOImpl();
	private static AssociateDAO associateDAO;
	
	@Override
	public int acceptAssociateDetails(String firstName, String lastName,
			String emailid, String department, String designation,
			String pancard, int yearlyInvestmentUnder80C, int basicSalary,
			int epf, int companyPf, int accountNumber, String bankName,
			String ifscCode) throws PayrollServicesDownException {
		
		Associate associate = new Associate(yearlyInvestmentUnder80C,firstName,
				lastName,  department,  designation,
				pancard,  emailid, new BankDetails(accountNumber,bankName,ifscCode),
				new Salary(basicSalary,epf,companyPf));
		
		associate = associateDAO.save(associate);

		return associate.getAssociateId();
	}

	@Override
	public int calculateNetSalary(int associateId)
			throws AssociateDetailNotFoundException,PayrollServicesDownException {
		Associate associate=getAssociateDetails(associateId);
		int baiscSalary=associate.getSalary().getBasicSalary();
		int companyPf=associate.getSalary().getCompanyPf();
		int epf=associate.getSalary().getEpf();

		associate.getSalary().setHra((30*associate.getSalary().getBasicSalary())/100);
		associate.getSalary().setOtherAllowance((20*associate.getSalary().getBasicSalary())/100);
		associate.getSalary().setPersonalAllowance((25*associate.getSalary().getBasicSalary())/100);
		associate.getSalary().setConveyenceAllowance((15*associate.getSalary().getBasicSalary())/100);
		associate.getSalary().setGrossSalary((associate.getSalary().getBasicSalary())+(associate.getSalary().getHra())+(associate.getSalary().getConveyenceAllowance())+(associate.getSalary().getPersonalAllowance())+(associate.getSalary().getOtherAllowance()));

		System.out.println("Basic Salary : "+associate.getSalary().getBasicSalary());
		System.out.println("Personal Allowance : "+associate.getSalary().getPersonalAllowance());
		System.out.println("HRA : "+associate.getSalary().getHra());
		System.out.println("OtherAllowance : "+associate.getSalary().getOtherAllowance());
		System.out.println("Conveyence Allowance : "+associate.getSalary().getConveyenceAllowance());
		System.out.println("Gross Salary : "+associate.getSalary().getGrossSalary());

		associate.getSalary().setNetSalary(associate.getSalary().getGrossSalary());

		int salaryPerAnnum=(associate.getSalary().getGrossSalary()*12);
		if(salaryPerAnnum<=250000)
			associate.getSalary().setMonthlyTax(0);
		else if(salaryPerAnnum>250000 && salaryPerAnnum<=500000)
			associate.getSalary().setMonthlyTax((5*(associate.getSalary().getGrossSalary()-250000))/(100*12));
			else if(salaryPerAnnum>500000 && salaryPerAnnum<=1000000){
				int upto5=250000;
				int upto10=(10*(1000000-associate.getSalary().getBasicSalary()))/100;
				associate.getSalary().setMonthlyTax((upto5+upto10)/12);
			}

		associate.getSalary().setNetSalary((associate.getSalary().getBasicSalary())-(associate.getSalary().getMonthlyTax()));
		return associate.getSalary().getNetSalary();
	}

	@Override
	public Associate getAssociateDetails(int associateId)
			throws AssociateDetailNotFoundException, PayrollServicesDownException {
		Associate associate = associateDAO.findOne(associateId);
		if(associate==null) throw new AssociateDetailNotFoundException("Associate Details not found");
		return associate;
	}
	@Override
	public Associate[] getAllAssociateDetails()
			throws PayrollServicesDownException {
		return associateDAO.findAll();
	}
}
