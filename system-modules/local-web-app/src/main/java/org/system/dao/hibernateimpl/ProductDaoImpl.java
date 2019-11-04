package org.system.dao.hibernateimpl;

import org.system.dao.BaseHibernateDao;
import org.system.dao.ProductDao;
import org.system.domain.Product;

public class ProductDaoImpl extends BaseHibernateDao implements ProductDao {

	public Product getProductById(int productId) {
		// TODO Auto-generated method stub
		return (Product) super.get(Product.class,productId);
	}

}
