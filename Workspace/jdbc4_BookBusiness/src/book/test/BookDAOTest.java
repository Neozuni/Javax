package book.test;

import java.sql.SQLException;

import book.dao.BookDAO;
import book.exception.DuplicateIsbnException;
import book.vo.Book;
import config.OracleInfo;

public class BookDAOTest {

	public static void main(String[] args) throws Exception {
		BookDAO dao = BookDAO.getInstance();
		
		try {
		dao.registerBook(new Book("123j", "이것이자바냐", "신용권", "길", 25900 ));
		}catch(DuplicateIsbnException e) {
			System.out.println("등록하려는 책이 있어요 ");
		}
		
//		dao.deleteBook("5E5");
		
	}
}//class
