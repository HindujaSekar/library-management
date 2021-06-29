package com.training.management.library.repository;

import org.springframework.data.repository.CrudRepository;

import com.training.management.library.entity.Book;

public interface BookRepository extends CrudRepository<Book, Long>{

}
