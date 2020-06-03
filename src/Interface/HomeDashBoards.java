package Interface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.JMenu;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import java.awt.Scrollbar;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;

public class HomeDashBoards extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTextField textField;
	private JTextField textTable;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField tenSP;
	private JTextField cost;
	private JTextField textField_1;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeDashBoards homeframe = new HomeDashBoards();
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
	public HomeDashBoards() {
//		frame = new JFrame("Copy Frame Data To File Example");
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1257, 751);
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
		panelTable.setBounds(0, 46, 366, 706);
		contentPane.add(panelTable);
		panelTable.setLayout(null);
		
		JLabel lblTable = new JLabel("Book a Table");
		lblTable.setFont(new Font("Tempus Sans ITC", Font.BOLD, 34));
		lblTable.setBounds(93, 13, 224, 36);
		panelTable.add(lblTable);

		
		//Table1
		JPanel panel_table1 = new JPanel();
		panel_table1.setBackground(new Color(204, 255, 153));
		panel_table1.setBounds(56, 62, 103, 95);
		panelTable.add(panel_table1);
		
		JLabel table1 = new JLabel("");
		panel_table1.add(table1);
		table1.setIcon(new ImageIcon("C:\\Users\\DEll\\Desktop\\cafe_96px.png"));
//		table1.setIcon(new ImageIcon(getCurrentStaticContext("cafe_96px.png")));
//		System.out.println(System.getProperty("user.dir"));
		
		JButton buttonTable1 = new JButton("Table 1");
		buttonTable1.setBackground(new Color(204, 255, 153));
		buttonTable1.setBounds(56, 154, 103, 20);
		panelTable.add(buttonTable1);
		
		buttonTable1.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				buttonTable1.setBackground(new Color(238, 99, 99));
				panel_table1.setBackground(new Color(238, 99, 99));
			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		//Table 2
		JPanel panel_table2 = new JPanel();
		panel_table2.setBackground(new Color(204, 255, 153));
		panel_table2.setBounds(214, 62, 103, 95);
		panelTable.add(panel_table2);
		
		JLabel table2 = new JLabel("");
		panel_table2.add(table2);
		table2.setIcon(new ImageIcon("C:\\Users\\DEll\\Desktop\\cafe_96px.png"));
//		table2.setIcon(new ImageIcon(getCurrentStaticContext("cafe_96px.png")));
		
		JButton buttonTable2 = new JButton("Table 2");
		buttonTable2.setBackground(new Color(204, 255, 153));
		buttonTable2.setBounds(214, 154, 103, 20);
		panelTable.add(buttonTable2);
		
		//Table3
		JPanel panel_table3 = new JPanel();
		panel_table3.setBackground(new Color(204, 255, 153));
		panel_table3.setBounds(56, 187, 103, 95);
		panelTable.add(panel_table3);
		
		JLabel table3 = new JLabel("");
		panel_table3.add(table3);
		table3.setIcon(new ImageIcon("C:\\Users\\DEll\\Desktop\\cafe_96px.png"));
//		table3.setIcon(new ImageIcon(getCurrentStaticContext("cafe_96px.png")));
		
		JButton buttonTable3 = new JButton("Table 3");
		buttonTable3.setBackground(new Color(204, 255, 153));
		buttonTable3.setBounds(56, 280, 103, 20);
		panelTable.add(buttonTable3);
		
		//Table 4
		JPanel panel_table4 = new JPanel();
		panel_table4.setBackground(new Color(204, 255, 153));
		panel_table4.setBounds(214, 187, 103, 95);
		panelTable.add(panel_table4);
		
		JLabel table4 = new JLabel("");
		panel_table4.add(table4);
		table4.setIcon(new ImageIcon("C:\\Users\\DEll\\Desktop\\cafe_96px.png"));
//		table4.setIcon(new ImageIcon(getCurrentStaticContext("cafe_96px.png")));
		
		JButton buttonTable4 = new JButton("Table 4");
//		buttonTable4.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//			}
//		});
		buttonTable4.setBackground(new Color(204, 255, 153));
		buttonTable4.setBounds(214, 280, 103, 20);
		panelTable.add(buttonTable4);
		
		//Table 5
		JPanel panel_table5 = new JPanel();
		panel_table5.setBackground(new Color(204, 255, 153));
		panel_table5.setBounds(56, 313, 103, 95);
		panelTable.add(panel_table5);
		
		JLabel table5 = new JLabel("");
		panel_table5.add(table5);
		table5.setIcon(new ImageIcon("C:\\Users\\DEll\\Desktop\\cafe_96px.png"));
//		table5.setIcon(new ImageIcon(getCurrentStaticContext("cafe_96px.png")));
		
		JButton buttonTable5 = new JButton("Table 5");
		buttonTable5.setBackground(new Color(204, 255, 153));
		buttonTable5.setBounds(56, 408, 103, 20);
		panelTable.add(buttonTable5);
		
		//Table 6
		JPanel panel_table6 = new JPanel();
		panel_table6.setBackground(new Color(204, 255, 153));
		panel_table6.setBounds(214, 313, 103, 95);
		panelTable.add(panel_table6);
		
		JLabel table6 = new JLabel("");
		panel_table6.add(table6);
		table6.setIcon(new ImageIcon("C:\\Users\\DEll\\Desktop\\cafe_96px.png"));
//		table6.setIcon(new ImageIcon(getCurrentStaticContext("cafe_96px.png")));
		
		JButton buttonTable6 = new JButton("Table 6");
		buttonTable6.setBackground(new Color(204, 255, 153));
		buttonTable6.setBounds(214, 408, 103, 20);
		panelTable.add(buttonTable6);
		
		//Table 7
		JPanel panel_table7 = new JPanel();
		panel_table7.setBackground(new Color(204, 255, 153));
		panel_table7.setBounds(56, 441, 103, 95);
		panelTable.add(panel_table7);
		
		JLabel table7 = new JLabel("");
		panel_table7.add(table7);
		table7.setIcon(new ImageIcon("C:\\Users\\DEll\\Desktop\\cafe_96px.png"));
//		table7.setIcon(new ImageIcon(getCurrentStaticContext("cafe_96px.png")));
		
		JButton buttonTable7 = new JButton("Table 7");
		buttonTable7.setBackground(new Color(204, 255, 153));
		buttonTable7.setBounds(56, 536, 103, 20);
		panelTable.add(buttonTable7);
		
		//Table 8
		JPanel panel_table8 = new JPanel();
		panel_table8.setBackground(new Color(204, 255, 153));
		panel_table8.setBounds(214, 441, 103, 95);
		panelTable.add(panel_table8);
		
		JLabel table8 = new JLabel("");
		panel_table8.add(table8);
		table8.setIcon(new ImageIcon("C:\\Users\\DEll\\Desktop\\cafe_96px.png"));
//		table8.setIcon(new ImageIcon(getCurrentStaticContext("cafe_96px.png")));
		
		JButton buttonTable8 = new JButton("Table 8");
		buttonTable8.setBackground(new Color(204, 255, 153));
		buttonTable8.setBounds(214, 536, 103, 20);
		panelTable.add(buttonTable8);
		
		//Table 9
		JPanel panel_table9 = new JPanel();
		panel_table9.setBackground(new Color(204, 255, 153));
		panel_table9.setBounds(56, 569, 103, 95);
		panelTable.add(panel_table9);
		
		JLabel table9 = new JLabel("");
		panel_table9.add(table9);
		table9.setIcon(new ImageIcon("C:\\Users\\DEll\\Desktop\\cafe_96px.png"));
//		table9.setIcon(new ImageIcon(getCurrentStaticContext("cafe_96px.png")));
		
		JButton buttonTable9 = new JButton("Table 9");
		buttonTable9.setBackground(new Color(204, 255, 153));
		buttonTable9.setBounds(56, 660, 103, 20);
		panelTable.add(buttonTable9);
		
		//Table 10
		JPanel panel_table10 = new JPanel();
		panel_table10.setBackground(new Color(204, 255, 153));
		panel_table10.setBounds(214, 569, 103, 95);
		panelTable.add(panel_table10);
		
		JLabel table10 = new JLabel("");
		panel_table10.add(table10);
		table10.setIcon(new ImageIcon("C:\\Users\\DEll\\Desktop\\cafe_96px.png"));
		
		JButton buttonTable10 = new JButton("Table 10");
		buttonTable10.setBackground(new Color(204, 255, 153));
		buttonTable10.setBounds(214, 660, 103, 20);
		panelTable.add(buttonTable10);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(0, 0, 1258, 47);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label = new JLabel("-");
		label.setForeground(new Color(51, 153, 153));
		label.setFont(new Font("Showcard Gothic", Font.BOLD, 32));
		label.setBounds(1137, 0, 39, 47);
		panel_1.add(label);
		
		JButton btnX = new JButton("X");
		btnX.setForeground(new Color(51, 153, 153));
		btnX.setFont(new Font("Showcard Gothic", Font.BOLD, 31));
		btnX.setBounds(1188, 0, 70, 47);
		btnX.setBackground(new Color(255, 255, 255));
		panel_1.add(btnX);
		
		
		
		JPanel pnMenu = new JPanel();
		pnMenu.setBackground(new Color(204, 255, 153));
		pnMenu.setBounds(421, 46, 384, 706);
		contentPane.add(pnMenu);
		pnMenu.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(new Color(255, 255, 204));
		tabbedPane.setBounds(0, 77, 384, 466);
		pnMenu.add(tabbedPane);
		
		JPanel tab2 = new JPanel();
		tab2.setBackground(new Color(204, 255, 153));
		tabbedPane.addTab("FOOD", null, tab2, null);
		tab2.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(12, 27, 203, 30);
		tab2.add(textField_1);
		
		JButton button_1 = new JButton("Search");
		button_1.setFont(new Font("SimSun", Font.PLAIN, 16));
		button_1.setBounds(245, 29, 97, 25);
		tab2.add(button_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(12, 98, 356, 326);
		tab2.add(panel_2);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 368, 326);
		panel_2.add(scrollPane);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"ID", "Name", "Cost"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(table_1);
		
		JPanel tab1 = new JPanel();
		tab1.setBackground(new Color(204, 255, 153));
		tabbedPane.addTab("DRINK", null, tab1, null);
		tabbedPane.setForegroundAt(1, Color.BLACK);
		tab1.setLayout(null);
		
		textField_4 = new JTextField();
		textField_4.setBounds(12, 25, 203, 30);
		tab1.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setFont(new Font("SimSun", Font.PLAIN, 16));
		btnSearch.setBounds(243, 27, 97, 25);
		tab1.add(btnSearch);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(12, 90, 356, 334);
		tab1.add(panel_3);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 0, 356, 334);
		panel_3.add(scrollPane_1);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"ID", "Name", "Cost"
			}
		));
		scrollPane_1.setViewportView(table_2);
		
		JLabel lblOrder = new JLabel("Menu");
		lblOrder.setFont(new Font("Tempus Sans ITC", Font.BOLD, 34));
		lblOrder.setBounds(130, 13, 105, 36);
		pnMenu.add(lblOrder);
		
		JButton btnOrder = new JButton("Order");
		btnOrder.setFont(new Font("SimSun", Font.BOLD, 18));
		btnOrder.setBackground(new Color(204, 255, 153));
		btnOrder.setBounds(213, 610, 117, 44);
		pnMenu.add(btnOrder);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setFont(new Font("SimSun", Font.PLAIN, 23));
		lblDescription.setBounds(12, 556, 153, 28);
		pnMenu.add(lblDescription);
		
		tenSP = new JTextField();
		tenSP.setBounds(22, 598, 143, 28);
		pnMenu.add(tenSP);
		tenSP.setColumns(10);
		
		cost = new JTextField();
		cost.setColumns(10);
		cost.setBounds(22, 638, 143, 28);
		pnMenu.add(cost);
		
		
		JPanel pnListOrder = new JPanel();
		pnListOrder.setBackground(new Color(204, 255, 153));
		pnListOrder.setBounds(837, 46, 421, 706);
		contentPane.add(pnListOrder);
		pnListOrder.setLayout(null);
		
		JLabel lblIdBill = new JLabel(" ID Bill");
		lblIdBill.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 25));
		lblIdBill.setBounds(0, 13, 76, 36);
		pnListOrder.add(lblIdBill);
		
		textField = new JTextField();
		textField.setBounds(75, 13, 124, 29);
		pnListOrder.add(textField);
		textField.setColumns(10);
		
		JLabel lblTable_1 = new JLabel("Table");
		lblTable_1.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 25));
		lblTable_1.setBounds(211, 23, 56, 16);
		pnListOrder.add(lblTable_1);
		
		textTable = new JTextField();
		textTable.setColumns(10);
		textTable.setBounds(279, 13, 110, 29);
		pnListOrder.add(textTable);
		
		JLabel label_1 = new JLabel(" Date");
		label_1.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 25));
		label_1.setBounds(0, 62, 76, 36);
		pnListOrder.add(label_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(75, 62, 124, 29);
		pnListOrder.add(textField_2);
		
		JLabel label_2 = new JLabel("Time");
		label_2.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 25));
		label_2.setBounds(211, 66, 56, 29);
		pnListOrder.add(label_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(279, 62, 110, 29);
		pnListOrder.add(textField_3);
		
		JLabel label_3 = new JLabel(" List Order");
		label_3.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 25));
		label_3.setBounds(36, 141, 265, 36);
		pnListOrder.add(label_3);
		
		JButton btnPayment = new JButton("PayMent");
		btnPayment.setFont(new Font("SimSun", Font.BOLD, 18));
		btnPayment.setBackground(new Color(245, 245, 245));
		btnPayment.setBounds(239, 614, 131, 48);
		pnListOrder.add(btnPayment);
		
		JButton button = new JButton("CheckBill");
		button.setFont(new Font("SimSun", Font.BOLD, 18));
		button.setBackground(new Color(245, 245, 245));
		button.setBounds(53, 614, 134, 48);
		pnListOrder.add(button);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(0, 200, 421, 338);
		pnListOrder.add(panel_4);
		panel_4.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(0, 0, 421, 338);
		panel_4.add(scrollPane_2);
		
		table_3 = new JTable();
		table_3.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"ID KHTX", "ID", "Name", "Cost", "Amount", "Total"
			}
		));
		scrollPane_2.setViewportView(table_3);
		
		table = new JTable();
		table.setBounds(421, 377, 1, 1);
		contentPane.add(table);
		
		
	}
}
