import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

public class PanelAbout extends JPanel {
	
	private Image img_aboutus = new ImageIcon(LoginForm.class.getResource("res/aboutus.png")).getImage().getScaledInstance(661,296, Image.SCALE_SMOOTH);

	public PanelAbout() {
		setBackground(new Color(255, 228, 225));
		setBounds(0, 0, 760, 439);
		setLayout(null);
		
		JLabel lblAboutUs = new JLabel("About Us");
		lblAboutUs.setForeground(new Color(205, 92, 92));
		lblAboutUs.setFont(new Font("Catline", Font.PLAIN, 25));
		lblAboutUs.setBounds(43, 5, 512, 39);
		add(lblAboutUs);
		
		JLabel lblAbout = new JLabel("");
		lblAbout.setIcon(new ImageIcon(img_aboutus));
		lblAbout.setBounds(52, 104, 661, 296);
		add(lblAbout);


	}

}