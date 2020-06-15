package OrderList;

import coffeebooking.Meal;
import coffeebooking.Application;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class OrderList {
    static PriorityQueue<Order> pQueue = new PriorityQueue<>();

    public static void printOrder(ArrayList<Order> orderList) throws InterruptedException {
    	if (orderList.size() != 0) {
    		for (Order or : orderList) {
    			pQueue.add(or);
    		}
    	}
        else {
			System.out.println("List is empty");
		}

        while(!pQueue.isEmpty()) {
            System.out.println(pQueue.remove());
        }
    }
}