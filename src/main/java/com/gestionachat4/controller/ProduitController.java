package com.gestionachat4.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gestionachat4.entities.Produit; 
import com.gestionachat4.repository.ProduitRepository;


@RestController
@CrossOrigin("*")
@RequestMapping(value = "/produit")
public class ProduitController {
	
	@Autowired
	private ProduitRepository produitRepository ; 
	
	@RequestMapping(
			method= RequestMethod.POST , 
			value="/createproduit" , 
			produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE			
			)  
		public ResponseEntity<?> createproduit(@RequestBody Produit produit) throws Exception {
		
		produitRepository.save(produit)	 ;
		return new ResponseEntity<>(produit , HttpStatus.OK) ;
		}
	
	@RequestMapping(
			method= RequestMethod.GET , 
			value="/all" , 
			produces = MediaType.APPLICATION_JSON_VALUE
			//consumes = MediaType.APPLICATION_JSON_VALUE			
			)  
		public ResponseEntity<?> allproduit() throws Exception {
		
		 
		return new ResponseEntity<>(produitRepository.getAllProduit()	 , HttpStatus.OK) ;
		}
	
	

	@RequestMapping(
			method= RequestMethod.POST , 
			value="/update" , 
			produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE			
			)  
		public <T> ResponseEntity<?> updateproduit(@RequestBody Produit produit) throws Exception {
		
		System.out.println(produit.toString());
	Produit cl = produitRepository.updateById(produit.getCodeproduit())	 ;
	 if (cl==null) {
		// Object res= new Object( ) {message :" produit introuvable "}  ;
		// res.
		 //{message :" produit introuvable "} ; 
		 return new ResponseEntity<T>(HttpStatus.NOT_FOUND) ;
	 } 
	
	produitRepository.save(produit);
	
	System.out.println(produit.toString());
	
		return new ResponseEntity<>(produit , HttpStatus.OK) ;
		}


//delete by id 
@RequestMapping(
		method= RequestMethod.POST , 
		value="/delete" , 
		produces = MediaType.APPLICATION_JSON_VALUE,
		consumes = MediaType.APPLICATION_JSON_VALUE			
		)  
	public <T> ResponseEntity<?> deleteproduit(@RequestBody Produit produit) throws Exception {
	
	System.out.println(produit.toString());
	
	System.out.println("delete test ");
	System.out.println("delete test ");
	System.out.println("delete test ");
	if (produitRepository.findById(produit.getCodeproduit() ) ==null ) {
		 return new ResponseEntity<T>(HttpStatus.NOT_FOUND) ;
	}

 produitRepository.deleteById(produit.getCodeproduit());
	
// produit cl = produitRepository.deteById(produit.getCodeproduit())	 ;
 
	return new ResponseEntity<>( HttpStatus.OK) ;
	}
}


