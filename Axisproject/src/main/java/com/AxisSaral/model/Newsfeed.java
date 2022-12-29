package com.AxisSaral.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Newsfeed {

	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private String newsfeedname;
	private String newsfeedtype;
	private String newsfeeddesc;
	
	@Lob
	 @Column(name = "data",columnDefinition="LONGBLOB")
	
	private byte[] data;

	public Newsfeed() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Newsfeed(Long id, String newsfeedname, String newsfeedtype, String newsfeeddesc, byte[] data) {
		super();
		this.id = id;
		this.newsfeedname = newsfeedname;
		this.newsfeedtype = newsfeedtype;
		this.newsfeeddesc = newsfeeddesc;
		this.data = data;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNewsfeedname() {
		return newsfeedname;
	}

	public void setNewsfeedname(String newsfeedname) {
		this.newsfeedname = newsfeedname;
	}

	public String getNewsfeedtype() {
		return newsfeedtype;
	}

	public void setNewsfeedtype(String newsfeedtype) {
		this.newsfeedtype = newsfeedtype;
	}

	public String getNewsfeeddesc() {
		return newsfeeddesc;
	}

	public void setNewsfeeddesc(String newsfeeddesc) {
		this.newsfeeddesc = newsfeeddesc;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}
	
	
}
