package com.abhi.repository;

import org.springframework.data.repository.CrudRepository;

import com.abhi.entity.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{
	

}
