package view;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginGUI extends JFrame {
	public LoginGUI() {
		setTitle("Tela de Login");
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setBounds(143, 53, 33, 19);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		textField = new JTextField();
		textField.setBounds(143, 83, 170, 20);
		textField.setColumns(10);
		getContentPane().setLayout(null);
		getContentPane().add(lblNewLabel);
		getContentPane().add(textField);
		
		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(143, 126, 46, 14);
		getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(143, 151, 170, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("LIMPAR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(129, 211, 89, 23);
		getContentPane().add(btnNewButton_1);
		
		
		JButton btnNewButton_2 = new JButton("ENTRAR");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(239, 211, 89, 23);
		getContentPane().add(btnNewButton_2);
	}
	
	private static final Runnable Runnable = null;
	private JPanel contentPane;
	private JTextField txtTtututtu;
	private JButton btnNewButton;
	private JTextField textField;
	private JTextField textField_1;
	
	/*
	 * Lauch the aplication.
	 */

	public class Handler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
}
