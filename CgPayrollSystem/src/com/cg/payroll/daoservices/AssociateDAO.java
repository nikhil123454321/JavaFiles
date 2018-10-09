package com.cg.payroll.daoservices;

import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.payroll.beans.Associate;

public interface AssociateDAO {
	Associate save(Associate associate) throws SQLException;
	Associate findOne(int associateID) throws SQLException ;
	//boolean Update(Associate associate);
	ArrayList<Associate> findAll() throws SQLException;
	boolean Update(Associate associate) throws SQLException;
}
