package com.neuedu.ForeTmall.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.ForeTmall.model.bean.Product;
import com.neuedu.ForeTmall.model.mapper.ProductMapper;

@Service
public class ProductService {
	@Autowired
	private ProductMapper productMapper;
	
	public List<Product> getAllProductsByCid(int cid){
		return productMapper.getAllProductsByCid(cid);
	}

	public Product getProductByPid(int pid){
		return productMapper.getProductByPid(pid);
	}
}
