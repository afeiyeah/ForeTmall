package com.neuedu.ForeTmall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neuedu.ForeTmall.model.bean.Product;
import com.neuedu.ForeTmall.model.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService productService;
	@RequestMapping("getAllProductsByCid/{cid}")
	@ResponseBody
	public List<Product> getAllProductsByCid(@PathVariable int cid){
		return productService.getAllProductsByCid(cid);
	}
	@RequestMapping("getProductByPid/{pid}")
	@ResponseBody
	public Product getProductByPid(@PathVariable int pid){
		return productService.getProductByPid(pid);
	}
}
