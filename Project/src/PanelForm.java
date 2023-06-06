import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextPane;

public class PanelForm extends JPanel {
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField4;
	private JTextField textField5;
	private JTextField textField_1;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField day;
	private JTextField month;
	private JTextField year;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private AgreeementData AgreeementData;
	
	
	/**
	 * Create the panel.
	 */
	public PanelForm() {
		setBackground(new Color(255, 228, 225));
		setBounds(0, 0, 760, 439);
		setLayout(null);
		
		AgreeementData data = new AgreeementData();

		JLabel lblDigitalArtCommission = new JLabel("Art Commission Agreement\r\n");
		lblDigitalArtCommission.setBounds(43, 5, 337, 39);
		lblDigitalArtCommission.setForeground(new Color(205, 92, 92));
		lblDigitalArtCommission.setFont(new Font("Catline", Font.PLAIN, 25));
		add(lblDigitalArtCommission);
		
		JLabel lblInOrderTo = new JLabel("THIS AGREEMENT is made at the");
		lblInOrderTo.setBounds(84, 42, 224, 39);
		lblInOrderTo.setForeground(Color.BLACK);
		lblInOrderTo.setFont(new Font("Objective", Font.PLAIN, 13));
		add(lblInOrderTo);
		
		day = new JTextField();
		day.setBounds(307, 51, 42, 19);
		add(day);
		day.setColumns(10);
		
		JLabel lblDayOf = new JLabel("day of\r\n");
		lblDayOf.setForeground(Color.BLACK);
		lblDayOf.setFont(new Font("Objective", Font.PLAIN, 13));
		lblDayOf.setBounds(359, 42, 42, 39);
		add(lblDayOf);
		
		month = new JTextField();
		month.setColumns(10);
		month.setBounds(409, 51, 123, 19);
		add(month);
		
		JLabel lblInOrderTo_1 = new JLabel("in the year\r\n");
		lblInOrderTo_1.setForeground(Color.BLACK);
		lblInOrderTo_1.setFont(new Font("Objective", Font.PLAIN, 13));
		lblInOrderTo_1.setBounds(541, 42, 76, 39);
		add(lblInOrderTo_1);
		
		year = new JTextField();
		year.setColumns(10);
		year.setBounds(619, 51, 57, 19);
		add(year);
		
		JLabel lblInOrderTo_1_1 = new JLabel("between");
		lblInOrderTo_1_1.setForeground(Color.BLACK);
		lblInOrderTo_1_1.setFont(new Font("Objective", Font.PLAIN, 13));
		lblInOrderTo_1_1.setBounds(84, 71, 63, 28);
		add(lblInOrderTo_1_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(146, 74, 123, 19);
		add(textField_6);
		
		JLabel lblInOrderTo_1_1_1 = new JLabel("(the Artist), whose address is");
		lblInOrderTo_1_1_1.setForeground(Color.BLACK);
		lblInOrderTo_1_1_1.setFont(new Font("Objective", Font.PLAIN, 13));
		lblInOrderTo_1_1_1.setBounds(279, 74, 197, 23);
		add(lblInOrderTo_1_1_1);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(482, 74, 194, 19);
		add(textField_7);
		
		JLabel lblInOrderTo_1_1_2 = new JLabel("and");
		lblInOrderTo_1_1_2.setForeground(Color.BLACK);
		lblInOrderTo_1_1_2.setFont(new Font("Objective", Font.PLAIN, 13));
		lblInOrderTo_1_1_2.setBounds(84, 91, 35, 39);
		add(lblInOrderTo_1_1_2);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(146, 100, 123, 19);
		add(textField_8);
		
		JLabel lblInOrderTo_1_1_1_1 = new JLabel("(the Client), whose address is");
		lblInOrderTo_1_1_1_1.setForeground(Color.BLACK);
		lblInOrderTo_1_1_1_1.setFont(new Font("Objective", Font.PLAIN, 13));
		lblInOrderTo_1_1_1_1.setBounds(279, 99, 197, 23);
		add(lblInOrderTo_1_1_1_1);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(482, 100, 194, 19);
		add(textField_9);
		
		JLabel lblAgreement = new JLabel("AGREEMENT\r\n");
		lblAgreement.setForeground(Color.BLACK);
		lblAgreement.setFont(new Font("Objective", Font.PLAIN, 13));
		lblAgreement.setBounds(43, 120, 203, 39);
		add(lblAgreement);
		
		JLabel lblDefinitions = new JLabel("DEFINITIONS");
		lblDefinitions.setForeground(Color.BLACK);
		lblDefinitions.setFont(new Font("Objective Medium", Font.PLAIN, 13));
		lblDefinitions.setBounds(43, 141, 203, 39);
		add(lblDefinitions);
		
		JLabel lblInThisAgreement = new JLabel("In this Agreement the following words shall have the following meanings:");
		lblInThisAgreement.setForeground(Color.BLACK);
		lblInThisAgreement.setFont(new Font("Objective", Font.PLAIN, 13));
		lblInThisAgreement.setBounds(43, 155, 592, 39);
		add(lblInThisAgreement);
		
		JLabel lblInWitnessWhereof = new JLabel("IN WITNESS WHEREOF, the parties have executed this Agreement as of the date first above written.");
		lblInWitnessWhereof.setForeground(Color.BLACK);
		lblInWitnessWhereof.setFont(new Font("Objective", Font.PLAIN, 13));
		lblInWitnessWhereof.setBounds(43, 367, 687, 39);
		add(lblInWitnessWhereof);
		
		JTextPane txtpnadescriptionOf = new JTextPane();
		txtpnadescriptionOf.setBackground(new Color(255, 228, 225));
		txtpnadescriptionOf.setFont(new Font("Objective", Font.PLAIN, 11));
		txtpnadescriptionOf.setText("(a) \"Description of Work\" means the Artist agrees to create artwork (the \"Work\") as specified by the Client in the commission request.\r\n(b) \"Payment\" means the Client agrees to pay the artist (amount) for the work that Payment will be made online payment (GCash, Paypal, and Maya). The payment shall be paid upon signing this agreement. Payment should be given by the Client first after the Artsist send the commissioned art.\r\n(c) \"Ownership and Copyright\"  the Artist retains ownership and all copyright rights to the work. Client may use the work for personal use only and may not reproduce, distribute, or use the work for any commercial purposes without the written permission of the Artist.\r\n(d) \"Changes and Revisions\" the Client agrees to make all changes and revisions to the work during the initial review period. Any additional changes or revisions requested by the client after the initial review period will be subject to additional charges at the artist's hourly rate.\r\n(e) \"Entire Agreement\" this agreement constitutes the entire agreement between the parties and supersedes all prior negotiations, understandings, and agreements between the parties.\r\n(f) \"Amendments\" any amendments to this agreement made in e-signature and signed by both parties.");
		txtpnadescriptionOf.setBounds(43, 185, 687, 193);
		add(txtpnadescriptionOf);
		
		
		
		setVisible(true);
	}
}
