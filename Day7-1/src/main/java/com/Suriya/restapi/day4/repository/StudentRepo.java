package com.Suriya.restapi.day4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Suriya.restapi.day4.model.StudentModel;
@Repository
public interface StudentRepo extends JpaRepository<StudentModel, Integer>{

}