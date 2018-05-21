/**
 * 
 */
package edu.fjnu.action;

import java.util.ArrayList;
import java.util.List;

import edu.fjnu.domain.Book;

/**
 * @author ASUS
 *
 */
public class BookAction extends BaseAction {

	private Book book;
	private static List<Book> bookList;
	static{
		bookList=new ArrayList<Book>();
		bookList.add(new Book("Struts权威指南","李刚",89.0));
		bookList.add(new Book("JAVA Web","李兴化",45.0));
		bookList.add(new Book("C语言","谭浩强",34.0));
		bookList.add(new Book("数据库","蒋本珊",33.0));
	}
	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	
	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}

	public String toInput() throws Exception{
		
		book=new Book();
		return "input";
	}
	
	public String create() throws Exception{
		
		bookList.add(book);
		return "listBook";
	}
	
	public String loadBook() throws Exception{
		
		return "listBook";
	}
	
}
