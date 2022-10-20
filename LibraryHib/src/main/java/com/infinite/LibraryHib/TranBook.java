package com.infinite.LibraryHib;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TranBook")
public class TranBook {

	@Id
	@Column(name="tid")
	private int tid;

	@Column(name="Username")
	private String userName;
	
	@Column(name="bookId")
	private int bookId;

	@Column(name="FromDate")
	private Date fromDate;

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public TranBook(int tid, String userName, int bookId, Date fromDate) {
		super();
		this.tid = tid;
		this.userName = userName;
		this.bookId = bookId;
		this.fromDate = fromDate;
	}

	public TranBook() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "TranBook [tid=" + tid + ", userName=" + userName + ", bookId=" + bookId + ", fromDate=" + fromDate
				+ "]";
	}
	
	
	
}