
package com.cg.payroll.daoservices;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.cg.payroll.beans.Associate;

public class AssociateDAOImpl implements AssociateDAO{
	
	//private static Associate [] associates = new Associate[10];
	private static HashMap<Integer, Associate> associates = new HashMap<Integer, Associate>();
	//private static ArrayList<Associate> associates = new ArrayList<Associate>();
	private static int ASSOCIATE_ID_COUNTER = 101;
	//private static int ASSOCIATE_IDX = 0;
	
	@Override
	public Associate save(Associate associate) {
		associate.setAssociateId(ASSOCIATE_ID_COUNTER++);
		associates.put(associate.getAssociateId(),associate);
		return associate;
	}

	@Override
	public Associate findOne(int associateID) {
		/*for (int i = 0; i < associates.length; i++) {
			if(associates[i]!=null && associateID==associates[i].getAssociateId())
				return associates[i];
		}*/
		for (HashMap.Entry m : associates.entrySet()) {
			if(m.getKey()!=null  && ((Set<Entry<Integer,Associate>>) m).contains(associateID))
				return (Associate) m;
			System.out.println(m);
		}
		return null;
	}

	@Override
	public Associate[] findAll() {
		
		return null;
	}

}
