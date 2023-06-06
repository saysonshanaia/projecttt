import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class PanelApproved extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelApproved() {
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