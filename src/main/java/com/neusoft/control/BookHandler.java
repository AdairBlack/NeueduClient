package com.neusoft.control;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neusoft.bean.Book;
import com.neusoft.service.BookService;

@Controller
public class BookHandler {

	@Autowired
	private BookService bookService;
	
	@RequestMapping(value="/book/BookHandler_findAllBook")
	@ResponseBody
	public List<Book> findAllBook() throws Exception {
		System.out.println("......BookHandler......findAllBook()..........");
		List<Book> books = bookService.findAllBook();
		
		return books;
	}
	
	@RequestMapping(value="/book/BookHandler_findPartBook")
	@ResponseBody
	public List<Book> findPartBook(HttpServletRequest request) throws Exception {
		System.out.println("......BookHandler......findPartBook()..........");
		List<Book> books = bookService.findPartBook(request.getParameter("condition"));
		
		return books;
		
	}
	
	@RequestMapping(value="/book/BookHandler_findBookById")
	@ResponseBody
	public Book findBookById(HttpServletRequest request) throws Exception {
		System.out.println("......BookHandler......findBookById()..........");
		Book book = bookService.findBookById(Integer.parseInt(request.getParameter("id")));
		
		return book;
		
	}
}
