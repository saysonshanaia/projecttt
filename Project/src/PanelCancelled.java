import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class PanelCancelled extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelCancelled() {
		setBackground(new Color(245, 245, 245));
		setBounds(43, 114, 668, 277);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("no art commissions yet.");
		lblNewLabel.setFont(new Font("Objective Medium", Font.PLAIN, 13));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 131, 668, 13);
		add(lblNewLabel);
		
		

	}

}