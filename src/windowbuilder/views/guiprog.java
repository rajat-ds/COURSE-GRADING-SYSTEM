package windowbuilder.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class guiprog extends Staffportal{

	private JFrame frmLoginportal;
	private JTextField USERNAMEFIELD;
	private JPasswordField passwordField;
	JComboBox comboBox = new JComboBox();
	JButton LOGINButton = new JButton("");
	private String stulogin="student",stupassword="student",stafflogin="staff",staffpassword="staff";

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					guiprog window = new guiprog();
					window.frmLoginportal.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	
	
	
	
	
	
	
	
	/**
	 * Create the application.
	 */
	public guiprog() {
		initialize();
		initcomponents();
		createEvent();
	}
     private void createEvent() {
		// TODO Auto-generated method stub
    	 comboBox.addActionListener(new ActionListener() {
 			public void actionPerformed(ActionEvent arg0) {
 			}
 		});
 		comboBox.setModel(new DefaultComboBoxModel(new String[] {"STAFF", "STUDENT"}));
 		//////////////////////////////////////////////////////////////////////////////
 		////LOGINBUTTON
 		//////////////////////////////////////
 		LOGINButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				char pass[] = passwordField.getPassword();
				String user = USERNAMEFIELD.getText();
				String p = new String(pass);
				int selectedoption = comboBox.getSelectedIndex();
				if(selectedoption==0){
					if(user.equals(stafflogin)&&p.equals(staffpassword))
						
			    {       frame1.setVisible(true); 
						exit();
					     JOptionPane.showMessageDialog(null,"LOGIN_SUCCESSFULLY");
					    
					}
					else
						 JOptionPane.showMessageDialog(null,"LOGIN_FAILED");
				}
				else
				{
					if(user.equals(stulogin)&&p.equals(stupassword))
				    {   STUDENT_PORTAL studentportal = new STUDENT_PORTAL();  
						
						studentportal.frameSTUDENT.setVisible(true); 
						     JOptionPane.showMessageDialog(null,"LOGIN_SUCCESSFULLY");
						     
						     exit();
						}
						else
							 JOptionPane.showMessageDialog(null,"LOGIN_FAILED");
					
					
					
					
				}
				
				
				
				
			}
		});
		LOGINButton.setIcon(new ImageIcon(guiprog.class.getResource("/windowbulder/resorces/6348364-Login-icon-button-blue-glossy-with-shadow-vector-illustration-Stock-Vector.jpg")));
	}









	private void initcomponents() {
		frmLoginportal = new JFrame();
		frmLoginportal.getContentPane().setBackground(Color.YELLOW);
		
		JLabel LOGINTITLLE = new JLabel("WELCOME TO IIIT KOTTAYAM COURSE GRADING SYSTEM");
		LOGINTITLLE.setForeground(Color.RED);
		
		JLabel LOGINASl = new JLabel("LOGIN_AS");
		LOGINASl.setForeground(Color.RED);
		
		
		
		
		JLabel USERNAME = new JLabel("USERNAME");
		USERNAME.setForeground(Color.RED);
		
		USERNAMEFIELD = new JTextField();
		USERNAMEFIELD.setColumns(10);
		
		JLabel LBLPASSWORD = new JLabel("PASSWORD");
		LBLPASSWORD.setForeground(Color.RED);
		
		passwordField = new JPasswordField();
		passwordField.setEchoChar('*');
		
	
		
		GroupLayout groupLayout = new GroupLayout(frmLoginportal.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(131)
							.addComponent(LOGINTITLLE, GroupLayout.PREFERRED_SIZE, 336, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(92)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(USERNAME, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(LOGINASl, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
								.addComponent(LBLPASSWORD, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGap(80)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(passwordField)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
									.addComponent(USERNAMEFIELD)
									.addComponent(comboBox, 0, 154, Short.MAX_VALUE)))))
					.addContainerGap(90, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(223)
					.addComponent(LOGINButton, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(215, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(32)
					.addComponent(LOGINTITLLE, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
					.addGap(34)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(LOGINASl, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(53)
							.addComponent(USERNAME, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(45)
							.addComponent(USERNAMEFIELD)))
					.addGap(35)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(LBLPASSWORD, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
					.addComponent(LOGINButton, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		frmLoginportal.getContentPane().setLayout(groupLayout);
		frmLoginportal.setBackground(Color.YELLOW);
		frmLoginportal.setIconImage(Toolkit.getDefaultToolkit().getImage(guiprog.class.getResource("/windowbulder/resorces/login_user_profile_account-512.png")));
		frmLoginportal.setTitle("LOGIN_PORTAL");
		frmLoginportal.setBounds(100, 100, 600, 400);
	}









	public void exit(){
    	 frmLoginportal.dispose();
     }
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
	}
}
