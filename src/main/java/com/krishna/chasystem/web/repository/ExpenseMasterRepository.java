package com.krishna.chasystem.web.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.krishna.chasystem.web.dto.ExpenseMaster;

@Repository
public class ExpenseMasterRepository {
	public List<ExpenseMaster> getAllExpenseMasterRecords() {
		List<ExpenseMaster> expenseMasterList = new ArrayList<ExpenseMaster>();
		ExpenseMaster expenseMaster = new ExpenseMaster();
		expenseMaster.setAccountCode("001");
		expenseMaster.setExpenseCode(1001);
		expenseMaster.setExpenseName("ABCD DEBIT");
		expenseMaster.setCgst(12);
		expenseMaster.setIgst(10);
		expenseMaster.setSgst(6);
		expenseMaster.setReceiptOrDetailAction("Receipt");
		expenseMasterList.add(expenseMaster);
		return expenseMasterList;
	}

}
