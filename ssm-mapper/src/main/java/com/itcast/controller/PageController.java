package com.itcast.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itcast.mapper.ItemMapper;
import com.itcast.pojo.Items;
import com.itcast.service.ItemService;

@Controller
public class PageController {

	
	@Autowired
	private ItemService itemService;
	
	@RequestMapping("/index")
	public String index(Model map){
		
		List<Items> items = itemService.getAllItems();
		
		map.addAttribute("itemList", items);
		return "itemList";
	}
}
