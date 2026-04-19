public class Lesson3_2 {
    public static void main(String[] args) {
       Product[] productsArray = new Product[5];
       productsArray [0] = new Product ( "Samsung S25 Ultra", "01.02.2025",
               "Samsung Corp.", 5599, "Korea", true);
        productsArray [1] = new Product ( "iPhone 16", "01.03.2024",
                "Apple Inc.", 5000, "USA", true);
        productsArray [2] = new Product ( "Samsung Galaxy", "01.01.2023",
                "Samsung Corp.", 3000, "Korea", false);
        productsArray [3] = new Product ( "Xiaomi 17 Ultra", "01.02.2022",
                "Xiaomi", 3500, "China", true);
        productsArray [4] = new Product ( "iPhone 17", "01.03.2026",
                "Apple Inc.", 6000, "USA", true);
        for (int i = 0; i < productsArray.length; i++) {
            System.out.println ("Товар " + (i + 1) + ":");
            System.out.println ("Name: " + productsArray[i].name);
            System.out.println ("Production data: " + productsArray[i].productionData);
            System.out.println ("Manufacturer: " + productsArray[i].manufacturer);
            System.out.println ("Price: " + productsArray[i].price);
            System.out.println ("Country of origin: " + productsArray[i].countryOfOrigin);
            System.out.println ("Booked: " + productsArray[i].booked);
            System.out.println ("-----------------");
        }
    }
}
