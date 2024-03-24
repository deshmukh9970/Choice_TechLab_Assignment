package com.object_oriented_programming;

import java.sql.Date;
import java.util.List;

public class LibraryPatron {
	
	 private int id;
	 private String name;
	 private String address;
	 private String phoneNumber;
	 private String emailAddress;
	 private boolean isMember;
	 private Date membershipExpiryDate;
	 private List<Books> booksBorrowed;
	 
	 
	 public LibraryPatron()
	 {
		 
	 }


	public LibraryPatron(int id, String name, String address, String phoneNumber, String emailAddress, boolean isMember,
			Date membershipExpiryDate, List<Books> booksBorrowed) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
		this.isMember = isMember;
		this.membershipExpiryDate = membershipExpiryDate;
		this.booksBorrowed = booksBorrowed;
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


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}


	public boolean isMember() {
		return isMember;
	}


	public void setMember(boolean isMember) {
		this.isMember = isMember;
	}


	public Date getMembershipExpiryDate() {
		return membershipExpiryDate;
	}


	public void setMembershipExpiryDate(Date membershipExpiryDate) {
		this.membershipExpiryDate = membershipExpiryDate;
	}


	public List<Books> getBooksBorrowed() {
		return booksBorrowed;
	}


	public void setBooksBorrowed(List<Books> booksBorrowed) {
		this.booksBorrowed = booksBorrowed;
	}


	@Override
	public String toString() {
		return "LibraryPatron [id=" + id + ", name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber
				+ ", emailAddress=" + emailAddress + ", isMember=" + isMember + ", membershipExpiryDate="
				+ membershipExpiryDate + ", booksBorrowed=" + booksBorrowed + "]";
	}
	 
	
	
	 
	 

}
