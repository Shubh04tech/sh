// Laptop.java
public class Laptop {
    private String model;
    private double price;

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.setModel("Dell XPS");
        laptop.setPrice(1500.0);

        System.out.println(laptop.toString());
    }
}