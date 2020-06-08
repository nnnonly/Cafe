package coffeebooking;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Component;
import java.awt.Event;
import java.awt.FlowLayout;

import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;
import javax.swing.table.DefaultTableModel;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.omg.CORBA.PUBLIC_MEMBER;

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
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;

public class Application extends JFrame {

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
    private JTable table_1;
    private JTable table_2;
    private JTable table_3;
    private JTextField textField_5;

    private JPanel bookTablePanel;
    private ArrayList<Table> listTable;

    /**
     * Create the frame.
     */
    public Application() {
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

        init();

    }

    public void init() {
        listTable = new ArrayList<>();
        bookTable();
        menu();
        listOrder();
        header();
    }

    private void bookTable() {
        //Context panel
        bookTablePanel = new JPanel();
        bookTablePanel.setBackground(new Color(204, 255, 153));
        bookTablePanel.setBounds(0, 46, 366, 706);
        contentPane.add(bookTablePanel);
        bookTablePanel.setLayout(null);

        JLabel lblTable = new JLabel("Book a Table");
        lblTable.setFont(new Font("Tempus Sans ITC", Font.BOLD, 34));
        lblTable.setBounds(91, 13, 224, 36);
        bookTablePanel.add(lblTable);

        //Booking button
        JButton btnBook = new JButton("Book");
        btnBook.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                for (Table table : listTable) {
                    if(table.getStatus() == 1){
                        table.updateOnBookStatus();
                    }
                }
            }
        });

        btnBook.setBackground(new Color(204, 255, 153));
        btnBook.setBounds(257, 49, 97, 25);
        bookTablePanel.add(btnBook);
        

        //seting up whole table
        Table table1 = new Table(bookTablePanel, "Table 1", CONSTANT.ICON_COFFE_DIR);
        table1.setLocation(56, 76, 103, 95);
        listTable.add(table1);

        Table table2 = new Table(bookTablePanel, "Table 2", CONSTANT.ICON_COFFE_DIR);
        table2.setLocation(212, 76, 103, 95);
        listTable.add(table2);

        Table table3 = new Table(bookTablePanel, "Table 3", CONSTANT.ICON_COFFE_DIR);
        table3.setLocation(56, 197, 103, 95);
        listTable.add(table3);

        Table table4 = new Table(bookTablePanel, "Table 4", CONSTANT.ICON_COFFE_DIR);
        table4.setLocation(214, 197, 103, 95);
        listTable.add(table4);

        Table table5 = new Table(bookTablePanel, "Table 5", CONSTANT.ICON_COFFE_DIR);
        table5.setLocation(56, 326, 103, 95);
        listTable.add(table5);

        Table table6 = new Table(bookTablePanel, "Table 6", CONSTANT.ICON_COFFE_DIR);
        table6.setLocation(212, 326, 103, 95);
        listTable.add(table6);

        Table table7 = new Table(bookTablePanel, "Table 7", CONSTANT.ICON_COFFE_DIR);
        table7.setLocation(56, 454, 103, 95);
        listTable.add(table7);

        Table table8 = new Table(bookTablePanel, "Table 8", CONSTANT.ICON_COFFE_DIR);
        table8.setLocation(214, 454, 103, 95);
        listTable.add(table8);

        Table table9 = new Table(bookTablePanel, "Table 9", CONSTANT.ICON_COFFE_DIR);
        table9.setLocation(56, 581, 103, 95);
        listTable.add(table9);

        Table table10 = new Table(bookTablePanel, "Table 10", CONSTANT.ICON_COFFE_DIR);
        table10.setLocation(214, 581, 103, 95);
        listTable.add(table10);
    }

    private void menu() {
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
        textField_1.setEditable(false);
        textField_1.setColumns(10);
        textField_1.setBounds(12, 27, 203, 30);
        textField_1.setBackground(new Color(255, 255, 255));
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
        scrollPane.setBounds(0, 0, 356, 326);
        panel_2.add(scrollPane);

        table_1 = new JTable();
        table_1.setModel(new DefaultTableModel(
                new Object[][]{
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},},
                new String[]{
                    "ID", "Name", "Cost"
                }
        ) {
            boolean[] columnEditables = new boolean[]{
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
        textField_4.setBackground(new Color(255, 255, 255));
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
            new Object[][]{
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},},
            new String[]{
                "ID", "Name", "Cost"
            }
    ) {
        boolean[] columnEditables = new boolean[]{
            false, false, false
        };

        public boolean isCellEditable(int row, int column) {
            return columnEditables[column];
        }
    });
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
        tenSP.setEditable(false);
        tenSP.setBackground(new Color(255, 255, 255));
        tenSP.setBounds(22, 598, 143, 28);
        pnMenu.add(tenSP);
        tenSP.setColumns(10);

        cost = new JTextField();
        cost.setEditable(false);
        cost.setBackground(new Color(255, 255, 255));
        cost.setColumns(10);
        cost.setBounds(22, 638, 143, 28);
        pnMenu.add(cost);
    }

    private void header() {
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
        btnX.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                System.exit(0);
            }
        });

        btnX.setForeground(new Color(51, 153, 153));
        btnX.setFont(new Font("Showcard Gothic", Font.BOLD, 31));
        btnX.setBounds(1188, 0, 70, 47);
        btnX.setBackground(new Color(255, 255, 255));
        panel_1.add(btnX);

    }

    private void listOrder() {
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
        textField.setEditable(false);
        textField.setBounds(75, 13, 124, 29);
        textField.setBackground(new Color(255, 255, 255));
        pnListOrder.add(textField);
        textField.setColumns(10);

        JLabel lblTable_1 = new JLabel("Table");
        lblTable_1.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 25));
        lblTable_1.setBounds(211, 23, 56, 16);
        pnListOrder.add(lblTable_1);

        textTable = new JTextField();
        textTable.setEditable(false);
        textTable.setColumns(10);
        textTable.setBounds(279, 13, 110, 29);
        textTable.setBackground(new Color(255, 255, 255));
        pnListOrder.add(textTable);

        JLabel label_1 = new JLabel(" Date");
        label_1.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 25));
        label_1.setBounds(0, 62, 76, 36);
        pnListOrder.add(label_1);

        textField_2 = new JTextField();
        textField_2.setEditable(false);
        textField_2.setColumns(10);
        textField_2.setBounds(75, 62, 124, 29);
        textField_2.setBackground(new Color(255, 255, 255));
        pnListOrder.add(textField_2);

        JLabel label_2 = new JLabel("Time");
        label_2.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 25));
        label_2.setBounds(211, 66, 56, 29);
        pnListOrder.add(label_2);

        textField_3 = new JTextField();
        textField_3.setEditable(false);
        textField_3.setColumns(10);
        textField_3.setBounds(279, 62, 110, 29);
        textField_3.setBackground(new Color(255, 255, 255));
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
        scrollPane_2.setBounds(0, 0, 421, 190);
        panel_4.add(scrollPane_2);

        table_3 = new JTable();
        table_3.setModel(new DefaultTableModel(
                new Object[][]{
                    {null, null, null, null, null, null},
                    {null, null, null, null, null, null},
                    {null, null, null, null, null, null},
                    {null, null, null, null, null, null},
                    {null, null, null, null, null, null},
                    {null, null, null, null, null, null},
                    {null, null, null, null, null, null},
                    {null, null, null, null, null, null},
                    {null, null, null, null, null, null},
                    {null, null, null, null, null, null},},
                new String[]{
                    "ID KHTX", "ID", "Name", "Cost", "Amount", "Total"
                }
                ) {
                    boolean[] columnEditables = new boolean[]{
                        false, false, false, false, false, false
                    };
            
                    public boolean isCellEditable(int row, int column) {
                        return columnEditables[column];
                    }
                });
        scrollPane_2.setViewportView(table_3);

        JLabel lblTotal = new JLabel("Total:");
        lblTotal.setFont(new Font("SimSun", Font.PLAIN, 21));
        lblTotal.setHorizontalAlignment(SwingConstants.CENTER);
        lblTotal.setBounds(81, 245, 93, 29);
        panel_4.add(lblTotal);

        textField_5 = new JTextField();
        textField_5.setBackground(new Color(255, 255, 255));
        textField_5.setEditable(false);
        textField_5.setBounds(174, 244, 155, 36);
        panel_4.add(textField_5);
        textField_5.setColumns(10);

        JLabel lblVnd = new JLabel("VND");
        lblVnd.setFont(new Font("SimSun", Font.PLAIN, 21));
        lblVnd.setBounds(341, 251, 56, 16);
        panel_4.add(lblVnd);
    }
}
