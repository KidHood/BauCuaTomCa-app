package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import view.BauCuaView2;

public class BauCuaController2 implements ActionListener{
	BauCuaView2 bauCuaView2;
	
	
	public BauCuaController2(BauCuaView2 bauCuaView2) {
		this.bauCuaView2 = bauCuaView2;
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String src =  e.getActionCommand();
		switch (src) {
		case "100k": 
			bauCuaView2.change_100k();
			break;
		case "200k": 
			bauCuaView2.change_200k();
			break;
		case "500k": 
			bauCuaView2.change_500k();
			break;
		case "1000k": 
			bauCuaView2.change_1000k();
			break;
		case "2000k": 
			bauCuaView2.change_2000k();
			break;
		case "5000k": 
			bauCuaView2.change_5000k();
			break;
		case "Nai": 
			bauCuaView2.close();
			break;
		case "Gà": 
			bauCuaView2.close();
			break;
		case "Tôm": 
			bauCuaView2.close();
			break;
		case "Cá": 
			bauCuaView2.close();
			break;
		case "Bầu": 
			bauCuaView2.close();
			break;
		case "Cua": 
			bauCuaView2.close();
			break;
		case "Reset":
			bauCuaView2.reset_bet();
			break;
		case "Nạp tiền":
			boolean cont = true;
			do {
				try {
					String bill = (String)JOptionPane.showInputDialog(
					bauCuaView2,
					"\n Nhập vào số tiền bạn muốn nạp (lớn hơn 1 củ): ",
					JOptionPane.PLAIN_MESSAGE);	
					if(bill == null)
						cont = false;
					else {
						 if(Double.valueOf(bill) < 1000000) throw new Exception();
							bauCuaView2.setBalance(Double.valueOf(bill));
							bauCuaView2.changeBlance();
							cont = false;
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(bauCuaView2,
						"Bạn xem lại số tiền nhập vào nha!",
						"Error",
						JOptionPane.ERROR_MESSAGE);
				}
			} while(cont == true);
			break;
		case "Thông tin":
			JOptionPane.showMessageDialog(bauCuaView2,
				    "Người không chơi là người không thắng"
					+"\nNgười chơi là người không thua");
			break;
		case "Mở":
			bauCuaView2.bet(src);
			bauCuaView2.open();
			break;
		case "Đóng":
			bauCuaView2.close();
			break;
		}
		
		if(bauCuaView2.getBalance() == 0) {
			JOptionPane.showMessageDialog(bauCuaView2,
					"Hết Tiền gòi bạn oi" 
					+"\nNgã ở đâu gấp đôi ở đó thôi bạn",
					"Error",
					JOptionPane.ERROR_MESSAGE);
		}
			
				
		
	}
	
	
}
