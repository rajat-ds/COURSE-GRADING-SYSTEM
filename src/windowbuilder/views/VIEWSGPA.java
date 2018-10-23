package windowbuilder.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class VIEWSGPA {

	public JFrame frameSGPA;
	JRadioButton RBTNsem1 = new JRadioButton("VIEW SEM 1 SGPA");
	private final JRadioButton RBTNsem2 = new JRadioButton("VIEW SEM 2 SGPA");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VIEWSGPA window = new VIEWSGPA();
					window.frameSGPA.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VIEWSGPA() {
		initialize();
		initcomponent();
		createEvent();
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/////////////////////////////EVENT HANDLER/////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	private void createEvent() {
		////////////////////////////////////////SEM 1 BUTTON////////////////////////////////////////////////////////////////////
		
		
		
		RBTNsem1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
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
						flag=1;
						JOptionPane.showMessageDialog(null," Roll no  "+y+"\nName " + s +"\n SGPA of sem1 " + yy);
					//System.out.println(y);
					//System.out.println(s);
				//	System.out.println(yy);
					
						}
			}
			frameSGPA.dispose();
			if(flag==0)
				JOptionPane.showMessageDialog(null,"Roll no not found");
			
			}
		});
		RBTNsem1.setBackground(Color.GREEN);
		RBTNsem1.setForeground(Color.BLUE);
////////////////////////////////////////////////////////////sem2 sgpa/////////////////////////////////////////////////////////////////		
		RBTNsem2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				 int roll_no=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the Roll No."));
					
				 	Scanner read = null;
					
					try {
						read = new Scanner(new FileInputStream("sem2"));
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
							flag=1;
							JOptionPane.showMessageDialog(null," Roll no  "+y+"\nName " + s +"\n SGPA of sem2 " + yy);
						//System.out.println(y);
						//System.out.println(s);
					//	System.out.println(yy);
						
							}
				}
				frameSGPA.dispose();
				if(flag==0)
					JOptionPane.showMessageDialog(null,"Roll no not found");
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			}
		});
		RBTNsem2.setBackground(Color.GREEN);
		
		
		
		
	}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/////////////////////////////////////////COMPONENT HADLER///////////////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	private void initcomponent() {
		
		frameSGPA = new JFrame();
		frameSGPA.getContentPane().setBackground(Color.PINK);
		frameSGPA.getContentPane().setForeground(Color.ORANGE);
		
		JLabel LBLtitle = new JLabel("************VIEW SGPA*********");
		LBLtitle.setForeground(Color.BLUE);
		
	
		
		
		GroupLayout groupLayout = new GroupLayout(frameSGPA.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(199)
							.addComponent(LBLtitle, GroupLayout.PREFERRED_SIZE, 257, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(66)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(RBTNsem2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(RBTNsem1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))))
					.addContainerGap(128, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(21)
					.addComponent(LBLtitle, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(48)
					.addComponent(RBTNsem1, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
					.addGap(56)
					.addComponent(RBTNsem2, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(123, Short.MAX_VALUE))
		);
		frameSGPA.getContentPane().setLayout(groupLayout);
		frameSGPA.setForeground(Color.GREEN);
		frameSGPA.setTitle("VIEW SGPA");
		frameSGPA.setBounds(100, 100, 600, 400);
		frameSGPA.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
	}
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
