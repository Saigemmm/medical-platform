package org.system.service.impl;

import org.system.domain.Product;
import org.system.service.ProductService;
import org.system.dao.ProductDao;

public class ProductServiceImpl implements ProductService{
	private ProductDao product;

	public void setProduct(ProductDao product) {
		this.product = product;
	}

	public Product getProductByProdcutId(int productId) {
		// TODO Auto-generated method stub
		return product.getProductById(productId);
	}


}
