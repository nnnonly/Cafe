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
    public static void main(String[] args) {
        
        data.insertNode(new Meal("Coffee den", 6f, "8h"));
        data.insertNode(new Meal("Coffee nau", 12, "20h"));
        data.insertNode(new Meal("Tra dao", 5.5f, "12h"));
        data.insertNode(new Meal("Banh my", 5.5f, "12h"));
        data.insertNode(new Meal("Tra xanh", 5.5f, "12h"));
        data.insertNode(new Meal("Machiato", 5.5f, "12h"));
        
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

        
        
//        bs.inorder();
//        ArrayList<Meal> output = bs.getOutput();
//        for (Meal meal : output) {
//            System.out.println(meal.toString());
//        }
    }

}
