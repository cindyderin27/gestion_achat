package com.gestionachat4.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.gestionachat4.entities.Acheter;
import com.gestionachat4.entities.AcheterPK;


@Repository
public interface AcheterRepository extends JpaRepository<Acheter , Short > {
	// liste des utilisateurs 
	@Query(" SELECT c FROM Acheter c") 
	List<Acheter> getAllAcheter() ;
	
	// recuperer un user a partir de son code 
		//@Query(" SELECT c FROM AcheterPK c WHERE c.codeachat=:codeacheter") 
		 Optional<AcheterPK> findByAcheterPK(@Param("codeacheter") int codeacheter);
	/*	
// recuperer un user a partir de son code 
	@Query(" SELECT c FROM Acheter c WHERE c.codeachat=:codeacheter") 
	Acheter updateAchat(@Param("codeacheter") int codeacheter);
	*/
	//update un user a partir du code
	
		//List<Acheter>updateAcheter(short codeacheter , String nom , String login , String datenaiss) ;
	 
	// String findByNom() ;
	
	
 // delete by id 
	/*
		@Query(" DELETE  FROM Acheter c WHERE c.codeachat=:codeacheter") 
		 void deleteByAcheterPK(@Param("codeacheter") AcheterPK acheterpk);
	*/
}
