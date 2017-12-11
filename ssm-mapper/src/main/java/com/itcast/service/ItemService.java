package com.itcast.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itcast.mapper.ItemMapper;
import com.itcast.pojo.Items;

@Service
public class ItemService {

	@Autowired
	private ItemMapper  itemMapper;
	
	public List<Items> getAllItems(){
		return itemMapper.selectAll();
	}
	
	
	
	
	
}
