package com.gestionachat4.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.gestionachat4.entities.Client;


@Repository
public interface ClientRepository extends JpaRepository<Client , Short > {
	// liste des utilisateurs 
	@Query(" SELECT c FROM Client c") 
	List<Client> getAllClient() ;
	
	// recuperer un user a partir de son code 
		@Query(" SELECT c FROM Client c WHERE c.codeclient=:codeclient") 
		 Optional<Client> findById(@Param("codeclient") Short codeclient);
		
// recuperer un user a partir de son code 
	@Query(" SELECT c FROM Client c WHERE c.codeclient=:codeclient") 
	 Client updateById(@Param("codeclient") Short codeclient);
	
	//update un user a partir du code
	
		//List<Client>updateClient(short codeclient , String nom , String login , String datenaiss) ;
	 
	String findByNom() ;
	
	
 // delete by id 
		@Query(" DELETE  FROM Client c WHERE c.codeclient=:codeclient") 
		 void deleteById(@Param("codeclient") short codeclient);
	
}
