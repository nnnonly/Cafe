package Interface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.JMenu;
import javax.swing.JButton;

public class HomeDashboard extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeDashboard homeframe = new HomeDashboard();
//					homeframe.HomeDashboard();
					//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//					homeframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	public String getCurrentStaticContext(String fileName) {
		return System.getProperty("user.dir") + "\\src\\Interface\\static\\" + fileName;
	}
	public HomeDashboard() {
//		frame = new JFrame("Copy Frame Data To File Example");
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1156, 739);
		setUndecorated(true);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new LineBorder(new Color(204, 255, 153), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 285, 285);;
		
		JPanel panelTable = new JPanel();
		panelTable.setBackground(new Color(204, 255, 153));
		panelTable.setBounds(0, 46, 366, 693);
		contentPane.add(panelTable);
		panelTable.setLayout(null);
		
		//Table1
		JPanel panel_table1 = new JPanel();
		panel_table1.setBackground(new Color(204, 255, 153));
		panel_table1.setBounds(56, 79, 103, 95);
		panelTable.add(panel_table1);
		
		JLabel table1 = new JLabel("");
		panel_table1.add(table1);
		table1.setIcon(new ImageIcon("C:\\Users\\DEll\\Desktop\\cafe_96px.png"));
//		table1.setIcon(new ImageIcon(getCurrentStaticContext("cafe_96px.png")));
//		System.out.println(System.getProperty("user.dir"));
		
		
		//Table 2
		JPanel panel_table2 = new JPanel();
		panel_table2.setBackground(new Color(204, 255, 153));
		panel_table2.setBounds(214, 79, 103, 95);
		panelTable.add(panel_table2);
		
		JLabel table2 = new JLabel("");
		panel_table2.add(table2);
		table2.setIcon(new ImageIcon("C:\\Users\\DEll\\Desktop\\cafe_96px.png"));
//		table2.setIcon(new ImageIcon(getCurrentStaticContext("cafe_96px.png")));
		
		//Table3
		JPanel panel_table3 = new JPanel();
		panel_table3.setBackground(new Color(204, 255, 153));
		panel_table3.setBounds(56, 207, 103, 95);
		panelTable.add(panel_table3);
		
		JLabel table3 = new JLabel("");
		panel_table3.add(table3);
		table3.setIcon(new ImageIcon("C:\\Users\\DEll\\Desktop\\cafe_96px.png"));
//		table3.setIcon(new ImageIcon(getCurrentStaticContext("cafe_96px.png")));
		
		//Table 4
		JPanel panel_table4 = new JPanel();
		panel_table4.setBackground(new Color(204, 255, 153));
		panel_table4.setBounds(214, 207, 103, 95);
		panelTable.add(panel_table4);
		
		JLabel table4 = new JLabel("");
		panel_table4.add(table4);
		table4.setIcon(new ImageIcon("C:\\Users\\DEll\\Desktop\\cafe_96px.png"));
//		table4.setIcon(new ImageIcon(getCurrentStaticContext("cafe_96px.png")));
		
		//Table 5
		JPanel panel_table5 = new JPanel();
		panel_table5.setBackground(new Color(204, 255, 153));
		panel_table5.setBounds(56, 331, 103, 95);
		panelTable.add(panel_table5);
		
		JLabel table5 = new JLabel("");
		panel_table5.add(table5);
		table5.setIcon(new ImageIcon("C:\\Users\\DEll\\Desktop\\cafe_96px.png"));
//		table5.setIcon(new ImageIcon(getCurrentStaticContext("cafe_96px.png")));
		
		//Table 6
		JPanel panel_table6 = new JPanel();
		panel_table6.setBackground(new Color(204, 255, 153));
		panel_table6.setBounds(214, 331, 103, 95);
		panelTable.add(panel_table6);
		
		JLabel table6 = new JLabel("");
		panel_table6.add(table6);
		table6.setIcon(new ImageIcon("C:\\Users\\DEll\\Desktop\\cafe_96px.png"));
//		table6.setIcon(new ImageIcon(getCurrentStaticContext("cafe_96px.png")));
		
		//Table 7
		JPanel panel_table7 = new JPanel();
		panel_table7.setBackground(new Color(204, 255, 153));
		panel_table7.setBounds(56, 458, 103, 95);
		panelTable.add(panel_table7);
		
		JLabel table7 = new JLabel("");
		panel_table7.add(table7);
		table7.setIcon(new ImageIcon("C:\\Users\\DEll\\Desktop\\cafe_96px.png"));
//		table7.setIcon(new ImageIcon(getCurrentStaticContext("cafe_96px.png")));
		
		//Table 8
		JPanel panel_table8 = new JPanel();
		panel_table8.setBackground(new Color(204, 255, 153));
		panel_table8.setBounds(214, 458, 103, 95);
		panelTable.add(panel_table8);
		
		JLabel table8 = new JLabel("");
		panel_table8.add(table8);
		table8.setIcon(new ImageIcon("C:\\Users\\DEll\\Desktop\\cafe_96px.png"));
//		table8.setIcon(new ImageIcon(getCurrentStaticContext("cafe_96px.png")));
		
		//Table 9
		JPanel panel_table9 = new JPanel();
		panel_table9.setBackground(new Color(204, 255, 153));
		panel_table9.setBounds(56, 585, 103, 95);
		panelTable.add(panel_table9);
		
		JLabel table9 = new JLabel("");
		panel_table9.add(table9);
		table9.setIcon(new ImageIcon("C:\\Users\\DEll\\Desktop\\cafe_96px.png"));
//		table9.setIcon(new ImageIcon(getCurrentStaticContext("cafe_96px.png")));
		
		//Table 10
		JPanel panel_table10 = new JPanel();
		panel_table10.setBackground(new Color(204, 255, 153));
		panel_table10.setBounds(214, 585, 103, 95);
		panelTable.add(panel_table10);
		
		JLabel table10 = new JLabel("");
		panel_table10.add(table10);
		table10.setIcon(new ImageIcon("C:\\Users\\DEll\\Desktop\\cafe_96px.png"));
		
		JLabel lblTable = new JLabel("Book a Table");
		lblTable.setFont(new Font("Tempus Sans ITC", Font.BOLD, 34));
		lblTable.setBounds(93, 13, 224, 36);
		panelTable.add(lblTable);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(0, 0, 1156, 47);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label = new JLabel("-");
		label.setForeground(new Color(51, 153, 153));
		label.setFont(new Font("Showcard Gothic", Font.BOLD, 32));
		label.setBounds(1049, 0, 39, 47);
		panel_1.add(label);
		
		JLabel lblX = new JLabel("X");
		lblX.setForeground(new Color(51, 153, 153));
		lblX.setFont(new Font("Showcard Gothic", Font.BOLD, 32));
		lblX.setBounds(1100, 0, 56, 47);
		panel_1.add(lblX);
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(204, 255, 153));
		panel_3.setBounds(408, 46, 358, 693);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(new Color(255, 255, 204));
		tabbedPane.setBounds(0, 77, 358, 449);
		panel_3.add(tabbedPane);
		
		JPanel tab1 = new JPanel();
		tab1.setBackground(new Color(245, 245, 245));
		tabbedPane.addTab("DRINK", null, tab1, null);
		tabbedPane.setForegroundAt(0, Color.BLACK);
		
		JPanel tab2 = new JPanel();
		tab2.setBackground(new Color(245, 245, 245));
		tabbedPane.addTab("FOOD", null, tab2, null);
		
		JLabel lblOrder = new JLabel("Menu");
		lblOrder.setFont(new Font("Tempus Sans ITC", Font.BOLD, 34));
		lblOrder.setBounds(130, 13, 105, 36);
		panel_3.add(lblOrder);
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(204, 255, 153));
		panel_2.setBounds(809, 46, 347, 693);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblIdBill = new JLabel(" ID Bill");
		lblIdBill.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 25));
		lblIdBill.setBounds(0, 13, 76, 36);
		panel_2.add(lblIdBill);
		
		textField = new JTextField();
		textField.setBounds(75, 13, 95, 29);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel lblTable_1 = new JLabel("Table");
		lblTable_1.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 25));
		lblTable_1.setBounds(193, 23, 56, 16);
		panel_2.add(lblTable_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(252, 13, 83, 29);
		panel_2.add(textField_1);
		
		JLabel label_1 = new JLabel(" Date");
		label_1.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 25));
		label_1.setBounds(0, 62, 76, 36);
		panel_2.add(label_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(75, 62, 95, 29);
		panel_2.add(textField_2);
		
		JLabel label_2 = new JLabel("Time");
		label_2.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 25));
		label_2.setBounds(193, 62, 56, 29);
		panel_2.add(label_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(252, 62, 83, 29);
		panel_2.add(textField_3);
		
		JLabel label_3 = new JLabel(" List Order");
		label_3.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 25));
		label_3.setBounds(36, 125, 265, 36);
		panel_2.add(label_3);
		
		JButton btnPayment = new JButton("PayMent");
		btnPayment.setFont(new Font("SimSun", Font.BOLD, 18));
		btnPayment.setBackground(new Color(245, 245, 245));
		btnPayment.setBounds(193, 614, 131, 48);
		panel_2.add(btnPayment);
		
		JButton button = new JButton("CheckBill");
		button.setFont(new Font("SimSun", Font.BOLD, 18));
		button.setBackground(new Color(245, 245, 245));
		button.setBounds(36, 614, 134, 48);
		panel_2.add(button);

	}
}
