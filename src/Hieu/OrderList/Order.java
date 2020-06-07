/* NomNom created on 6/4/2020 inside the package - Hieu.OrderList */

package Hieu.OrderList;

import Hieu.Abcdef;

import java.sql.Time;

public class Order implements Comparable {
    private int id = 0;
    private double rank = 0;
    private double timeCreate;
    private Abcdef abc;

    public Order(boolean isVip, int id, Abcdef abc) {
        this.id = id;
        this.abc = abc;
        timeCreate = System.currentTimeMillis();
        caculateRank(isVip);
    }

    private void caculateRank(boolean isVip) {
        if (isVip)
            this.rank = 0.5 * abc.getTime();
        else
            this.rank = 1 * abc.getTime();
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", rank=" + rank +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Order a = (Order) o;
        if (this.rank != a.rank) {
            if (this.rank < a.rank) return -1;
            else return 1;
        }
        return 0;
    }
}
