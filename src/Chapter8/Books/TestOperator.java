package Chapter8.Books;

import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;

public class TestOperator {

	public static void main(String[] args) {

		List<Book> books = BookFactory.getBookList();
		Book book1 = books.get(1);
		Book book2 = books.get(2);
		Book book3 = books.get(3);
		Book book4 = books.get(4);
		Book book5 = books.get(5);
		Book book6 = books.get(6);

		System.out.println(book1);
		System.out.println(book2);

		Comparator<Book> comparator1 = (o1, o2) -> o1.getPages() - o2.getPages();

		BinaryOperator<Book> maxLengthPage = BinaryOperator.maxBy(comparator1);
		Book maxPageBook = maxLengthPage.apply(book1, book2);
		Book maxPageBook1 = maxLengthPage.apply(book3, book4);
		Book maxPageBook2 = maxLengthPage.apply(book5, book6);

		System.out.println("Longest book is " + maxPageBook);
		System.out.println("Longest book is " + maxPageBook1);

	}

}
