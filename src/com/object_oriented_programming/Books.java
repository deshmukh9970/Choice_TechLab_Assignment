package com.object_oriented_programming;



public class Books {

	    private String title;
	    private Authors authors;
	    private String isbn;
	    private String publisher;
	    private int publicationYear;
	    private int availableCopies;
	    private int totalCopies;
	    
	    
	    public Books()
	    {
	    	
	    }


		public Books(String title, Authors authors, String isbn, String publisher, int publicationYear,
				int availableCopies, int totalCopies) {
			super();
			this.title = title;
			this.authors = authors;
			this.isbn = isbn;
			this.publisher = publisher;
			this.publicationYear = publicationYear;
			this.availableCopies = availableCopies;
			this.totalCopies = totalCopies;
		}


		public String getTitle() {
			return title;
		}


		public void setTitle(String title) {
			this.title = title;
		}


		public Authors getAuthors() {
			return authors;
		}


		public void setAuthors(Authors authors) {
			this.authors = authors;
		}


		public String getIsbn() {
			return isbn;
		}


		public void setIsbn(String isbn) {
			this.isbn = isbn;
		}


		public String getPublisher() {
			return publisher;
		}


		public void setPublisher(String publisher) {
			this.publisher = publisher;
		}


		public int getPublicationYear() {
			return publicationYear;
		}


		public void setPublicationYear(int publicationYear) {
			this.publicationYear = publicationYear;
		}


		public int getAvailableCopies() {
			return availableCopies;
		}


		public void setAvailableCopies(int availableCopies) {
			this.availableCopies = availableCopies;
		}


		public int getTotalCopies() {
			return totalCopies;
		}


		public void setTotalCopies(int totalCopies) {
			this.totalCopies = totalCopies;
		}


		@Override
		public String toString() {
			return "Books [title=" + title + ", authors=" + authors + ", isbn=" + isbn + ", publisher=" + publisher
					+ ", publicationYear=" + publicationYear + ", availableCopies=" + availableCopies + ", totalCopies="
					+ totalCopies + "]";
		}
	    
		
		
	    
	    

}
