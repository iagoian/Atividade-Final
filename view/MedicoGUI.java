package view;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JToggleButton;
import javax.swing.JSlider;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JSpinner;
import javax.swing.DefaultComboBoxModel;

public class MedicoGUI extends JFrame {
	public MedicoGUI() {
		setTitle("Cadastro de M\u00E9dicos");
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CRM");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(105, 40, 46, 14);
		getContentPane().add(lblNewLabel);
		
		textField_2 = new JTextField();
		textField_2.setBounds(105, 65, 220, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("NOME");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(105, 109, 46, 14);
		getContentPane().add(lblNewLabel_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(105, 136, 220, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("CPF");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(105, 184, 46, 14);
		getContentPane().add(lblNewLabel_2);
		
		textField_4 = new JTextField();
		textField_4.setBounds(105, 209, 220, 20);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(422, 397, 2, -136);
		getContentPane().add(scrollPane);
		
		JLabel lblNewLabel_3 = new JLabel("ESPECIALIDADES");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(105, 253, 121, 14);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("TELEFONE");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(105, 329, 76, 14);
		getContentPane().add(lblNewLabel_4);
		
		textField_6 = new JTextField();
		textField_6.setBounds(105, 354, 220, 20);
		getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("LIMPAR");
		btnNewButton_1.setBounds(105, 413, 89, 23);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("ENVIAR");
		btnNewButton_2.setBounds(236, 413, 89, 23);
		getContentPane().add(btnNewButton_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Cardiologista", "Cl\u00EDnico geral", "Dermatologista", "Endocrinologista", "Neurologista"}));
		comboBox.setBounds(105, 278, 220, 20);
		getContentPane().add(comboBox);
	}
	
	private JPanel contentPane;
	private JTextField txtTtututtu;
	private JButton btnNewButton;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_6;
}
