package com.ashokit.repository;

import org.springframework.data.jpa.repository.JpaRepository; 

import com.ashokit.entity.Books;

public interface BookRepository extends JpaRepository<Books, Integer>{

}
