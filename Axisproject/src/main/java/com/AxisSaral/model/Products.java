package com.AxisSaral.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Products {

	
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private String prodname;
	private String prodtype;
	private String proddesc;
	
	 @Lob
	 @Column(name = "data",columnDefinition="LONGBLOB"
 )
	 private byte[] data;

	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Products(Long id, String prodname, String prodtype, String proddesc, byte[] data) {
		super();
		this.id = id;
		this.prodname = prodname;
		this.prodtype = prodtype;
		this.proddesc = proddesc;
		this.data = data;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProdname() {
		return prodname;
	}

	public void setProdname(String prodname) {
		this.prodname = prodname;
	}

	public String getProdtype() {
		return prodtype;
	}

	public void setProdtype(String prodtype) {
		this.prodtype = prodtype;
	}

	public String getProddesc() {
		return proddesc;
	}

	public void setProddesc(String proddesc) {
		this.proddesc = proddesc;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

}
