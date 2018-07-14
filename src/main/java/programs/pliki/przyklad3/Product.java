package programs.pliki.przyklad3;

public class Product {
    private long id;
    private String name;
    private double price;
    private String category;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return String.format("\nid: %d\r\nname: %s\r\nprice: %s\r\ncategory: %s\n",
                id, name, price, category);
    }
}
