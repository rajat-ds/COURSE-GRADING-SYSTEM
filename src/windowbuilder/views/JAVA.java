package windowbuilder.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;

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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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

	private void createEvent() {
		OKbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frameJAVA.dispose();
			JOptionPane.showMessageDialog(null,"Done_Successfully");
			// frame1.setVisible(true);

			FileWriter fw = null;
			try {
				fw = new FileWriter("savio3");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			PrintWriter pw=new PrintWriter(fw);
			try {
				FileWriter fwe=new FileWriter("savio3",true);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			PrintWriter pwe=new PrintWriter(fw,true);
			pwe.println(91);
			pwe.println(81);
			pwe.println(71);
			pwe.println(61);
			pwe.println(51);
			pwe.println(41);
			
			
			
			
			
			
			
			
			
			
			
			
			
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
