package com.krishna.chasystem.web.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.krishna.chasystem.web.constants.CheckPrintFormatEnum;
import com.krishna.chasystem.web.dto.BankMaster;

@Repository
public class BankMasterRepository {

	public List<BankMaster> getBankMasterList() {
		List<BankMaster> bankMasterList = new ArrayList<BankMaster>();
		
		BankMaster bankMaster = new BankMaster();
		bankMaster.setAccountCode("A-1005");
		bankMaster.setBankCode(1001);
		bankMaster.setBankName("SBI");
		bankMaster.setCheckPrintFormat(CheckPrintFormatEnum.valueOf("NORMAL"));
		bankMaster.setTransactionCode("TR-1001");
		bankMasterList.add(bankMaster);

		bankMaster = new BankMaster();
		bankMaster.setAccountCode("A-1006");
		bankMaster.setBankCode(1002);
		bankMaster.setBankName("HDFC");
		bankMaster.setCheckPrintFormat(CheckPrintFormatEnum.valueOf("PORTRAIT"));
		bankMaster.setTransactionCode("TR-1002");
		bankMasterList.add(bankMaster);
		
		return bankMasterList;
	}

}
