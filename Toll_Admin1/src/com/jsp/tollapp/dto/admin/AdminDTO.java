package com.jsp.tollapp.dto.admin;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "admin_table")
public class AdminDTO implements Serializable {

	private static Logger logger = LoggerFactory.getLogger(AdminDTO.class);

	@Id
	@GenericGenerator(name = "myid", strategy = "increment")
	@GeneratedValue(generator = "myid")
	@Column(name = "a_id")
	private int id;

	@Column(name = "a_username")
	private String username;

	@Column(name = "a_password")
	private String password;

	@Column(name = "a_expiry_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date expiryDate;

	@Column(name = "a_email")
	private String email;

	@Column(name = "a_choose_toll")
	private String choosetoll;

	@Column(name = "a_status")
	private boolean status;

	public AdminDTO() {
		logger.info("created.." + this.getClass().getSimpleName());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getChoosetoll() {
		return choosetoll;
	}

	public void setChoosetoll(String choosetoll) {
		this.choosetoll = choosetoll;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "AdminDTO [id=" + id + ", username=" + username + ", password=" + password + ", expiryDate=" + expiryDate
				+ ", email=" + email + ", choosetoll=" + choosetoll + ", status=" + status + "]";
	}

}
