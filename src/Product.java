public class Product {
    public String name;
    public String productionData;
    public String manufacturer;
    public String countryOfOrigin;
    public int price;
    public boolean booked;

    public Product(String name,
                   String productionData,
                   String manufacturer,
                   int price,
                   String countryOfOrigin,
                   boolean booked){
        this.name = name;
        this.productionData = productionData;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
        this.booked = booked;
    }
}
