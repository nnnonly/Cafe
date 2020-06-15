/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffeebooking;

import java.util.Vector;

public class OrderDetails {
//    "ID", "Name", "Cost", "Amount", "Total"
    private String id;
    private String name;
    private float cost;
    private int amount;
    private float total;
    private double time;
    private double total_time;

    public OrderDetails() {
    }

    @Override
    public String toString() {
        return "OrderDetails{" + "id=" + id + ", name=" + name + ", cost=" + cost + ", amount=" + amount + ", total=" + total + '}';
    }

    public OrderDetails(String id, String name, float cost, int amount, double time) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.amount = amount;
        this.time = time;
        
        if(cost != 0 && amount != 0){
            total = cost * amount;
            total_time = time * amount; 
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public float getTotal() {
        total = amount * cost;
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
    public void setTime(double time) {
    	this.time = time;
    }
    
    public double getTime() {
		return time;
	}
    
    public double getTotalTime() {
    	total_time = amount * time;
    	return total_time;
    }
    
    public void setTotal_time(double total_time) {
		this.total_time = total_time;
	}
    
    public Vector toVector(){
        Vector o = new Vector();
        o.add(id);
        o.add(name);
        o.add(cost);
        o.add(amount);
        o.add(getTotal());
        o.add(time);
        o.add(getTotalTime());
        return o;
    }
}
