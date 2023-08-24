package com.example.demo.repository;
import org.hibernate.mapping.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.PetrolBunk;
public interface FuelREP {
	
//public interface FuelREP extends JpaRepository<PetrolBunk,Integer> {

	}
}

public PetrolBunk save(PetrolBunk p);

//public List findAll();
