package com.infinite.LibraryHib;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transreturn")

public class TransReturn {
	@Id
	@Column(name="tid")
	private int tid;
	@Column(name="Username")
	private String userName;
	@Column(name="BookId")
	private int bookId;
	@Column(name="Fromdate")
	private Date fromdate;
	@Column(name="Todate")
	private Date toDate;
	
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
	public Date getFromdate() {
		return fromdate;
	}
	public void setFromdate(Date fromdate) {
		this.fromdate = fromdate;
	}
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	public TransReturn() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TransReturn(int tid, String userName, int bookId, Date fromdate, Date toDate) {
		super();
		this.tid = tid;
		this.userName = userName;
		this.bookId = bookId;
		this.fromdate = fromdate;
		this.toDate = toDate;
	}
	@Override
	public String toString() {
		return "TransReturn [tid=" + tid + ", userName=" + userName + ", bookId=" + bookId + ", fromdate=" + fromdate
				+ ", toDate=" + toDate + "]";
	}

	
}
