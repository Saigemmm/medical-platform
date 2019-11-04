package org.system.service.impl;

import org.system.dao.PayerAccountDao;
import org.system.domain.PayerAccount;
import org.system.service.PayerAccountService;

public class PayerAccountServiceImpl implements PayerAccountService {
	private PayerAccountDao payerAccountDao;

	public void setPayerAccountDao(PayerAccountDao payerAccountDao) {
		this.payerAccountDao = payerAccountDao;
	}

	public PayerAccount getPayerAccountById(int payId) {
		// TODO Auto-generated method stub
		return payerAccountDao.getPayerAccountById(payId);
	}

}
