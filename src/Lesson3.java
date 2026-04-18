public class Lesson3 {
    public static void main(String[] args) {
        Product product1 = new Product("Phohe", "2000",
                "Apple", 1000, "China", "Paid");
        System.out.print(" Name: " + product1.name + ", productionData: " + product1.productionData+
                        ", manufacturer: " +product1.manufacturer+ ", price: "+ product1.price
                        +", countryOfOrigin: " + product1.countryOfOrigin + ", bookingStatus: " + product1.bookingStatus) ;
    }
}
