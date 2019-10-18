package com.neuedu.ForeTmall.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.PathVariable;

import com.neuedu.ForeTmall.model.bean.Product;

@Mapper
public interface ProductMapper {
	public List<Product> getAllProductsByCid(int cid);
	public Product getProductByPid(int pid);
		
	
}
