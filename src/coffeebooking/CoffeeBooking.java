/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffeebooking;

import java.awt.EventQueue;
import java.util.ArrayList;

public class CoffeeBooking {

    /**
     * @param args the command line arguments
     */
    public static BinarySearchTree data = new BinarySearchTree();

    public static BinarySearchTree dataFood = new BinarySearchTree();
    public static void main(String[] args) {
        
        data.insertNode(new Meal("Cà phê đen", 35f, 1000));
        data.insertNode(new Meal("Cà phê nâu", 29f, 800));
        data.insertNode(new Meal("Trà Đào cam sả", 49f, 600));
        data.insertNode(new Meal("Espresso", 49f, 1200));
        data.insertNode(new Meal("Latte", 59f, 1500));
        data.insertNode(new Meal("Cold Brew Cam sả", 45f, 1200));
        data.insertNode(new Meal("Cold Breww Macchiato", 50f, 1200));
        data.insertNode(new Meal("Trà  Oolong", 50f, 800));
        data.insertNode(new Meal("TrÃ  Oolong hạt sen", 42f, 2000));
        data.insertNode(new Meal("Caramel Macchiato", 39f, 1200));
        data.insertNode(new Meal("Trà hoa cúc", 40f, 500));
        data.insertNode(new Meal("Trà  Matcha", 55f, 2000));
        data.insertNode(new Meal("Hot Chocolate", 55f, 700));
        data.insertNode(new Meal("Trà Việt Quất", 45f, 1500));
        data.insertNode(new Meal("Hồng trà", 20f, 1700));
        data.insertNode(new Meal("Trà  Chanh", 32f, 1200));
        data.insertNode(new Meal("Deep Blue", 25f, 1200));
        data.insertNode(new Meal("Trà sữa thái", 45f, 2500));
        data.insertNode(new Meal("Trà sữa Chocolate", 45f, 900));
        data.insertNode(new Meal("Cà phê đánh đá", 45f, 2000));
        data.insertNode(new Meal("Xoài dầm", 43f, 900));
        data.insertNode(new Meal("Sữa chua", 35f, 2000));
        data.insertNode(new Meal("Nước cam", 40f, 300));
        data.insertNode(new Meal("Cacao nóng", 25f, 700));

        dataFood.insertNode(new Meal("Bánh quy", 10f, 0));
        dataFood.insertNode(new Meal("Bánh gấu", 20f, 500));
        dataFood.insertNode(new Meal("Hướng dương", 15f, 0));
        dataFood.insertNode(new Meal("Bánh mousse chanh leo", 35f, 5));
        dataFood.insertNode(new Meal("Bánh mousse chocolate", 35f, 10));
        dataFood.insertNode(new Meal("Khô gà  lá chanh", 25f, 10));
        dataFood.insertNode(new Meal("Snack", 5f, 10));

        
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    Application application = new Application();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

}
