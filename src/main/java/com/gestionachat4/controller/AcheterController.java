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

import com.gestionachat4.entities.Acheter;
import com.gestionachat4.entities.AcheterPK;
import com.gestionachat4.entities.MyRequest;

import com.gestionachat4.repository.AcheterRepository;


@RestController
@CrossOrigin("*")
@RequestMapping(value = "/acheter")
public class AcheterController {
	
	@Autowired
	private AcheterRepository acheterRepository ; 

	
	@RequestMapping(
			method= RequestMethod.POST , 
			value="/createachat" , 
			produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE			
			)  
		public ResponseEntity<?> createAcheter(@RequestBody MyRequest achat) throws Exception {
		
		AcheterPK acheterpk = new AcheterPK(achat.getCodeclient() , achat.getCodeproduit() , achat.getCodeachat()) ;
		
	
		
		Acheter acheter = new Acheter(acheterpk , achat.getQte() , achat.getDateachat()) ;
		
		acheterRepository.save(acheter)	 ;
		
		
		return new ResponseEntity<>(acheter , HttpStatus.OK) ;
		}
	
	@RequestMapping(
			method= RequestMethod.GET , 
			value="/all" , 
			produces = MediaType.APPLICATION_JSON_VALUE
			//consumes = MediaType.APPLICATION_JSON_VALUE			
			)  
		public ResponseEntity<?> allAcheter() throws Exception {
		
		 
		return new ResponseEntity<>(acheterRepository.findAll()	 , HttpStatus.OK) ;
		}
	
/*
	@RequestMapping(
			method= RequestMethod.POST , 
			value="/update" , 
			produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE			
			)  
		public <T> ResponseEntity<?> updateAcheter(@RequestBody MyRequest acheter) throws Exception {
		
		System.out.println(acheter.toString());
		AcheterPK acheterpk = new AcheterPK( acheter.getCodeclient() , acheter.getCodeproduit() , acheter.getCodeachat()) ;
		
		Acheter panier = new Acheter(acheterpk , acheter.getCodeproduit() , acheter.getDateachat()) ; 
 		
	Acheter cl = acheterRepository.updateAchat(acheter.getCodeachat())	 ;
	 if (cl==null) {
		// Object res= new Object( ) {message :" Acheter introuvable "}  ;
		// res.
		 //{message :" Acheter introuvable "} ; 
		 return new ResponseEntity<T>(HttpStatus.NOT_FOUND) ;
	 } 
	
	acheterRepository.save(panier);
	
	System.out.println(acheter.toString());
	
		return new ResponseEntity<>(acheter , HttpStatus.OK) ;
		}

*/
	
	
//delete by id 
	/*
@RequestMapping(
		method= RequestMethod.POST , 
		value="/delete" , 
		produces = MediaType.APPLICATION_JSON_VALUE,
		consumes = MediaType.APPLICATION_JSON_VALUE			
		)  
	public <T> ResponseEntity<?> deleteAcheter(@RequestBody AcheterPK acheterpk) throws Exception {
	
	System.out.println(acheterpk.toString());
	
	System.out.println("delete test ");

	if (acheterRepository.findByAcheterPK(acheterpk.getCodeachat() ) ==null ) {
		 return new ResponseEntity<T>(HttpStatus.NOT_FOUND) ;
	}

 acheterRepository.deleteByAcheterPK(acheterpk);
	
// Acheter cl = acheterRepository.deteById(acheter.getCodeacheter())	 ;
 
	return new ResponseEntity<>( HttpStatus.OK) ;
	}
	*/
	
	
}


