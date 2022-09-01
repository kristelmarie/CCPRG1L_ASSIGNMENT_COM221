public class Item {
    int price;
    int weight;
    int quantity;
    String description;
    String name;
    boolean canbetraded;

    public void itemDescription() {
        System.out.println("This is a " + name + ". It is worth " + price + " pesos. That weighs " + weight + " kilograms.");

    }
    
    
}
