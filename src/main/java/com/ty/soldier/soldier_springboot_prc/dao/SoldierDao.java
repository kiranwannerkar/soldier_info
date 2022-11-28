package com.ty.soldier.soldier_springboot_prc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.soldier.soldier_springboot_prc.dto.Soldier;
import com.ty.soldier.soldier_springboot_prc.repo.SoldierRepository;
@Repository
public class SoldierDao {
	@Autowired
	SoldierRepository repository;
	public Soldier saveSoldier(Soldier soldier) {

		return repository.save(soldier);
	}

	public Soldier getSoldier(int id) {

		return repository.findById(id).get();
	}
	
	public String deleteSoldier(int id) {
		
		repository.deleteById(id);
		return "deleted";
	}
}
