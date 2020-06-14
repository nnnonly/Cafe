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
        
        data.insertNode(new Meal("Cà phê đen", 35f, "20ph"));
        data.insertNode(new Meal("Cà phê nâu", 29f, "5ph"));
        data.insertNode(new Meal("Trà đào cam sả", 49f, "10ph"));
        data.insertNode(new Meal("Espresso", 49f, "15ph"));
        data.insertNode(new Meal("Latte", 59f, "15ph"));
        data.insertNode(new Meal("Cold Brew Cam sả", 45f, "12ph"));
        data.insertNode(new Meal("Cold Breww Macchiato", 50f, "12ph"));
        data.insertNode(new Meal("Trà Oolong Vải", 50f, "8ph"));
        data.insertNode(new Meal("Trà Oolong Hạt sen", 42f, "20ph"));
        data.insertNode(new Meal("Caramel Macchiato", 39f, "12ph"));
        data.insertNode(new Meal("Trà Đen Macchiato", 40f, "5h"));
        data.insertNode(new Meal("Trà Matcha", 55f, "20ph"));
        data.insertNode(new Meal("Hot Chocolate", 55f, "7ph"));
        data.insertNode(new Meal("Đào Việt Quất", 45f, "15ph"));
        data.insertNode(new Meal("Hồng Trà Vải", 20f, "17ph"));
        data.insertNode(new Meal("Trà Chanh", 32f, "12ph"));
        data.insertNode(new Meal("Deep Blue", 25f, "12ph"));
        data.insertNode(new Meal("Trà sữa thái", 45f, "25ph"));
        data.insertNode(new Meal("Trà sữa Chocolate", 45f, "9h"));
        data.insertNode(new Meal("Cà phê cốt dừa", 45f, "20ph"));
        data.insertNode(new Meal("Xoài nha đam", 43f, "9ph"));
        data.insertNode(new Meal("Sữa chua đánh đá", 35f, "20ph"));
        data.insertNode(new Meal("Nước cam", 40f, "3ph"));
        data.insertNode(new Meal("Cacao nóng", 25f, "7ph"));

        dataFood.insertNode(new Meal("Bánh quy", 10f, "có sẵn"));
        dataFood.insertNode(new Meal("Bánh mỳ", 20f, "5ph"));
        dataFood.insertNode(new Meal("Hướng dương", 15f, "lấy ngay"));
        dataFood.insertNode(new Meal("Bánh mousse chanh leo", 35f, "có sẵn"));
        dataFood.insertNode(new Meal("Bánh mousse chocolate", 35f, "có sẵn"));
        dataFood.insertNode(new Meal("Khô gà lá chanh", 25f, "có sẵn"));
        dataFood.insertNode(new Meal("Snack", 5f, "có sẵn"));

        
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
