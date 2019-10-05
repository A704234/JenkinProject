package com.poojeri.sachin.atg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author A704234
 *
 */
@Entity
@Table(name = "LOGIN_TABLE1")
public class LoginModel {
	@Column(name = "ID")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "UserName")
	private String userName;
	
	@Column(name = "PassWord")
	private String password;

	/**
	 * @param id
	 * @param userName
	 * @param password
	 */
	public LoginModel(Integer id, String userName, String password) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
	}
	
	public LoginModel() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public byte byteValue() {
		return id.byteValue();
	}

	public int compareTo(Integer arg0) {
		return id.compareTo(arg0);
	}

	public double doubleValue() {
		return id.doubleValue();
	}

	public float floatValue() {
		return id.floatValue();
	}

	public int intValue() {
		return id.intValue();
	}

	public long longValue() {
		return id.longValue();
	}

	public short shortValue() {
		return id.shortValue();
	}
	
	
}
