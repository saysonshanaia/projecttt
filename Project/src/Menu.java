import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;


import java.awt.Font;

public class Menu extends JFrame {
	
	private JPanel contentPane;
	
	private Image img_logo = new ImageIcon(Menu.class.getResource("res/LOGO1.png")).getImage().getScaledInstance(208,55, Image.SCALE_SMOOTH);

	private PanelHome panelHome;
	private PanelProgress panelProgress;
	private PanelPortfolio panelPortfolio;
	private PanelForm panelForm;
	private PanelAbout panelAbout;
	private PanelAgreement panelAgreement;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Menu() {
		setBackground(new Color(143, 188, 143));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 780, 527);
		setUndecorated(true);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 228, 225));
		contentPane.setBorder(new LineBorder(new Color(143, 188, 143), 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);		
		
		panelHome = new PanelHome();
		panelProgress = new PanelProgress();
		panelPortfolio = new PanelPortfolio();
		panelForm = new PanelForm();
		panelAbout = new PanelAbout();
		panelAgreement = new PanelAgreement();
		
		JLabel lblLOGO = new JLabel("");
		lblLOGO.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLOGO.setBounds(303, 6, 208, 55);
		lblLOGO.setIcon(new ImageIcon(img_logo));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(143, 188, 143));
		panel.setBounds(0, 0, 780, 66);
		contentPane.add(panel);
		panel.setLayout(null);
		panel.add(lblLOGO);
		
		JPanel paneHome = new JPanel();
		paneHome.addMouseListener(new PanelButtonMouseAdapter(paneHome){
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelHome);
			}
		});
		paneHome.addMouseListener(new PanelButtonMouseAdapter(paneHome));
		paneHome.setBackground(new Color(143, 188, 143));
		paneHome.setBounds(10, 39, 71, 27);
		panel.add(paneHome);
		
		JLabel lblNewLabel = new JLabel("HOME");
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Objective", Font.PLAIN, 13));
		paneHome.add(lblNewLabel);
		
		JPanel paneProgress = new JPanel();
		paneProgress.addMouseListener(new PanelButtonMouseAdapter(paneProgress) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelProgress);
			}
		});
		paneProgress.addMouseListener(new PanelButtonMouseAdapter(paneProgress));
		paneProgress.setBackground(new Color(143, 188, 143));
		paneProgress.setBounds(91, 39, 95, 27);
		panel.add(paneProgress);
		
		JLabel lblNewLabel_1 = new JLabel("PROGRESS");
		lblNewLabel_1.setFont(new Font("Objective", Font.PLAIN, 13));
		paneProgress.add(lblNewLabel_1);
		
		JPanel panePortfolio = new JPanel();
		panePortfolio.addMouseListener(new PanelButtonMouseAdapter(panePortfolio) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelPortfolio);
			}
		});
		panePortfolio.addMouseListener(new PanelButtonMouseAdapter(panePortfolio));
		panePortfolio.setBackground(new Color(143, 188, 143));
		panePortfolio.setBounds(196, 39, 95, 27);
		panel.add(panePortfolio);
		
		JLabel lblNewLabel_2 = new JLabel("PORTFOLIO");
		lblNewLabel_2.setFont(new Font("Objective", Font.PLAIN, 13));
		panePortfolio.add(lblNewLabel_2);
		
		JPanel paneForm = new JPanel();
		paneForm.addMouseListener(new PanelButtonMouseAdapter(paneForm) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelAgreement);
				menuClicked(panelForm);
			}
		});
		paneForm.addMouseListener(new PanelButtonMouseAdapter(paneForm));
		paneForm.setBackground(new Color(143, 188, 143));
		paneForm.setBounds(521, 39, 71, 27);
		panel.add(paneForm);
		
		JLabel lblNewLabel_3 = new JLabel("FORM");
		lblNewLabel_3.setFont(new Font("Objective", Font.PLAIN, 13));
		paneForm.add(lblNewLabel_3);
		
		JPanel paneAbout = new JPanel();
		paneAbout.addMouseListener(new PanelButtonMouseAdapter(paneAbout) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelAbout);
			}
		});
		paneAbout.addMouseListener(new PanelButtonMouseAdapter(paneAbout));
		paneAbout.setBackground(new Color(143, 188, 143));
		paneAbout.setBounds(602, 39, 71, 27);
		panel.add(paneAbout);
		
		JLabel lblNewLabel_4 = new JLabel("ABOUT");
		lblNewLabel_4.setFont(new Font("Objective", Font.PLAIN, 13));
		paneAbout.add(lblNewLabel_4);
		
		JPanel paneLogout = new JPanel();
		paneLogout.addMouseListener(new PanelButtonMouseAdapter(paneLogout) {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to Log out?") == 0) {
					LoginForm frame = new LoginForm();
					frame.setVisible(true);
					Menu.this.dispose();
				}
			}
		});
		paneLogout.addMouseListener(new PanelButtonMouseAdapter(paneLogout));
		paneLogout.setBackground(new Color(143, 188, 143));
		paneLogout.setBounds(683, 39, 87, 27);
		panel.add(paneLogout);
		
		JLabel lblNewLabel_5 = new JLabel("LOG OUT");
		lblNewLabel_5.setFont(new Font("Objective", Font.PLAIN, 13));
		paneLogout.add(lblNewLabel_5);
		
		JLabel lblExit = new JLabel("X");
		lblExit.setForeground(new Color(85, 107, 47));
		lblExit.setHorizontalAlignment(SwingConstants.RIGHT);
		lblExit.setFont(new Font("Objective", Font.PLAIN, 15));
		lblExit.setBounds(714, 11, 56, 14);
		lblExit.addMouseListener(new MouseAdapter() {
		
		
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
					Menu.this.dispose();
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblExit.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblExit.setForeground(Color.WHITE);
			}
		});
		
		contentPane.add(lblExit);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 228, 225));
		panel_1.setBounds(10, 77, 760, 439);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		panel_1.add(panelHome);
		panel_1.add(panelProgress);
		panel_1.add(panelPortfolio);
		panel_1.add(panelForm);
		panel_1.add(panelAbout);
		panel_1.add(panelAgreement);
		
		menuClicked(panelHome);
	}
	
	public void menuClicked(JPanel panel) {
		panelHome.setVisible(false);
		panelProgress.setVisible(false);
		panelPortfolio.setVisible(false);
		panelForm.setVisible(false);
		panelAbout.setVisible(false);
		panelAgreement.setVisible(false);
		
		panel.setVisible(true);
	}
	
	private class PanelButtonMouseAdapter extends MouseAdapter {
		
		JPanel panel;
		public PanelButtonMouseAdapter(JPanel panel) {
			this.panel = panel;
		}
		@Override
		public void mouseEntered(MouseEvent e) {
			panel.setBackground(new Color(133, 177, 133));
		}
		@Override
		public void mouseExited(MouseEvent e) {
			panel.setBackground(new Color(143, 188, 143));
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			panel.setBackground(new Color(183, 197, 183));
		}
		
		@Override
		public void mouseReleased(MouseEvent e) {
			panel.setBackground(new Color(143, 188, 143));
		}
	}
	
}	
	


		

	

