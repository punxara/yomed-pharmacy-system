package com.adel.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;

import com.adel.demo.model.Alien;

import java.util.List;

public interface AlienRepo extends JpaRepository<Alien,Integer> 
{
	List<Alien> findByTech(String tech);
	List<Alien> findByAidGreaterThan(int aid);
	@Query("from Alien where tech=?1 order by aname")
	List<Alien> findByTechSorted(String tech);
	
}

