package com.object_oriented_programming;

import java.util.List;

public class Authors {
	
	private int id;
	private String name;
    private String email;
    private List<Books> booksWritten;
    
    public Authors()
    {
    	
    }

	public Authors(int id, String name, String email, List<Books> booksWritten) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.booksWritten = booksWritten;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Books> getBooksWritten() {
		return booksWritten;
	}

	public void setBooksWritten(List<Books> booksWritten) {
		this.booksWritten = booksWritten;
	}

	@Override
	public String toString() {
		return "Authors [id=" + id + ", name=" + name + ", email=" + email + ", booksWritten=" + booksWritten + "]";
	}
    
    
    
	
}
