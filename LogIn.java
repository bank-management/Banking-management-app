import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.Label;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPasswordField;

public class LogIn extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIn frame = new LogIn();
					frame.setUndecorated(true);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LogIn() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 920, 520);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Button button = new Button("Sign Up");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBackground(new Color(241,57,83));
		button.setBounds(527, 383, 279, 41);
		contentPane.add(button);
		
		textField = new JTextField();
		textField.setBounds(527, 79, 277, 41);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(527, 117, 277, 2);
		contentPane.add(separator);
		
		JLabel lblNewLabel = new JLabel("USERNAME");
		lblNewLabel.setBounds(527, 57, 89, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("EMAIL");
		lblNewLabel_1.setBounds(527, 135, 89, 29);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(527, 156, 277, 41);
		contentPane.add(textField_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(527, 195, 277, 2);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(527, 266, 277, 2);
		contentPane.add(separator_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("PASSWORD");
		lblNewLabel_1_1.setBounds(527, 207, 89, 29);
		contentPane.add(lblNewLabel_1_1);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(527, 348, 277, 2);
		contentPane.add(separator_3);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("REPEAT PASSWORD");
		lblNewLabel_1_1_1.setBounds(527, 288, 156, 29);
		contentPane.add(lblNewLabel_1_1_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(212, 242, 234));
		panel.setForeground(Color.WHITE);
		panel.setBounds(-1, 2, 416, 517);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(-13, 5, 442, 279);
		lblNewLabel_2.setIcon(new ImageIcon(LogIn.class.getResource("/images/dw14-tiger-minty-03-japanese-l (2).jpg")));
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("IU BANK APP");
		lblNewLabel_3.setBounds(122, 322, 174, 50);
		lblNewLabel_3.setFont(new Font("Sylfaen", Font.BOLD, 25));
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Welcome You To Our Bank");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(88, 392, 277, 25);
		panel.add(lblNewLabel_4);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(527, 227, 279, 41);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(527, 309, 279, 41);
		contentPane.add(passwordField_1);
	}
}
