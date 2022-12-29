package com.AxisSaral.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Image {
	
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String docName;
    private String docdesc;
    private String docType;
   
    
    @Lob
    @Column(name = "data", columnDefinition="LONGBLOB")
    private byte[] data;
    
	public Image() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Image(Long id, String docName, String docdesc, String docType, byte[] data) {
		super();
		this.id = id;
		this.docName = docName;
		this.docdesc = docdesc;
		this.docType = docType;
		this.data = data;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	public String getDocdesc() {
		return docdesc;
	}

	public void setDocdesc(String docdesc) {
		this.docdesc = docdesc;
	}

	public String getDocType() {
		return docType;
	}

	public void setDocType(String docType) {
		this.docType = docType;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

	
    
}
