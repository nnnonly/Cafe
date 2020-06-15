package OrderList;

import coffeebooking.Meal;

import java.sql.Time;

public class Order implements Comparable {
    private int id = 0;
    private double rank = 0;
    private double timeCreate;
    private boolean isVip = true;
    private Meal abc;

    public Order(boolean isVip, int id, Meal abc) {
    	this.isVip = isVip;
        this.id = id;
        this.abc = abc;
        timeCreate = System.currentTimeMillis();
        caculateRank(isVip);
    }

    private void caculateRank(boolean isVip) {
        if (isVip)
            this.rank = 0.5 * abc.getTimeEstimate();
        else
            this.rank = 1 * abc.getTimeEstimate();
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", vip=" + isVip +
                ", rank=" + rank +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Order a = (Order) o;
        if (this.isVip == true && a.isVip == true) {
            if (this.rank < a.rank) return -1;
            else if (this.rank > a.rank) return 1;
            else return 0;
        }
        else {
            if (this.isVip == false && a.isVip == false) {
                if (this.rank < a.rank) return -1;
                else if (this.rank > a.rank) return 1;
                else {
                    if (this.id < a.id) return -1;
                    else if (this.id > a.id) return 1;
                    else return 0;
                }
            }
            else {
                if (this.isVip == true) return -1;
                else return 1;
            }
        }
    }
}