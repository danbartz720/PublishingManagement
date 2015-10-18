package controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import data.Book;

@RestController
@RequestMapping("/book")
public class BookController {

	@RequestMapping(value = "/{isbn}", method = RequestMethod.GET)
	public Book getBook(@PathVariable String isbn) {

		Book tempBook = new Book(isbn);
		
		return tempBook;

	}
	
}
