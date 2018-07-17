package com.neusoft.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.bean.Book;
import com.neusoft.mapper.BookMapper;
import com.neusoft.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookMapper bookMapper;
	
	@Override
	public List<Book> findAllBook() throws Exception {
		System.out.println("......BookServiceImpl......findAllBook()......");
		List<Book> books = new ArrayList<Book>(); 
		
		books = bookMapper.findAllBook();
		
		return books;
	}


	@Override
	public List<Book> findPartBook(String condition) throws Exception {
		System.out.println("......BookServiceImpl......findBookById()......");
		List<Book> books = bookMapper.findPartBook(condition);
		return books;
	}


	@Override
	public Book findBookById(int id) throws Exception {
		System.out.println("......BookServiceImpl......findBookById()......");
		Book book = bookMapper.findBookById(id);
		return book;
	}

}