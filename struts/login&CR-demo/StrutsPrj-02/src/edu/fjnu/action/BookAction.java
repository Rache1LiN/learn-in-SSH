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
		bookList.add(new Book("StrutsȨ��ָ��","���",89.0));
		bookList.add(new Book("JAVA Web","���˻�",45.0));
		bookList.add(new Book("C����","̷��ǿ",34.0));
		bookList.add(new Book("���ݿ�","����ɺ",33.0));
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
