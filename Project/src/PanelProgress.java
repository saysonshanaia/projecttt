import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.Font;

public class PanelProgress extends JPanel {
	
	private JPanel contentPane;
	
	private Image img_logo = new ImageIcon(LoginForm.class.getResource("res/LOGO.png")).getImage().getScaledInstance(127,121, Image.SCALE_SMOOTH);
	private JLabel lblReceived;
	
	private PanelApproved paneApproval;
	private PanelWIP paneWIP;
	private PanelCompleted paneCompleted;
	private PanelReceived paneArtReceived;
	private PanelCancelled paneCancelled;
	private PanelReturn paneReturn;

	public PanelProgress() {
		setBackground(new Color(255, 228, 225));
		setBounds(0, 0, 760, 439);
		setLayout(null);	
		
		paneApproval = new PanelApproved();
		paneWIP = new PanelWIP();
		paneCompleted = new PanelCompleted();
		paneArtReceived = new PanelReceived();
		paneCancelled = new PanelCancelled();
		paneReturn = new PanelReturn();
		
		JLabel lblNewLabel = new JLabel("My commissions");
		lblNewLabel.setForeground(new Color(205, 92, 92));
		lblNewLabel.setFont(new Font("Catline", Font.PLAIN, 25));
		lblNewLabel.setBounds(43, 5, 337, 39);
		add(lblNewLabel);
		
		JPanel panelApproval = new JPanel();
		panelApproval.addMouseListener(new PanelButtonMouseAdapter(panelApproval) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(paneApproval);
			}
		});
		panelApproval.setBackground(new Color(255, 228, 225));
		panelApproval.setBounds(43, 68, 113, 24);
		add(panelApproval);
		panelApproval.setLayout(null);
		
		JLabel lblApproval = new JLabel("Art Approval");
		lblApproval.setBounds(16, 5, 81, 14);
		lblApproval.setFont(new Font("Objective", Font.PLAIN, 13));
		panelApproval.add(lblApproval);
		
		JPanel panelWIP = new JPanel();
		panelWIP.addMouseListener(new PanelButtonMouseAdapter(panelWIP) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(paneWIP);
			}
		});
		panelWIP.setBackground(new Color(255, 228, 225));
		panelWIP.setBounds(166, 68, 133, 24);
		add(panelWIP);
		panelWIP.setLayout(null);
		
		JLabel lblWIP = new JLabel("Work in Progress");
		lblWIP.setBounds(11, 5, 110, 14);
		lblWIP.setFont(new Font("Objective", Font.PLAIN, 13));
		panelWIP.add(lblWIP);
		
		JPanel panelCompleted = new JPanel();
		panelCompleted.addMouseListener(new PanelButtonMouseAdapter(panelCompleted) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(paneCompleted);
			}
		});
		panelCompleted.setBackground(new Color(255, 228, 225));
		panelCompleted.setBounds(309, 68, 97, 24);
		add(panelCompleted);
		panelCompleted.setLayout(null);
		
		JLabel lblCompleted = new JLabel("Completed");
		lblCompleted.setBounds(12, 5, 72, 14);
		lblCompleted.setFont(new Font("Objective", Font.PLAIN, 13));
		panelCompleted.add(lblCompleted);
		
		JPanel panelArtReceived = new JPanel();
		panelArtReceived.addMouseListener(new PanelButtonMouseAdapter(panelArtReceived) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(paneArtReceived);
			}
		});
		panelArtReceived.setBackground(new Color(255, 228, 225));
		panelArtReceived.setBounds(416, 68, 97, 24);
		add(panelArtReceived);
		panelArtReceived.setLayout(null);
		
		lblReceived = new JLabel("Received");
		lblReceived.setBounds(18, 5, 61, 14);
		lblReceived.setHorizontalAlignment(SwingConstants.TRAILING);
		lblReceived.setFont(new Font("Objective", Font.PLAIN, 13));
		panelArtReceived.add(lblReceived);
		
		JPanel panelCancelled = new JPanel();
		panelCancelled.addMouseListener(new PanelButtonMouseAdapter(panelCancelled) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(paneCancelled);
			}
		});
		panelCancelled.setBackground(new Color(255, 228, 225));
		panelCancelled.setBounds(523, 68, 97, 24);
		add(panelCancelled);
		panelCancelled.setLayout(null);
		
		JLabel lblCancelled = new JLabel("Cancelled");
		lblCancelled.setBounds(15, 5, 66, 14);
		lblCancelled.setHorizontalAlignment(SwingConstants.TRAILING);
		lblCancelled.setFont(new Font("Objective", Font.PLAIN, 13));
		panelCancelled.add(lblCancelled);
		
		JPanel panelReturn = new JPanel();
		panelReturn.addMouseListener(new PanelButtonMouseAdapter(panelReturn) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(paneReturn);
			}
		});
		panelReturn.setBackground(new Color(255, 228, 225));
		panelReturn.setBounds(630, 68, 81, 24);
		add(panelReturn);
		panelReturn.setLayout(null);
		
		JLabel lblReturn = new JLabel("Return");
		lblReturn.setBounds(19, 5, 43, 14);
		lblReturn.setHorizontalAlignment(SwingConstants.TRAILING);
		lblReturn.setFont(new Font("Objective", Font.PLAIN, 13));
		panelReturn.add(lblReturn);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(245, 245, 245));
		panel.setBounds(43, 114, 668, 277);
		add(panel);
		
		panel.add(paneApproval);
		panel.add(paneWIP);
		panel.add(paneCompleted);
		panel.add(paneArtReceived);
		panel.add(paneCancelled);
		panel.add(paneReturn);
		
		menuClicked(paneApproval);
		
	}
	public void menuClicked(JPanel panel) {
		paneApproval.setVisible(false);
		paneWIP.setVisible(false);
		paneCompleted.setVisible(false);
		paneArtReceived.setVisible(false);
		paneCancelled.setVisible(false);
		paneReturn.setVisible(false);
		
		panel.setVisible(true);
	}
	
	private class PanelButtonMouseAdapter extends MouseAdapter {
		
		JPanel panel;
		public PanelButtonMouseAdapter(JPanel panel) {
			this.panel = panel;
		}
		@Override
		public void mouseEntered(MouseEvent e) {
			panel.setBackground(new Color(225, 228, 225));
		}
		@Override
		public void mouseExited(MouseEvent e) {
			panel.setBackground(new Color(255, 240, 245));
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			panel.setBackground(new Color(255, 192, 203));
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			panel.setBackground(new Color(225, 228, 225));
		}
	}
	
}	
