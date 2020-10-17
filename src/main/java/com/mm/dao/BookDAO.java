package com.mm.dao;

import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


import com.mm.service.Book;
@Service
public class BookDAO
{
	List<Book> books;
	Connection con;

	public BookDAO() throws ClassNotFoundException
	{
		books=new ArrayList<Book>();
		books.add(new Book(1,"CCC",600,"aaa"));
		books.add(new Book(2,"AAA",560,"bbb"));
		books.add(new Book(3,"BBB",890,"ccc"));
	}
	//Input differnt Id every time before running the program
	public Book insertBook( Book book) throws SQLException
	{
		
		try {
			Connection con=DBConnector.getConnection();
			
			String query=("insert into springbook values(?,?,?,?)");
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, 13);
			ps.setString(2, "JAVA");
			ps.setInt(3, 300);
			ps.setString(4, "HS");
			
			ps.executeUpdate();
			
			PreparedStatement ps1=con.prepareStatement("Select *from springbook");
			ResultSet users1=ps1.executeQuery();
			
			while(users1.next())
			{
					System.out.println(+users1.getInt(1) +","+users1.getString(2)+","+users1.getInt(3)+","+users1.getString(4));
			}
			return book;
		}
		
		finally
		{
			
			con.close();
		}
	}
	public List<Book> getAllBooks()
	{

		return books;

	}
	
}




	


