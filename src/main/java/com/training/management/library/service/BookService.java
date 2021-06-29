package com.training.management.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.management.library.entity.Book;
import com.training.management.library.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;

	public List<Book> getAllBooks() {
		return (List<Book>) bookRepository.findAll();
	}

	public Book getBookById(long id) {
		return bookRepository.findById(id).get();
	}

	public void deleteBookById(long id) {
		bookRepository.deleteById(id);
	}

	public void addBook(Book book) {
		bookRepository.save(book);
	}

	public void updateBook(Book book, long id) {
		if (bookRepository.existsById(id)) {
			bookRepository.save(book);
		}
	}

}
