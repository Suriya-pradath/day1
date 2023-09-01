package com.Suriya.restapi.day5.repository;




import org.springframework.data.jpa.repository.JpaRepository;

import com.Suriya.restapi.day5.model.BookModel;



public interface BookRepository extends JpaRepository<BookModel,Integer>{



	boolean existsById(int id);



}