package windowbuilder.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SEM_1_INPUT  {

	public JFrame frameSEM1;
	private JTextField TFrollno;
	private JTextField TFname;
	private JTextField tfjava;
	private JTextField TFmaths;
	JButton JBTNpressok = new JButton("PRESS OK");
	public int sem1sgpa=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
