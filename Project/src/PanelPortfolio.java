import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

public class PanelPortfolio extends JPanel {
	
	private Image img_portfolio = new ImageIcon(LoginForm.class.getResource("res/portfolio.png")).getImage().getScaledInstance(740,336, Image.SCALE_SMOOTH);

	public PanelPortfolio() {
		setBackground(new Color(255, 228, 225));
		setBounds(0, 0, 760, 439);
		setLayout(null);
		
		JLabel lblPortfolio = new JLabel("Portfolio");
		lblPortfolio.setForeground(new Color(205, 92, 92));
		lblPortfolio.setFont(new Font("Catline", Font.PLAIN, 25));
		lblPortfolio.setBounds(43, 5, 337, 39);
		add(lblPortfolio);
		
		JLabel lblDigitalArt = new JLabel("Digital Art • Traditional Art ");
		lblDigitalArt.setForeground(Color.BLACK);
		lblDigitalArt.setFont(new Font("Objective", Font.PLAIN, 13));
		lblDigitalArt.setBounds(43, 43, 512, 39);
		add(lblDigitalArt);
		
		JLabel lblArtworks = new JLabel("");
		lblArtworks.setIcon(new ImageIcon(img_portfolio));
		lblArtworks.setBounds(10, 92, 740, 336);
		add(lblArtworks);


	}

}