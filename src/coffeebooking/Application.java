package coffeebooking;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.Vector;
import java.util.stream.Collectors;

public class Application extends JFrame {

    private JPanel contentPane;
    private JFrame frame;
    private JTextField txtIDBill;
    private JTextField txtTableBook;
    private JTextField txtDateBook;
    private JTextField txtTimeBook;
    private JTextField txtDrinkSearch;
    private JTextField txtSelectedMeal;
    private JTextField txtQuantity;
    private JTextField txtSearchFood;
    private JTable foodTable;
    private JTable drinkTable;
    private JTable orderedTable;
    private JButton btnOrder;
    private JTextField txtTotalVND;
    private JButton btnBook;
    private JPanel bookTablePanel;
    private ArrayList<Table> listTable;

    private JButton btnDrinkSearch;
    private JButton btnSearchFood;
    private JButton btnPayment;
    private JButton btnCheckBill;
    private Vector listOrder = new Vector();
    private Vector listNull = new Vector();
    private ArrayList<OrderDetails> listOrderDetails = new ArrayList<>();

    private float tmpPrice = 0;

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
        listOrderDetails = new ArrayList<>();
        listTable = new ArrayList<>();
        bookTable();
        menu();
        listOrder();
        header();
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
        btnBook = new JButton("Book");
        btnBookOnClick(btnBook);

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

        txtSearchFood = new JTextField();
        txtSearchFood.setEditable(true);
        txtSearchFood.setColumns(10);
        txtSearchFood.setBounds(12, 27, 203, 30);
        txtSearchFood.setBackground(new Color(255, 255, 255));
        tab2.add(txtSearchFood);

        btnSearchFood = new JButton("Search");
        btnSearchFood.setFont(new Font("SimSun", Font.PLAIN, 16));
        btnSearchFood.setBounds(245, 29, 97, 25);
        tab2.add(btnSearchFood);

        JPanel panel_2 = new JPanel();
        panel_2.setBounds(12, 98, 356, 326);
        tab2.add(panel_2);
        panel_2.setLayout(null);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(0, 0, 356, 326);
        panel_2.add(scrollPane);

        foodTable = new JTable();

        Vector dataModelFood = new Vector();
        CoffeeBooking.dataFood.inorder();
        ArrayList<Meal> outputFood = CoffeeBooking.dataFood.getOutput();

        for (Meal food : outputFood) {
            Vector _food = new Vector();
            _food.add(food.getName());
            _food.add(food.getPrice());
            _food.add(food.getTimeEstimate());
            dataModelFood.add(_food);
        }

        setupTable(dataModelFood, CONSTANT.getFoodHeader(), foodTable, scrollPane);
        // btnSearchOnClick(btnSearchFood, txtSearchFood, foodTable, scrollPane);
        btnSearchFoodOnClick(btnSearchFood, txtSearchFood, foodTable, scrollPane);

        JPanel tab1 = new JPanel();
        tab1.setBackground(new Color(204, 255, 153));
        tabbedPane.addTab("DRINK", null, tab1, null);
        tabbedPane.setForegroundAt(1, Color.BLACK);
        tab1.setLayout(null);

        txtDrinkSearch = new JTextField();
        txtDrinkSearch.setBounds(12, 25, 203, 30);
        txtDrinkSearch.setBackground(new Color(255, 255, 255));
        tab1.add(txtDrinkSearch);
        txtDrinkSearch.setColumns(10);

        btnDrinkSearch = new JButton("Search");
        btnDrinkSearch.setFont(new Font("SimSun", Font.PLAIN, 16));
        btnDrinkSearch.setBounds(243, 27, 97, 25);
        tab1.add(btnDrinkSearch);

        JPanel panel_3 = new JPanel();
        panel_3.setBounds(12, 90, 356, 334);
        tab1.add(panel_3);
        panel_3.setLayout(null);

        JScrollPane scrollPane_1 = new JScrollPane();
        scrollPane_1.setBounds(0, 0, 356, 334);
        panel_3.add(scrollPane_1);

        drinkTable = new JTable();

        Vector dataModel = new Vector();
        CoffeeBooking.data.inorder();
        ArrayList<Meal> output = CoffeeBooking.data.getOutput();

        for (Meal meal : output) {
            Vector _meal = new Vector();
            _meal.add(meal.getName());
            _meal.add(meal.getPrice());
            _meal.add(meal.getTimeEstimate());
            dataModel.add(_meal);
        }

        setupTable(dataModel, CONSTANT.getFoodHeader(), drinkTable, scrollPane_1);
        btnSearchOnClick(btnDrinkSearch, txtDrinkSearch, drinkTable, scrollPane_1);

        JLabel lblOrder = new JLabel("Menu");
        lblOrder.setFont(new Font("Tempus Sans ITC", Font.BOLD, 34));
        lblOrder.setBounds(130, 13, 105, 36);
        pnMenu.add(lblOrder);

        btnOrder = new JButton("Order");
        btnOrder.setFont(new Font("SimSun", Font.BOLD, 18));
        btnOrder.setBackground(new Color(204, 255, 153));
        btnOrder.setBounds(213, 610, 117, 44);
        pnMenu.add(btnOrder);
        btnOrderOnClick(btnOrder);

        JLabel lblDescription = new JLabel("Description");
        lblDescription.setFont(new Font("SimSun", Font.PLAIN, 23));
        lblDescription.setBounds(12, 556, 153, 28);
        pnMenu.add(lblDescription);

        txtSelectedMeal = new JTextField();
        txtSelectedMeal.setEditable(false);
        txtSelectedMeal.setBackground(new Color(255, 255, 255));
        txtSelectedMeal.setBounds(22, 598, 143, 28);
        pnMenu.add(txtSelectedMeal);
        txtSelectedMeal.setColumns(10);

        txtQuantity = new JTextField();
        txtQuantity.setEditable(false);
        txtQuantity.setBackground(new Color(255, 255, 255));
        txtQuantity.setColumns(10);
        txtQuantity.setBounds(22, 638, 143, 28);
        pnMenu.add(txtQuantity);
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

        txtIDBill = new JTextField();
        txtIDBill.setEditable(false);
        txtIDBill.setBounds(75, 13, 124, 29);
        txtIDBill.setBackground(new Color(255, 255, 255));
        pnListOrder.add(txtIDBill);
        txtIDBill.setColumns(10);

        JLabel lblTableBook = new JLabel("Table");
        lblTableBook.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 25));
        lblTableBook.setBounds(211, 23, 56, 16);
        pnListOrder.add(lblTableBook);

        txtTableBook = new JTextField();
        txtTableBook.setEditable(false);
        txtTableBook.setColumns(10);
        txtTableBook.setBounds(279, 13, 110, 29);
        txtTableBook.setBackground(new Color(255, 255, 255));
        pnListOrder.add(txtTableBook);

        JLabel lblDateBook = new JLabel(" Date");
        lblDateBook.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 25));
        lblDateBook.setBounds(0, 62, 76, 36);
        pnListOrder.add(lblDateBook);

        txtDateBook = new JTextField();
        txtDateBook.setEditable(false);
        txtDateBook.setColumns(10);
        txtDateBook.setBounds(75, 62, 124, 29);
        txtDateBook.setBackground(new Color(255, 255, 255));
        pnListOrder.add(txtDateBook);

        JLabel lblTimeBook = new JLabel("Time");
        lblTimeBook.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 25));
        lblTimeBook.setBounds(211, 66, 56, 29);
        pnListOrder.add(lblTimeBook);

        txtTimeBook = new JTextField();
        txtTimeBook.setEditable(false);
        txtTimeBook.setColumns(10);
        txtTimeBook.setBounds(279, 62, 110, 29);
        txtTimeBook.setBackground(new Color(255, 255, 255));
        pnListOrder.add(txtTimeBook);

        JLabel label_3 = new JLabel(" List Order");
        label_3.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 25));
        label_3.setBounds(36, 141, 265, 36);
        pnListOrder.add(label_3);

        btnPayment = new JButton("PayMent");
        btnPayment.setFont(new Font("SimSun", Font.BOLD, 18));
        btnPayment.setBackground(new Color(245, 245, 245));
        btnPayment.setBounds(239, 614, 131, 48);
        pnListOrder.add(btnPayment);
        btnPaymentOnClick(btnPayment);

        btnCheckBill = new JButton("CheckBill");
        btnCheckBill.setFont(new Font("SimSun", Font.BOLD, 18));
        btnCheckBill.setBackground(new Color(245, 245, 245));
        btnCheckBill.setBounds(53, 614, 134, 48);
        pnListOrder.add(btnCheckBill);
        btnCheckBillOnClick(btnCheckBill);

        JPanel panel_4 = new JPanel();
        panel_4.setBounds(0, 200, 421, 338);
        pnListOrder.add(panel_4);
        panel_4.setLayout(null);

        JScrollPane scrollPane_2 = new JScrollPane();
        scrollPane_2.setBounds(0, 0, 421, 190);
        panel_4.add(scrollPane_2);

        orderedTable = new JTable();
        orderedTable.setModel(new DefaultTableModel(listOrder, CONSTANT.getOrderHeader()) {
            boolean[] columnEditables = new boolean[]{
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int row, int column) {
                return columnEditables[column];
            }
        });
        scrollPane_2.setViewportView(orderedTable);

        JLabel lblTotal = new JLabel("Total:");
        lblTotal.setFont(new Font("SimSun", Font.PLAIN, 21));
        lblTotal.setHorizontalAlignment(SwingConstants.CENTER);
        lblTotal.setBounds(81, 245, 93, 29);
        panel_4.add(lblTotal);

        txtTotalVND = new JTextField();
        txtTotalVND.setBackground(new Color(255, 255, 255));
        txtTotalVND.setEditable(false);
        txtTotalVND.setBounds(174, 244, 155, 36);
        panel_4.add(txtTotalVND);
        txtTotalVND.setColumns(10);

        JLabel lblVnd = new JLabel("VND");
        lblVnd.setFont(new Font("SimSun", Font.PLAIN, 21));
        lblVnd.setBounds(341, 251, 56, 16);
        panel_4.add(lblVnd);
    }

    private void btnSearchOnClick(JButton btnSearch, JTextField textField, JTable table, JScrollPane scrollPane) {
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                String keyword = textField.getText();
                CoffeeBooking.data.inorder();
                ArrayList<Meal> output = CoffeeBooking.data.getOutput();
                List<Meal> filter = output.stream().
                        filter(meal -> meal.getName().toLowerCase().contains(keyword.toLowerCase()))
                        .collect(Collectors.toList());

                Vector dataModel = new Vector();
                for (Meal meal : filter) {
                    Vector _meal = new Vector();
                    _meal.add(meal.getName());
                    _meal.add(meal.getPrice());
                    _meal.add(meal.getTimeEstimate());
                    dataModel.add(_meal);
                }
                setupTable(dataModel, CONSTANT.getFoodHeader(), table, scrollPane);
            }
        });
    }

    private void btnSearchFoodOnClick(JButton btnSearch, JTextField textField, JTable table, JScrollPane scrollPane) {
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                String keyword = textField.getText();
                CoffeeBooking.dataFood.inorder();
                ArrayList<Meal> output = CoffeeBooking.dataFood.getOutput();
                List<Meal> filter = output.stream().
                        filter(meal -> meal.getName().toLowerCase().contains(keyword.toLowerCase()))
                        .collect(Collectors.toList());

                Vector dataModel = new Vector();
                for (Meal meal : filter) {
                    Vector _food = new Vector();
                    _food.add(meal.getName());
                    _food.add(meal.getPrice());
                    _food.add(meal.getTimeEstimate());
                    dataModel.add(_food);
                }
                setupTable(dataModel, CONSTANT.getFoodHeader(), table, scrollPane);
            }
        });
    }

    private void setupTable(Vector dataModel, Vector header, JTable table_1, JScrollPane scrollPane) {
        table_1.setModel(new DefaultTableModel(dataModel, header) {
            boolean[] columnEditables = new boolean[]{
                false, false, false
            };

            public boolean isCellEditable(int row, int column) {
                return columnEditables[column];
            }
        });
        scrollPane.setViewportView(table_1);

        table_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTable source = (JTable) evt.getSource();
                int row = source.rowAtPoint(evt.getPoint());
                String selectedRow = source.getModel().getValueAt(row, 0) + "";
                try {
                    tmpPrice = Float.parseFloat(source.getModel().getValueAt(row, 1) + "");
                } catch (Exception e) {
                    System.out.println("Code ngu roi");
                }
                txtSelectedMeal.setText(selectedRow);
                txtQuantity.setText(1 + "");
                txtQuantity.setEditable(true);
            }
        });
    }

    private void btnBookOnClick(JButton btnBook) {
        btnBook.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                //update table color
                String bookingTable = "";
                for (Table table : listTable) {
                    if (table.getStatus() == 1) {
                        table.updateOnBookStatus();
                    }
                    if (table.getStatus() == 1 || table.getStatus() == 2) {
                        bookingTable += table.getButton().getText() + " ";
                    }
                }
                //set field to right panel
                txtIDBill.setText(UUID.randomUUID().toString() + "");
                txtTableBook.setText(bookingTable);

                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
                LocalDate localDate = LocalDate.now();
                txtDateBook.setText(dtf.format(localDate));

                Date date = new Date();
                String strDateFormat = "hh:mm:ss a";
                DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
                String formattedDate = dateFormat.format(date);
                txtTimeBook.setText(formattedDate);
            }
        });
    }

    private void btnOrderOnClick(JButton btnOrder) {
        btnOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OrderDetails order = new OrderDetails();
                order.setId(txtIDBill.getText());
                order.setCost(tmpPrice);
                order.setAmount(Integer.parseInt(txtQuantity.getText()) == 0 ? 1 : Integer.parseInt(txtQuantity.getText()));
                order.setName(txtSelectedMeal.getText());
                listOrder.add(order.toVector());
                listOrderDetails.add(order);

                orderedTable.setModel(new DefaultTableModel(listOrder, CONSTANT.getOrderHeader()) {
                    boolean[] columnEditables = new boolean[]{
                        false, false, false, false, false, false
                    };

                    public boolean isCellEditable(int row, int column) {
                        return columnEditables[column];
                    }
                });
            }
        });
    }

    private void btnPaymentOnClick(JButton btnPayment) {
        btnPayment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listOrder = listNull;
                orderedTable.setModel(new DefaultTableModel(listNull, CONSTANT.getOrderHeader()) {
                    boolean[] columnEditables = new boolean[]{
                        false, false, false, false, false, false
                    };

                    public boolean isCellEditable(int row, int column) {
                        return columnEditables[column];
                    }
                });
            }
        });
    }

    private void btnCheckBillOnClick(JButton btnCheckBill) {
        btnCheckBill.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                float total = 0;
                for (OrderDetails listOrderDetail : listOrderDetails) {
                    total += listOrderDetail.getTotal();
                }
                txtTotalVND.setText(total + "");
            }
        });

    }

}
