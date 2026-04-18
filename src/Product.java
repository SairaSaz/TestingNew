public class Product {
    public String name;
    public String productionData;
    public String manufacturer;
    public String countryOfOrigin;
    public int price;
    public String bookingStatus;

    public Product(String name,
                   String productionData,
                   String manufacturer,
                   int price,
                   String countryOfOrigin,
                   String bookingStatus){
        this.name = name;
        this.productionData = productionData;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
        this.bookingStatus = bookingStatus;
    }
}
