/* NomNom created on 6/4/2020 inside the package - Hieu.AVLTree */

package Hieu;

public class Drink implements Abcdef {
    private int id;
    private String name;
    private double time;
    private double price;
    private int number;

    public Drink(int id, String name, double time, double price, int number) {
        this.id = id;
        this.name = name;
        this.time = time;
        this.price = price;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
