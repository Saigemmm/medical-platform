package org.system.service;

import java.util.List;

import org.system.domain.Example;

public interface ExampleService {
	void addGoods(Example example);

	void deleteExample(int id);

	void updateExample(Example example);

	Example getExampleById(int id);

	List<Example> getAllExample();

	List<Example> findExample(String key);

	List<Example> getExampleByPaging(int pageNum, int pageSize);

	int getExampleCount();

	int getExamplePageCount(int pageSize);

}
