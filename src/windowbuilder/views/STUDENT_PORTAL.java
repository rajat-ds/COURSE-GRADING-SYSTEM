package windowbuilder.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class STUDENT_PORTAL {

	public JFrame frameSTUDENT;
	JRadioButton RBTNviewsgpa = new JRadioButton("VIEW SGPA");
	JRadioButton RBTNviewcgpa = new JRadioButton("VIEW CGPA");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					STUDENT_PORTAL window = new STUDENT_PORTAL();
					window.frameSTUDENT.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public STUDENT_PORTAL() {
		initialize();
		initcomponent();
		createEvent();
	}

	private void createEvent() {
		RBTNviewsgpa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VIEWSGPA sgpa = new VIEWSGPA();
				sgpa.frameSGPA.setVisible(true);
				
			}
		});
		RBTNviewsgpa.setBackground(Color.ORANGE);
		//////////////////////////////////////////////VIEW CGPA BUTTON//////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		RBTNviewcgpa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				float cgpa=0;
				int roll_no=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the Roll No."));
				
			 	Scanner read = null;
				
				try {
					read = new Scanner(new FileInputStream("sem1"));
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
					int k =roll_no;int flag=0;
					
				//	for(int i=0;i<5;i++){
						while(read.hasNext()){
							
					int y=read.nextInt();
					String s=read.next();
					float yy=read.nextFloat();
					
					if(y==k){
						flag=1;cgpa=yy;
						//JOptionPane.showMessageDialog(null, cgpa);
						}
			}
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
						//////////////////////////////////////////////////////////////////////////////////////////////////////
						Scanner reade = null;
						try {
							reade = new Scanner(new FileInputStream("sem2"));
						} catch (FileNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
							//int k =roll_no;int flag=0;
							
						//	for(int i=0;i<5;i++){
								while(reade.hasNext()){
									
							int y=reade.nextInt();
							String s=reade.next();
							float yy=reade.nextFloat();
							
							if(y==k){
								flag=1;cgpa=yy+cgpa;
								JOptionPane.showMessageDialog(null,"Name :    "+s +"\nRoll No:    " + y+"\nCGPA     "+ cgpa/2);
								break;
								}
					}
						
					
				
				
				
				
			
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
				
			
			}
		});
		RBTNviewcgpa.setBackground(Color.ORANGE);
		RBTNviewcgpa.setForeground(Color.BLACK);
		
		
	}

	private void initcomponent() {
		frameSTUDENT = new JFrame();
		frameSTUDENT.getContentPane().setBackground(Color.CYAN);
		frameSTUDENT.setTitle("STUDENT PORTAL");
		frameSTUDENT.setBounds(100, 100, 600, 400);
		frameSTUDENT.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("********************WELCOME TO STUDENT PORTAL****************");
		lblNewLabel.setForeground(Color.ORANGE);
		
		
		
	
		
		GroupLayout groupLayout = new GroupLayout(frameSTUDENT.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(127)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 339, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(62)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(RBTNviewcgpa, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(RBTNviewsgpa, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE))))
					.addContainerGap(118, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(30)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addGap(58)
					.addComponent(RBTNviewsgpa, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addGap(62)
					.addComponent(RBTNviewcgpa, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(90, Short.MAX_VALUE))
		);
		frameSTUDENT.getContentPane().setLayout(groupLayout);
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	
	}
}
