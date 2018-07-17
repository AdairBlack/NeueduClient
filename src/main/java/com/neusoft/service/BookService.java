package com.neusoft.service;

import java.util.List;

import com.neusoft.bean.Book;

public interface BookService {
	public List<Book> findAllBook() throws Exception;

	public List<Book> findPartBook(String condition) throws Exception;

	public Book findBookById(int id) throws Exception;
}
