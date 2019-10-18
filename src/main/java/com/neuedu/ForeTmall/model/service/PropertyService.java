package com.neuedu.ForeTmall.model.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.ForeTmall.model.bean.Property;
import com.neuedu.ForeTmall.model.mapper.PropertyMapper;

@Service
public class PropertyService {
	@Autowired
	private PropertyMapper propertyMapper;
	
	public List<Property> getPropertiesById( int pid,int cid){
		Map<String,Object> map=new HashMap<>();
		map.put("pid", pid);
		map.put("cid", cid);
		List<Property> list=propertyMapper.getPropertiesById(map);
		return list;
	}
}
