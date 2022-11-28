package com.ty.soldier.soldier_springboot_prc.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.soldier.soldier_springboot_prc.dto.Soldier;

public interface SoldierRepository extends JpaRepository<Soldier, Integer>{

}
