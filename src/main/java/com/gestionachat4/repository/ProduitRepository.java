package com.gestionachat4.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.gestionachat4.entities.Produit;


@Repository
public interface ProduitRepository extends JpaRepository<Produit , Short > {
	// liste des utilisateurs 
	@Query(" SELECT c FROM Produit c") 
	List<Produit> getAllProduit() ;
	
	// recuperer un user a partir de son code 
		@Query(" SELECT c FROM Produit c WHERE c.codeproduit=:codeproduit") 
		 Optional<Produit> findById(@Param("codeproduit") Short codeproduit);
		
// recuperer un user a partir de son code 
	@Query(" SELECT c FROM Produit c WHERE c.codeproduit=:codeproduit") 
	 Produit updateById(@Param("codeproduit") Short codeproduit);
	
	//update un user a partir du code
	
		//List<Produit>updateProduit(short codeproduit , String nom , String login , String datenaiss) ;
	 
	String findByLabel() ;
	
	
 // delete by id 
		@Query(" DELETE  FROM Produit c WHERE c.codeproduit=:codeproduit") 
		 void deleteById(@Param("codeproduit") short codeproduit);
	
}
