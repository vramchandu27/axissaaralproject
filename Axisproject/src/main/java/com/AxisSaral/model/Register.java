package com.AxisSaral.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="saralbase")
public class Register {
   
     	@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private long id;
		private String fullname;
		private String dateofbirth;
		private String mobileno;
		private String address;
		private String emailid;
		private String password;
		private String role;
		public Register() {
			super();
		}
		public Register(long id, String fullname, String dateofbirth, String mobileno, String address, String emailid,
				String password, String role) {
			super();
			this.id = id;
			this.fullname = fullname;
			this.dateofbirth = dateofbirth;
			this.mobileno = mobileno;
			this.address = address;
			this.emailid = emailid;
			this.password = password;
			this.role = role;
		}
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getFullname() {
			return fullname;
		}
		public void setFullname(String fullname) {
			this.fullname = fullname;
		}
		public String getDateofbirth() {
			return dateofbirth;
		}
		public void setDateofbirth(String dateofbirth) {
			this.dateofbirth = dateofbirth;
		}
		public String getMobileno() {
			return mobileno;
		}
		public void setMobileno(String mobileno) {
			this.mobileno = mobileno;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getEmailid() {
			return emailid;
		}
		public void setEmailid(String emailid) {
			this.emailid = emailid;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
		
		
}
