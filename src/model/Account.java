package model;

import java.text.NumberFormat;
import java.util.Locale;

public class Account {
	private String user;
	private String passWord;
	private double balance = 1000000;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	public Account(String user, String passWord, double balance) {
		this.user = user;
		this.passWord = passWord;
		this.balance = balance;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}
