package swing;

import javax.swing.*;

public class TesteDeTela {

	public static void main(String[]args) {

		JLabel l1;
		JTextField txt1 = new JTextField();
		JFrame f = new JFrame("Caixa Eletronico");
		JButton bt1, bt2;

		l1 = new JLabel("Escolha uma Opção");
		l1.setBounds(150, 50, 1000, 130);
		bt1 = new JButton("transferencia");
		bt1.setBounds(100, 150, 120, 130);

		f.add(l1);
		f.add(txt1);
		f.add(bt1);
		f.setSize(500, 500);
		f.setLayout(null);
		f.setVisible(true);
	}
}
