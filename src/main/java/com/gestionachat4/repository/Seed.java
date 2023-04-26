package com.gestionachat4.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import com.gestionachat4.entities.Client;


@Service
public class Seed implements CommandLineRunner {
	
		private ClientRepository clientRepository;
	
		public Seed( ClientRepository clientRepository) {
			
			this.clientRepository = clientRepository;
		}
		
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		// seed pour ajouter des clients par defauts dans le systeme 
		
		/*
		Client c = new Client( " Cabrel", "M", "laroma", "12345") ;
		Client c1 = new Client( " ange", "F", "manuella", "12345") ;
		
		ArrayList<Client> maliste = new ArrayList<Client>() ;
		
		maliste.add(c) ;
		maliste.add(c1) ;
		
		clientRepository.deleteAll();
		clientRepository.saveAll(maliste) ;
		*/
	}

	
	
}
