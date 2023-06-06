import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;

public class RegisterForm extends JFrame {
	
	private Image img_logo = new ImageIcon(LoginForm.class.getResource("res/LOGO.png")).getImage().getScaledInstance(222,195, Image.SCALE_SMOOTH);

	private JPanel contentPane;
	private JTextField txtNewusername;
	private JPasswordField pwdPassword;

	private JLabel lblSignupMessage = new JLabel("");
	private JTextField txtLastname;
	private JTextField txtName;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterForm frame = new RegisterForm();
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
	public RegisterForm() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 393);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new LineBorder(new Color(143, 188, 143), 15));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(75, 145, 268, 30);
		panel.setBackground(new Color(245, 245, 245));
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtNewusername = new JTextField();
		txtNewusername.setBounds(10, 0, 258, 30);
		panel.add(txtNewusername);
		txtNewusername.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
			if(txtNewusername.getText().equals("Username")) {
				txtNewusername.setText("");
			}
			else {
				txtNewusername.selectAll();
			}
				
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtNewusername.getText().equals(""))
					txtNewusername.setText("Username");
			}
		});
		txtNewusername.setBackground(new Color(245, 245, 245));
		txtNewusername.setBorder(null);
		txtNewusername.setFont(new Font("Monospaced", Font.PLAIN, 12));
		txtNewusername.setText("Username");
		txtNewusername.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(75, 180, 268, 30);
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(245, 245, 245));
		contentPane.add(panel_1);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setBounds(10, 0, 258, 30);
		panel_1.add(pwdPassword);
		pwdPassword.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(pwdPassword.getText().equals("Password")) {
					pwdPassword.setEchoChar('●');
					pwdPassword.setText("");
					}
				else {
					pwdPassword.selectAll();
				}
				
			}
			@Override
			public void focusLost(FocusEvent e) {
			if(pwdPassword.getText().equals("")) {
				pwdPassword.setText("Password");
				pwdPassword.setEchoChar((char)0);
			}
				
			}
		});
		pwdPassword.setBackground(new Color(245, 245, 245));
		pwdPassword.setEchoChar((char)0);
		pwdPassword.setBorder(null);
		pwdPassword.setFont(new Font("Monospaced", Font.PLAIN, 12));
		pwdPassword.setText("Password");
		
		JPanel pnlBtnSignup = new JPanel();
		pnlBtnSignup.setBounds(75, 240, 268, 58);
		pnlBtnSignup.setBorder(null);
		pnlBtnSignup.setBackground(new Color(143, 188, 143));
		contentPane.add(pnlBtnSignup);
		pnlBtnSignup.setLayout(null);
		
		JLabel lblSignup = new JLabel("SIGN UP");
		lblSignup.setBounds(10, 11, 248, 36);
		pnlBtnSignup.add(lblSignup);
		lblSignup.setBorder(null);
		lblSignup.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(txtNewusername.getText().equals("user1") && pwdPassword.getText().equals("userone")) {
					lblSignupMessage.setText("");
					JOptionPane.showMessageDialog(null,"Thank you for signing in!");
					
					LoginForm loginform = new LoginForm();
					loginform.setVisible(true);
					RegisterForm.this.dispose();
				}
				else if(txtNewusername.getText().equals("") || txtNewusername.getText().equals("Username") || 
						pwdPassword.getText().equals("") || pwdPassword.getText().equals("Password")) {
					lblSignupMessage.setText("Please input all requirements!");
					
				}
				else {
					lblSignupMessage.setText("This username is already taken");
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				pnlBtnSignup.setBackground(new Color(133, 177, 133));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pnlBtnSignup.setBackground(new Color(153, 187, 153));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				pnlBtnSignup.setBackground(new Color(183, 197, 183));
				
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				pnlBtnSignup.setBackground(new Color(153, 187, 153));
			}
		});
		lblSignup.setBackground(new Color(143, 188, 143));
		lblSignup.setForeground(new Color(255, 255, 255));
		lblSignup.setHorizontalAlignment(SwingConstants.CENTER);
		lblSignup.setFont(new Font("Objective", Font.BOLD, 17));
		lblSignupMessage.setBounds(75, 210, 268, 30);
		
	

		
		lblSignupMessage.setForeground(new Color(219, 112, 147));
		lblSignupMessage.setFont(new Font("Objective", Font.PLAIN, 10));
		contentPane.add(lblSignupMessage);
		
		JLabel lblX = new JLabel("X");
		lblX.setBounds(637, 22, 38, 14);
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
					RegisterForm.this.dispose();
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
		contentPane.add(lblX);
		
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
		
		JPanel panelLastname = new JPanel();
		panelLastname.setLayout(null);
		panelLastname.setBackground(new Color(245, 245, 245));
		panelLastname.setBounds(75, 110, 268, 30);
		contentPane.add(panelLastname);
		
		txtLastname = new JTextField();
		panelLastname.add(txtLastname);
		txtLastname.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
			if(txtLastname.getText().equals("Last name")) {
				txtLastname.setText("");
			}
			else {
				txtLastname.selectAll();
			}
				
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtLastname.getText().equals(""))
					txtLastname.setText("Last name");
			}
		});
		txtLastname.setText("Last Name");
		txtLastname.setFont(new Font("Monospaced", Font.PLAIN, 12));
		txtLastname.setColumns(10);
		txtLastname.setBorder(null);
		txtLastname.setBackground(new Color(245, 245, 245));
		txtLastname.setBounds(10, 0, 258, 30);
		panelLastname.add(txtLastname);
		
		JPanel panelName = new JPanel();
		panelName.setLayout(null);
		panelName.setBackground(new Color(245, 245, 245));
		panelName.setBounds(75, 74, 268, 30);
		contentPane.add(panelName);
		
		txtName = new JTextField();
		panelName.add(txtName);
		txtName.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
			if(txtName.getText().equals("First name")) {
				txtName.setText("");
			}
			else {
				txtName.selectAll();
			}
				
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtName.getText().equals(""))
					txtName.setText("First name");
			}
		});
		txtName.setText("First Name");
		txtName.setFont(new Font("Monospaced", Font.PLAIN, 12));
		txtName.setColumns(10);
		txtName.setBorder(null);
		txtName.setBackground(new Color(245, 245, 245));
		txtName.setBounds(10, 0, 258, 30);
		panelName.add(txtName);
		
		JLabel lblAcc = new JLabel("Already have an account?");
		lblAcc.setFont(new Font("Objective", Font.PLAIN, 11));
		lblAcc.setBounds(107, 339, 179, 14);
		contentPane.add(lblAcc);
		
		JLabel lblLoginNow = new JLabel("Login now");
		lblLoginNow.addMouseListener(new MouseAdapter() {
			 @Override
	            public void mouseClicked(MouseEvent e) {
	                LoginForm loginForm = new LoginForm();
	                loginForm.setVisible(true);
	                dispose();
	            }
			@Override
			public void mouseEntered(MouseEvent e) {
				lblLoginNow.setForeground(Color.GRAY);
			}
		
		@Override
	public void mouseExited(MouseEvent e) {
		lblX.setForeground(Color.WHITE);
		}
		});
		lblLoginNow.setForeground(new Color(85, 107, 47));
		lblLoginNow.setFont(new Font("Objective", Font.PLAIN, 11));
		lblLoginNow.setBounds(257, 339, 86, 14);
		contentPane.add(lblLoginNow);
		
		JCheckBox chckbxSignupCheckBox = new JCheckBox("I accept at terms & conditions.");
		chckbxSignupCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxSignupCheckBox.setFont(new Font("Objective", Font.PLAIN, 11));
		chckbxSignupCheckBox.setBackground(new Color(255, 255, 255));
		chckbxSignupCheckBox.setBorder(null);
		chckbxSignupCheckBox.setBounds(75, 305, 268, 23);
		contentPane.add(chckbxSignupCheckBox);
	}
}
		
	