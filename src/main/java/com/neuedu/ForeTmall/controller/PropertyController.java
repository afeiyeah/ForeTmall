package com.neuedu.ForeTmall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neuedu.ForeTmall.model.bean.Property;
import com.neuedu.ForeTmall.model.service.PropertyService;

@Controller
public class PropertyController {
	@Autowired
	private PropertyService propertyService;
	@RequestMapping("getPropertiesById/{pid}/{cid}")
	@ResponseBody
	public List<Property> getPropertiesById(@PathVariable int pid,@PathVariable int cid){
		
		return propertyService.getPropertiesById(pid,cid);
		
	}
}
