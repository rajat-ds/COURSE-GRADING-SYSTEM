package windowbuilder.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Window.Type;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

//import windowbuilder.views.changeGradingScale.JAVA;
//import windowbuilder.views.changeGradingScale.MATHS;

import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class Staffportal extends VIEWSGPA {

	 JFrame frame1;
	JRadioButton CHANEGRADESCALERBTN = new JRadioButton("CHANGE THE GRADING SCALE");
	int selected;
	JRadioButton RBTNmarkssem1 = new JRadioButton("ENTER THE MARKS OF SEM 1");
	private final JRadioButton RBTNmarkssem2 = new JRadioButton("ENTER THE MARKS OF SEM 2 ");
	private final JRadioButton RBTNviewsgpa = new JRadioButton("VIEW SGPA");
	private final JRadioButton RBTNviewcgpa = new JRadioButton("VIEW CGPA");
	private final JRadioButton RBTNexit = new JRadioButton("EXIT");
	changeGradingScale CGS = new changeGradingScale();
	SEM_1_INPUT SEM1 = new SEM_1_INPUT();
	SEM_2_INPUT SEM2 = new SEM_2_INPUT();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Staffportal window = new Staffportal();
					window.frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Staffportal() {
		initialize();
		initcomponents();
		createEvent();
	}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/////////////EVENT HANDLER
	////////////////////////////////
	private void createEvent() {
	///////////////////////////////////////////////////////////////////////////////	
		CHANEGRADESCALERBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(CHANEGRADESCALERBTN.isSelected())
					selected=1;CGS.frame2.setVisible(true);
				    frame1.dispose();
				}
		});
		CHANEGRADESCALERBTN.setBackground(new Color(0, 191, 255));
	/////////////////////////////////////////////////////////////////////////////////////////////////
		RBTNmarkssem1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
             if(RBTNmarkssem1.isSelected())
            	 selected=2;SEM1.frameSEM1.setVisible(true);
				    frame1.dispose();
			}
		});
		RBTNmarkssem1.setBackground(new Color(0, 191, 255));
//////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		RBTNmarkssem2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(RBTNmarkssem2.isSelected())
					selected=3;
				SEM2.frameSEM2.setVisible(true);
			    frame1.dispose();
			}
		});
		RBTNmarkssem2.setBackground(new Color(0, 191, 255));
////////////////////////////////////////////////////////////////////////////////////////////////////////////
		RBTNviewsgpa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(RBTNviewsgpa.isSelected())
					selected=4;
				frameSGPA.setVisible(true);
				  frame1.dispose();
			}
		});
		RBTNviewsgpa.setBackground(new Color(0, 191, 255));
/////////////////////////////////////////////////////////////////////////////////////////////////////////
		RBTNviewcgpa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(RBTNviewcgpa.isSelected())
					selected=5;
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
				
			
		
		
		
		
	
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////				
////////////////////////////////////////////////////////////////////////////////////////////////////////////////				
			}
		});
		RBTNviewcgpa.setBackground(new Color(0, 191, 255));
/////////////////////////////////////////////////////////////////////////////////////////
		RBTNexit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(RBTNexit.isSelected())
					frame1.dispose();
			}
		});
		RBTNexit.setForeground(new Color(0, 0, 0));
		RBTNexit.setBackground(new Color(0, 191, 255));
/////////////////////////////////////////////////////////////////////////////////////////////////////
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////ADD COMPONENTS
	///////////////////////////////////////////////////////////
	private void initcomponents() {
	
		
		
		
		frame1 = new JFrame();
		frame1.getContentPane().setBackground(new Color(255, 215, 0));
		frame1.setBackground(new Color(102, 205, 170));
		frame1.setForeground(Color.GREEN);
		frame1.setTitle("STAFF_PORTAL");
		frame1.setBounds(100, 100, 600, 400);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel LBLTITLE = new JLabel("****************WELCOME TO STAFF PORTAL***********");
		LBLTITLE.setForeground(Color.RED);
		LBLTITLE.setBackground(Color.ORANGE);
		
		
	
		
	
		
		GroupLayout groupLayout = new GroupLayout(frame1.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(119)
							.addComponent(LBLTITLE, GroupLayout.PREFERRED_SIZE, 343, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(79)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(RBTNmarkssem1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(CHANEGRADESCALERBTN, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
								.addComponent(RBTNmarkssem2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(RBTNviewsgpa, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(RBTNviewcgpa, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(RBTNexit, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
					.addContainerGap(122, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(19)
					.addComponent(LBLTITLE, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addGap(37)
					.addComponent(CHANEGRADESCALERBTN)
					.addGap(18)
					.addComponent(RBTNmarkssem1)
					.addGap(18)
					.addComponent(RBTNmarkssem2)
					.addGap(18)
					.addComponent(RBTNviewsgpa)
					.addGap(18)
					.addComponent(RBTNviewcgpa)
					.addGap(18)
					.addComponent(RBTNexit)
					.addContainerGap(46, Short.MAX_VALUE))
		);
		frame1.getContentPane().setLayout(groupLayout);

	}
	
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	//////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public class changeGradingScale  {

		public JFrame frame2;
		JRadioButton RBTNjava = new JRadioButton("JAVA");
		 JRadioButton RBTNmathematics = new JRadioButton("MATHEMATICS");
		 ////////////////////////////////////////////////////////////////////////////////////////////////////
		 /////////////////OBJECT OF TYPE JAVA///////////////////////////////////////////////////////////////
		 //////////////////////////////////////////////////////////////////////////////////////////////
		  JAVA javachange = new JAVA();
		  MATHS mathchange = new MATHS();
		 
		 
		 
		 
		/**
		 * Launch the application.
		 */
		public  void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						changeGradingScale window = new changeGradingScale();
						window.frame2.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
	     
		/**
		 * Create the application.
		 */
		public changeGradingScale() {
			initialize();
			initcomponents();
			createEvent();
		}

		private void createEvent() {
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			RBTNjava.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					javachange.frameJAVA.setVisible(true);
					
					frame2.dispose();
					
				}
			});
			RBTNjava.setBackground(new Color(255, 0, 255));
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			RBTNmathematics.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
	mathchange.frameMATHS.setVisible(true);
					
					frame2.dispose();
					
					
				}
			});
			RBTNmathematics.setBackground(new Color(255, 0, 255));
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		}

		private void initcomponents() {
			frame2 = new JFrame();
			frame2.getContentPane().setBackground(new Color(51, 255, 204));
			frame2.setBackground(new Color(154, 205, 50));
			frame2.setTitle("CHANGE GRADING SCALE");
			frame2.setBounds(100, 100, 600, 400);
			frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			JLabel LBLtitle = new JLabel("**************SELECT THE SUBJECT****************");
			LBLtitle.setForeground(new Color(255, 0, 0));
			LBLtitle.setBackground(new Color(0, 255, 51));
			
			
		
			
			
		
			GroupLayout groupLayout = new GroupLayout(frame2.getContentPane());
			groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
					.addGroup(groupLayout.createSequentialGroup()
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addGroup(groupLayout.createSequentialGroup()
								.addGap(153)
								.addComponent(LBLtitle, GroupLayout.PREFERRED_SIZE, 336, GroupLayout.PREFERRED_SIZE))
							.addGroup(groupLayout.createSequentialGroup()
								.addGap(83)
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(RBTNmathematics, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(RBTNjava, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE))))
						.addContainerGap(95, Short.MAX_VALUE))
			);
			groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
					.addGroup(groupLayout.createSequentialGroup()
						.addGap(48)
						.addComponent(LBLtitle, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addGap(26)
						.addComponent(RBTNjava, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addGap(54)
						.addComponent(RBTNmathematics, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(128, Short.MAX_VALUE))
			);
			frame2.getContentPane().setLayout(groupLayout);
			
		}

		/**
		 * Initialize the contents of the frame.
		 */
		private void initialize() {
			
		}

		
		
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////JAVA CHANGE GRADE PAGE/////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
		
		
		
		
		
		public class JAVA  {

			public JFrame frameJAVA;
			private JTextField TFgrade_A;
			private JLabel LBLgradeB;
			private JTextField TFgradeB;
			private JLabel LBLgradeC;
			private JLabel LBLgradeD;
			private JLabel LBLgradeE;
			private JLabel LBLgradeF;
			private JTextField TFgradeC;
			private JTextField TFgradeD;
			private JTextField TFgradeE;
			private JTextField TFgradeF;
			JButton OKbutton = new JButton("PRESS OK");
			public int JgradeA=91,JgradeB=81,JgradeC=71,JgradeD=61,JgradeE=51,JgradeF=41;
			//changeGradingScale CGS = new changeGradingScale();

			/**
			 * Launch the application.
			 */
			public  void main(String[] args) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							JAVA window = new JAVA();
							window.frameJAVA.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}

			/**
			 * Create the application.
			 */
			public JAVA() {
				initialize();
				initcomponents();
				createEvent();
			}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
			/////////////////EVENT HANDLER.////////////////////////////////////////////////////////////////////
			//////////////////////////////////////////////////////////////////////////////////////////////////
			private void createEvent() {
				OKbutton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					

						FileWriter fw = null;
						try {
							fw = new FileWriter("java");
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						PrintWriter pw=new PrintWriter(fw);
						try {
							FileWriter fwe=new FileWriter("java",true);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						PrintWriter pwe=new PrintWriter(fw,true);
						pwe.println(Integer.parseInt(TFgrade_A.getText()));
						pwe.println(Integer.parseInt(TFgradeB.getText()));
						pwe.println(Integer.parseInt(TFgradeC.getText()));
						pwe.println(Integer.parseInt(TFgradeD.getText()));
						pwe.println(Integer.parseInt(TFgradeE.getText()));
						pwe.println(Integer.parseInt(TFgradeF.getText()));
						
						frameJAVA.dispose();
						 frame1.setVisible(true);
						
						
						
						
						
					
					}
				});
				OKbutton.setBackground(new Color(102, 102, 255));
			/////////////////////////////////////////////////////////////////////////////////////////////////////////////	
			}

			private void initcomponents() {
				frameJAVA = new JFrame();
				frameJAVA.getContentPane().setBackground(new Color(0, 255, 102));
				
				JLabel LBLgradeA = new JLabel("ENTER LOWER LIMIT OF GRADE \"A\"");
				LBLgradeA.setForeground(new Color(255, 0, 0));
				
				TFgrade_A = new JTextField();
				TFgrade_A.setColumns(10);
				
				LBLgradeB = new JLabel("ENTER LOWER LIMIT OF GRADE \"B\"");
				LBLgradeB.setForeground(new Color(255, 0, 0));
				
				TFgradeB = new JTextField();
				TFgradeB.setColumns(10);
				
				LBLgradeC = new JLabel("ENTER LOWER LIMIT OF GRADE \"C\"");
				LBLgradeC.setForeground(new Color(255, 0, 0));
				
				LBLgradeD = new JLabel("ENTER LOWER LIMIT OF GRADE \"D\"");
				LBLgradeD.setForeground(new Color(255, 0, 0));
				
				LBLgradeE = new JLabel("ENTER LOWER LIMIT OF GRADE \"E\"");
				LBLgradeE.setForeground(new Color(255, 0, 0));
				
				LBLgradeF = new JLabel("ENTER LOWER LIMIT OF GRADE \"F\"");
				LBLgradeF.setForeground(new Color(255, 0, 0));
				
				TFgradeC = new JTextField();
				TFgradeC.setColumns(10);
				
				TFgradeD = new JTextField();
				TFgradeD.setColumns(10);
				
				TFgradeE = new JTextField();
				TFgradeE.setColumns(10);
				
				TFgradeF = new JTextField();
				TFgradeF.setColumns(10);
				
				
				
				GroupLayout groupLayout = new GroupLayout(frameJAVA.getContentPane());
				groupLayout.setHorizontalGroup(
					groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(26)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(LBLgradeF, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
								.addComponent(LBLgradeE, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
								.addComponent(LBLgradeD, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
								.addComponent(LBLgradeC, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(Alignment.LEADING, groupLayout.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(LBLgradeB, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(LBLgradeA, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
							.addGap(95)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(TFgradeF, GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
								.addComponent(TFgradeE, GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
								.addComponent(TFgradeD, GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
								.addComponent(TFgradeC, GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
								.addComponent(TFgradeB)
								.addComponent(TFgrade_A, GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
							.addGap(135))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addContainerGap(426, Short.MAX_VALUE)
							.addComponent(OKbutton, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
							.addGap(51))
				);
				groupLayout.setVerticalGroup(
					groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(LBLgradeA, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addComponent(TFgrade_A, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
							.addGap(34)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(TFgradeB)
								.addComponent(LBLgradeB, GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
							.addGap(29)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(LBLgradeC, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
								.addComponent(TFgradeC, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
							.addGap(26)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(LBLgradeD, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addComponent(TFgradeD, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(27)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(LBLgradeE, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(LBLgradeF, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
										.addComponent(TFgradeF, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)))
								.addComponent(TFgradeE, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addComponent(OKbutton, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(19, Short.MAX_VALUE))
				);
				frameJAVA.getContentPane().setLayout(groupLayout);
				frameJAVA.setTitle("GRADING SCALE JAVA");
				frameJAVA.setBounds(100, 100, 600, 400);
				frameJAVA.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
			}

			/**
			 * Initialize the contents of the frame.
			 */
			private void initialize() {
				
			}
			
		}

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////MATHEMATICS CHANGE GRADE PAGE///////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		public class MATHS  {

			public JFrame frameMATHS;
			private JTextField TFgrade_A;
			private JLabel LBLgradeB;
			private JTextField TFgradeB;
			private JLabel LBLgradeC;
			private JLabel LBLgradeD;
			private JLabel LBLgradeE;
			private JLabel LBLgradeF;
			private JTextField TFgradeC;
			private JTextField TFgradeD;
			private JTextField TFgradeE;
			private JTextField TFgradeF;
			JButton OKbutton = new JButton("PRESS OK");
			public int MgradeA=91,MgradeB=81,MgradeC=71,MgradeD=61,MgradeE=51,MgradeF=41;

			/**
			 * Launch the application.
			 */
			public  void main(String[] args) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							JAVA window = new JAVA();
							window.frameJAVA.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}

			/**
			 * Create the application.
			 */
			public MATHS() {
				initialize();
				initcomponents();
				createEvent();
			}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
			///////////////////envent handler/////////////////////////////////////////////////////////////////
			///////////////////////////////////////////////////////////////////////////////////////////////////
			private void createEvent() {
				OKbutton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						frameMATHS.dispose();
					JOptionPane.showMessageDialog(null,"Done_Successfully");
					FileWriter fw = null;
					try {
						fw = new FileWriter("maths");
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					PrintWriter pw=new PrintWriter(fw);
					try {
						FileWriter fwe=new FileWriter("maths",true);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					PrintWriter pwe=new PrintWriter(fw,true);
					pwe.println(Integer.parseInt(TFgrade_A.getText()));
					pwe.println(Integer.parseInt(TFgradeB.getText()));
					pwe.println(Integer.parseInt(TFgradeC.getText()));
					pwe.println(Integer.parseInt(TFgradeD.getText()));
					pwe.println(Integer.parseInt(TFgradeE.getText()));
					pwe.println(Integer.parseInt(TFgradeF.getText()));
					
					 frame1.setVisible(true);
					
					
					
					
					
					  
					
					
					
					}
				});
				OKbutton.setBackground(new Color(102, 102, 255));
			/////////////////////////////////////////////////////////////////////////////////////////////////////////////	
			}

			private void initcomponents() {
				frameMATHS = new JFrame();
				frameMATHS.getContentPane().setBackground(new Color(0, 255, 102));
				
				JLabel LBLgradeA = new JLabel("ENTER LOWER LIMIT OF GRADE \"A\"");
				LBLgradeA.setForeground(new Color(255, 0, 0));
				
				TFgrade_A = new JTextField();
				TFgrade_A.setColumns(10);
				
				LBLgradeB = new JLabel("ENTER LOWER LIMIT OF GRADE \"B\"");
				LBLgradeB.setForeground(new Color(255, 0, 0));
				
				TFgradeB = new JTextField();
				TFgradeB.setColumns(10);
				
				LBLgradeC = new JLabel("ENTER LOWER LIMIT OF GRADE \"C\"");
				LBLgradeC.setForeground(new Color(255, 0, 0));
				
				LBLgradeD = new JLabel("ENTER LOWER LIMIT OF GRADE \"D\"");
				LBLgradeD.setForeground(new Color(255, 0, 0));
				
				LBLgradeE = new JLabel("ENTER LOWER LIMIT OF GRADE \"E\"");
				LBLgradeE.setForeground(new Color(255, 0, 0));
				
				LBLgradeF = new JLabel("ENTER LOWER LIMIT OF GRADE \"F\"");
				LBLgradeF.setForeground(new Color(255, 0, 0));
				
				TFgradeC = new JTextField();
				TFgradeC.setColumns(10);
				
				TFgradeD = new JTextField();
				TFgradeD.setColumns(10);
				
				TFgradeE = new JTextField();
				TFgradeE.setColumns(10);
				
				TFgradeF = new JTextField();
				TFgradeF.setColumns(10);
				
				
				
				GroupLayout groupLayout = new GroupLayout(frameMATHS.getContentPane());
				groupLayout.setHorizontalGroup(
					groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(26)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(LBLgradeF, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
								.addComponent(LBLgradeE, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
								.addComponent(LBLgradeD, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
								.addComponent(LBLgradeC, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(Alignment.LEADING, groupLayout.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(LBLgradeB, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(LBLgradeA, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
							.addGap(95)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(TFgradeF, GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
								.addComponent(TFgradeE, GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
								.addComponent(TFgradeD, GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
								.addComponent(TFgradeC, GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
								.addComponent(TFgradeB)
								.addComponent(TFgrade_A, GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
							.addGap(135))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addContainerGap(426, Short.MAX_VALUE)
							.addComponent(OKbutton, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
							.addGap(51))
				);
				groupLayout.setVerticalGroup(
					groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(LBLgradeA, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addComponent(TFgrade_A, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
							.addGap(34)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(TFgradeB)
								.addComponent(LBLgradeB, GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
							.addGap(29)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(LBLgradeC, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
								.addComponent(TFgradeC, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
							.addGap(26)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(LBLgradeD, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addComponent(TFgradeD, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(27)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(LBLgradeE, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(LBLgradeF, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
										.addComponent(TFgradeF, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)))
								.addComponent(TFgradeE, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addComponent(OKbutton, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(19, Short.MAX_VALUE))
				);
				frameMATHS.getContentPane().setLayout(groupLayout);
				frameMATHS.setTitle("GRADING SCALE MATHEMATICS");
				frameMATHS.setBounds(100, 100, 600, 400);
				frameMATHS.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
			}

			/**
			 * Initialize the contents of the frame.
			 */
			private void initialize() {
				
			}
			
		}
	}
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//////////////////////////SEM1 MARKS/////////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public class SEM_1_INPUT  {

		public JFrame frameSEM1;
		private JTextField TFrollno;
		private JTextField TFname;
		private JTextField tfjava;
		private JTextField TFmaths;
		JButton JBTNpressok = new JButton("PRESS OK");
		public int sem1sgpa=0;
		changeGradingScale CGS = new changeGradingScale();
		

		/**
		 * Launch the application.
		 */
		public  void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						SEM_1_INPUT window = new SEM_1_INPUT();
						window.frameSEM1.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

		/**
		 * Create the application.
		 */
		public SEM_1_INPUT() {
			initialize();
			initcomponents();
			createEvents();
		}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////EVENT HANDLER//////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////
		private void createEvents() {
			JBTNpressok.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
            int javagradeA=91,javagradeB=81,javagradeC=71,javagradeD=61,javagradeE=51,javagradeF=41;
			int mathgradeA=91,mathgradeB=81,mathgradeC=71,mathgradeD=61,mathgradeE=51,mathgradeF=41;		
					
            Scanner reade = null;

            try {
            	reade = new Scanner(new FileInputStream("maths"));
            } catch (FileNotFoundException e) {
            	// TODO Auto-generated catch block
            	e.printStackTrace();
            }
            while(reade.hasNext()){
            	mathgradeA=reade.nextInt();
            	mathgradeB=reade.nextInt();
            	mathgradeC=reade.nextInt();
            	mathgradeD=reade.nextInt();
            	mathgradeE=reade.nextInt();
            	mathgradeF=reade.nextInt();
            }
            if(Integer.parseInt(TFmaths.getText())>=mathgradeA)
            sem1sgpa=10+sem1sgpa;
            else if(Integer.parseInt(TFmaths.getText())>=mathgradeB&&Integer.parseInt(TFmaths.getText())<mathgradeA)
            sem1sgpa=9+sem1sgpa;
            else if(Integer.parseInt(TFmaths.getText())>=mathgradeC&&Integer.parseInt(TFmaths.getText())<mathgradeB)
            	sem1sgpa=8+sem1sgpa;
            else if(Integer.parseInt(TFmaths.getText())>=mathgradeD&&Integer.parseInt(TFmaths.getText())<mathgradeC)
            	sem1sgpa=7+sem1sgpa;
            else if(Integer.parseInt(TFmaths.getText())>=mathgradeE&&Integer.parseInt(TFmaths.getText())<mathgradeD)
            	sem1sgpa=6+sem1sgpa;
            else if(Integer.parseInt(TFmaths.getText())>=mathgradeF&&Integer.parseInt(TFmaths.getText())<mathgradeE)
            	sem1sgpa=5+sem1sgpa;
            else
            	sem1sgpa=0;	
            	




Scanner read = null;

try {
	read = new Scanner(new FileInputStream("java"));
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
while(read.hasNext()){
	javagradeA=read.nextInt();
	javagradeB=read.nextInt();
	javagradeC=read.nextInt();
	javagradeD=read.nextInt();
	javagradeE=read.nextInt();
	javagradeF=read.nextInt();
}
if(Integer.parseInt(tfjava.getText())>=javagradeA)
sem1sgpa=10+sem1sgpa;
else if(Integer.parseInt(tfjava.getText())>=javagradeB&&Integer.parseInt(tfjava.getText())<javagradeA)
sem1sgpa=9+sem1sgpa;
else if(Integer.parseInt(tfjava.getText())>=javagradeC&&Integer.parseInt(tfjava.getText())<javagradeB)
	sem1sgpa=8+sem1sgpa;
else if(Integer.parseInt(tfjava.getText())>=javagradeD&&Integer.parseInt(tfjava.getText())<javagradeC)
	sem1sgpa=7+sem1sgpa;
else if(Integer.parseInt(tfjava.getText())>=javagradeE&&Integer.parseInt(tfjava.getText())<javagradeD)
	sem1sgpa=6+sem1sgpa;
else if(Integer.parseInt(tfjava.getText())>=javagradeF&&Integer.parseInt(tfjava.getText())<javagradeE)
	sem1sgpa=5+sem1sgpa;
else
	sem1sgpa=0;	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////SAVING RECORDS////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
FileWriter fwe = null;
try {
	fwe = new FileWriter("sem1",true);
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
PrintWriter pwe=new PrintWriter(fwe,true);
pwe.print(Integer.parseInt(TFrollno.getText())+" ");
pwe.print(TFname.getText()+ " ");
pwe.println((float)sem1sgpa/2);

///////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////










frame1.setVisible(true);
frameSEM1.dispose();
JOptionPane.showMessageDialog(null,"number saved successfully and sgpa is" + (float)sem1sgpa/2);





















				}
			});
		}
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		///////////////////////////COMPONENTS////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////////////////////////
		private void initcomponents() {
		
			frameSEM1 = new JFrame();
			frameSEM1.getContentPane().setBackground(Color.PINK);
			frameSEM1.getContentPane().setForeground(Color.GREEN);
			
			JLabel LBLtitle = new JLabel("****************ENTER THE MARKS OF SEM1***********");
			LBLtitle.setForeground(Color.BLUE);
			
			JLabel LBLrollno = new JLabel("ENTER THE ROLL NO:");
			LBLrollno.setForeground(new Color(0, 0, 0));
			
			TFrollno = new JTextField();
			TFrollno.setColumns(10);
			
			JLabel LBLname = new JLabel("ENTER THE NAME OF STUDENT:");
			
			TFname = new JTextField();
			TFname.setColumns(10);
			
			JLabel LBLjava = new JLabel("ENTER THE MARKS OF JAVA:");
			
			tfjava = new JTextField();
			tfjava.setColumns(10);
			
			JLabel LBLmaths = new JLabel("ENETR THE MARKS OF MATHS:");
			
			TFmaths = new JTextField();
			TFmaths.setColumns(10);
			
			
			
			GroupLayout groupLayout = new GroupLayout(frameSEM1.getContentPane());
			groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
					.addGroup(groupLayout.createSequentialGroup()
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addGroup(groupLayout.createSequentialGroup()
								.addGap(128)
								.addComponent(LBLtitle, GroupLayout.PREFERRED_SIZE, 304, GroupLayout.PREFERRED_SIZE))
							.addGroup(groupLayout.createSequentialGroup()
								.addGap(50)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
									.addComponent(LBLrollno, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
									.addComponent(LBLname, GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
									.addComponent(LBLjava, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
									.addComponent(LBLmaths, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addPreferredGap(ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
									.addComponent(TFmaths)
									.addComponent(tfjava)
									.addComponent(TFname)
									.addComponent(TFrollno, GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))))
						.addContainerGap(152, Short.MAX_VALUE))
					.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
						.addContainerGap(410, Short.MAX_VALUE)
						.addComponent(JBTNpressok, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
						.addGap(48))
			);
			groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
					.addGroup(groupLayout.createSequentialGroup()
						.addContainerGap()
						.addComponent(LBLtitle, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addGap(18)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(LBLrollno, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
							.addComponent(TFrollno, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
						.addGap(40)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(LBLname, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
							.addComponent(TFname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(38)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addComponent(LBLjava)
							.addComponent(tfjava, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(31)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(LBLmaths, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addComponent(TFmaths, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
						.addComponent(JBTNpressok, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addGap(24))
			);
			frameSEM1.getContentPane().setLayout(groupLayout);
			frameSEM1.setTitle("ENTERS MARKS OF SEM 1");
			frameSEM1.setBounds(100, 100, 600, 400);
			frameSEM1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		}

		/**
		 * Initialize the contents of the frame.
		 */
		private void initialize() {
		
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////////////////////////
	/////////////////////////////SEM2_MARKS INPUT//////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public class SEM_2_INPUT  {

		public JFrame frameSEM2;
		private JTextField TFrollno;
		private JTextField TFname;
		private JTextField tfjava;
		private JTextField TFmaths;
		JButton JBTNpressok = new JButton("PRESS OK");
		public int sem1sgpa=0;
		changeGradingScale CGS = new changeGradingScale();
		

		/**
		 * Launch the application.
		 */
		public  void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						SEM_2_INPUT window = new SEM_2_INPUT();
						window.frameSEM2.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

		/**
		 * Create the application.
		 */
		public SEM_2_INPUT() {
			initialize();
			initcomponents();
			createEvents();
		}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////EVENT HANDLER//////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////
		private void createEvents() {
			JBTNpressok.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
            int javagradeA=91,javagradeB=81,javagradeC=71,javagradeD=61,javagradeE=51,javagradeF=41;
			int mathgradeA=91,mathgradeB=81,mathgradeC=71,mathgradeD=61,mathgradeE=51,mathgradeF=41;		
					
            Scanner reade = null;

            try {
            	reade = new Scanner(new FileInputStream("maths"));
            } catch (FileNotFoundException e) {
            	// TODO Auto-generated catch block
            	e.printStackTrace();
            }
            while(reade.hasNext()){
            	mathgradeA=reade.nextInt();
            	mathgradeB=reade.nextInt();
            	mathgradeC=reade.nextInt();
            	mathgradeD=reade.nextInt();
            	mathgradeE=reade.nextInt();
            	mathgradeF=reade.nextInt();
            }
            if(Integer.parseInt(TFmaths.getText())>=mathgradeA)
            sem1sgpa=10+sem1sgpa;
            else if(Integer.parseInt(TFmaths.getText())>=mathgradeB&&Integer.parseInt(TFmaths.getText())<mathgradeA)
            sem1sgpa=9+sem1sgpa;
            else if(Integer.parseInt(TFmaths.getText())>=mathgradeC&&Integer.parseInt(TFmaths.getText())<mathgradeB)
            	sem1sgpa=8+sem1sgpa;
            else if(Integer.parseInt(TFmaths.getText())>=mathgradeD&&Integer.parseInt(TFmaths.getText())<mathgradeC)
            	sem1sgpa=7+sem1sgpa;
            else if(Integer.parseInt(TFmaths.getText())>=mathgradeE&&Integer.parseInt(TFmaths.getText())<mathgradeD)
            	sem1sgpa=6+sem1sgpa;
            else if(Integer.parseInt(TFmaths.getText())>=mathgradeF&&Integer.parseInt(TFmaths.getText())<mathgradeE)
            	sem1sgpa=5+sem1sgpa;
            else
            	sem1sgpa=0;	
            	




Scanner read = null;

try {
	read = new Scanner(new FileInputStream("java"));
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
while(read.hasNext()){
	javagradeA=read.nextInt();
	javagradeB=read.nextInt();
	javagradeC=read.nextInt();
	javagradeD=read.nextInt();
	javagradeE=read.nextInt();
	javagradeF=read.nextInt();
}
if(Integer.parseInt(tfjava.getText())>=javagradeA)
sem1sgpa=10+sem1sgpa;
else if(Integer.parseInt(tfjava.getText())>=javagradeB&&Integer.parseInt(tfjava.getText())<javagradeA)
sem1sgpa=9+sem1sgpa;
else if(Integer.parseInt(tfjava.getText())>=javagradeC&&Integer.parseInt(tfjava.getText())<javagradeB)
	sem1sgpa=8+sem1sgpa;
else if(Integer.parseInt(tfjava.getText())>=javagradeD&&Integer.parseInt(tfjava.getText())<javagradeC)
	sem1sgpa=7+sem1sgpa;
else if(Integer.parseInt(tfjava.getText())>=javagradeE&&Integer.parseInt(tfjava.getText())<javagradeD)
	sem1sgpa=6+sem1sgpa;
else if(Integer.parseInt(tfjava.getText())>=javagradeF&&Integer.parseInt(tfjava.getText())<javagradeE)
	sem1sgpa=5+sem1sgpa;
else
	sem1sgpa=0;	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////SAVING RECORDS////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////
FileWriter fwe = null;
try {
	fwe = new FileWriter("sem2",true);
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
PrintWriter pwe=new PrintWriter(fwe,true);
pwe.print(Integer.parseInt(TFrollno.getText())+" ");
pwe.print(TFname.getText()+ " ");
pwe.println((float)sem1sgpa/2);

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////





	

frame1.setVisible(true);

frameSEM2.dispose();
JOptionPane.showMessageDialog(null,"number saved successfully and sgpa is" + (float)sem1sgpa/2);























				}
			});
		}
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		///////////////////////////COMPONENTS////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////////////////////////
		private void initcomponents() {
		
			frameSEM2 = new JFrame();
			frameSEM2.getContentPane().setBackground(Color.PINK);
			frameSEM2.getContentPane().setForeground(Color.GREEN);
			
			JLabel LBLtitle = new JLabel("****************ENTER THE MARKS OF SEM1***********");
			LBLtitle.setForeground(Color.BLUE);
			
			JLabel LBLrollno = new JLabel("ENTER THE ROLL NO:");
			LBLrollno.setForeground(new Color(0, 0, 0));
			
			TFrollno = new JTextField();
			TFrollno.setColumns(10);
			
			JLabel LBLname = new JLabel("ENTER THE NAME OF STUDENT:");
			
			TFname = new JTextField();
			TFname.setColumns(10);
			
			JLabel LBLjava = new JLabel("ENTER THE MARKS OF JAVA:");
			
			tfjava = new JTextField();
			tfjava.setColumns(10);
			
			JLabel LBLmaths = new JLabel("ENETR THE MARKS OF MATHS:");
			
			TFmaths = new JTextField();
			TFmaths.setColumns(10);
			
			
			
			GroupLayout groupLayout = new GroupLayout(frameSEM2.getContentPane());
			groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
					.addGroup(groupLayout.createSequentialGroup()
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addGroup(groupLayout.createSequentialGroup()
								.addGap(128)
								.addComponent(LBLtitle, GroupLayout.PREFERRED_SIZE, 304, GroupLayout.PREFERRED_SIZE))
							.addGroup(groupLayout.createSequentialGroup()
								.addGap(50)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
									.addComponent(LBLrollno, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
									.addComponent(LBLname, GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
									.addComponent(LBLjava, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
									.addComponent(LBLmaths, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addPreferredGap(ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
									.addComponent(TFmaths)
									.addComponent(tfjava)
									.addComponent(TFname)
									.addComponent(TFrollno, GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))))
						.addContainerGap(152, Short.MAX_VALUE))
					.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
						.addContainerGap(410, Short.MAX_VALUE)
						.addComponent(JBTNpressok, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
						.addGap(48))
			);
			groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
					.addGroup(groupLayout.createSequentialGroup()
						.addContainerGap()
						.addComponent(LBLtitle, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addGap(18)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(LBLrollno, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
							.addComponent(TFrollno, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
						.addGap(40)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(LBLname, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
							.addComponent(TFname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(38)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addComponent(LBLjava)
							.addComponent(tfjava, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(31)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(LBLmaths, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addComponent(TFmaths, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
						.addComponent(JBTNpressok, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addGap(24))
			);
			frameSEM2.getContentPane().setLayout(groupLayout);
			frameSEM2.setTitle("ENTERS MARKS OF SEM 1");
			frameSEM2.setBounds(100, 100, 600, 400);
			frameSEM2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		}

		/**
		 * Initialize the contents of the frame.
		 */
		private void initialize() {
		
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////view sgpa////////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
}
