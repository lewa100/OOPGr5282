import Domen.Product;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class MainFrame extends JFrame {


    final private Font mainFont = new Font("Segoe print", Font.BOLD, 18);
    JTextField tfCash;
    JList<String> prodlist;

    JLabel lbMonitor;

    public void initialize(String[] inList) {
        JLabel lbProductList = new JLabel("Product List");
        lbProductList.setFont(mainFont);

        prodlist = new JList<String>();
        prodlist.setListData(inList);
        prodlist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JLabel lbCash = new JLabel("Enter cash:");
        lbCash.setFont(mainFont);

        tfCash = new JTextField("0");
        tfCash.setFont(mainFont);

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(2, 2, 1, 1));
        formPanel.add(lbProductList);
        var scrollPane = new JScrollPane(prodlist);
        formPanel.add(scrollPane);
        formPanel.add(lbCash);
        formPanel.add(tfCash);

        tfCash.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();  // if it's not a number, ignore the event
                }
            }
        });

        lbMonitor = new JLabel();
        lbMonitor.setFont(mainFont);



        JButton btnBuy = new JButton("купить товар");
        btnBuy.setFont(mainFont);
        btnBuy.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int cash = Integer.parseInt(tfCash.getText());
                if (cash <= 0) {
                    lbMonitor.setText("You don't have any money.");
                    return;
                }
                lbMonitor.setText("You want to buy product by " + cash + " money.");
            }

        });

        JButton btnClear = new JButton("Clear");
        btnClear.setFont(mainFont);
        btnClear.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                tfCash.setText("");
                lbMonitor.setText("");

            }

        });


        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 2, 5, 5));
        buttonPanel.add(btnBuy);
        buttonPanel.add(btnClear);


        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(128, 128, 255));

        mainPanel.add(formPanel, BorderLayout.NORTH);
        mainPanel.add(lbMonitor, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);


        add(mainPanel);


        mainPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        formPanel.setOpaque(false);
        buttonPanel.setOpaque(false);


        setTitle("VendingMachines");
        setSize(500, 600);
        setMaximumSize(new Dimension(300, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

//    public static void main(String[] arg)
//    {
//        MainFrame myFrame = new MainFrame();
//        myFrame.initialize();
//    }
}
