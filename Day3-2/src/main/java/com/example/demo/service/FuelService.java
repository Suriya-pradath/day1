package com.example.demo.service;

//import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.PetrolBunk;
import com.example.demo.repository.FuelREP;



@Service
public class FuelService {

	
		@Autowired
		FuelREP frepo;
		
		public PetrolBunk saveDetails(PetrolBunk p)
		{
			return frepo.save(p);
		}
		
		public java.util.List<PetrolBunk> getDetails()
		{
			return (java.util.List<PetrolBunk>) frepo.findAll();
		}
	}


