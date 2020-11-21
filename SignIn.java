import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Button;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SignIn extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignIn frame = new SignIn();
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
	public SignIn() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 920, 520);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(Color.WHITE);
		panel.setBackground(new Color(212, 242, 234));
		panel.setBounds(0, 0, 416, 519);
		contentPane.add(panel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(SignIn.class.getResource("/images/dw14-tiger-minty-03-japanese-l (2).jpg")));
		lblNewLabel_2.setBounds(-13, 5, 442, 279);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("IU BANK APP");
		lblNewLabel_3.setFont(new Font("Sylfaen", Font.BOLD, 25));
		lblNewLabel_3.setBounds(122, 322, 174, 50);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Please Input Your CustomerID");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(71, 392, 277, 25);
		panel.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(540, 97, 277, 41);
		contentPane.add(textField);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(540, 135, 277, 2);
		contentPane.add(separator);
		
		JLabel lblNewLabel = new JLabel("USERNAME");
		lblNewLabel.setBounds(540, 75, 89, 29);
		contentPane.add(lblNewLabel);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(540, 221, 277, 2);
		contentPane.add(separator_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("PASSWORD");
		lblNewLabel_1_1.setBounds(540, 162, 89, 29);
		contentPane.add(lblNewLabel_1_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(540, 182, 279, 41);
		contentPane.add(passwordField);
		
		Button button = new Button("Log In");
		button.setBackground(new Color(241, 57, 83));
		button.setBounds(538, 258, 279, 41);
		contentPane.add(button);
		
		JLabel lblNewLabel_1 = new JLabel("Doesn't have an account yet?");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(513, 332, 206, 35);
		contentPane.add(lblNewLabel_1);
		
		Button button_1 = new Button("Sign Up");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LogIn hfram = new LogIn();
				hfram.setVisible(true);
			}
		});
		button_1.setBackground(new Color(241, 57, 83));
		button_1.setBounds(728, 332, 89, 35);
		contentPane.add(button_1);
	}

}
