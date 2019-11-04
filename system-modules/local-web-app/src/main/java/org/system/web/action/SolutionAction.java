package org.system.web.action;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.system.domain.Example;
import org.system.service.ExampleService;
import org.system.web.BaseAction;

import com.opensymphony.xwork2.ModelDriven;

public class SolutionAction extends BaseAction implements ModelDriven<Example>{
	Example example=new Example();
	
	private ExampleService exampleService;

	public void setExampleService(ExampleService exampleService) {
		this.exampleService = exampleService;
	}
	
	private String key;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
	//用于传递和接收当前页码和单页容量
	private int pageNum = 1;
	private int pageSize = 3;

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	public String index() {
		// List<Goods> goodsList = goodsBiz.getAllGoodses();
		//分页查询
		List<Example> exampleList = exampleService.getExampleByPaging(pageNum, pageSize);
		//获取一共有多少页
		int pageCount = exampleService.getExamplePageCount(pageSize);
		request.setAttribute("goodsList", exampleList);
		request.setAttribute("pageCount", pageCount);
		return "default";
	}
	
	public String toDetail() {
		Example g = exampleService.getExampleById(example.getExampleId());
		System.out.println(g.getExampleName());
		request.setAttribute("g", g);
		return "detail";
	}
	
	public String search() {
		List<Example> exampleList = exampleService.findExample(key);
		request.setAttribute("goodsList", exampleList);
		return "list";
	}

	private File img;
	private String imgFileName;

	public File getImg() {
		return img;
	}

	public void setImg(File img) {
		this.img = img;
	}

	public String getImgFileName() {
		return imgFileName;
	}

	public void setImgFileName(String imgFileName) {
		this.imgFileName = imgFileName;
	}

	public String doAdd() {
		example.setInsertTime(new Timestamp(System.currentTimeMillis()));
		String dirPath = servletContext.getRealPath("/img");
		File dir = new File(dirPath);
		if (!dir.exists()) {
			dir.mkdirs();
		}
		try {
			FileUtils.copyFile(img, new File(dir, imgFileName));
			example.setGoodsImg(imgFileName);
			exampleService.addGoods(example);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "index";
	}	
	
	public String toSolution() {
		return "solution";
	}

	public Example getModel() {
		// TODO Auto-generated method stub
		return example;
	}

}
