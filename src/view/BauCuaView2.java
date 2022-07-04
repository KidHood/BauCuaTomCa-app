package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import controller.BauCuaController2;
import model.BauCuaModel;

import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.net.URL;
import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;

import javax.swing.BorderFactory;

public class BauCuaView2 extends JFrame {
	MyPanel_animation myPanel_animation;
	private BauCuaModel bauCuaModel;
	private JPanel contentPane;
	private Border border;
	private JPanel panel_center;
	private JMenuBar menuBar;
	private JMenu account;
	private JMenuItem inFo;
	private JMenuItem pay;
	private JLabel label_betMoney;
	private JMenu balance;
	private Locale lc;
	private NumberFormat numf;
	private JLabel result_2;
	private JLabel result_1;
	private JLabel result_3;
	private JLabel annoument;
	private int count;
	private int remember;
	private JButton jButton_OpenClose;

	public BauCuaView2() {
		count = 0;
		// setIconImage(Toolkit.getDefaultToolkit().getImage(BauCuaView2.class.getResource("/view/crab_icon.png")));
		bauCuaModel = new BauCuaModel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setLocationRelativeTo(null);
		setContentPane(contentPane);

		myPanel_animation = new MyPanel_animation();
		
		lc = new Locale("Vi", "VN");
		numf = NumberFormat.getCurrencyInstance(lc);
		ActionListener ac = new BauCuaController2(this);
		//ActionListener ac_1 = new MyPanel_animation(this);
		
		border = BorderFactory.createLineBorder(Color.green, 3);
		Font font = new Font("Arial", Font.BOLD, 30);
		contentPane.setLayout(new BorderLayout(0, 0));

		JButton jButton_carp = new JButton();
		JButton jButton_deer;
		JButton jButton_bau;
		JButton jButton_rooster;
		JButton jButton_shrimp;
		JButton jButton_crab;

		jButton_deer = new JButton(); // create a label
		jButton_deer.setText("Nai"); // set text of label
		jButton_deer.setIcon(
				new ImageIcon(Toolkit.getDefaultToolkit().createImage(BauCuaView2.class.getResource("deer_icon.png"))));
		jButton_deer.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT,CENTER, RIGHT of imageicon
		jButton_deer.setVerticalTextPosition(JLabel.TOP); // set text TOP,CENTER, BOTTOM of imageicon
		jButton_deer.setForeground(new Color(0x00FF00)); // set font color of text
		jButton_deer.setFont(font); // set font of text
		jButton_deer.setIconTextGap(-25); // set gap of text to image
		 // set background color
		jButton_deer.setOpaque(true); // display background colo
		jButton_deer.setBorder(border); // sets border of label (not image+text)
		jButton_deer.setBackground(Color.black);
		//jButton_deer.setBorderPainted(false);
		//jButton_deer.setFocusPainted(false);
		jButton_deer.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon+text within label
		jButton_deer.setHorizontalAlignment(JLabel.CENTER);
		jButton_deer.addActionListener(ac);

		jButton_carp.setText("Cá"); // set text of label
		jButton_carp.setIcon(
				new ImageIcon(Toolkit.getDefaultToolkit().createImage(BauCuaView2.class.getResource("carp.png"))));
		jButton_carp.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT,CENTER, RIGHT of imageicon
		jButton_carp.setVerticalTextPosition(JLabel.TOP); // set text TOP,CENTER, BOTTOM of imageicon
		jButton_carp.setForeground(new Color(0x00FF00)); // set font color of text
		jButton_carp.setFont(font); // set font of text
		jButton_carp.setIconTextGap(-25); // set gap of text to image
		jButton_carp.setBackground(Color.black); // set background color
		jButton_carp.setOpaque(true); // display background color
		//jButton_carp.setBorderPainted(false);
		jButton_carp.setBorder(border); // sets border of label (not image+text)
		jButton_carp.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon+text within label
		jButton_carp.setHorizontalAlignment(JLabel.CENTER);
		jButton_carp.addActionListener(ac);

		jButton_shrimp = new JButton(); // create a label
		jButton_shrimp.setText("Tôm"); // set text of label
		jButton_shrimp.setIcon(new ImageIcon(
				Toolkit.getDefaultToolkit().createImage(BauCuaView2.class.getResource("shirmp_icon.png"))));
		jButton_shrimp.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT,CENTER, RIGHT of imageicon
		jButton_shrimp.setVerticalTextPosition(JLabel.TOP); // set text TOP,CENTER, BOTTOM of imageicon
		jButton_shrimp.setForeground(new Color(0x00FF00)); // set font color of text
		jButton_shrimp.setFont(font); // set font of text
		jButton_shrimp.setIconTextGap(-25); // set gap of text to image
		jButton_shrimp.setBackground(Color.black); // set background color
		jButton_shrimp.setOpaque(true); // display background color
		//jButton_shrimp.setBorderPainted(false);
		jButton_shrimp.setBorder(border); // sets border of label (not image+text)
		jButton_shrimp.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon+text within label
		jButton_shrimp.setHorizontalAlignment(JLabel.CENTER);
		jButton_shrimp.addActionListener(ac);

		jButton_crab = new JButton(); // create a label
		jButton_crab.setText("Cua"); // set text of label
		jButton_crab.setIcon(
				new ImageIcon(Toolkit.getDefaultToolkit().createImage(BauCuaView2.class.getResource("crab_icon.png"))));
		jButton_crab.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT,CENTER, RIGHT of imageicon
		jButton_crab.setVerticalTextPosition(JLabel.TOP); // set text TOP,CENTER, BOTTOM of imageicon
		jButton_crab.setForeground(new Color(0x00FF00)); // set font color of text
		jButton_crab.setFont(font); // set font of text
		jButton_crab.setIconTextGap(-25); // set gap of text to image
		jButton_crab.setBackground(Color.black); // set background color
		jButton_crab.setOpaque(true); // display background color
		//jButton_crab.setBorderPainted(false);
		jButton_crab.setBorder(border); // sets border of label (not image+text)
		jButton_crab.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon+text within label
		jButton_crab.setHorizontalAlignment(JLabel.CENTER);
		jButton_crab.addActionListener(ac);

		jButton_bau = new JButton(); // create a label
		jButton_bau.setText("Bầu"); // set text of label
		jButton_bau.setIcon(
				new ImageIcon(Toolkit.getDefaultToolkit().createImage(BauCuaView2.class.getResource("bau.png"))));
		jButton_bau.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT,CENTER, RIGHT of imageicon
		jButton_bau.setVerticalTextPosition(JLabel.TOP); // set text TOP,CENTER, BOTTOM of imageicon
		jButton_bau.setForeground(new Color(0x00FF00)); // set font color of text
		jButton_bau.setFont(font); // set font of text
		jButton_bau.setIconTextGap(-25); // set gap of text to image
		jButton_bau.setBackground(Color.black); // set background color
		jButton_bau.setOpaque(true); // display background color
		//jButton_bau.setBorderPainted(false);
		jButton_bau.setBorder(border); // sets border of label (not image+text)
		jButton_bau.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon+text within label
		jButton_bau.setHorizontalAlignment(JLabel.CENTER);
		jButton_bau.addActionListener(ac);

		jButton_rooster = new JButton(); // create a label
		jButton_rooster.setText("Gà"); // set text of label
		jButton_rooster.setIcon(new ImageIcon(
				Toolkit.getDefaultToolkit().createImage(BauCuaView2.class.getResource("rooster_icon.png"))));
		jButton_rooster.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT,CENTER, RIGHT of imageicon
		jButton_rooster.setVerticalTextPosition(JLabel.TOP); // set text TOP,CENTER, BOTTOM of imageicon
		jButton_rooster.setForeground(new Color(0x00FF00)); // set font color of text
		jButton_rooster.setFont(font); // set font of text
		jButton_rooster.setIconTextGap(-25); // set gap of text to image
		jButton_rooster.setBackground(Color.black); // set background color
		jButton_rooster.setOpaque(true); // display background color
		//jButton_rooster.setBorderPainted(false);
		jButton_rooster.setBorder(border); // sets border of label (not image+text)
		jButton_rooster.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon+text within label
		jButton_rooster.setHorizontalAlignment(JLabel.CENTER);
		jButton_rooster.addActionListener(ac);

		JLabel label_back = new JLabel();
		label_back.setBounds(0, 0, 976, 236);
		label_back.setIcon(new ImageIcon(
				Toolkit.getDefaultToolkit().createImage(BauCuaView2.class.getResource("backgroud2.png"))));
		label_back.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT,CENTER, RIGHT of imageicon
		label_back.setVerticalTextPosition(JLabel.TOP); // set text TOP,CENTER, BOTTOM of imageicon
		label_back.setForeground(new Color(0x00FF00)); // set font color of text
		label_back.setFont(font); // set font of text
		label_back.setIconTextGap(-25); // set gap of text to image
		//label_back.setBackground(new Color(185, 3, 15)); //set background color
		// label_back.setOpaque(true); //display background color
		label_back.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon+text within label
		label_back.setHorizontalAlignment(JLabel.CENTER);

		JPanel panel_footer = new JPanel();
		panel_footer.add(jButton_deer);
		panel_footer.add(jButton_bau);
		panel_footer.add(jButton_rooster);
		panel_footer.add(jButton_carp);
		panel_footer.add(jButton_crab);
		panel_footer.add(jButton_shrimp);

		contentPane.add(panel_footer, BorderLayout.SOUTH);
		panel_footer.setLayout(new GridLayout(2, 3, 5, 5));

		panel_center = new JPanel();
		panel_center.setBackground(new Color(185, 3, 15));
		panel_center.setOpaque(true);
		contentPane.add(panel_center, BorderLayout.CENTER);
		panel_center.setLayout(null);
		
		//add animation
//		myPanel_animation.setLocation(395, 28);
//		myPanel_animation.setSize(190, 180);
//		panel_center.add(myPanel_animation);
//		
		label_betMoney = new JLabel("");
		label_betMoney.setForeground(Color.yellow);
		label_betMoney.setBounds(420, 0, 313, 20);
		label_betMoney.setFont(new Font("Arial", Font.BOLD, 20));
		panel_center.add(label_betMoney);

		result_1 = new JLabel("");
		result_1.setBounds(460, 55, 80, 70);
		result_1.setFont(font);
		result_1.setForeground(Color.blue);
		panel_center.add(result_1);

		result_2 = new JLabel("");
		result_2.setBounds(425, 120, 80, 70);
		result_2.setFont(font);
		result_2.setForeground(Color.BLUE);
		panel_center.add(result_2);

		result_3 = new JLabel("");
		result_3.setBounds(490, 120, 80, 70);
//		result_3.setIcon(new ImageIcon(
//				Toolkit.getDefaultToolkit().createImage(BauCuaView2.class.getResource("deer_dice.png"))));
		result_3.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT,CENTER, RIGHT of imageicon
		result_3.setVerticalTextPosition(JLabel.TOP); // set text TOP,CENTER, BOTTOM of imageicon
		result_3.setForeground(new Color(0x00FF00)); // set font color of text
		result_3.setFont(font); // set font of text
		result_3.setIconTextGap(-25); // set gap of text to image
		// label_back.setBackground(new Color(185, 3, 15)); //set background color
		// label_back.setOpaque(true); //display background color
		result_3.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon+text within label
		result_3.setHorizontalAlignment(JLabel.CENTER);
		panel_center.add(result_3);

		annoument = new JLabel("");
		annoument.setBounds(600, 100, 250, 30);
		annoument.setFont(new Font("Arial", Font.BOLD, 20));
		annoument.setForeground(new Color(0x00FF00));
		panel_center.add(annoument);
		
		jButton_OpenClose = new JButton("Mở");
		jButton_OpenClose.setFont(new Font("Tahoma", Font.BOLD, 20));
		jButton_OpenClose.setForeground(Color.RED);
		jButton_OpenClose.setBackground(Color.CYAN);
		jButton_OpenClose.setBounds(650, 185, 94, 36);
		jButton_OpenClose.addActionListener(ac);
		panel_center.add(jButton_OpenClose);


		panel_center.add(label_back);


		JButton bet_100k = new JButton("100k");
		bet_100k.setBounds(50, 50, 85, 21);
		panel_center.add(bet_100k);
		bet_100k.addActionListener(ac);

		JButton bet_200k = new JButton("200k");
		bet_200k.setBounds(50, 100, 85, 21);
		panel_center.add(bet_200k);
		bet_200k.addActionListener(ac);

		JButton bet_500k = new JButton("500k");
		bet_500k.setBounds(50, 150, 85, 21);
		panel_center.add(bet_500k);
		bet_500k.addActionListener(ac);

		JButton bet_1m = new JButton("1000k");
		bet_1m.setBounds(850, 50, 85, 21);
		panel_center.add(bet_1m);
		bet_1m.addActionListener(ac);

		JButton bet_2m = new JButton("2000k");
		bet_2m.setBounds(850, 100, 85, 21);
		panel_center.add(bet_2m);
		bet_2m.addActionListener(ac);

		JButton bet_5m = new JButton("5000k");
		bet_5m.setBounds(850, 150, 85, 21);
		bet_5m.addActionListener(ac);
		panel_center.add(bet_5m);

		JButton button_reset = new JButton("Reset");
		button_reset.setForeground(Color.BLACK);
		button_reset.setBounds(50, 200, 85, 21);
		button_reset.addActionListener(ac);
		panel_center.add(button_reset);
		


		menuBar = new JMenuBar();
		menuBar.setLayout(new FlowLayout(FlowLayout.RIGHT));
		menuBar.setBorder(BorderFactory.createLineBorder(Color.black));
		menuBar.setBackground(new Color(0xFFD6D6D6));
		contentPane.add(menuBar, BorderLayout.NORTH);

		account = new JMenu("Tài khoản");

		inFo = new JMenuItem("Thông tin");
		inFo.setIcon(new ImageIcon(BauCuaView2.class.getResource("/view/information.png")));
		inFo.addActionListener(ac);
		account.add(inFo);

		pay = new JMenuItem("Nạp tiền");
		pay.setIcon(new ImageIcon(BauCuaView2.class.getResource("/view/dollar.png")));
		pay.addActionListener(ac);
		account.add(pay);

		String temp_balance = numf.format(bauCuaModel.getBalance());
		balance = new JMenu("Số dư: " + temp_balance);
		balance.setBackground(Color.white);
		balance.setOpaque(true);
		balance.setForeground(Color.BLUE);

		menuBar.add(balance);
		menuBar.add(account);
		//tạo icon chính
		URL urlCrabIcon =  BauCuaView2.class.getResource("crab_main.png");
		Image img_IconMain =  Toolkit.getDefaultToolkit().createImage(urlCrabIcon);
		this.setIconImage(img_IconMain);
		//this.setResizable(false);
		this.setVisible(true);

	}

	public void change_100k() {
		if (bauCuaModel.getBetMoney() <= (bauCuaModel.getBalance() - 100000)) {
			annoument.setText("");
			this.refresh();
			bauCuaModel.setBetMoney(bauCuaModel.getBetMoney() + 100000);
			String temp = numf.format(bauCuaModel.getBetMoney());
			label_betMoney.setText("Tiền đặt: " + temp);
		}
	}

	public void change_200k() {
		if (bauCuaModel.getBetMoney() <= (bauCuaModel.getBalance() - 200000)) {
			annoument.setText("");
			this.refresh();
			bauCuaModel.setBetMoney(bauCuaModel.getBetMoney() + 200000);
			String temp = numf.format(bauCuaModel.getBetMoney());
			label_betMoney.setText("Tiền đặt: " + temp);
		}
	}

	public void change_500k() {
		if (bauCuaModel.getBetMoney() <= (bauCuaModel.getBalance() - 500000)) {
			annoument.setText("");
			this.refresh();
			bauCuaModel.setBetMoney(bauCuaModel.getBetMoney() + 500000);
			String temp = numf.format(bauCuaModel.getBetMoney());
			label_betMoney.setText("Tiền đặt: " + temp);
		}
	}

	public void change_1000k() {
		if (bauCuaModel.getBetMoney() <= (bauCuaModel.getBalance() - 1000000)) {
			annoument.setText("");
			this.refresh();
			bauCuaModel.setBetMoney(bauCuaModel.getBetMoney() + 1000000);
			String temp = numf.format(bauCuaModel.getBetMoney());
			label_betMoney.setText("Tiền đặt: " + temp);
		}
	}

	public void change_2000k() {
		if (bauCuaModel.getBetMoney() <= (bauCuaModel.getBalance() - 2000000)) {
			annoument.setText("");
			this.refresh();
			bauCuaModel.setBetMoney(bauCuaModel.getBetMoney() + 2000000);
			String temp = numf.format(bauCuaModel.getBetMoney());
			label_betMoney.setText("Tiền đặt: " + temp);
		}
	}

	public void change_5000k() {
		if (bauCuaModel.getBetMoney() <= (bauCuaModel.getBalance() - 5000000)) {
			annoument.setText("");
			this.refresh();
			bauCuaModel.setBetMoney(bauCuaModel.getBetMoney() + 5000000);
			String temp = numf.format(bauCuaModel.getBetMoney());
			label_betMoney.setText("Tiền đặt: " + temp);
		}
	}

	public void bet(String s) {
		count = count + 1;
		if(bauCuaModel.getBetMoney() != 0) {
			bauCuaModel.setButtonBet(s);
			System.out.println("count " + count);
			if(count  > 0) {
				remember = bauCuaModel.getValueReal1() + bauCuaModel.getValueReal2() + bauCuaModel.getValueReal3();
			} else if(count > 1){
				if(remember > 6 && remember < 12) {
					bauCuaModel.setValue1(remember - 6);
					System.out.println(bauCuaModel.getValueReal1() + " <6");
				} else if(remember > 12) {
					bauCuaModel.setValue2(remember - 12);
					System.out.println(bauCuaModel.getValueReal1() + " 12");
				}
				else if (remember == 12) {
					bauCuaModel.setValue3(1);
					System.out.println(bauCuaModel.getValueReal3() + " 12");
				}
				else if (remember == 6) {
					bauCuaModel.setValue2(3);
					System.out.println(bauCuaModel.getValueReal2() + " 6");
				}
				else if(remember == 3) {
					bauCuaModel.setValue1(6);
					System.out.println(bauCuaModel.getValueReal1() + " 3");
				}
			}
			bauCuaModel.calculateBalance();
			result_1.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(bauCuaModel.getValue1())));
			result_2.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(bauCuaModel.getValue2())));
			result_3.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(bauCuaModel.getValue3())));
			annoument.setText(bauCuaModel.annountment());
			bauCuaModel.setBetMoney(0);
			label_betMoney.setText("");
			String temp_balance = numf.format(bauCuaModel.getBalance());
			balance.setText("Số dư: " + temp_balance);
			
		}

	}

	public void reset_bet() {
		bauCuaModel.setBetMoney(0);
		label_betMoney.setText("");
	}

	public double getBalance() {
		return bauCuaModel.getBalance();
	}

	public void setBalance(double balance) {
		bauCuaModel.setBalance(balance + bauCuaModel.getBalance());
	}

	public void changeBlance() {
		String annount = numf.format(bauCuaModel.getBalance());
		balance.setText("Số dư: " + annount);
	}
	
	public void open () {
		//add animation
		panel_center.remove(myPanel_animation);
//		this.pack();
//		this.resize(1000, 600);
		jButton_OpenClose.setText("Đóng");
		
	}
	
	public void close () {	
		myPanel_animation.setLocation(395, 28);
		myPanel_animation.setSize(190, 180);
		panel_center.add(myPanel_animation);
//		this.pack();
//		this.resize(1000, 600);
		jButton_OpenClose.setText("Mở");
	}
	
	public void refresh () {
		result_1.setIcon(null);
		result_2.setIcon(null);
		result_3.setIcon(null);
	}
}
