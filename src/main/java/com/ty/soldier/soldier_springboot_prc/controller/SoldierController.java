package com.ty.soldier.soldier_springboot_prc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ty.soldier.soldier_springboot_prc.dao.SoldierDao;
import com.ty.soldier.soldier_springboot_prc.dto.Soldier;

@RestController
public class SoldierController {
	
	@Autowired
	SoldierDao dao;
	@PostMapping("save")
	public Soldier saveSoldier(@RequestBody Soldier soldier) {
		return dao.saveSoldier(soldier);
	}
	@GetMapping("get")
	public Soldier getSoldier(@RequestParam int id) {
		return dao.getSoldier(id);
	}
	
	@DeleteMapping("delete/{id}")
	public String deleteSoldier(@PathVariable int id) {
		
		return dao.deleteSoldier(id);
	}

}
