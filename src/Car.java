public class Car {
    private String model;
    private String brand;
    private int year;
    private int price;
    private String color;
    private int quantity;

    public Car(String model, String brand, int year, int price, String color, int quantity) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.color = color;
        setPrice(price);
        setQuantity(quantity);
    }

    public String getModel() {return model;}
    public String getBrand() { return brand; }
    public int getYear() { return year; }
    public int getPrice() { return price; }
    public String getColor() { return color; }
    public int getQuantity() { return quantity; }

    public void setModel(String model) { this.model = model; }
    public void setBrand(String brand) { this.brand = brand; }
    public void setYear(int year) { this.year = year; }
    public void setPrice(int price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.price = price;
    }
    public void setColor(String color) { this.color = color; }
    public void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative");
        }
        this.quantity = quantity;
    }
    public void delivery() {
        quantity = Math.incrementExact(quantity);
    }
    public void sell() {
     if(quantity > 0){
         quantity--;
     }else{
         System.out.println("Out of Stock");
     }
    }
    @Override
    public String toString() {
        return "Car(model =" + model + ", brand =" + brand + ", year =" + year + ", price=" + price +
                ", color=" + color +
                ", quantity=" + quantity + ")";
    }
}
