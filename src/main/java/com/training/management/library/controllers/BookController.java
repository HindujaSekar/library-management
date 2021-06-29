package com.training.management.library.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.management.library.entity.Book;
import com.training.management.library.service.BookService;

@RestController
@RequestMapping("library-management")
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/")
	public List<Book> getAllBooks(){
		return bookService.getAllBooks();
	}
	@GetMapping("/{id}")
	public Book getBookById(@PathVariable("id")long id){
		return bookService.getBookById(id);
	}
	@DeleteMapping("/{id}")
	public long deleteBookById(@PathVariable("id")long id){
		 bookService.deleteBookById(id);
		 return id;
	}
	@PostMapping("/")
	public long addBook(@RequestBody Book book){
		bookService.addBook(book);
		return book.getBookId();
	}
	@PutMapping("/{id}")
	public long addBook(@RequestBody Book book, @PathVariable("id")long id){
		bookService.addBook(book);
		return book.getBookId();
	}

}
