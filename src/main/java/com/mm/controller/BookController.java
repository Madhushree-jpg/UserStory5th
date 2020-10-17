package com.mm.controller;



import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.mm.service.Book;
import com.mm.service.BookService;
import com.mm.service.BookUser;

@RestController
@RequestMapping(value="/web")
public class BookController 
{

		@Autowired
		BookService service;
		
		
		@Autowired
		BookUser user;


		
		@GetMapping(value="/books")
		public Book inserBook(Book book) throws SQLException
		{
			return (service).createBook(book);
			//return service.getAllBooks();
		}
		
		@RequestMapping(value="/booklist")
		public List<Book> getBooks()
		{
		return user.getAllBooks();
		}	
		
}
