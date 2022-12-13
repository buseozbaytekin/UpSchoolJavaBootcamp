package HomeworksChapter13;



public class Book {
	
	Author author;
	String title;
	int page;
	BookType type;
	boolean isHardCover;
	int currentPage;
	
	enum BookType{
		
		FICTION, NON_FICTION, SCIENTIFIC;
		
		private String description;
		
	    public void setDescription(String description) {
	    	this.description = description;
	    }
		
	}
	
	public Book(Author author, String title, int page, BookType type, boolean isHardCover, int currentPage) {
        this.author = author;
        this.title = title;
        this.page = page;
        this.type = type;
        this.isHardCover = isHardCover;
        this.currentPage = currentPage;
        System.out.println("Book is created.");
    }

	public Book() {
		// TODO Auto-generated constructor stub
	}

	
	
}
