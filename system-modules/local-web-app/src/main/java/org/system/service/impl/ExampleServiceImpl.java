package org.system.service.impl;

import java.util.List;

import org.system.dao.ExampleDao;
import org.system.domain.Example;
import org.system.service.ExampleService;

public class ExampleServiceImpl implements ExampleService{
	ExampleDao exampleDao;

	public void setExampleDao(ExampleDao exampleDao) {
		this.exampleDao = exampleDao;
	}

	public void addGoods(Example example) {
		// TODO Auto-generated method stub
		exampleDao.addGoods(example);
	}

	public void deleteExample(int id) {
		// TODO Auto-generated method stub
		exampleDao.deleteExample(id);
	}

	public void updateExample(Example example) {
		// TODO Auto-generated method stub
		exampleDao.updateExample(example);
	}

	public Example getExampleById(int id) {
		// TODO Auto-generated method stub
		return exampleDao.getExampleById(id);
	}

	public List<Example> getAllExample() {
		// TODO Auto-generated method stub
		return exampleDao.getAllExample();
	}

	public List<Example> findExample(String key) {
		// TODO Auto-generated method stub
		return exampleDao.findExample(key);
	}

	public List<Example> getExampleByPaging(int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		return exampleDao.getExampleByPaging(pageNum, pageSize);
	}

	public int getExampleCount() {
		// TODO Auto-generated method stub
		return exampleDao.getExampleCount();
	}

	public int getExamplePageCount(int pageSize) {
		// TODO Auto-generated method stub
		return exampleDao.getExamplePageCount(pageSize);
	}

}
