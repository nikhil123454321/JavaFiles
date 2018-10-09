package com.cg.payroll.client;
import java.util.Vector;

import com.cg.payroll.beans.Associate;
import com.cg.payroll.beans.BankDetails;
import com.cg.payroll.beans.Salary;
import com.cg.payroll.exceptions.AssociateDetailNotFoundException;
import com.cg.payroll.exceptions.PayrollServicesDownException;
import com.cg.payroll.services.PayrollServices;
import com.cg.payroll.services.PayrollServicesImpl;
public class MainClass {
	public static void main(String[] args) {
		PayrollServices payrollServices = new PayrollServicesImpl();
		try {
			payrollServices.acceptAssociateDetails("Nikhil", "Maheshwari", "nikhil@gmail.com", "NFS", "Sr.Con", "nh123fd", 12000, 20000, 1000, 1000, 1212354, "hdfc", "hdfc00025");
		} catch (PayrollServicesDownException e) {
			e.printStackTrace();
			System.out.println("Payroll Services has down");
		}
		try {
			System.out.println("Net Salary : " + payrollServices.calculateNetSalary(101));
		} catch (AssociateDetailNotFoundException | PayrollServicesDownException e) {
			e.printStackTrace();
			System.out.println("Associate Detail Not Found"); 
 
		}
 
		try {
			payrollServices.getAssociateDetails(101);
		} catch (PayrollServicesDownException e) {
			System.out.println("Payroll Services has down");
			e.printStackTrace();
		} catch (AssociateDetailNotFoundException e) {
			System.out.println("Associate Detail Not Found");
			e.printStackTrace();
		}
 
		try {
			payrollServices.getAllAssociateDetails();
		} catch (PayrollServicesDownException e) {
			System.out.println("Payroll Services has down");
			e.printStackTrace();
		}
	}
}
