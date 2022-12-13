package HomeworksChapter13;

import HomeworksChapter13.Book.BookType;

public class ReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book1 = new Book();
		book1.title = "Kurtlarla Kosan Kadinlar";
		book1.isHardCover = false;
		book1.page = 539;
		book1.currentPage = 402;
		book1.type = BookType.FICTION;
		
		
		
		Author author1 = new Author();
		author1.name = "Clarissa P. Estes";
		book1.author = author1;
		
		Reader reader1 = new Reader();
		reader1.name = "Buse Ozbaytekin";
		reader1.age = 26;
		reader1.sex = 'K';
		reader1.book = book1;
		
		
		System.out.println(book1.title + " is read by " + reader1.name + " and she is reading page " + book1.currentPage + " right now.");

		
	}

}
