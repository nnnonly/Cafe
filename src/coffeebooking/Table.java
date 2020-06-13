/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffeebooking;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Table {

    private int status; //0 on initial, 1 on click, 2 on booked.

    private JPanel currentPanel;
    private JPanel wrapPanel;
    private JButton button;

    public Table(JPanel rootPanel, String table_label, String ICON_DIR) {
        this.currentPanel = rootPanel;

        wrapPanel = new JPanel();
        wrapPanel.setBackground(new Color(204, 255, 153));
        rootPanel.add(wrapPanel);

        //Using for setting the icon
        JLabel iconHolder = new JLabel("");
        wrapPanel.add(iconHolder);
        iconHolder.setIcon(new ImageIcon(ICON_DIR));

        //Setup click button
        button = new JButton(table_label);
        button.setBackground(new Color(204, 255, 153));
        rootPanel.add(button);
        this.status = 0;
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                updateOnClickStatus();
            }
            
            
            @Override
            public void mouseEntered(MouseEvent e){
                if(status == 1){
                    updateOnClickStatus();
                }
            }
        });
    }

    public void refreshBackground(int status) {
        switch (status) {
            case 0: {
                button.setBackground(new Color(204, 255, 153));
                wrapPanel.setBackground(new Color(204, 255, 153));
                break;
            }
            case 1: {
                button.setBackground(new Color(238, 99, 99));
                wrapPanel.setBackground(new Color(238, 99, 99));
                break;
            }
            case 2: {
                button.setBackground(new Color(238, 99, 99));
                wrapPanel.setBackground(new Color(238, 99, 99));
                break;
            }
        }
    }

    public void setLocation(int x, int y, int width, int height) {
        wrapPanel.setBounds(x, y, width, height);
        setBtnBound(x, y + 94, width, 20);
    }

    public void setBtnBound(int x, int y, int width, int height) {
        button.setBounds(x, y, width, height);
    }

    public JPanel getCurrentPanel() {
        return currentPanel;
    }

    public void setCurrentPanel(JPanel currentPanel) {
        this.currentPanel = currentPanel;
    }

    public JPanel getWrapPanel() {
        return wrapPanel;
    }

    public void setWrapPanel(JPanel wrapPanel) {
        this.wrapPanel = wrapPanel;
    }

    public JButton getButton() {
        return button;
    }

    public void setButton(JButton choosingBtn) {
        this.button = choosingBtn;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
        refreshBackground(status);
    }

    public void updateOnClickStatus() {
        if (this.status == 0) {
            setStatus(1);
        } else if (this.status == 1) {
            setStatus(0);
        }
    }

    public void updateOnBookStatus() {
        this.status = 2;
        refreshBackground(status);
    }

}
