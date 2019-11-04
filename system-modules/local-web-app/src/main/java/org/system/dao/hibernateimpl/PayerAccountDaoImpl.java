package org.system.dao.hibernateimpl;

import org.system.dao.BaseHibernateDao;
import org.system.dao.PayerAccountDao;
import org.system.domain.PayerAccount;

public class PayerAccountDaoImpl extends BaseHibernateDao implements PayerAccountDao {

	public PayerAccount getPayerAccountById(int payId) {
		// TODO Auto-generated method stub
		return (PayerAccount) super.get(PayerAccount.class, payId);
	}

}
