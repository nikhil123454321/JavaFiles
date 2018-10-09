package com.cg.payroll.services;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.payroll.beans.Associate;
import com.cg.payroll.exceptions.AssociateDetailNotFoundException;
import com.cg.payroll.exceptions.PayrollServicesDownException;

public interface PayrollServices {
	 int acceptAssociateDetails(String firstName,String lastName,String emailid,String department,String designation,String pancard,
			 int yearlyInvestmentUnder80C,int basicSalary, int epf,int companyPf,int accountNumber,String bankName,String ifscCode) 
			throws PayrollServicesDownException;
	 
	 int calculateNetSalary(int associateID) throws AssociateDetailNotFoundException,PayrollServicesDownException ;
	 Associate getAssociateDetails(int associateID) throws AssociateDetailNotFoundException,PayrollServicesDownException;
	 public ArrayList<Associate> getAllAssociateDetails() throws PayrollServicesDownException;
}
