import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JCheckBox;

public class LoginForm extends JFrame {
	
	private Image img_logo = new ImageIcon(LoginForm.class.getResource("res/LOGO.png")).getImage().getScaledInstance(222,195, Image.SCALE_SMOOTH);
	
	
	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField txtPassword;

	private JLabel lblLoginMessage = new JLabel("");

	private Menu Menu;

	private Window newframe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm frame = new LoginForm();
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
	public LoginForm() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 393);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new LineBorder(new Color(143, 188, 143), 15));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(245, 245, 245));
		panel.setBounds(75, 145, 268, 30);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(10, 0, 258, 30);
		panel.add(txtUsername);
		txtUsername.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
			if(txtUsername.getText().equals("Username")) {
				txtUsername.setText("");
			}
			else {
				txtUsername.selectAll();
			}
				
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtUsername.getText().equals(""))
					txtUsername.setText("Username");
			}
		});
		txtUsername.setBackground(new Color(245, 245, 245));
		txtUsername.setBorder(null);
		txtUsername.setFont(new Font("Monospaced", Font.PLAIN, 12));
		txtUsername.setText("Username");
		txtUsername.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(245, 245, 245));
		panel_1.setBounds(75, 180, 268, 30);
		contentPane.add(panel_1);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(10, 0, 258, 30);
		panel_1.add(txtPassword);
		txtPassword.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtPassword.getText().equals("Password")) {
					txtPassword.setEchoChar('●');
					txtPassword.setText("");
					}
				else {
					txtPassword.selectAll();
				}
				
			}
			@Override
			public void focusLost(FocusEvent e) {
			if(txtPassword.getText().equals("")) {
				txtPassword.setText("Password");
				txtPassword.setEchoChar((char)0);
			}
				
			}
		});
		txtPassword.setBackground(new Color(245, 245, 245));
		txtPassword.setEchoChar((char)0);
		txtPassword.setBorder(null);
		txtPassword.setFont(new Font("Monospaced", Font.PLAIN, 12));
		txtPassword.setText("Password");
		
		JPanel pnlBtnLogin = new JPanel();
		pnlBtnLogin.setBorder(null);
		pnlBtnLogin.setBackground(new Color(143, 188, 143));
		pnlBtnLogin.setBounds(75, 240, 268, 58);
		contentPane.add(pnlBtnLogin);
		pnlBtnLogin.setLayout(null);
		
		JLabel lblLogin = new JLabel("LOG IN");
		lblLogin.setBounds(10, 11, 248, 36);
		pnlBtnLogin.add(lblLogin);
		lblLogin.setBorder(null);
		lblLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(txtUsername.getText().equals("user1") && txtPassword.getText().equals("userone")) {
					lblLoginMessage.setText("");
					JOptionPane.showMessageDialog(null,"Login successfull");
					
					Menu menu = new Menu();
					menu.setVisible(true);
					LoginForm.this.dispose();
				}
				else if(txtUsername.getText().equals("") || txtUsername.getText().equals("Username") || 
						txtPassword.getText().equals("") || txtPassword.getText().equals("Password")) {
					lblLoginMessage.setText("Please input all requirements!");
					
				}
				else {
					lblLoginMessage.setText("Invalid Username or Password");
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				pnlBtnLogin.setBackground(new Color(133, 177, 133));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pnlBtnLogin.setBackground(new Color(153, 187, 153));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				pnlBtnLogin.setBackground(new Color(183, 197, 183));
				
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				pnlBtnLogin.setBackground(new Color(153, 187, 153));
			}
		});
		lblLogin.setBackground(new Color(143, 188, 143));
		lblLogin.setForeground(new Color(255, 255, 255));
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setFont(new Font("Objective", Font.BOLD, 17));
		
	

		
		lblLoginMessage.setForeground(new Color(219, 112, 147));
		lblLoginMessage.setFont(new Font("Objective", Font.PLAIN, 10));
		lblLoginMessage.setBounds(75, 210, 268, 30);
		contentPane.add(lblLoginMessage);
		
		JLabel lblX = new JLabel("X");
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
					LoginForm.this.dispose();
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblX.setForeground(Color.RED);
			}
			@Override
		public void mouseExited(MouseEvent e) {
			lblX.setForeground(Color.WHITE);
			}
		});
		lblX.setForeground(new Color(85, 107, 47));
		lblX.setHorizontalAlignment(SwingConstants.RIGHT);
		lblX.setFont(new Font("Objective", Font.PLAIN, 15));
		lblX.setBounds(623, 22, 56, 14);
		contentPane.add(lblX);
		
		JLabel lblNoAcc = new JLabel("No account? ");
		lblNoAcc.setFont(new Font("Objective", Font.PLAIN, 11));
		lblNoAcc.setBounds(159, 339, 74, 14);
		contentPane.add(lblNoAcc);
		
		JLabel lblSignUp = new JLabel("Sign up");
		lblSignUp.addMouseListener(new MouseAdapter() {
			 @Override
	            public void mouseClicked(MouseEvent e) {
	                RegisterForm registerForm = new RegisterForm();
	                registerForm.setVisible(true);
	                dispose();
	            }
			@Override
			public void mouseEntered(MouseEvent e) {
				lblSignUp.setForeground(Color.GRAY);
			}
		
		@Override
	public void mouseExited(MouseEvent e) {
		lblX.setForeground(Color.WHITE);
		}
		});
		lblSignUp.setForeground(new Color(85, 107, 47));
		lblSignUp.setFont(new Font("Objective", Font.PLAIN, 11));
		lblSignUp.setBounds(234, 339, 56, 14);
		contentPane.add(lblSignUp);
		
		JPanel pnlBtnLogin_1 = new JPanel();
		pnlBtnLogin_1.setLayout(null);
		pnlBtnLogin_1.setBorder(null);
		pnlBtnLogin_1.setBackground(new Color(143, 188, 143));
		pnlBtnLogin_1.setBounds(411, 11, 279, 371);
		contentPane.add(pnlBtnLogin_1);
		
		JLabel lblLOGO = new JLabel("");
		lblLOGO.setIcon(new ImageIcon(img_logo));
		lblLOGO.setBounds(47, 91, 193, 195);
		pnlBtnLogin_1.add(lblLOGO);
		
		JLabel lblWelcom = new JLabel("Welcome!");
		lblWelcom.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcom.setForeground(new Color(219, 112, 147));
		lblWelcom.setFont(new Font("Objective Extra Bold", Font.BOLD, 40));
		lblWelcom.setBorder(null);
		lblWelcom.setBackground(new Color(143, 188, 143));
		lblWelcom.setBounds(75, 62, 269, 36);
		contentPane.add(lblWelcom);
		
		JCheckBox chckbxRememberMe = new JCheckBox("Remember me");
		chckbxRememberMe.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxRememberMe.setFont(new Font("Objective", Font.PLAIN, 11));
		chckbxRememberMe.setBorder(null);
		chckbxRememberMe.setBackground(Color.WHITE);
		chckbxRememberMe.setBounds(75, 305, 268, 23);
		contentPane.add(chckbxRememberMe);
		setLocationRelativeTo(null);
		
	}
}