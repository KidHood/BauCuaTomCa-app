package model;


import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.text.NumberFormat;
import java.util.Iterator;
import java.util.Locale;
import java.util.Random;

import javax.print.attribute.EnumSyntax;

import view.BauCuaView2;

public class BauCuaModel {
	private Account accountP = new Account();
	private double betMoney = 0;;
	private int result;
	private String buttonBet;
	private int value1;
	private int value2;
	private int value3;
	private NumberFormat numf;
	
	
	
	public BauCuaModel() {
		this.accountP = accountP;
		this.betMoney = betMoney;
		this.result = result;
		this.buttonBet = buttonBet;
	}


	public Account getAccountP() {
		return accountP;
	}


	public void setAccountP(Account accountP) {
		this.accountP = accountP;
	}


	public double getBetMoney() {
		return betMoney;
	}


	public void setBetMoney(double betMoney) {
		this.betMoney = betMoney;
	}


	public int getResult() {
		return result;
	}


	public void setResult(int result) {
		this.result = result;
	}


	public String getButtonBet() {
		return buttonBet;
	}


	public void setButtonBet(String buttonBet) {
		this.buttonBet = buttonBet;
	}


	public double getBalance () {
		return accountP.getBalance();
	}
	
	public void setBalance (double balance) {
		this.accountP.setBalance(balance);
	}
	


	public URL getValue1() {
		URL urlCrabIcon = BauCuaView2.class.getResource("");
		switch (value1) {
		case 1:
			urlCrabIcon =  BauCuaView2.class.getResource("deer_dice.png");
			break;
		case 2:
			urlCrabIcon =  BauCuaView2.class.getResource("bau_dice.png");
			break;
		case 3:
			urlCrabIcon =  BauCuaView2.class.getResource("rooster_dice.png");
			break;
		case 4:
			urlCrabIcon =  BauCuaView2.class.getResource("carp_dice.png");
			break;
		case 5:
			urlCrabIcon =  BauCuaView2.class.getResource("crab_dice.png");
			break;
		case 6:
			urlCrabIcon =  BauCuaView2.class.getResource("shrimp_dice.png");
			break;
		}
		return urlCrabIcon;
	}


	public void setValue1(int value1) {
		this.value1 = value1;
	}


	public URL getValue2() {
		URL urlCrabIcon = BauCuaView2.class.getResource("");
		switch (value2) {
		case 1:
			urlCrabIcon =  BauCuaView2.class.getResource("deer_dice.png");
			break;
		case 2:
			urlCrabIcon =  BauCuaView2.class.getResource("bau_dice.png");
			break;
		case 3:
			urlCrabIcon =  BauCuaView2.class.getResource("rooster_dice.png");
			break;
		case 4:
			urlCrabIcon =  BauCuaView2.class.getResource("carp_dice.png");
			break;
		case 5:
			urlCrabIcon =  BauCuaView2.class.getResource("crab_dice.png");
			break;
		case 6:
			urlCrabIcon =  BauCuaView2.class.getResource("shrimp_dice.png");
			break;
		}
		return urlCrabIcon;
	}


	public void setValue2(int value2) {
		this.value2 = value2;
	}


	public URL getValue3() {
		URL urlCrabIcon = BauCuaView2.class.getResource("");
		switch (value3) {
		case 1:
			urlCrabIcon =  BauCuaView2.class.getResource("deer_dice.png");
			break;
		case 2:
			urlCrabIcon =  BauCuaView2.class.getResource("bau_dice.png");
			break;
		case 3:
			urlCrabIcon =  BauCuaView2.class.getResource("rooster_dice.png");
			break;
		case 4:
			urlCrabIcon =  BauCuaView2.class.getResource("carp_dice.png");
			break;
		case 5:
			urlCrabIcon =  BauCuaView2.class.getResource("crab_dice.png");
			break;
		case 6:
			urlCrabIcon =  BauCuaView2.class.getResource("shrimp_dice.png");
			break;
		}
		return urlCrabIcon;
	}


	public void setValue3(int value3) {
		this.value3 = value3;		
	}


	public void getAResult () {
		Random r = new Random();
		value1 = r.nextInt(6) + 1;
		value2 = r.nextInt(6) + 1;
		value3 = r.nextInt(6) + 1;	
		result = 0;
		
		BauCuaModelEnum b = BauCuaModelEnum.Bầu;
		
		if(buttonBet.equalsIgnoreCase("Gà"))
			b = BauCuaModelEnum.Gà;
		else if(buttonBet.equalsIgnoreCase("Nai"))
			b = BauCuaModelEnum.Nai;
		else if(buttonBet.equalsIgnoreCase("Cua"))
			b = BauCuaModelEnum.Cua;
		else if(buttonBet.equalsIgnoreCase("Bầu"))
			b = BauCuaModelEnum.Bầu;
		else if(buttonBet.equalsIgnoreCase("Tôm"))
			b = BauCuaModelEnum.Tôm;
		else if(buttonBet.equalsIgnoreCase("Cá"))
			b = BauCuaModelEnum.Cá;
		
		if(value1 == b.getValue())
			result++;
		if(value2 == b.getValue())
			result++;
		if(value3 == b.getValue())
			result++;
		if(result == 0)
			result = -1;
	}
	
	public double calculateBalance () {
		getAResult();
		double newBalance = accountP.getBalance() + (this.betMoney*this.result);
		this.accountP.setBalance(newBalance);
		return newBalance;
	}
	
	public String annountment () {
		Locale lc = new Locale("Vi", "VN");
		numf =  NumberFormat.getCurrencyInstance(lc);
		String temp = numf.format(result*getBetMoney());
		if(this.result > 0)
			return "Win: +" + temp;
		else
			return "Loss: " + temp;
	
	}
	
	public void test () {
	}
	
	public int getValueReal1 () {
		return value1;
	}
	
	public int getValueReal2 () {
		return value2;
	}
	
	public int getValueReal3 () {
		return value3;
	}
	
	
}
