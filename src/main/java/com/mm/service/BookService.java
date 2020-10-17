package com.mm.service;

import java.sql.SQLException;

import org.springframework.stereotype.Repository;


@Repository
public interface BookService
{

	public Book createBook(Book book) throws SQLException;

	//public  List<Book>getAllBooks();



	}

