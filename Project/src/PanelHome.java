import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import javax.swing.ImageIcon;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;


public class PanelHome extends JPanel {
	
	private Image img_caption = new ImageIcon(LoginForm.class.getResource("res/caption.png")).getImage().getScaledInstance(675,71, Image.SCALE_SMOOTH);
	private Image img_caption2 = new ImageIcon(LoginForm.class.getResource("res/caption2.png")).getImage().getScaledInstance(675,217, Image.SCALE_SMOOTH);

	public PanelHome() {
		setBackground(new Color(255, 228, 225));
		setBounds(0, 0, 760, 439);
		setLayout(null);
		setVisible(true);
		
		JLabel lblWelcome = new JLabel("Welcome to Commission Time");
		lblWelcome.setForeground(new Color(205, 92, 92));
		lblWelcome.setFont(new Font("Catline", Font.PLAIN, 25));
		lblWelcome.setBounds(43, 5, 512, 39);
		add(lblWelcome);
		
		JLabel lblOnlineDigitalArt = new JLabel("Online Art Commissions");
		lblOnlineDigitalArt.setForeground(new Color(0, 0, 0));
		lblOnlineDigitalArt.setFont(new Font("Objective", Font.PLAIN, 13));
		lblOnlineDigitalArt.setBounds(43, 43, 512, 39);
		add(lblOnlineDigitalArt);
		
		JLabel lblCaption = new JLabel("");
		lblCaption.setIcon(new ImageIcon(img_caption));
		lblCaption.setBounds(43, 93, 675, 71);
		add(lblCaption);
		
		JLabel lblContacts = new JLabel("");
		lblContacts.setIcon(new ImageIcon(img_caption2));
		lblContacts.setBounds(43, 196, 675, 217);
		add(lblContacts);
		

	}
}