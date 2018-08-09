package com.krishna.chasystem.web.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.krishna.chasystem.web.dto.UnitMaster;

@Repository
public class UnitMasterRepository {

	public List<UnitMaster> getUnitMasterList() {
		List<UnitMaster> unitMasterList = new  ArrayList<UnitMaster>();
		
		UnitMaster unitMaster = new UnitMaster();
		unitMaster.setUnitId(1);
		unitMaster.setUnitName("Metric Ton");
		unitMasterList.add(unitMaster);
		
		unitMaster = new UnitMaster();
		unitMaster.setUnitId(2);
		unitMaster.setUnitName("Kilogram");
		unitMasterList.add(unitMaster);
		
		unitMaster = new UnitMaster();
		unitMaster.setUnitId(3);
		unitMaster.setUnitName("Pounds");
		unitMasterList.add(unitMaster);
		
		return unitMasterList;
	}

}
