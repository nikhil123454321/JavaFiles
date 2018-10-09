package com.cg.payroll.daoservices;

import com.cg.payroll.beans.Associate;

public interface AssociateDAO {
	Associate save(Associate associate);
	Associate findOne(int associateID);
	Associate[] findAll();
}
