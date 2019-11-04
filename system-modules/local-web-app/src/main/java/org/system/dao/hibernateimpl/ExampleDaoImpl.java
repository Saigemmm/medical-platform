package org.system.dao.hibernateimpl;

import java.util.List;

import org.system.dao.BaseHibernateDao;
import org.system.dao.ExampleDao;
import org.system.domain.Example;

public class ExampleDaoImpl extends BaseHibernateDao implements ExampleDao {

	public void addGoods(Example example) {
		// TODO Auto-generated method stub
		super.add(example);
	}

	public void deleteExample(int id) {
		// TODO Auto-generated method stub
		super.delete(Example.class, id);
	}

	public void updateExample(Example example) {
		// TODO Auto-generated method stub
		super.update(example);
	}

	public Example getExampleById(int id) {
		// TODO Auto-generated method stub
		return (Example) super.get(Example.class, id);
	}

	public List<Example> getAllExample() {
		// TODO Auto-generated method stub
		return super.find("from Example", null);
	}

	public List<Example> findExample(String key) {
		// TODO Auto-generated method stub
		String hql = "from Example g where g.exampleName like ? and g.exampleDesc like ?";
		return super.find1(hql, "%" + key + "%", "%" + key + "%");
	}

	public List<Example> getExampleByPaging(int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		return super.findByPaging("from Example", null, pageNum, pageSize);
	}

	public int getExampleCount() {
		// TODO Auto-generated method stub
		return super.count("select count(g) from Example g", null);
	}

	public int getExamplePageCount(int pageSize) {
		// TODO Auto-generated method stub
		return super.pageCount("select count(g) from Example g", null, pageSize);
	}

}
