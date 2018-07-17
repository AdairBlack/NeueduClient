package com.neusoft.mapper;

import java.util.List;

import com.neusoft.bean.Book;

public interface BookMapper {
	public List<Book> findAllBook() throws Exception;

	public List<Book> findPartBook(String condition) throws Exception;

	public Book findBookById(int id) throws Exception;

}
