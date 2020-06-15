package coffeebooking;

import java.util.UUID;

public class Meal implements Comparable{
    private String name;
    private float price;
    private UUID id;
    private double timeEstimate;
    // private String description;

    public Meal(){
    }

    public Meal(String name, float price, double timeEstimate){
        this.name = name;
        this.price = price;
        this.timeEstimate = timeEstimate;
        id = UUID.randomUUID();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public double getTimeEstimate() {
        return timeEstimate;
    }

    public void setTimeEstimate(double timeEstimate) {
        this.timeEstimate = timeEstimate;
    }

    @Override
    public int compareTo(Object o) {
        Meal other = (Meal)o;
        return this.name.compareTo((other.getName()));
    }

    @Override
    public String toString() {
        return "Meal{" + "name=" + name + ", price=" + price + ", id=" + id + ", timeEstimate=" + timeEstimate + '}';
    }

    
}