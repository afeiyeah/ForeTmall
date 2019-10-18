package com.neuedu.ForeTmall.model.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.neuedu.ForeTmall.model.bean.Property;

@Mapper
public interface PropertyMapper {
	public List<Property> getPropertiesById(Map<String,Object> map);
}
